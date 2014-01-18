/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdBlackList;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BLACK_LIST. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBlackListDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBlackListDbm _instance = new LdBlackListDbm();
    private LdBlackListDbm() {}
    public static LdBlackListDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BLACK_LIST"; }
    public String getTablePropertyName() { return "blackList"; }
    public String getTableSqlName() { return "BLACK_LIST"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBlackListId = cci("BLACK_LIST_ID", null, "blackListId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLbUserId = cci("LB_USER_ID", null, "lbUserId", Integer.class, false, null, null);
    protected LdColumnInfo _columnBlackRank = cci("BLACK_RANK", null, "blackRank", String.class, false, 3, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBlackListId() { return _columnBlackListId; }
    public LdColumnInfo columnLbUserId() { return _columnLbUserId; }
    public LdColumnInfo columnBlackRank() { return _columnBlackRank; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnBlackListId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignLbUser() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLbUserId(), LdLbUserDbm.getInstance().columnLbUserId());
        return cfi("lbUser", this, LdLbUserDbm.getInstance(), map, 0, true);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerBlackActionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBlackListId(), LdBlackActionDbm.getInstance().columnBlackListId());
        return cri("blackActionList", this, LdBlackActionDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public BlackListRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BlackListRelationTrace(relationTraceFixHandler);
    }

    public BlackListRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BlackListRelationTrace(relationList, relationTraceList);
    }

    public static class BlackListRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BlackListRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BlackListRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdLbUserDbm.LbUserRelationTrace foreignLbUser() {
            _relationList.add(LdBlackListDbm.getInstance().foreignLbUser());
            return LdLbUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdBlackActionDbm.BlackActionRelationTrace referrerBlackActionList() {
            _relationList.add(LdBlackListDbm.getInstance().referrerBlackActionList());
            return LdBlackActionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnBlackListId() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnBlackListId()); }
        public RelationTrace columnLbUserId() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnLbUserId()); }
        public RelationTrace columnBlackRank() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnBlackRank()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBlackListDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdBlackList"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdBlackListCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdBlackListDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdBlackListBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBlackList> getEntityType() { return LdBlackList.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBlackList newMyEntity() { return new LdBlackList(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBlackList)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBlackList)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdBlackList>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBlackListId(), columnBlackListId());
        setupEps(_epsMap, new EpsLbUserId(), columnLbUserId());
        setupEps(_epsMap, new EpsBlackRank(), columnBlackRank());
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
        findEps(_epsMap, propertyName).setup((LdBlackList)entity, value);
    }
    
    public static class EpsBlackListId implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setBlackListId((Integer)v); }
    }
    public static class EpsLbUserId implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setLbUserId((Integer)v); }
    }
    public static class EpsBlackRank implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setBlackRank((String)v); }
    }
    public static class EpsRUser implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBlackList> {
        public void setup(LdBlackList e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
