/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdLbUser;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of LB_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLbUserDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLbUserDbm _instance = new LdLbUserDbm();
    private LdLbUserDbm() {}
    public static LdLbUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "LB_USER"; }
    public String getTablePropertyName() { return "lbUser"; }
    public String getTableSqlName() { return "LB_USER"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLbUserId = cci("LB_USER_ID", null, "lbUserId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLbUserName = cci("LB_USER_NAME", null, "lbUserName", String.class, false, 80, 0);
    protected LdColumnInfo _columnUserPassword = cci("USER_PASSWORD", null, "userPassword", String.class, false, 50, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLbUserId() { return _columnLbUserId; }
    public LdColumnInfo columnLbUserName() { return _columnLbUserName; }
    public LdColumnInfo columnUserPassword() { return _columnUserPassword; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnLbUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignBlackListAsOne() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLbUserId(), LdBlackListDbm.getInstance().columnLbUserId());
        return cfi("blackListAsOne", this, LdBlackListDbm.getInstance(), map, 0, true);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerLibraryUserList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLbUserId(), LdLibraryUserDbm.getInstance().columnLbUserId());
        return cri("libraryUserList", this, LdLibraryUserDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public LbUserRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new LbUserRelationTrace(relationTraceFixHandler);
    }

    public LbUserRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new LbUserRelationTrace(relationList, relationTraceList);
    }

    public static class LbUserRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public LbUserRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public LbUserRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBlackListDbm.BlackListRelationTrace foreignBlackListAsOne() {
            _relationList.add(LdLbUserDbm.getInstance().foreignBlackListAsOne());
            return LdBlackListDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryUserDbm.LibraryUserRelationTrace referrerLibraryUserList() {
            _relationList.add(LdLbUserDbm.getInstance().referrerLibraryUserList());
            return LdLibraryUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLbUserId() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnLbUserId()); }
        public RelationTrace columnLbUserName() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnLbUserName()); }
        public RelationTrace columnUserPassword() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnUserPassword()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdLbUserDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdLbUser"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdLbUserCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdLbUserDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdLbUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLbUser> getEntityType() { return LdLbUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdLbUser newMyEntity() { return new LdLbUser(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdLbUser)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdLbUser)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdLbUser>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLbUserId(), columnLbUserId());
        setupEps(_epsMap, new EpsLbUserName(), columnLbUserName());
        setupEps(_epsMap, new EpsUserPassword(), columnUserPassword());
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
        findEps(_epsMap, propertyName).setup((LdLbUser)entity, value);
    }
    
    public static class EpsLbUserId implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setLbUserId((Integer)v); }
    }
    public static class EpsLbUserName implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setLbUserName((String)v); }
    }
    public static class EpsUserPassword implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setUserPassword((String)v); }
    }
    public static class EpsRUser implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdLbUser> {
        public void setup(LdLbUser e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
