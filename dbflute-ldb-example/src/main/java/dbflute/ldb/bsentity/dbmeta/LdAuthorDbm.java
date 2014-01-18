/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of AUTHOR. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdAuthorDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdAuthorDbm _instance = new LdAuthorDbm();
    private LdAuthorDbm() {}
    public static LdAuthorDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "AUTHOR"; }
    public String getTablePropertyName() { return "author"; }
    public String getTableSqlName() { return "AUTHOR"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnAuthorId = cci("AUTHOR_ID", null, "authorId", Integer.class, true, null, null);
    protected LdColumnInfo _columnAuthorName = cci("AUTHOR_NAME", null, "authorName", String.class, false, 80, 0);
    protected LdColumnInfo _columnAuthorAge = cci("AUTHOR_AGE", null, "authorAge", Integer.class, false, null, null);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnAuthorId() { return _columnAuthorId; }
    public LdColumnInfo columnAuthorName() { return _columnAuthorName; }
    public LdColumnInfo columnAuthorAge() { return _columnAuthorAge; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnAuthorId()); }
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
    public LdReferrerInfo referrerBookList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnAuthorId(), LdBookDbm.getInstance().columnAuthorId());
        return cri("bookList", this, LdBookDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public AuthorRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new AuthorRelationTrace(relationTraceFixHandler);
    }

    public AuthorRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new AuthorRelationTrace(relationList, relationTraceList);
    }

    public static class AuthorRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public AuthorRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public AuthorRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBookDbm.BookRelationTrace referrerBookList() {
            _relationList.add(LdAuthorDbm.getInstance().referrerBookList());
            return LdBookDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnAuthorId() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnAuthorId()); }
        public RelationTrace columnAuthorName() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnAuthorName()); }
        public RelationTrace columnAuthorAge() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnAuthorAge()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdAuthorDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdAuthor"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdAuthorCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdAuthorDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdAuthorBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdAuthor> getEntityType() { return LdAuthor.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdAuthor newMyEntity() { return new LdAuthor(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdAuthor)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdAuthor)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdAuthor>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsAuthorId(), columnAuthorId());
        setupEps(_epsMap, new EpsAuthorName(), columnAuthorName());
        setupEps(_epsMap, new EpsAuthorAge(), columnAuthorAge());
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
        findEps(_epsMap, propertyName).setup((LdAuthor)entity, value);
    }
    
    public static class EpsAuthorId implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setAuthorId((Integer)v); }
    }
    public static class EpsAuthorName implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setAuthorName((String)v); }
    }
    public static class EpsAuthorAge implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setAuthorAge((Integer)v); }
    }
    public static class EpsRUser implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdAuthor> {
        public void setup(LdAuthor e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
