package dbflute.ldb.allcommon.s2dao;

import java.lang.reflect.Method;

import org.seasar.dao.BeanMetaData;
import org.seasar.dao.RelationPropertyType;
import org.seasar.dao.impl.DaoMetaDataImpl;
import org.seasar.dao.impl.SelectDynamicCommand;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ResultSetHandler;

import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdSelectResource;

/**
 * DaoMetaDataImpl for DaoGen.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdS2DaoMetaDataExtension extends DaoMetaDataImpl {

    /**
     * Constructor.
     */
    public LdS2DaoMetaDataExtension() {
    }

    /**
     * This method overrides the method that is declared at super.
     * 
     * @param method Method instance. (NotNull)
     */
    protected void setupSelectMethodByAuto(Method method) {
        String query = annotationReader.getQuery(method);
        ResultSetHandler handler = createResultSetHandler(method);
        SelectDynamicCommand cmd = null;
        String[] argNames = annotationReader.getArgNames(method);
        Class[] argTypes = method.getParameterTypes();
        if (query != null && !startsWithOrderBy(query)) {
            cmd = createSelectDynamicCommand(handler, query);
        } else {
            cmd = createSelectDynamicCommand(handler);
            String sql = null;
            if (argNames.length == 0 && argTypes.length == 1) {
                argNames = new String[] { "dto" };
                // /----------------------------------------------------- [MyExtension]
                if (LdConditionBeanContext.isTheTypeConditionBean(argTypes[0])) {
                    final String sqlNormal = getSelectClause(getBeanMetaData());
                    final String sqlPKOnly = getSelectClausePKOnly(getBeanMetaData());
                    final LdS2DaoSelectDynamicCommand dynamicCommand = newLdS2DaoSelectDynamicCommand(handler);
                    sql = sqlNormal;
                    cmd = dynamicCommand;
                    dynamicCommand.setSelectClause(sqlNormal);
                    dynamicCommand.setSelectClausePKOnly(sqlPKOnly);
                } else {
                    if (LdSelectResource.class.isAssignableFrom(argTypes[0])) {
                        String msg = "If the first argument type is select-resource(and not condition-bean), ";
                        msg = msg + "the method should not use auto-select-sql.";
                        msg = msg + " (Do you want to use outer-file-sql? Please check your sql-file-name and build-action!)";
                        msg = msg + ": dao=" + method.getDeclaringClass() + " method=" + method.getName() + "()";
                        msg = msg + " firstArgument=" + argTypes[0] + " argTypes.length=" + argTypes.length;
                        throw new IllegalStateException(msg);
                    }
                    sql = createAutoSelectSqlByDto(argTypes[0]);
                }
                // -----------/
            } else {
                // /----------------------------------------------------- [MyExtension]
                if (argTypes.length > 1 && LdSelectResource.class.isAssignableFrom(argTypes[0])) {
                    String msg = "If the number of argument is more than 1 and the first argument type is select-resource, ";
                    msg = msg + "the method should not use auto-select-sql.";
                    msg = msg + " (Do you want to use outer-file-sql? Please check your sql-file-name and build-action!)";
                    msg = msg + ": dao=" + method.getDeclaringClass() + " method=" + method.getName() + "()";
                    msg = msg + " firstArgument=" + argTypes[0] + " argTypes.length=" + argTypes.length;
                    throw new IllegalStateException(msg);
                }
                // -----------/
                sql = createAutoSelectSql(argNames);
            }
            if (query != null) {
                sql = sql + " " + query;
            }
            cmd.setSql(sql);
        }
        cmd.setArgNames(argNames);
        cmd.setArgTypes(method.getParameterTypes());
        sqlCommands.put(method.getName(), cmd);
    }

    /**
     * Get select clause.
     * 
     * @param beanMetaData BeanMetaData. (NotNull)
     * @return Select clause. (NotNull)
     */
    protected String getSelectClause(BeanMetaData beanMetaData) {
        final StringBuffer sb = new StringBuffer(100);
        sb.append("select/*$dto.selectHint*/ ");

        final StringBuffer sbMySelectList = new StringBuffer(100);
        for (int i = 0; i < beanMetaData.getPropertyTypeSize(); ++i) {
            final PropertyType pt = beanMetaData.getPropertyType(i);
            if (pt.isPersistent()) {
                if (sbMySelectList.length() != 0) {
                    sbMySelectList.append(", ");
                }
                sbMySelectList.append(beanMetaData.getTableName());
                sbMySelectList.append(".");
                sbMySelectList.append(pt.getColumnName());
            }
        }
        sb.append(sbMySelectList);

        for (int i = 0; i < beanMetaData.getRelationPropertyTypeSize(); ++i) {
            final StringBuffer sbYourSelectList = new StringBuffer(100);
            final RelationPropertyType rpt = beanMetaData.getRelationPropertyType(i);
            if (rpt == null) {
                String msg = "The beanMetaData.GetRelationPropertyType(" + i + ") returned null";
                msg = msg + ": beanMetaData.getTableName()=" + beanMetaData.getTableName();
                msg = msg + ": beanMetaData.getRelationPropertyTypeSize()=" + beanMetaData.getRelationPropertyTypeSize();
                throw new IllegalStateException(msg);
            }

            final BeanMetaData bmd = rpt.getBeanMetaData();
            final String ifComment = "/*IF dto." + rpt.getPropertyName() + "_isSelect != null*/";
            final String endComment = "/*END*/";
            for (int j = 0; j < bmd.getPropertyTypeSize(); ++j) {
                final PropertyType pt = bmd.getPropertyType(j);
                if (pt.isPersistent()) {
                    final String columnName = pt.getColumnName();

                    if (sbMySelectList.length() != 0 || sbYourSelectList.length() != 0) {
                        sbYourSelectList.append(", ");
                    }
                    sbYourSelectList.append(rpt.getPropertyName()).append(".").append(columnName);
                    sbYourSelectList.append(" AS ");
                    sbYourSelectList.append(pt.getColumnName()).append("_").append(rpt.getRelationNo());
                }
            }
            sb.append(ifComment).append(sbYourSelectList).append(endComment);
        }

        return sb.toString();
    }

    /**
     * Get select clause PK only.
     * 
     * @param beanMetaData BeanMetaData. (NotNull)
     * @return Select clause PK only. (NotNull)
     */
    protected String getSelectClausePKOnly(BeanMetaData beanMetaData) {
        final StringBuffer sb = new StringBuffer(100);
        sb.append("select/*$dto.selectHint*/ ");

        final StringBuffer sbMySelectList = new StringBuffer(100);
        for (int i = 0; i < beanMetaData.getPropertyTypeSize(); ++i) {
            final PropertyType pt = beanMetaData.getPropertyType(i);
            if (pt.isPersistent() && pt.isPrimaryKey()) {
                if (sbMySelectList.length() != 0) {
                    sbMySelectList.append(", ");
                }
                sbMySelectList.append(beanMetaData.getTableName());
                sbMySelectList.append(".");
                sbMySelectList.append(pt.getColumnName());
            }
        }
        sb.append(sbMySelectList);

        return sb.toString();
    }

    /**
     * Create select-dynamic-command. (Override)
     * 
     * @param handler ResultSetHandler
     * @return Select dynamic command. (NotNull)
     */
    protected SelectDynamicCommand createSelectDynamicCommand(ResultSetHandler handler) {
        return newLdS2DaoSelectDynamicCommand(handler);
    }

    /**
     * New my select dynamic command.
     * 
     * @param handler ResultSetHandler
     * @return My select dynamic command. (NotNull)
     */
    protected LdS2DaoSelectDynamicCommand newLdS2DaoSelectDynamicCommand(ResultSetHandler handler) {
        return new LdS2DaoSelectDynamicCommand(dataSource, statementFactory, handler, resultSetFactory);
    }
}