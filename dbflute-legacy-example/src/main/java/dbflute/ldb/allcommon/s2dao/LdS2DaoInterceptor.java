package dbflute.ldb.allcommon.s2dao;

import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBean;

/**
 * My-DaoInterceptor.
 * Customises original class 'S2DaoInterceptor'.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdS2DaoInterceptor extends org.seasar.framework.aop.interceptors.AbstractInterceptor {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdS2DaoInterceptor.class);

    /** Dao meta data factory. */
    private org.seasar.dao.DaoMetaDataFactory daoMetaDataFactory_;

    /**
     * Constructor.
     * 
     * @param daoMetaDataFactory Dao meta data factory.
     */
    public LdS2DaoInterceptor(org.seasar.dao.DaoMetaDataFactory daoMetaDataFactory) {
        daoMetaDataFactory_ = daoMetaDataFactory;
    }

    /**
     * Invoke.
     * 
     * @param invocation Method invocation.
     * @return Result of the method.
     * @throws Throwable
     */
    public Object invoke(MethodInvocation invocation) throws Throwable {
        final java.lang.reflect.Method method = invocation.getMethod();
        if (!org.seasar.framework.util.MethodUtil.isAbstract(method)) {
            return invocation.proceed();
        }

        if (_log.isDebugEnabled()) {
            final String invokeName = getShortClassName(method.getDeclaringClass()) + "." + method.getName();
            final int length = invokeName.length();
            final StringBuffer sb = new StringBuffer();
            for (int i=0; i < length; i++) {
                sb.append("=");
            }
            _log.debug("/==================================================================" + sb.toString() + "==");
            _log.debug("                                                      Dao Method - " + invokeName + "()");
            _log.debug("                                                      =============" + sb.toString() + "=/");
        }

        final org.seasar.dao.SqlCommand cmd;
        {
            final Class targetClass = getTargetClass(invocation);
            final org.seasar.dao.DaoMetaData dmd = daoMetaDataFactory_.getDaoMetaData(targetClass);
            cmd = dmd.getSqlCommand(method.getName());
        }

        final LdConditionBean cb = preprocessConditionBean(invocation, cmd);
        Object ret = null;
        final long before = System.currentTimeMillis();
        try {
            ret = cmd.execute(invocation.getArguments());
        } catch (Exception e) {
            _log.info("Dao threw the exception: " + e.getClass() + " msg=" + e.getMessage());
            _log.info("    method   --> " + invocation.getMethod());
            _log.info("    argument --> " + getObjectArrayString(invocation.getArguments()));
            if (e instanceof org.seasar.framework.exception.SQLRuntimeException) {
                final Throwable causeException = ((org.seasar.framework.exception.SQLRuntimeException)e).getCause();
                if (causeException instanceof org.seasar.framework.exception.SSQLException) {
                    final String sql = ((org.seasar.framework.exception.SSQLException)causeException).getSql();
                    _log.info("    sql      --> " + sql);
                }
            }
            throw e;
        } finally {
            postprocessConditionBean(invocation, cb);
        }
        final long after = System.currentTimeMillis();

        final Class retType = method.getReturnType();

        if (_log.isDebugEnabled()) {
            try {
                final String daoResultPrefix = "===========/ [Dao Result (" + getPerformanceView(after - before) + ") - ";
                if (java.util.List.class.isAssignableFrom(retType)) {
                    if (ret == null) {
                        _log.debug(daoResultPrefix + "Selected count: null]");
                    } else {
                        final java.util.List ls = (java.util.List)ret;
                        if (ls.isEmpty()) {
                            _log.debug(daoResultPrefix + "Selected count: 0]");
                        } else {
                            _log.debug(daoResultPrefix + "Selected count: " + ls.size() + " first=" + ls.get(0) + "]");
                        }
                    }
                } else if (LdEntity.class.isAssignableFrom(retType)) {
                    if (ret == null) {
                        _log.debug(daoResultPrefix + "Selected entity: null" + "]");
                    } else {
                        final LdEntity entity = (LdEntity)ret;
                        _log.debug(daoResultPrefix + "Selected entity: " + entity + "]");
                    }
                } else {
                    if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
                        _log.debug(daoResultPrefix + "Selected count: " + ret + "]");
                    } else {
                        _log.debug(daoResultPrefix + "Result: " + ret + "]");
                    }
                }
                _log.debug(" ");
            } catch (Exception e) {
                String msg = "Result object debug threw the exception: methodName=" + method.getName() + " retType=" + retType;
                msg = msg + " ret=" + ret;
                _log.warn(msg, e);
                throw e;
            }
        }

        if (retType.isPrimitive()) {
            return org.seasar.framework.util.NumberConversionUtil.convertPrimitiveWrapper(retType, ret);
        } else if (Number.class.isAssignableFrom(retType)) {
            return org.seasar.framework.util.NumberConversionUtil.convertNumber(retType, ret);
        } else {
            return ret;
        }
    }

    // =====================================================================================
    //                                                                      Pre&Post Process
    //                                                                      ================
    /**
     * Preprocess condition-bean.
     * <p>
     * If this method is condition bean select target, make dynamic sql.
     * Else nothing.
     * 
     * @param invocation Method invocation. (NotNull)
     * @param cmd Sql command. (NotNull)
     * @return Condition-bean. (Nullable)
     */
    protected LdConditionBean preprocessConditionBean(MethodInvocation invocation, org.seasar.dao.SqlCommand cmd) {
        final LdConditionBean cb;
        {
            final Object[] args = invocation.getArguments();
            if (args == null || !(args.length >= 1)) {
                return null;
            }

            final Object arg0 = args[0];
            if (arg0 == null) {
                return null;
            }

            if (!LdConditionBeanContext.isTheTypeConditionBean(arg0.getClass())) {// The argument is not condition-bean...
                if (!LdFetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(arg0.getClass())) {// And it is not fetch-narrowing-bean...
                    return null;
                }
                LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread((LdFetchNarrowingBean)arg0);
                return null;
            }

            cb = (LdConditionBean)arg0;
        }

        if (!(cmd instanceof LdS2DaoSelectDynamicCommand)) {// The argument is condition-bean, but this method use outer-sql-file...
            LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
            return null;
        }

        final LdS2DaoSelectDynamicCommand dynamicCommand = (LdS2DaoSelectDynamicCommand)cmd;
        final String selectClause;
        if (cb.isLimitSelect_PKOnly()) {
            selectClause = dynamicCommand.getSelectClausePKOnly();
        } else {
            selectClause = dynamicCommand.getSelectClause();
        }
        if (selectClause == null || selectClause.trim().length() == 0) {// The argument is condition-bean, but this method use outer-sql-file...
            LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
            return null;
        }

        if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
            // It changes temporarily.
            //   for NG-sql: select count(*) from (select * from Xxx order by xxx) base;
            cb.getSqlClause().ignoreOrderBy();

            // It changes temporarily.
            //   SelectCount with fetch-narrowing is unsupported at DaoGen-Framework.
            cb.getSqlClause().ignoreFetchScope();

            final String sql;
            {
                final String fromWhereOrderByClause = cb.getSqlClause().getClause();
                sql = selectClause + fromWhereOrderByClause;
            }
            dynamicCommand.setSql("select count(*) from (" + sql + ") base");
            return cb;
        }

        LdConditionBeanContext.setConditionBeanOnThread(cb);
        LdFetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
        final String sql;
        {
            final String fromWhereOrderByClause = cb.getSqlClause().getClause();
            sql = selectClause + fromWhereOrderByClause;
        }
        dynamicCommand.setSql(sql);
        return cb;
    }

    /**
     * Postprocess condition-bean.
     * 
     * @param invocation Method invocation. (NotNull)
     * @param cb Condition-bean. (Nullable)
     */
    public void postprocessConditionBean(MethodInvocation invocation, LdConditionBean cb) {
        if (LdConditionBeanContext.isExistConditionBeanOnThread()) {
            LdConditionBeanContext.clearConditionBeanOnThread();
        }
        if (LdFetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread()) {
            LdFetchNarrowingBeanContext.clearFetchNarrowingBeanOnThread();
        }

        if (cb == null) {
            return;
        }
        if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
            cb.getSqlClause().makeOrderByEffective();// It returns it.
            cb.getSqlClause().makeFetchScopeEffective();// It returns it.
        }
    }

    // =====================================================================================
    //                                                                         Determination
    //                                                                         =============
    /**
     * Is select count method?
     * 
     * @param invocation Method invocation. (NotNull)
     * @return Determination.
     */
    protected boolean isSelectCountIgnoreFetchScopeMethod(MethodInvocation invocation) {
        final String name = invocation.getMethod().getName();
        if (name.startsWith("readCountIgnoreFetchScope") || name.startsWith("selectCountIgnoreFetchScope")) {
            return true;
        } else {
            return false;
        }
    }

    // =====================================================================================
    //                                                                                Helper
    //                                                                                ======
    /**
     * Get short class name.
     * 
     * @param clazz Class instance. (NotNull)
     * @return Short class name. (NotNull)
     */
    protected String getShortClassName(Class clazz) {
        String s = clazz.getName();
        int i = s.lastIndexOf('.');
        if (i > 0) {
            return s.substring(i + 1);
        }
        return s;
    }

    /**
     * Change object array to string divided with comma.
     * 
     * @param objArray Object array. (Nullable)
     * @return String (NotNull: If the argument is null, returns empty string.)
     */
    protected String getObjectArrayString(Object[] objArray) {
        if (objArray == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < objArray.length; i++) {
            if (i == 0) {
                sb.append(objArray[i]);
            } else {
                sb.append(", ").append(objArray[i]);
            }
        }
        return sb.toString();
    }

    /**
     * Get performance view.
     * 
     * @param mil The value of millisecound.
     * @return Performance view. (ex. 1m23s456ms) (NotNull)
     */
    protected String getPerformanceView(long mil) {
        if (mil < 0) {
            return String.valueOf(mil);
        }

        long sec = mil / 1000;
        long min = sec / 60;
        sec = sec % 60;
        mil = mil % 1000;

        StringBuffer sb = new StringBuffer();
        if (min >= 10) { // Minute
            sb.append(min).append("m");
        } else if (min < 10 && min >= 0) {
            sb.append("0").append(min).append("m");
        }
        if (sec >= 10) { // Second
            sb.append(sec).append("s");
        } else if (sec < 10 && sec >= 0) {
            sb.append("0").append(sec).append("s");
        }
        if (mil >= 100) { // Millisecond
            sb.append(mil).append("ms");
        } else if (mil < 100 && mil >= 10) {
            sb.append("0").append(mil).append("ms");
        } else if (mil < 10 && mil >= 0) {
            sb.append("00").append(mil).append("ms");
        }

        return sb.toString();
    }
}