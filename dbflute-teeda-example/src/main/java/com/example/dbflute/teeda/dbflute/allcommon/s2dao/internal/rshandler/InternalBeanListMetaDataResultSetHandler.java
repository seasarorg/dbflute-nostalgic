package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.rshandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.framework.beans.PropertyDesc;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.dao.BeanMetaData;
import org.seasar.dao.RelationPropertyType;
import org.seasar.dao.RelationRowCreator;
import org.seasar.dao.RowCreator;
import org.seasar.dao.impl.RelationKey;
import org.seasar.dao.impl.RelationRowCache;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.ConditionBeanContext;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.outsidesql.OutsideSqlContext;

/**
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class InternalBeanListMetaDataResultSetHandler extends InternalAbstractBeanMetaDataResultSetHandler {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
	 * @param beanMetaData Bean meta data. (NotNull)
     * @param rowCreator Row creator. (NotNull)
     * @param relationRowCreator Relation row creator. (NotNul)
     */
    public InternalBeanListMetaDataResultSetHandler(BeanMetaData beanMetaData, RowCreator rowCreator, RelationRowCreator relationRowCreator) {
        super(beanMetaData, rowCreator, relationRowCreator);
    }
	
	// ===================================================================================
    //                                                                              Handle
    //                                                                              ======
    public Object handle(ResultSet rs) throws SQLException {
        // Lazy initialization because if the result is zero, the resources are unused.
        Set columnNames = null; // Set<String(columnName)>
        Map propertyCache = null; // Map<String(columnName), PropertyType>
        Map relationPropertyCache = null; // Map<String(relationNoSuffix), Map<String(columnName), PropertyType>>
        RelationRowCache relRowCache = null;

        final List list = new ArrayList();
        final int relSize = getBeanMetaData().getRelationPropertyTypeSize();
        final boolean hasCB = hasConditionBean();
        final boolean skipRelationLoop;
        {
            final boolean emptyRelation = isSelectedForeignInfoEmpty();
            final boolean hasOSC = hasOutsideSqlContext();
            final boolean specifiedOutsideSql = isSpecifiedOutsideSql();

            // If it has condition-bean that has no relation to get
            // or it has outside-sql context that is specified-outside-sql,
            // they are unnecessary to do relation loop!
            skipRelationLoop = (hasCB && emptyRelation) || (hasOSC && specifiedOutsideSql);
        }

        while (rs.next()) {
			if (columnNames == null) {
			    columnNames = createColumnNames(rs.getMetaData());
			}
            if (propertyCache == null) {
                propertyCache = createPropertyCache(columnNames);
            }

            // Create row instance of base table by row property cache.
            final Object row = createRow(rs, propertyCache);

            // If it has condition-bean that has no relation to get
            // or it has outside-sql context that is specified-outside-sql,
            // they are unnecessary to do relation loop!
            if (skipRelationLoop) {
                postCreateRow(row);
                list.add(row);
                continue;
            }

            if (relationPropertyCache == null) {
                relationPropertyCache = createRelationPropertyCache(columnNames);
            }
            if (relRowCache == null) {
                relRowCache = new RelationRowCache(relSize);
            }
            for (int i = 0; i < relSize; ++i) {
                final RelationPropertyType rpt = getBeanMetaData().getRelationPropertyType(i);
                if (rpt == null) {
                    continue;
                }

                // Do only selected foreign property for performance if condition-bean exists.
                if (hasCB && !hasSelectedForeignInfo(buildRelationNoSuffix(rpt))) {
                    continue;
                }

                final Map relKeyValues = new HashMap();
                final RelationKey relKey = createRelationKey(rs, rpt, columnNames, relKeyValues);
                Object relationRow = null;
                if (relKey != null) {
                    relationRow = relRowCache.getRelationRow(i, relKey);
                    if (relationRow == null) { // when no cache
                        relationRow = createRelationRow(rs, rpt, columnNames, relKeyValues, relationPropertyCache);
                        if (relationRow != null) {
                            relRowCache.addRelationRow(i, relKey, relationRow);
                            postCreateRow(relationRow);
                        }
                    }
                }
                if (relationRow != null) {
                    final PropertyDesc pd = rpt.getPropertyDesc();
                    pd.setValue(row, relationRow);
                }
            }
            postCreateRow(row);
            list.add(row);
        }
        return list;
    }

    protected RelationKey createRelationKey(ResultSet rs, RelationPropertyType rpt, Set columnNames, Map relKeyValues) throws SQLException {
        final List keyList = new ArrayList();
        final BeanMetaData bmd = rpt.getBeanMetaData();
        for (int i = 0; i < rpt.getKeySize(); ++i) {
            final ValueType valueType;
            String columnName = rpt.getMyKey(i);
            if (columnNames.contains(columnName)) {
                final PropertyType pt = getBeanMetaData().getPropertyTypeByColumnName(columnName);
                valueType = pt.getValueType();
            } else {
                final PropertyType pt = bmd.getPropertyTypeByColumnName(rpt.getYourKey(i));
                columnName = pt.getColumnName() + buildRelationNoSuffix(rpt);
                if (columnNames.contains(columnName)) {
                    valueType = pt.getValueType();
                } else {
                    return null;
                }
            }
            final Object value = valueType.getValue(rs, columnName);
            if (value == null) {
                return null;
            }
            relKeyValues.put(columnName, value);
            keyList.add(value);
        }
        if (keyList.size() > 0) {
            Object[] keys = keyList.toArray();
            return new RelationKey(keys);
        } else {
            return null;
        }
    }
    
    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected boolean hasConditionBean() {
        return ConditionBeanContext.isExistConditionBeanOnThread();
    }

    protected boolean isSelectedForeignInfoEmpty() {
        if (!hasConditionBean()) {
            return true;
        }
        ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        if (cb.getSqlClause().isSelectedForeignInfoEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Has it selected foreign information?
     * You should call hasConditionBean() before calling this!
     * @param relationNoSuffix The suffix of relation NO. (NotNull)
     * @return Determination.
     */
    protected boolean hasSelectedForeignInfo(String relationNoSuffix) {
        final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        if (cb.getSqlClause().hasSelectedForeignInfo(relationNoSuffix)) {
            return true;
        }
        return false;
    }

    /**
     * Build the string of relation No suffix.
     * @param rpt The property type of relation. (NotNull)
     * @return The string of relation No suffix. (NotNull)
     */
    protected String buildRelationNoSuffix(RelationPropertyType rpt) {
        return "_" + rpt.getRelationNo();
    }

    protected boolean hasOutsideSqlContext() {
        return OutsideSqlContext.isExistOutsideSqlContextOnThread();
    }

    protected boolean isSpecifiedOutsideSql() {
        if (!hasOutsideSqlContext()) {
            return false;
        }
        final OutsideSqlContext context = OutsideSqlContext.getOutsideSqlContextOnThread();
        return context.isSpecifiedOutsideSql();
    }
}
