/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of BOOK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdBookDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdBookDbm _instance = new LdBookDbm();
    private LdBookDbm() {}
    public static LdBookDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "BOOK"; }
    public String getTablePropertyName() { return "book"; }
    public String getTableSqlName() { return "BOOK"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnBookId = cci("BOOK_ID", null, "bookId", Integer.class, true, null, null);
    protected LdColumnInfo _columnIsbn = cci("ISBN", null, "isbn", String.class, false, 20, 0);
    protected LdColumnInfo _columnBookName = cci("BOOK_NAME", null, "bookName", String.class, false, 80, 0);
    protected LdColumnInfo _columnAuthorId = cci("AUTHOR_ID", null, "authorId", Integer.class, false, null, null);
    protected LdColumnInfo _columnPublisherId = cci("PUBLISHER_ID", null, "publisherId", Integer.class, false, null, null);
    protected LdColumnInfo _columnGenreCode = cci("GENRE_CODE", null, "genreCode", String.class, false, 24, 0);
    protected LdColumnInfo _columnOpeningPart = cci("OPENING_PART", null, "openingPart", String.class, false, null, null);
    protected LdColumnInfo _columnMaxLendingDateCount = cci("MAX_LENDING_DATE_COUNT", null, "maxLendingDateCount", Integer.class, false, null, null);
    protected LdColumnInfo _columnOutOfUserSelectYn = cci("OUT_OF_USER_SELECT_YN", null, "outOfUserSelectYn", String.class, false, 1, 0);
    protected LdColumnInfo _columnOutOfUserSelectReason = cci("OUT_OF_USER_SELECT_REASON", null, "outOfUserSelectReason", String.class, false, 200, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnBookId() { return _columnBookId; }
    public LdColumnInfo columnIsbn() { return _columnIsbn; }
    public LdColumnInfo columnBookName() { return _columnBookName; }
    public LdColumnInfo columnAuthorId() { return _columnAuthorId; }
    public LdColumnInfo columnPublisherId() { return _columnPublisherId; }
    public LdColumnInfo columnGenreCode() { return _columnGenreCode; }
    public LdColumnInfo columnOpeningPart() { return _columnOpeningPart; }
    public LdColumnInfo columnMaxLendingDateCount() { return _columnMaxLendingDateCount; }
    public LdColumnInfo columnOutOfUserSelectYn() { return _columnOutOfUserSelectYn; }
    public LdColumnInfo columnOutOfUserSelectReason() { return _columnOutOfUserSelectReason; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnBookId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignAuthor() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnAuthorId(), LdAuthorDbm.getInstance().columnAuthorId());
        return cfi("author", this, LdAuthorDbm.getInstance(), map, 0, false);
    }
    public LdForeignInfo foreignGenre() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("genre", this, LdGenreDbm.getInstance(), map, 1, false);
    }
    public LdForeignInfo foreignPublisher() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnPublisherId(), LdPublisherDbm.getInstance().columnPublisherId());
        return cfi("publisher", this, LdPublisherDbm.getInstance(), map, 2, false);
    }
    public LdForeignInfo foreignCollectionStatusLookupAsNonExist() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdCollectionStatusLookupDbm.getInstance().columnCollectionStatusCode());
        return cfi("collectionStatusLookupAsNonExist", this, LdCollectionStatusLookupDbm.getInstance(), map, 3, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerCollectionList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnBookId(), LdCollectionDbm.getInstance().columnBookId());
        return cri("collectionList", this, LdCollectionDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public BookRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new BookRelationTrace(relationTraceFixHandler);
    }

    public BookRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new BookRelationTrace(relationList, relationTraceList);
    }

    public static class BookRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public BookRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public BookRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdAuthorDbm.AuthorRelationTrace foreignAuthor() {
            _relationList.add(LdBookDbm.getInstance().foreignAuthor());
            return LdAuthorDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdGenreDbm.GenreRelationTrace foreignGenre() {
            _relationList.add(LdBookDbm.getInstance().foreignGenre());
            return LdGenreDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdPublisherDbm.PublisherRelationTrace foreignPublisher() {
            _relationList.add(LdBookDbm.getInstance().foreignPublisher());
            return LdPublisherDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdCollectionStatusLookupDbm.CollectionStatusLookupRelationTrace foreignCollectionStatusLookupAsNonExist() {
            _relationList.add(LdBookDbm.getInstance().foreignCollectionStatusLookupAsNonExist());
            return LdCollectionStatusLookupDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdCollectionDbm.CollectionRelationTrace referrerCollectionList() {
            _relationList.add(LdBookDbm.getInstance().referrerCollectionList());
            return LdCollectionDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnBookId() { return fixTrace(_relationList, LdBookDbm.getInstance().columnBookId()); }
        public RelationTrace columnIsbn() { return fixTrace(_relationList, LdBookDbm.getInstance().columnIsbn()); }
        public RelationTrace columnBookName() { return fixTrace(_relationList, LdBookDbm.getInstance().columnBookName()); }
        public RelationTrace columnAuthorId() { return fixTrace(_relationList, LdBookDbm.getInstance().columnAuthorId()); }
        public RelationTrace columnPublisherId() { return fixTrace(_relationList, LdBookDbm.getInstance().columnPublisherId()); }
        public RelationTrace columnGenreCode() { return fixTrace(_relationList, LdBookDbm.getInstance().columnGenreCode()); }
        public RelationTrace columnOpeningPart() { return fixTrace(_relationList, LdBookDbm.getInstance().columnOpeningPart()); }
        public RelationTrace columnMaxLendingDateCount() { return fixTrace(_relationList, LdBookDbm.getInstance().columnMaxLendingDateCount()); }
        public RelationTrace columnOutOfUserSelectYn() { return fixTrace(_relationList, LdBookDbm.getInstance().columnOutOfUserSelectYn()); }
        public RelationTrace columnOutOfUserSelectReason() { return fixTrace(_relationList, LdBookDbm.getInstance().columnOutOfUserSelectReason()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdBookDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdBookDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdBookDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdBookDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdBookDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdBookDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdBook"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdBookCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdBookDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdBookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdBook> getEntityType() { return LdBook.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdBook newMyEntity() { return new LdBook(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdBook)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdBook)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdBook>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsBookId(), columnBookId());
        setupEps(_epsMap, new EpsIsbn(), columnIsbn());
        setupEps(_epsMap, new EpsBookName(), columnBookName());
        setupEps(_epsMap, new EpsAuthorId(), columnAuthorId());
        setupEps(_epsMap, new EpsPublisherId(), columnPublisherId());
        setupEps(_epsMap, new EpsGenreCode(), columnGenreCode());
        setupEps(_epsMap, new EpsOpeningPart(), columnOpeningPart());
        setupEps(_epsMap, new EpsMaxLendingDateCount(), columnMaxLendingDateCount());
        setupEps(_epsMap, new EpsOutOfUserSelectYn(), columnOutOfUserSelectYn());
        setupEps(_epsMap, new EpsOutOfUserSelectReason(), columnOutOfUserSelectReason());
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
        findEps(_epsMap, propertyName).setup((LdBook)entity, value);
    }
    
    public static class EpsBookId implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setBookId((Integer)v); }
    }
    public static class EpsIsbn implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setIsbn((String)v); }
    }
    public static class EpsBookName implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setBookName((String)v); }
    }
    public static class EpsAuthorId implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setAuthorId((Integer)v); }
    }
    public static class EpsPublisherId implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setPublisherId((Integer)v); }
    }
    public static class EpsGenreCode implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setGenreCode((String)v); }
    }
    public static class EpsOpeningPart implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setOpeningPart((String)v); }
    }
    public static class EpsMaxLendingDateCount implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setMaxLendingDateCount((Integer)v); }
    }
    public static class EpsOutOfUserSelectYn implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setOutOfUserSelectYn((String)v); }
    }
    public static class EpsOutOfUserSelectReason implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setOutOfUserSelectReason((String)v); }
    }
    public static class EpsRUser implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdBook> {
        public void setup(LdBook e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
