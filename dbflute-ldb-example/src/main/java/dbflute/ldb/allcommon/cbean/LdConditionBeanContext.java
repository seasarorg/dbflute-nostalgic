/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalSqlParser;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * The context of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionBeanContext {

    /** Log instance. */
    private static final Log _log = LogFactory.getLog(LdConditionBeanContext.class);

    // ===================================================================================
    //                                                                        Thread Local
    //                                                                        ============
    /** The thread-local for this. */
    private static final ThreadLocal<LdConditionBean> _threadLocal = new ThreadLocal<LdConditionBean>();

    /**
     * Get condition-bean on thread.
     * @return Condition-bean context. (Nullable)
     */
    public static LdConditionBean getConditionBeanOnThread() {
        return (LdConditionBean)_threadLocal.get();
    }

    /**
     * Set condition-bean on thread.
     * @param cb Condition-bean. (NotNull)
     */
    public static void setConditionBeanOnThread(LdConditionBean cb) {
        if (cb == null) {
            String msg = "The argument[cb] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _threadLocal.set(cb);
    }

    /**
     * Is existing condition-bean on thread?
     * @return Determination.
     */
    public static boolean isExistConditionBeanOnThread() {
        return (_threadLocal.get() != null);
    }

    /**
     * Clear condition-bean on thread.
     */
    public static void clearConditionBeanOnThread() {
        _threadLocal.set(null);
    }

    // ===================================================================================
    //                                                                  Type Determination
    //                                                                  ==================
    /**
     * Is the argument condition-bean?
     * @param dtoInstance DTO instance.
     * @return Determination.
     */
    public static boolean isTheArgumentConditionBean(final Object dtoInstance) {
        return dtoInstance instanceof LdConditionBean;
    }

    /**
     * Is the type condition-bean?
     * @param dtoClass DtoClass.
     * @return Determination.
     */
    public static boolean isTheTypeConditionBean(final Class<?> dtoClass) {
        return LdConditionBean.class.isAssignableFrom(dtoClass);
    }

    // ===================================================================================
    //                                                                        Cool Classes
    //                                                                        ============
	@SuppressWarnings("unused")
    public static void loadCoolClasses() {
        boolean debugEnabled = false; // If you watch the log, set this true.
        // Against the ClassLoader Headache!
        final StringBuilder sb = new StringBuilder();
        {
            final Class<?> clazz = dbflute.ldb.allcommon.cbean.LdSimplePagingBean.class;
            if (debugEnabled) { sb.append("  ...Loading class of " + clazz.getName() + " by " + clazz.getClassLoader().getClass()).append(getLineSeparator()); }
        }
		{
            Class<?> clazz = dbflute.ldb.allcommon.LdAccessContext.class;
            clazz = dbflute.ldb.allcommon.LdCallbackContext.class;
            clazz = dbflute.ldb.allcommon.cbean.coption.LdFromToOption.class;
            clazz = dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption.class;
            clazz = dbflute.ldb.allcommon.cbean.coption.LdInScopeOption.class;
            clazz = dbflute.ldb.allcommon.cbean.grouping.LdGroupingOption.class;
            clazz = dbflute.ldb.allcommon.cbean.grouping.LdGroupingRowEndDeterminer.class;
            clazz = dbflute.ldb.allcommon.cbean.grouping.LdGroupingRowResource.class;
            clazz = dbflute.ldb.allcommon.cbean.grouping.LdGroupingRowSetupper.class;
            clazz = dbflute.ldb.allcommon.cbean.pagenavi.LdPageNumberLink.class;
            clazz = dbflute.ldb.allcommon.cbean.pagenavi.LdPageNumberLinkSetupper.class;
            clazz = dbflute.ldb.allcommon.jdbc.LdCursorHandler.class;
            if (debugEnabled) { sb.append("  ...Loading class of ...and so on"); }
        }
        if (debugEnabled) { 
            _log.debug("{Initialize against the ClassLoader Headache}" + getLineSeparator() + sb);
        }
    }

    // ===================================================================================
    //                                                                  Exception Handling
    //                                                                  ==================
    public static void throwEntityAlreadyDeletedException(Object searchKey4Log) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The entity was Not Found! it has already been deleted!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the existence of your target record on your database." + getLineSeparator();
        msg = msg + "Does the target record really created before this operation?" + getLineSeparator();
        msg = msg + "Has the target record been deleted by other thread?" + getLineSeparator();
        msg = msg + "It is precondition that the record exists on your database." + getLineSeparator();
        msg = msg + getLineSeparator();
		if (searchKey4Log != null && searchKey4Log instanceof LdConditionBean) {
		    final LdConditionBean cb = (LdConditionBean)searchKey4Log;
			msg = msg + "[Display SQL]" + getLineSeparator() + cb.toDisplaySql() + getLineSeparator();
		} else {
            msg = msg + "[Search Condition]" + getLineSeparator() + searchKey4Log + getLineSeparator();
        }
        msg = msg + "* * * * * * * * * */";
        throw new dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException(msg);
    }

    public static void throwEntityDuplicatedException(String resultCountString, Object searchKey4Log, Throwable cause) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The entity was Too Many! it has been duplicated. It should be the only one! But the resultCount=" + resultCountString + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm your search condition. Does it really select the only one?" + getLineSeparator();
        msg = msg + "Please confirm your database. Does it really exist the only one?" + getLineSeparator();
        msg = msg + getLineSeparator();
		if (searchKey4Log != null && searchKey4Log instanceof LdConditionBean) {
		    final LdConditionBean cb = (LdConditionBean)searchKey4Log;
			msg = msg + "[Display SQL]" + getLineSeparator() + cb.toDisplaySql() + getLineSeparator();
		} else {
            msg = msg + "[Search Condition]" + getLineSeparator() + searchKey4Log + getLineSeparator();
        }
        msg = msg + "* * * * * * * * * */";
        if (cause != null) {
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg, cause);
        } else {
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg);
        }
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
	public static String convertConditionBean2DisplaySql(LdConditionBean cb
	                                                   , String logDateFormat
	                                                   , String logTimestampFormat) {
		final String twoWaySql = cb.getSqlClause().getClause();
	    return LdInternalSqlParser.convertTwoWaySql2DisplaySql(twoWaySql, cb, logDateFormat, logTimestampFormat);
	}

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected static String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }
}
