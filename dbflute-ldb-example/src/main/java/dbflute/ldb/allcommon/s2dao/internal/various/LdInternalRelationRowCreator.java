/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.various;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.framework.beans.PropertyDesc;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.dao.BeanMetaData;
import org.seasar.dao.RelationPropertyType;
import org.seasar.dao.impl.RelationRowCreationResource;
import org.seasar.dao.impl.RelationRowCreatorImpl;

import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalRelationRowCreator extends RelationRowCreatorImpl {

    @Override
    protected Object createRelationRow(RelationRowCreationResource res)
            throws SQLException {
        // - - - - - - - - - - - 
        // Recursive Call Point!
        // - - - - - - - - - - -
        if (!res.hasPropertyCacheElement()) {
            return null;
        }
        setupRelationKeyValue(res);
        setupRelationAllValue(res);
        return res.getRow();
    }

    @Override
    protected void setupRelationKeyValue(RelationRowCreationResource res) {
        final RelationPropertyType rpt = res.getRelationPropertyType();
        final BeanMetaData bmd = rpt.getBeanMetaData();
        final LdDBMeta dbmeta = findDBMeta(bmd.getBeanClass(), bmd.getTableName());
        for (int i = 0; i < rpt.getKeySize(); ++i) {
            final String columnName = rpt.getMyKey(i) + res.getBaseSuffix();

            if (!res.containsColumnName(columnName)) {
                continue;
            }
            if (!res.hasRowInstance()) {
                final Object row;
                if (dbmeta != null) {
                    row = dbmeta.newEntity();
                } else {
                    row = newRelationRow(rpt);
                }
                res.setRow(row);
            }
            if (!res.containsRelKeyValueIfExists(columnName)) {
                continue;
            }
            final Object value = res.extractRelKeyValue(columnName);
            if (value == null) {
                continue;
            }

            final String yourKey = rpt.getYourKey(i);
            final PropertyType pt = bmd.getPropertyTypeByColumnName(yourKey);
            final PropertyDesc pd = pt.getPropertyDesc();
            pd.setValue(res.getRow(), value);
            continue;
        }
    }

    protected Object createRelationRowInstance(LdDBMeta dbmeta) {
        if (dbmeta != null) {
            return dbmeta.newEntity();
        }
        return null;
    }

    protected LdDBMeta findDBMeta(Class<?> rowType, String tableName) {
        return LdInternalRowCreator.findDBMeta(rowType, tableName);
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void setupRelationAllValue(RelationRowCreationResource res) throws SQLException {
        final Map propertyCacheElement = res.extractPropertyCacheElement();
        final Set columnNameCacheElementKeySet = propertyCacheElement.keySet();
        for (final Iterator ite = columnNameCacheElementKeySet.iterator(); ite.hasNext();) {
            final String columnName = (String) ite.next();
            final PropertyType pt = (PropertyType) propertyCacheElement.get(columnName);
            res.setCurrentPropertyType(pt);
            if (!isValidRelationPerPropertyLoop(res)) {
                res.clearRowInstance();
                return;
            }
            setupRelationProperty(res);
        }
        if (!isValidRelationAfterPropertyLoop(res)) {
            res.clearRowInstance();
            return;
        }
        res.clearValidValueCount();
        if (res.hasNextRelationProperty() && (hasConditionBean(res) || res.hasNextRelationLevel())) {
            setupNextRelationRow(res);
        }
    }
    
    @Override
    protected void registerRelationValue(RelationRowCreationResource res, String columnName) throws SQLException {
        final PropertyType pt = res.getCurrentPropertyType();
        Object value = null;
        if (res.containsRelKeyValueIfExists(columnName)) {
            value = res.extractRelKeyValue(columnName);
        } else {
            final ValueType valueType = pt.getValueType();
            value = valueType.getValue(res.getResultSet(), columnName);
        }
        
        if (value != null) {
            res.incrementValidValueCount();
            final LdDBMeta dbmeta = findDBMeta(res.getRow());
            final String propertyName = pt.getPropertyName();
            if (dbmeta != null && dbmeta.hasEntityPropertySetupper(propertyName)) {
                dbmeta.setupEntityProperty(propertyName, res.getRow(), value);
            } else {
                final PropertyDesc pd = pt.getPropertyDesc();
                pd.setValue(res.getRow(), value);
            }
        }
    }
    
    /**
     * @param row The instance of row. (NotNull)
     * @return The interface of DBMeta. (Nullable: If it's null, it means NotFound.)
     */
    protected LdDBMeta findDBMeta(Object row) {
        return LdInternalRowCreator.findDBMeta(row);
    }

    @Override
    protected void setupPropertyCache(RelationRowCreationResource res) throws SQLException {
        // - - - - - - - - - - - 
        // Recursive Call Point!
        // - - - - - - - - - - -
        res.initializePropertyCacheElement();

        // Do only selected foreign property for performance if condition-bean exists.
        if (hasConditionBean(res) && !hasSelectedForeignInfo(res)) {
            return;
        }

        // Set up property cache about current beanMetaData.
        final BeanMetaData nextBmd = res.getRelationBeanMetaData();
        for (int i = 0; i < nextBmd.getPropertyTypeSize(); ++i) {
            final PropertyType pt = nextBmd.getPropertyType(i);
            res.setCurrentPropertyType(pt);
            if (!isTargetProperty(res)) {
                continue;
            }
            setupPropertyCacheElement(res);
        }
        
        // Set up next relation.
        if (res.hasNextRelationProperty() && (hasConditionBean(res) || res.hasNextRelationLevel())) {
            res.backupRelationPropertyType();
            res.incrementCurrentRelationNestLevel();
            try {
                setupNextPropertyCache(res, nextBmd);
            } finally {
                res.restoreRelationPropertyType();
                res.decrementCurrentRelationNestLevel();
            }
        }
    }

    @Override
    protected boolean isTargetProperty(RelationRowCreationResource res) throws SQLException {
        final PropertyType pt = res.getCurrentPropertyType();
        if (!pt.getPropertyDesc().hasWriteMethod()) {
            return false;
        }
        if (java.util.List.class.isAssignableFrom(pt.getPropertyDesc().getPropertyType())) {
            return false;
        }
        return true;
    }

    @Override
    protected boolean isCreateDeadLink() {
        return false;
    }
    
    @Override
    protected int getLimitRelationNestLevel() {
        return 2;// for Compatible
    }

    @SuppressWarnings("unchecked")
    @Override
    protected RelationRowCreationResource createResourceForRow(ResultSet rs,
            RelationPropertyType rpt, Set columnNames, Map relKeyValues,
            Map relationPropertyCache) throws SQLException {
        final RelationRowCreationResource res = new RelationRowCreationResourceExtension();
        res.setResultSet(rs);
        res.setRelationPropertyType(rpt);
        res.setColumnNames(columnNames);
        res.setRelKeyValues(relKeyValues);
        res.setRelationPropertyCache(relationPropertyCache);
        res.setBaseSuffix("");// as Default
        res.setRelationNoSuffix(buildRelationNoSuffix(rpt));
        res.setLimitRelationNestLevel(getLimitRelationNestLevel());
        res.setCurrentRelationNestLevel(1);// as Default
        res.setCreateDeadLink(isCreateDeadLink());
        return res;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected RelationRowCreationResource createResourceForPropertyCache(RelationPropertyType rpt, Set columnNames,
            Map relationPropertyCache, String baseSuffix, String relationNoSuffix, int limitRelationNestLevel)
            throws SQLException {
        final RelationRowCreationResource res = new RelationRowCreationResourceExtension();
        res.setRelationPropertyType(rpt);
        res.setColumnNames(columnNames);
        res.setRelationPropertyCache(relationPropertyCache);
        res.setBaseSuffix(baseSuffix);
        res.setRelationNoSuffix(relationNoSuffix);
        res.setLimitRelationNestLevel(limitRelationNestLevel);
        res.setCurrentRelationNestLevel(1);// as Default
        return res;
    }
    
    protected boolean isConditionBeanSelectedRelation(RelationRowCreationResource res) {
        if (hasConditionBean(res)) {
            final LdConditionBean cb = LdConditionBeanContext.getConditionBeanOnThread();
            if (cb.getSqlClause().hasSelectedForeignInfo(res.getRelationNoSuffix())) {
                return true;
            }
        }
        return false;
    }
    
    protected boolean hasConditionBean(RelationRowCreationResource res) {
        return LdConditionBeanContext.isExistConditionBeanOnThread();
    }
    
    protected boolean hasSelectedForeignInfo(RelationRowCreationResource res) {
        final LdConditionBean cb = LdConditionBeanContext.getConditionBeanOnThread();
        if (cb.getSqlClause().hasSelectedForeignInfo(res.getRelationNoSuffix())) {
            return true;
        }
        return false;
    }
    
    protected static class RelationRowCreationResourceExtension extends RelationRowCreationResource {
        protected Stack<RelationPropertyType> backupRelationPropertyType = new Stack<RelationPropertyType>();
        protected Stack<String> backupBaseSuffix = new Stack<String>();
        protected Stack<String> backupRelationSuffix = new Stack<String>();
        
        @Override
        public void backupRelationPropertyType() {
            backupRelationPropertyType.push(getRelationPropertyType());
        }
        
        @Override
        public void restoreRelationPropertyType() {
            setRelationPropertyType(backupRelationPropertyType.pop());
        }
        
        @Override
        public void backupSuffixAndPrepare(String baseSuffix, String additionalRelationNoSuffix) {
            backupBaseSuffixExtension();
            backupRelationNoSuffixExtension();
            setBaseSuffix(baseSuffix);
            addRelationNoSuffix(additionalRelationNoSuffix);
        }
        
        @Override
        public void restoreSuffix() {
            restoreBaseSuffixExtension();
            restoreRelationNoSuffixExtension();
        }
        
        protected void backupBaseSuffixExtension() {
            backupBaseSuffix.push(getBaseSuffix());
        }

        protected void restoreBaseSuffixExtension() {
            setBaseSuffix(backupBaseSuffix.pop());
        }
        
        protected void backupRelationNoSuffixExtension() {
            backupRelationSuffix.push(getRelationNoSuffix());
        }
        
        protected void restoreRelationNoSuffixExtension() {
            setRelationNoSuffix(backupRelationSuffix.pop());
        }
    }
}
