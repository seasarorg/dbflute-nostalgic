/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdBlackActionLookup;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BLACK_ACTION_LOOKUP. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionLookupDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBlackActionLookupDbm _instance = new LdBlackActionLookupDbm();
    private LdBlackActionLookupDbm() {}
    public static LdBlackActionLookupDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BLACK_ACTION_LOOKUP"; }
    public String getTablePropertyName() { return "blackActionLookup"; }
    public String getTableSqlName() { return "BLACK_ACTION_LOOKUP"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBlackActionCode = cci("BLACK_ACTION_CODE", null, "blackActionCode", String.class, true, 3, 0);
    protected LdColumnInfo _columnBlackActionName = cci("BLACK_ACTION_NAME", null, "blackActionName", String.class, false, 80, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBlackActionCode() { return _columnBlackActionCode; }
    public LdColumnInfo columnBlackActionName() { return _columnBlackActionName; }
    public LdColumnInfo columnRUser() { return _columnRUser; }
    public LdColumnInfo columnRModule() { return _columnRModule; }
    public LdColumnInfo columnRTimestamp() { return _columnRTimestamp; }
    public LdColumnInfo columnUUser() { return _columnUUser; }
    public LdColumnInfo columnUModule() { return _columnUModule; }
    public LdColumnInfo columnUTimestamp() { return _columnUTimestamp; }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnBlackActionCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerBlackActionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBlackActionCode(), LdBlackActionDbm.getInstance().columnBlackActionCode());
        return cri("blackActionList", this, LdBlackActionDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public BlackActionLookupRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BlackActionLookupRelationTrace(relationTraceFixHandler);
    }

    public BlackActionLookupRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BlackActionLookupRelationTrace(relationList, relationTraceList);
    }

    public static class BlackActionLookupRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BlackActionLookupRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BlackActionLookupRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBlackActionDbm.BlackActionRelationTrace referrerBlackActionList() {
            _relationList.add(LdBlackActionLookupDbm.getInstance().referrerBlackActionList());
            return LdBlackActionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnBlackActionCode() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnBlackActionCode()); }
        public RelationTrace columnBlackActionName() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnBlackActionName()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBlackActionLookupDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdBlackActionLookup"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdBlackActionLookupCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdBlackActionLookupDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdBlackActionLookupBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBlackActionLookup> getEntityType() { return LdBlackActionLookup.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBlackActionLookup newMyEntity() { return new LdBlackActionLookup(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBlackActionLookup)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBlackActionLookup)entity, columnValueMap, _epsMap);
    }

    public void acceptColumnValueMapString(LdEntity entity, String columnValueMapString) {
        MapStringUtil.acceptColumnValueMapString(columnValueMapString, entity);
    }

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    public String extractPrimaryKeyMapString(LdEntity entity) { return MapStringUtil.extractPrimaryKeyMapString(entity); }
    public String extractPrimaryKeyMapString(LdEntity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractPrimaryKeyMapString(entity, startBrace, endBrace, delimiter, equal);
    }
    public String extractColumnValueMapString(LdEntity entity) { return MapStringUtil.extractColumnValueMapString(entity); }
    public String extractColumnValueMapString(LdEntity entity, String startBrace, String endBrace, String delimiter, String equal) {
        return doExtractColumnValueMapString(entity, startBrace, endBrace, delimiter, equal);
    }

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    public List<Object> convertToColumnValueList(LdEntity entity) { return newArrayList(convertToColumnValueMap(entity).values()); }
    public Map<String, Object> convertToColumnValueMap(LdEntity entity) { return doConvertToColumnValueMap(entity); }
    public List<String> convertToColumnStringValueList(LdEntity entity) { return newArrayList(convertToColumnStringValueMap(entity).values()); }
    public Map<String, String> convertToColumnStringValueMap(LdEntity entity) { return doConvertToColumnStringValueMap(entity); }

    // ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
    // It's very INTERNAL!
    protected Map<String, Eps<LdBlackActionLookup>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBlackActionCode(), columnBlackActionCode());
        setupEps(_epsMap, new EpsBlackActionName(), columnBlackActionName());
        setupEps(_epsMap, new EpsRUser(), columnRUser());
        setupEps(_epsMap, new EpsRModule(), columnRModule());
        setupEps(_epsMap, new EpsRTimestamp(), columnRTimestamp());
        setupEps(_epsMap, new EpsUUser(), columnUUser());
        setupEps(_epsMap, new EpsUModule(), columnUModule());
        setupEps(_epsMap, new EpsUTimestamp(), columnUTimestamp());
    }
    
    public boolean hasEntityPropertySetupper(String propertyName) {
        return _epsMap.containsKey(propertyName);
    }

    public void setupEntityProperty(String propertyName, Object entity, Object value) {
        findEps(_epsMap, propertyName).setup((LdBlackActionLookup)entity, value);
    }
    
    public static class EpsBlackActionCode implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setBlackActionCode((String)v); }
    }
    public static class EpsBlackActionName implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setBlackActionName((String)v); }
    }
    public static class EpsRUser implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBlackActionLookup> {
        public void setup(LdBlackActionLookup e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
