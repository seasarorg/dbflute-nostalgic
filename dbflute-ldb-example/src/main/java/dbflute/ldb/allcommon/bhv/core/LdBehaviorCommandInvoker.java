/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaDataFactory;
import org.seasar.dao.ValueTypeFactory;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdXLog;
import dbflute.ldb.allcommon.LdInternalMapContext;
import dbflute.ldb.allcommon.cbean.LdConditionBeanContext;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBeanContext;
import dbflute.ldb.allcommon.cbean.outsidesql.LdOutsideSqlContext;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.helper.stacktrace.LdInvokeNameExtractingResource;
import dbflute.ldb.allcommon.helper.stacktrace.LdInvokeNameResult;
import dbflute.ldb.allcommon.helper.stacktrace.impl.LdInvokeNameExtractorImpl;
import dbflute.ldb.allcommon.jdbc.LdStatementConfig;
import dbflute.ldb.allcommon.s2dao.internal.various.LdInternalStatementFactory;
import dbflute.ldb.allcommon.util.LdTraceViewUtil;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;
import dbflute.ldb.allcommon.util.LdSimpleTypeUtil;

/**
 * The invoker of behavior command.
 * <pre>
 * public interface methods are as follows:
 *   o clearExecutionCache();
 *   o isExecutionCacheEmpty();
 *   o getExecutionCacheSize();
 *   o injectComponentProperty(LdBehaviorCommandComponentSetup behaviorCommand);
 *   o invoke(LdBehaviorCommand behaviorCommand);
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdBehaviorCommandInvoker {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                      Injection Target
    //                                      ----------------
    protected LdInvokerAssistant _invokerAssistant;
    protected DataSource _dataSource;
    protected BeanMetaDataFactory _beanMetaDataFactory;
    protected ValueTypeFactory _valueTypeFactory;

    // -----------------------------------------------------
    //                                       Execution Cache
    //                                       ---------------
    protected final Map<String, LdSqlExecution> _executionMap = new ConcurrentHashMap<String, LdSqlExecution>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdBehaviorCommandInvoker() {
    }

    // ===================================================================================
    //                                                                     Execution Cache
    //                                                                     ===============
    public void clearExecutionCache() {
        _executionMap.clear();
    }

    public boolean isExecutionCacheEmpty() {
        return _executionMap.isEmpty();
    }

    public int getExecutionCacheSize() {
        return _executionMap.size();
    }

    // ===================================================================================
    //                                                                      Command Set up
    //                                                                      ==============
    /**
     * Inject the properties of component to the command of behavior. {Public Interface}
     * @param behaviorCommand The command of behavior. (NotNull)
     */
    public void injectComponentProperty(LdBehaviorCommandComponentSetup behaviorCommand) {
        behaviorCommand.setDataSource(_dataSource);
        behaviorCommand.setStatementFactory(createStatememtFactory());
        behaviorCommand.setBeanMetaDataFactory(_beanMetaDataFactory);
        behaviorCommand.setValueTypeFactory(_valueTypeFactory);
        behaviorCommand.setSqlFileEncoding(getSqlFileEncoding());
    }

    protected StatementFactory createStatememtFactory() {
        assertInvokerAssistant();
        final LdStatementConfig defaultStatementConfig = _invokerAssistant.assistDefaultStatementConfig();
        final boolean internalDebug = _invokerAssistant.assistInternalDebug();
        LdInternalStatementFactory factory = new LdInternalStatementFactory();
        factory.setDefaultStatementConfig(defaultStatementConfig);
        factory.setInternalDebug(internalDebug);
        return factory;
    }

    protected String getSqlFileEncoding() {
        assertInvokerAssistant();
        return _invokerAssistant.assistSqlFileEncoding();
    }

    // ===================================================================================
    //                                                                      Command Invoke
    //                                                                      ==============
    /**
     * Invoke the command of behavior. {Public Interface}
     * This method is an entry point!
     * @param <RESULT> The type of result.
     * @param behaviorCommand The command of behavior. (NotNull)
     * @return The result object. (Nullable)
     */
    public <RESULT> RESULT invoke(LdBehaviorCommand<RESULT> behaviorCommand) {
        clearContext();
        try {
            return doInvoke(behaviorCommand);
        } finally {
            clearContext();
        }
    }

    /**
     * @param <RESULT> The type of result.
     * @param behaviorCommand The command of behavior. (NotNull)
     * @return The result object. (Nullable)
     */
    protected <RESULT> RESULT doInvoke(LdBehaviorCommand<RESULT> behaviorCommand) {
        setupResourceContext();

        // - - - - - - - - - - - - -
        // Initialize SQL Execution
        // - - - - - - - - - - - - -
        if (behaviorCommand.isInitializeOnly()) {
            initializeSqlExecution(behaviorCommand);
            return null; // The end! (Initialize Only)
        }
        behaviorCommand.beforeGettingSqlExecution();

        LdSqlExecution execution = null;
        try {
            final String key = behaviorCommand.buildSqlExecutionKey();
            execution = getSqlExecution(key);
            if (execution == null) {
                long beforeCmd = 0;
                if (isLogEnabled()) {
                    beforeCmd = System.currentTimeMillis();
                }
                LdSqlExecutionCreator creator = behaviorCommand.createSqlExecutionCreator();
                execution = getSqlExecution(key, creator);
                if (isLogEnabled()) {
                    final long afterCmd = System.currentTimeMillis();
                    if (beforeCmd != afterCmd) {
                        logSqlExecution(behaviorCommand, execution, beforeCmd, afterCmd);
                    }
                }
            }
        } finally {
            if (isLogEnabled()) {
                logInvocation(behaviorCommand);
            }
        }

        long before = 0;
        if (isLogEnabled()) {
            before = System.currentTimeMillis();
        }

        Object ret = null;
        try {
            final Object[] args = behaviorCommand.getSqlExecutionArgument();
            ret = executeSql(execution, args);
        } finally {
            behaviorCommand.afterExecuting();
        }
        final Class<?> retType = behaviorCommand.getCommandReturnType();
        assertRetType(retType, ret);

        if (isLogEnabled()) {
            final long after = System.currentTimeMillis();
            logReturn(behaviorCommand, retType, ret, before, after);
        }

        // - - - - - - - - - -
        // Convert and Return!
        // - - - - - - - - - -
        if (retType.isPrimitive()) {
            ret = convertPrimitiveWrapper(retType, ret);
        } else if (Number.class.isAssignableFrom(retType)) {
            ret = convertNumber(retType, ret);
        }
        @SuppressWarnings("unchecked")
        final RESULT result = (RESULT)ret;
        return result;
    }

    protected void setupResourceContext() {
        assertInvokerAssistant();
        LdResourceContext resourceContext = new LdResourceContext();
        resourceContext.setCurrentDBDef(_invokerAssistant.assistCurrentDBDef());
        resourceContext.setDBMetaProvider(_invokerAssistant.assistDBMetaProvider());
        resourceContext.setSqlClauseCreator(_invokerAssistant.assistSqlClauseCreator());
        resourceContext.setResourceParameter(_invokerAssistant.assistResourceParameter());
        LdResourceContext.setResourceContextOnThread(resourceContext);
    }

    // ===================================================================================
    //                                                                       SQL Execution
    //                                                                       =============
    protected <RESULT> void initializeSqlExecution(LdBehaviorCommand<RESULT> behaviorCommand) {
        final String key = behaviorCommand.buildSqlExecutionKey();
        LdSqlExecutionCreator creator = behaviorCommand.createSqlExecutionCreator();
        getSqlExecution(key, creator);
    }

    protected  LdSqlExecution getSqlExecution(String key) {
        return _executionMap.get(key);
    }

    /**
     * @param key The key of SQL execution. (NotNull)
     * @param executionCreator The creator of SQL execution. (NotNull)
     * @return The SQL execution that may be created then. (NotNull)
     */
    protected  LdSqlExecution getSqlExecution(String key, LdSqlExecutionCreator executionCreator) {
        LdSqlExecution execution = getSqlExecution(key);
        if (execution == null) {
            synchronized (_executionMap) {
                execution = getSqlExecution(key);
                if (execution == null) {
                    if (isLogEnabled()) {
                        log("...Initializing sqlExecution for the key '" + key + "'");
                    }
                    _executionMap.put(key, executionCreator.createSqlExecution());
                } else {
                    if (isLogEnabled()) {
                        log("...Getting sqlExecution as cache because the previous thread have already initialized.");
                    }
                }
            }
            execution = getSqlExecution(key);
            if (execution == null) {
                String msg = "sqlExecutionCreator.createSqlCommand() should not return null:";
                msg = msg + " sqlExecutionCreator=" + executionCreator + " key=" + key;
                throw new IllegalStateException(msg);
            }
            toBeDisposable(); // for HotDeploy
        }
        return execution;
    }

    protected Object executeSql(LdSqlExecution execution, Object[] args) {
        return execution.execute(args);
    }

    // ===================================================================================
    //                                                                      Log SqlCommand
    //                                                                      ==============
    protected <RESULT> void logSqlExecution(LdBehaviorCommand<RESULT> behaviorCommand, LdSqlExecution execution, long beforeCmd, long afterCmd) {
        log("SqlExecution Initialization Cost: [" + LdTraceViewUtil.convertToPerformanceView(afterCmd - beforeCmd) + "]");
    }

    // ===================================================================================
    //                                                                      Log Invocation
    //                                                                      ==============
    protected <RESULT> void logInvocation(LdBehaviorCommand<RESULT> behaviorCommand) {
        final StackTraceElement[] stackTrace = new Exception().getStackTrace();
        final LdInvokeNameResult behaviorResult = extractBehaviorInvokeName(stackTrace);
        filterBehaviorResult(behaviorCommand, behaviorResult);

        final String invokeClassName;
        final String invokeMethodName;
        if (!behaviorResult.isEmptyResult()) {
            invokeClassName = behaviorResult.getSimpleClassName();
            invokeMethodName = behaviorResult.getMethodName();
        } else {
            invokeClassName = behaviorCommand.getTableDbName();
            invokeMethodName = behaviorCommand.getCommandName();
        }
        final String expWithoutKakko = buildInvocationExpressionWithoutKakko(behaviorCommand, invokeClassName, invokeMethodName);

        // Save behavior invoke name for error message.
        putObjectToMapContext("df:BehaviorInvokeName", expWithoutKakko + "()");

        final String equalBorder = buildFitBorder("", "=", expWithoutKakko, false);
        final String callerExpression = expWithoutKakko + "()";

        log("/=====================================================" + equalBorder + "==");
        log("                                                      " + callerExpression);
        log("                                                      " + equalBorder + "=/");

        logPath(behaviorCommand, stackTrace, behaviorResult);

        if (behaviorCommand.isOutsideSql() && !behaviorCommand.isProcedure()) {
            final LdOutsideSqlContext outsideSqlContext = getOutsideSqlContext();
            if (outsideSqlContext != null) {
                log("path: " + behaviorCommand.getOutsideSqlPath());
                log("option: " + behaviorCommand.getOutsideSqlOption());
            }
        }
    }

    protected <RESULT> void filterBehaviorResult(LdBehaviorCommand<RESULT> behaviorCommand, LdInvokeNameResult behaviorResult) {
        final String simpleClassName = behaviorResult.getSimpleClassName();
        if (simpleClassName == null) {
            return;
        }
        if (simpleClassName.contains("Behavior") && simpleClassName.endsWith("$SLFunction")) {
            final String behaviorClassName = findBehaviorClassNameFromDBMeta(behaviorCommand.getTableDbName());
            behaviorResult.setSimpleClassName(behaviorClassName);
            behaviorResult.setMethodName("scalarSelect()." + behaviorResult.getMethodName());
        }
    }

    protected <RESULT> void logPath(LdBehaviorCommand<RESULT> behaviorCommand, StackTraceElement[] stackTrace, LdInvokeNameResult behaviorResult) {
        final int bhvNextIndex = behaviorResult.getNextStartIndex();
        final LdInvokeNameResult clientResult = extractClientInvokeName(stackTrace, bhvNextIndex);
        final int clientFirstIndex = clientResult.getFoundFirstIndex();
        final LdInvokeNameResult byPassResult = extractByPassInvokeName(stackTrace, bhvNextIndex, clientFirstIndex - bhvNextIndex);

        final String clientInvokeName = clientResult.getInvokeName();
        final String byPassInvokeName = byPassResult.getInvokeName();
        final String behaviorInvokeName = behaviorResult.getInvokeName();
        if (clientInvokeName.trim().length() == 0 && byPassInvokeName.trim().length() == 0) {
            return;
        }
        
        // Save client invoke name for error message.
        if (!clientResult.isEmptyResult()) {
            putObjectToMapContext("df:ClientInvokeName", clientInvokeName);
        }
        // Save by-pass invoke name for error message.
        if (!byPassResult.isEmptyResult()) {
            putObjectToMapContext("df:ByPassInvokeName", byPassInvokeName);
        }
        
        log(clientInvokeName + byPassInvokeName + behaviorInvokeName + "...");
    }

    protected <RESULT> String buildInvocationExpressionWithoutKakko(LdBehaviorCommand<RESULT> behaviorCommand
                                                                  , String invokeClassName, String invokeMethodName) {
        if (invokeClassName.contains("OutsideSql") && invokeClassName.endsWith("Executor")) { // OutsideSql Executor Handling
            try {
                final String originalName = invokeClassName;
                if (behaviorCommand.isOutsideSql()) {
                    final LdOutsideSqlContext outsideSqlContext = getOutsideSqlContext();
                    final String tableDbName = outsideSqlContext.getTableDbName();
                    final String behaviorClassName = findBehaviorClassNameFromDBMeta(tableDbName);
                    invokeClassName = behaviorClassName + ".outsideSql()";
                    if (originalName.endsWith("OutsideSqlEntityExecutor")) {
                        invokeClassName = invokeClassName + ".entityHandling()";
                    } else if (originalName.endsWith("OutsideSqlPagingExecutor")) {
                        if (outsideSqlContext.isAutoPagingLogging()) {
                            invokeClassName = invokeClassName + ".autoPaging()";
                        } else {
                            invokeClassName = invokeClassName + ".manualPaging()";
                        }
                    } else if (originalName.endsWith("OutsideSqlCursorExecutor")) {
                        invokeClassName = invokeClassName + ".cursorHandling()";
                    }
                } else {
                    invokeClassName = "OutsideSql";
                }
            } catch (RuntimeException ignored) {
                log("Ignored exception occurred: msg=" + ignored.getMessage());
            }
        }
        String callerExpressionWithoutKakko = invokeClassName  + "." + invokeMethodName;
        if ("selectPage".equals(invokeMethodName)) { // Special Handling!
            boolean resultTypeInteger = false;
            if (behaviorCommand.isOutsideSql()) {
                final LdOutsideSqlContext outsideSqlContext = getOutsideSqlContext();
                final Object resultTypeSpecification = outsideSqlContext.getResultTypeSpecification();
                if (resultTypeSpecification != null && resultTypeSpecification instanceof Class<?>) {
                    final Class<?> resultType = (Class<?>)resultTypeSpecification;
                    if (Integer.class.isAssignableFrom(resultType)) {
                        resultTypeInteger = true;
                    }
                }
            }
            if (resultTypeInteger || behaviorCommand.isSelectCount()) {
                callerExpressionWithoutKakko = callerExpressionWithoutKakko + "():count";
            } else {
                callerExpressionWithoutKakko = callerExpressionWithoutKakko + "():paging";
            }
        }
        return callerExpressionWithoutKakko;
    }

    protected String buildFitBorder(String prefix, String element, String lengthTargetString, boolean space) {
        final int length = space ? lengthTargetString.length() / 2 : lengthTargetString.length();
        final StringBuffer sb = new StringBuffer();
        sb.append(prefix);
        for (int i = 0; i < length; i++) {
            sb.append(element);
            if (space) {
                sb.append(" ");
            }
        }
        if (space) {
            sb.append(element);
        }
        return sb.toString();
    }

    protected LdInvokeNameResult extractClientInvokeName(StackTraceElement[] stackTrace, final int startIndex) {
        final List<String> suffixList = Arrays.asList(new String[]{"Page", "Action"});
        final LdInvokeNameExtractingResource resource = new LdInvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                return isClassNameEndsWith(className, suffixList);
            }
            public String filterSimpleClassName(String simpleClassName) {
                return simpleClassName;
            }
            public boolean isUseAdditionalInfo() {
                return true;
            }
            public int getStartIndex() {
                return startIndex;
            }
            public int getLoopSize() {
                return 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected LdInvokeNameResult extractByPassInvokeName(StackTraceElement[] stackTrace, final int startIndex, final int loopSize) {
        final List<String> suffixList = Arrays.asList(new String[]{"Service", "ServiceImpl", "Facade", "FacadeImpl"});
        final LdInvokeNameExtractingResource resource = new LdInvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                return isClassNameEndsWith(className, suffixList);
            }
            public String filterSimpleClassName(String simpleClassName) {
                return simpleClassName;
            }
            public boolean isUseAdditionalInfo() {
                return true;
            }
            public int getStartIndex() {
                return startIndex;
            }
            public int getLoopSize() {
                return loopSize >= 0 ? loopSize : 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected LdInvokeNameResult extractBehaviorInvokeName(StackTraceElement[] stackTrace) {
        final List<String> suffixList = Arrays.asList(new String[]{"Bhv", "BehaviorReadable", "BehaviorWritable" , "PagingInvoker"});
        final List<String> keywordList = Arrays.asList(new String[]{"Bhv$", "BehaviorReadable$", "BehaviorWritable$"});
        final List<String> ousideSql1List = Arrays.asList(new String[]{"OutsideSql"});
        final List<String> ousideSql2List = Arrays.asList(new String[]{"Executor"});
        final List<String> ousideSql3List = Arrays.asList(new String[]{"Executor$"});
        final LdInvokeNameExtractingResource resource = new LdInvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                if (isClassNameEndsWith(className, suffixList)) {
                    return true;
                }
                if (isClassNameContains(className, keywordList)) {
                    return true;
                }
                if (isClassNameContains(className, ousideSql1List)
                        && (isClassNameEndsWith(className, ousideSql2List) || isClassNameContains(className, ousideSql3List))) {
                    return true;
                }
                return false;
            }
            public String filterSimpleClassName(String simpleClassName) {
                return removeBasePrefixFromSimpleClassName(simpleClassName);
            }
            public boolean isUseAdditionalInfo() {
                return false;
            }
            public int getStartIndex() {
                return 0;
            }
            public int getLoopSize() {
                return 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected boolean isClassNameEndsWith(String className, List<String> suffixList) {
        for (String suffix : suffixList) {
            if (className.endsWith(suffix)) {
                return true;
            }
        }
        return false;
    }
    
    
    protected boolean isClassNameContains(String className, List<String> keywordList) {
        for (String keyword : keywordList) {
            if (className.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param resource the call-back resource for invoke-name-extracting. (NotNull)
     * @param stackTrace Stack log. (NotNull)
     * @return The result of invoke name. (NotNull: If not found, returns empty string.)
     */
    protected LdInvokeNameResult extractInvokeName(LdInvokeNameExtractingResource resource, StackTraceElement[] stackTrace) {
        final LdInvokeNameExtractorImpl extractor = new LdInvokeNameExtractorImpl();
        extractor.setStackTrace(stackTrace);
        return extractor.extractInvokeName(resource);
    }

    /**
     * @param simpleClassName The simple class name. (NotNull)
     * @return The simple class name removed the base prefix. (NotNull)
     */
    protected String removeBasePrefixFromSimpleClassName(String simpleClassName) {
        if (!simpleClassName.startsWith("LdBs")) {
            return simpleClassName;
        }
        final int prefixLength = "LdBs".length();
        if (!Character.isUpperCase(simpleClassName.substring(prefixLength).charAt(0))) {
            return simpleClassName;
        }
        if (simpleClassName.length() <= prefixLength) {
            return simpleClassName;
        }
        return "Ld" + simpleClassName.substring(prefixLength);
    }

    protected String findBehaviorClassNameFromDBMeta(String tableDbName) {
        final LdDBMeta dbmeta = LdResourceContext.provideDBMetaChecked(tableDbName);
        final String behaviorTypeName = dbmeta.getBehaviorTypeName();
        final String behaviorClassName = behaviorTypeName.substring(behaviorTypeName.lastIndexOf(".") + ".".length());
        return removeBasePrefixFromSimpleClassName(behaviorClassName);
    }

    // ===================================================================================
    //                                                                          Log Return
    //                                                                          ==========
    protected <RESULT> void logReturn(LdBehaviorCommand<RESULT> behaviorCommand, Class<?> retType, Object ret, long before, long after) {
        try {
            final String daoResultPrefix = "===========/ [" + LdTraceViewUtil.convertToPerformanceView(after - before) + " - ";
            if (List.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected list: null]");
                } else {
                    final List<?> ls = (java.util.List<?>) ret;
                    if (ls.isEmpty()) {
                        log(daoResultPrefix + "Selected list: 0]");
                    } else if (ls.size() == 1 && ls.get(0) instanceof Number) {
                        log(daoResultPrefix + "Selected count: " + ls.get(0) + "]");
                    } else {
                        log(daoResultPrefix + "Selected list: " + ls.size() + " first=" + ls.get(0) + "]");
                    }
                }
            } else if (LdEntity.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final LdEntity entity = (LdEntity) ret;
                    log(daoResultPrefix + "Selected entity: " + entity + "]");
                }
            } else if (LdEntity.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final LdEntity entity = (LdEntity) ret;
                    log(daoResultPrefix + "Selected entity: " + entity + "]");
                }
            } else if (int[].class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final int[] resultArray = (int[]) ret;
                    if (resultArray.length == 0) {
                        log(daoResultPrefix + "All updated count: 0]");
                    } else {
                        final StringBuilder sb = new StringBuilder();
                        boolean resultExpressionScope = true;
                        int resultCount = 0;
                        int loopCount = 0;
                        for (int element : resultArray) {
                            resultCount = resultCount + element;
                            if (resultExpressionScope) {
                                if (loopCount <= 10) {
                                    if (sb.length() == 0) {
                                        sb.append(element);
                                    } else {
                                        sb.append(",").append(element);
                                    }
                                } else {
                                    sb.append(",").append("...");
                                    resultExpressionScope = false;
                                }
                            }
                            ++loopCount;
                        }
                        sb.insert(0, "{").append("}");
                        log(daoResultPrefix + "All updated count: " + resultCount + " result=" + sb + "]");
                    }
                }
            } else {
                if (behaviorCommand.isSelectCount()) {
                    log(daoResultPrefix + "Selected count: " + ret + "]");
                } else {
                    log(daoResultPrefix + "Result: " + ret + "]");
                }
            }
            log(" ");
        } catch (RuntimeException e) {
            String msg = "Result object debug threw the exception: behaviorCommand=";
            msg = msg + behaviorCommand + " retType=" + retType;
            msg = msg + " ret=" + ret;
            throw e;
        }
    }

    // ===================================================================================
    //                                                                      Context Helper
    //                                                                      ==============
    protected LdOutsideSqlContext getOutsideSqlContext() {
        if (!LdOutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            return null;
        }
        return LdOutsideSqlContext.getOutsideSqlContextOnThread();
    }
    
    protected void putObjectToMapContext(String key, Object value) {
        LdInternalMapContext.setObject(key, value);
    }

    protected void clearContext() {
        if (LdOutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            LdOutsideSqlContext.clearOutsideSqlContextOnThread();
        }
        if (LdFetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread()) {
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            // Because there is possible that fetch narrowing has been ignored for manualPaging of outsideSql.
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            LdFetchNarrowingBeanContext.getFetchNarrowingBeanOnThread().restoreIgnoredFetchNarrowing();

            LdFetchNarrowingBeanContext.clearFetchNarrowingBeanOnThread();
        }
        if (LdConditionBeanContext.isExistConditionBeanOnThread()) {
            LdConditionBeanContext.clearConditionBeanOnThread();
        }
        if (LdInternalMapContext.isExistInternalMapContextOnThread()) {
            LdInternalMapContext.clearInternalMapContextOnThread();
        }
        if (LdResourceContext.isExistResourceContextOnThread()) {
            LdResourceContext.clearResourceContextOnThread();
        }
    }

    // ===================================================================================
    //                                                                  Execute Status Log
    //                                                                  ==================
    protected void log(String msg) {
        LdXLog.log(msg);
    }
    
    protected boolean isLogEnabled() {
        return LdXLog.isLogEnabled();
    }

    // ===================================================================================
    //                                                                             Dispose
    //                                                                             =======
    protected void toBeDisposable() {
        assertInvokerAssistant();
        _invokerAssistant.toBeDisposable();
    }

    // ===================================================================================
    //                                                                      Convert Helper
    //                                                                      ==============
    protected Object convertPrimitiveWrapper(Class<?> retType, Object ret) {
        return LdSimpleTypeUtil.toWrapper(retType, ret);
    }

    protected Object convertNumber(Class<?> retType, Object ret) {
        return LdSimpleTypeUtil.toNumber(retType, ret);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertRetType(Class<?> retType, Object ret) {
        if (List.class.isAssignableFrom(retType)) {
            if (ret != null && !(ret instanceof List)) {
                String msg = "The retType is difference from actual return: ";
                msg = msg + "retType=" + retType + " ret.getClass()=" + ret.getClass() + " ref=" + ret;
                throw new IllegalStateException(msg);
            }
        } else if (LdEntity.class.isAssignableFrom(retType)) {
            if (ret != null && !(ret instanceof LdEntity)) {
                String msg = "The retType is difference from actual return: ";
                msg = msg + "retType=" + retType + " ret.getClass()=" + ret.getClass() + " ref=" + ret;
                throw new IllegalStateException(msg);
            }
        }
    }

    protected void assertInvokerAssistant() {
        if (_invokerAssistant == null) {
            String msg = "The attribute 'invokerAssistant' should not be null!";
            throw new IllegalStateException(msg);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setInvokerAssistant(LdInvokerAssistant invokerAssistant) {
        _invokerAssistant = invokerAssistant;
    }

    public void setDataSource(DataSource dataSource) {
        _dataSource = dataSource;
    }

    public void setBeanMetaDataFactory(BeanMetaDataFactory beanMetaDataFactory) {
        _beanMetaDataFactory = beanMetaDataFactory;
    }

    public void setValueTypeFactory(ValueTypeFactory valueTypeFactory) {
        _valueTypeFactory = valueTypeFactory;
    }
}
