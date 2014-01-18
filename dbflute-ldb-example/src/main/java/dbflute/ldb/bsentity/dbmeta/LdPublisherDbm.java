/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdPublisher;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of PUBLISHER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdPublisherDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdPublisherDbm _instance = new LdPublisherDbm();
    private LdPublisherDbm() {}
    public static LdPublisherDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "PUBLISHER"; }
    public String getTablePropertyName() { return "publisher"; }
    public String getTableSqlName() { return "PUBLISHER"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnPublisherId = cci("PUBLISHER_ID", null, "publisherId", Integer.class, true, null, null);
    protected LdColumnInfo _columnPublisherName = cci("PUBLISHER_NAME", null, "publisherName", String.class, false, 80, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnPublisherId() { return _columnPublisherId; }
    public LdColumnInfo columnPublisherName() { return _columnPublisherName; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnPublisherId()); }
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
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnPublisherId(), LdBookDbm.getInstance().columnPublisherId());
        return cri("bookList", this, LdBookDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public PublisherRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new PublisherRelationTrace(relationTraceFixHandler);
    }

    public PublisherRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new PublisherRelationTrace(relationList, relationTraceList);
    }

    public static class PublisherRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public PublisherRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public PublisherRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdBookDbm.BookRelationTrace referrerBookList() {
            _relationList.add(LdPublisherDbm.getInstance().referrerBookList());
            return LdBookDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnPublisherId() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnPublisherId()); }
        public RelationTrace columnPublisherName() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnPublisherName()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdPublisherDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdPublisher"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdPublisherCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdPublisherDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdPublisherBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdPublisher> getEntityType() { return LdPublisher.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdPublisher newMyEntity() { return new LdPublisher(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdPublisher)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdPublisher)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdPublisher>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsPublisherId(), columnPublisherId());
        setupEps(_epsMap, new EpsPublisherName(), columnPublisherName());
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
        findEps(_epsMap, propertyName).setup((LdPublisher)entity, value);
    }
    
    public static class EpsPublisherId implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setPublisherId((Integer)v); }
    }
    public static class EpsPublisherName implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setPublisherName((String)v); }
    }
    public static class EpsRUser implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdPublisher> {
        public void setup(LdPublisher e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
