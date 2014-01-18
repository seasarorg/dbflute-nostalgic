/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdLibraryUser;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of LIBRARY_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdLibraryUserDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdLibraryUserDbm _instance = new LdLibraryUserDbm();
    private LdLibraryUserDbm() {}
    public static LdLibraryUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "LIBRARY_USER"; }
    public String getTablePropertyName() { return "libraryUser"; }
    public String getTableSqlName() { return "LIBRARY_USER"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnLibraryId = cci("LIBRARY_ID", null, "libraryId", Integer.class, true, null, null);
    protected LdColumnInfo _columnLbUserId = cci("LB_USER_ID", null, "lbUserId", Integer.class, true, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnLibraryId() { return _columnLibraryId; }
    public LdColumnInfo columnLbUserId() { return _columnLbUserId; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() {
        List<LdColumnInfo> ls = newArrayList();
        ls.add(columnLibraryId());
        ls.add(columnLbUserId());
        return cpui(ls);
    }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return true; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignLbUser() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLbUserId(), LdLbUserDbm.getInstance().columnLbUserId());
        return cfi("lbUser", this, LdLbUserDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignLibrary() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnLibraryId(), LdLibraryDbm.getInstance().columnLibraryId());
        return cfi("library", this, LdLibraryDbm.getInstance(), map, 1, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerLendingList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap();
        map.put(columnLibraryId(), LdLendingDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLendingDbm.getInstance().columnLbUserId());
        return cri("lendingList", this, LdLendingDbm.getInstance(), map, false);
    }
    public LdReferrerInfo referrerLendingCollectionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap();
        map.put(columnLibraryId(), LdLendingCollectionDbm.getInstance().columnLibraryId());
        map.put(columnLbUserId(), LdLendingCollectionDbm.getInstance().columnLbUserId());
        return cri("lendingCollectionList", this, LdLendingCollectionDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public LibraryUserRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new LibraryUserRelationTrace(relationTraceFixHandler);
    }

    public LibraryUserRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new LibraryUserRelationTrace(relationList, relationTraceList);
    }

    public static class LibraryUserRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public LibraryUserRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public LibraryUserRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdLbUserDbm.LbUserRelationTrace foreignLbUser() {
            _relationList.add(LdLibraryUserDbm.getInstance().foreignLbUser());
            return LdLbUserDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLibraryDbm.LibraryRelationTrace foreignLibrary() {
            _relationList.add(LdLibraryUserDbm.getInstance().foreignLibrary());
            return LdLibraryDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLendingDbm.LendingRelationTrace referrerLendingList() {
            _relationList.add(LdLibraryUserDbm.getInstance().referrerLendingList());
            return LdLendingDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdLendingCollectionDbm.LendingCollectionRelationTrace referrerLendingCollectionList() {
            _relationList.add(LdLibraryUserDbm.getInstance().referrerLendingCollectionList());
            return LdLendingCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnLibraryId() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnLibraryId()); }
        public RelationTrace columnLbUserId() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnLbUserId()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdLibraryUserDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdLibraryUser"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdLibraryUserCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdLibraryUserDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdLibraryUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdLibraryUser> getEntityType() { return LdLibraryUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdLibraryUser newMyEntity() { return new LdLibraryUser(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdLibraryUser)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdLibraryUser)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdLibraryUser>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsLibraryId(), columnLibraryId());
        setupEps(_epsMap, new EpsLbUserId(), columnLbUserId());
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
        findEps(_epsMap, propertyName).setup((LdLibraryUser)entity, value);
    }
    
    public static class EpsLibraryId implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setLibraryId((Integer)v); }
    }
    public static class EpsLbUserId implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setLbUserId((Integer)v); }
    }
    public static class EpsRUser implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdLibraryUser> {
        public void setup(LdLibraryUser e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
