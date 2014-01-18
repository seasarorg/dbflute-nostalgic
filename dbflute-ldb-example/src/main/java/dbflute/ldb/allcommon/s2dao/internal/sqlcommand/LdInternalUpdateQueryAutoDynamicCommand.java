/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Date;
import java.sql.Timestamp;
import java.lang.reflect.Method;
import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.CommandContext;
import org.seasar.dao.Node;
import org.seasar.dao.SqlCommand;

import dbflute.ldb.allcommon.bhv.core.LdSqlExecution;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalCommandContextHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalCommandContextCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalSqlParser;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalUpdateQueryAutoDynamicCommand implements SqlCommand, LdSqlExecution {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected DataSource dataSource;
    protected StatementFactory statementFactory;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalUpdateQueryAutoDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        this.dataSource = dataSource;
        this.statementFactory = statementFactory;
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public Object execute(Object[] args) {
        LdConditionBean cb = extractConditionBeanWithCheck(args);
        LdEntity entity = extractEntityWithCheck(args);
        String[] argNames = new String[]{"dto", "entity"};
        Class<?>[] argTypes = new Class<?>[]{cb.getClass(), entity.getClass()};
        String twoWaySql = buildQueryUpdateTwoWaySql(cb, entity);
        if (twoWaySql == null) {
            return 0;// No execute!
        }
        CommandContext context = createCommandContext(twoWaySql, argNames, argTypes, args);
        LdInternalCommandContextHandler handler = createCommandContextHandler(context);
        handler.setLoggingMessageSqlArgs(context.getBindVariables());
        int rows = handler.execute(args);
        return new Integer(rows);
    }
    
    protected LdConditionBean extractConditionBeanWithCheck(Object[] args) {
        assertArgument(args);
        Object fisrtArg = args[0];
        if (!(fisrtArg instanceof LdConditionBean)) {
            String msg = "The type of first argument should be " + LdConditionBean.class + "! But:";
            msg = msg + " type=" + fisrtArg.getClass();
            throw new IllegalArgumentException(msg);
        }
        return (LdConditionBean) fisrtArg;
    }
    
    protected LdEntity extractEntityWithCheck(Object[] args) {
        assertArgument(args);
        Object secondArg = args[1];
        if (!(secondArg instanceof LdEntity)) {
            String msg = "The type of second argument should be " + LdEntity.class + "! But:";
            msg = msg + " type=" + secondArg.getClass();
            throw new IllegalArgumentException(msg);
        }
        return (LdEntity) secondArg;
    }
	
    protected void assertArgument(Object[] args) {
        if (args == null || args.length <= 1) {
            String msg = "The arguments should have two argument! But:";
            msg = msg + " args=" + (args != null ? args.length : null);
            throw new IllegalArgumentException(msg);
        }
    }
    
    protected LdInternalCommandContextHandler createCommandContextHandler(CommandContext context) {
        return new LdInternalCommandContextHandler(dataSource, statementFactory, context);
    }

    /**
     * @param cb Condition-bean. (NotNull)
     * @param entity Entity. (NotNull)
     * @return The two-way SQL of query update. (Nullable: If the set of modified properties is empty, return null.)
     */
    protected String buildQueryUpdateTwoWaySql(LdConditionBean cb, LdEntity entity) {
        Map<String, String> columnParameterMap = new LinkedHashMap<String, String>();
        LdDBMeta dbmeta = entity.getDBMeta();
        Set<String> modifiedPropertyNames = entity.getModifiedPropertyNames();
        if (modifiedPropertyNames.isEmpty()) {
            return null;
        }
        String currentPropertyName = null;
        try {
            for (String propertyName : modifiedPropertyNames) {
                currentPropertyName = propertyName;
                LdColumnInfo columnInfo = dbmeta.findColumnInfo(propertyName);
                String columnName = columnInfo.getColumnDbName();
                Method getter = columnInfo.findGetter();
                Object value = getter.invoke(entity, (Object[])null);
                if (value != null) {
                    columnParameterMap.put(columnName, "/*entity." + propertyName + "*/null");
                } else {
                    columnParameterMap.put(columnName, "null");
                }
            }
            if (dbmeta.hasVersionNo()) {
                LdColumnInfo columnInfo = dbmeta.getVersionNoColumnInfo();
                String columnName = columnInfo.getColumnDbName();
                columnParameterMap.put(columnName, columnName + " + 1");
            }
            if (dbmeta.hasUpdateDate()) {
                LdColumnInfo columnInfo = dbmeta.getUpdateDateColumnInfo();
                Method setter = columnInfo.findSetter();
                if (Timestamp.class.isAssignableFrom(columnInfo.getPropertyType())) {
                    setter.invoke(entity, new Timestamp(System.currentTimeMillis()));
                } else {
                    setter.invoke(entity, new Date());
                }
                String columnName = columnInfo.getColumnDbName();
                columnParameterMap.put(columnName, "/*entity." + columnInfo.getPropertyName() + "*/null");
            }
        } catch (Exception e) {
            throwQueryUpdateFailureException(cb, entity, currentPropertyName, e);
        }
        return cb.getSqlClause().getClauseQueryUpdate(columnParameterMap);
    }
    
    protected void throwQueryUpdateFailureException(LdConditionBean cb, LdEntity entity, String propertyName, Exception e) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "queryUpdate() failed to execute!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the parameter comment logic." + getLineSeparator();
        msg = msg + "It may exist the parameter comment that DOESN'T have an end comment." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    before (x) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3" + getLineSeparator();
        msg = msg + "    after  (o) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3/*END*/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Doubtful Property Name]" + getLineSeparator() + propertyName + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[ConditionBean]" + getLineSeparator() + cb + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Entity]" + getLineSeparator() + entity + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Exception Message]" + getLineSeparator() + e.getMessage() + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new QueryUpdateFailureException(msg, e);
    }
	
    public static class QueryUpdateFailureException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public QueryUpdateFailureException(String msg, Exception e) {
            super(msg, e);
        }
    }

    protected CommandContext createCommandContext(String twoWaySql, String[] argNames, Class<?>[] argTypes, Object[] args) {
        CommandContext context;
        {
            LdInternalSqlParser parser = new LdInternalSqlParser(twoWaySql, true);
            Node node = parser.parse();
            LdInternalCommandContextCreator creator = new LdInternalCommandContextCreator(argNames, argTypes);
            context = creator.createCommandContext(args);
            node.accept(context);
        }
        return context;
    }
	
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }
}
