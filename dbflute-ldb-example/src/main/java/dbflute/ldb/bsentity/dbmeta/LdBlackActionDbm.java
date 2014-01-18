/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdBlackAction;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BLACK_ACTION. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackActionDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBlackActionDbm _instance = new LdBlackActionDbm();
    private LdBlackActionDbm() {}
    public static LdBlackActionDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BLACK_ACTION"; }
    public String getTablePropertyName() { return "blackAction"; }
    public String getTableSqlName() { return "BLACK_ACTION"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBlackActionId = cci("BLACK_ACTION_ID", null, "blackActionId", Integer.class, true, null, null);
    protected LdColumnInfo _columnBlackListId = cci("BLACK_LIST_ID", null, "blackListId", Integer.class, false, null, null);
    protected LdColumnInfo _columnBlackActionCode = cci("BLACK_ACTION_CODE", null, "blackActionCode", String.class, false, 3, 0);
    protected LdColumnInfo _columnBlackLevel = cci("BLACK_LEVEL", null, "blackLevel", Integer.class, false, null, null);
    protected LdColumnInfo _columnActionDate = cci("ACTION_DATE", null, "actionDate", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnEvidencePhotograph = cci("EVIDENCE_PHOTOGRAPH", null, "evidencePhotograph", byte[].class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBlackActionId() { return _columnBlackActionId; }
    public LdColumnInfo columnBlackListId() { return _columnBlackListId; }
    public LdColumnInfo columnBlackActionCode() { return _columnBlackActionCode; }
    public LdColumnInfo columnBlackLevel() { return _columnBlackLevel; }
    public LdColumnInfo columnActionDate() { return _columnActionDate; }
    public LdColumnInfo columnEvidencePhotograph() { return _columnEvidencePhotograph; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnBlackActionId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignBlackActionLookup() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBlackActionCode(), LdBlackActionLookupDbm.getInstance().columnBlackActionCode());
        return cfi("blackActionLookup", this, LdBlackActionLookupDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignBlackList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBlackListId(), LdBlackListDbm.getInstance().columnBlackListId());
        return cfi("blackList", this, LdBlackListDbm.getInstance(), map, 1, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public BlackActionRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BlackActionRelationTrace(relationTraceFixHandler);
    }

    public BlackActionRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BlackActionRelationTrace(relationList, relationTraceList);
    }

    public static class BlackActionRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BlackActionRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BlackActionRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBlackActionLookupDbm.BlackActionLookupRelationTrace foreignBlackActionLookup() {
            _relationList.add(LdBlackActionDbm.getInstance().foreignBlackActionLookup());
            return LdBlackActionLookupDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdBlackListDbm.BlackListRelationTrace foreignBlackList() {
            _relationList.add(LdBlackActionDbm.getInstance().foreignBlackList());
            return LdBlackListDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnBlackActionId() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnBlackActionId()); }
        public RelationTrace columnBlackListId() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnBlackListId()); }
        public RelationTrace columnBlackActionCode() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnBlackActionCode()); }
        public RelationTrace columnBlackLevel() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnBlackLevel()); }
        public RelationTrace columnActionDate() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnActionDate()); }
        public RelationTrace columnEvidencePhotograph() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnEvidencePhotograph()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBlackActionDbm.getInstance().columnUTimestamp()); }
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasUpdateDate() { return true; }
    public LdColumnInfo getUpdateDateColumnInfo() { return _columnUTimestamp; }
    public boolean hasCommonColumn() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdBlackAction"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdBlackActionCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdBlackActionDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdBlackActionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBlackAction> getEntityType() { return LdBlackAction.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBlackAction newMyEntity() { return new LdBlackAction(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBlackAction)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBlackAction)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdBlackAction>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBlackActionId(), columnBlackActionId());
        setupEps(_epsMap, new EpsBlackListId(), columnBlackListId());
        setupEps(_epsMap, new EpsBlackActionCode(), columnBlackActionCode());
        setupEps(_epsMap, new EpsBlackLevel(), columnBlackLevel());
        setupEps(_epsMap, new EpsActionDate(), columnActionDate());
        setupEps(_epsMap, new EpsEvidencePhotograph(), columnEvidencePhotograph());
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
        findEps(_epsMap, propertyName).setup((LdBlackAction)entity, value);
    }
    
    public static class EpsBlackActionId implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setBlackActionId((Integer)v); }
    }
    public static class EpsBlackListId implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setBlackListId((Integer)v); }
    }
    public static class EpsBlackActionCode implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setBlackActionCode((String)v); }
    }
    public static class EpsBlackLevel implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setBlackLevel((Integer)v); }
    }
    public static class EpsActionDate implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setActionDate((java.sql.Timestamp)v); }
    }
    public static class EpsEvidencePhotograph implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setEvidencePhotograph((byte[])v); }
    }
    public static class EpsRUser implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBlackAction> {
        public void setup(LdBlackAction e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
