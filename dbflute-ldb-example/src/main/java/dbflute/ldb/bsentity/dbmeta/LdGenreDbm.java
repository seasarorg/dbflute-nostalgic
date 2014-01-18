/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdAbstractDBMeta;
import dbflute.ldb.exentity.LdGenre;
import dbflute.ldb.allcommon.dbmeta.info.*;
import dbflute.ldb.allcommon.helper.LdStringKeyMap;

/**
 * The DB meta of GENRE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class LdGenreDbm extends LdAbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final LdGenreDbm _instance = new LdGenreDbm();
    private LdGenreDbm() {}
    public static LdGenreDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    public String getTableDbName() { return "GENRE"; }
    public String getTablePropertyName() { return "genre"; }
    public String getTableSqlName() { return "GENRE"; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected LdColumnInfo _columnGenreCode = cci("GENRE_CODE", null, "genreCode", String.class, true, 24, 0);
    protected LdColumnInfo _columnGenreName = cci("GENRE_NAME", null, "genreName", String.class, false, 80, 0);
    protected LdColumnInfo _columnHierarchyLevel = cci("HIERARCHY_LEVEL", null, "hierarchyLevel", Integer.class, false, 9, 0);
    protected LdColumnInfo _columnHierarchyOrder = cci("HIERARCHY_ORDER", null, "hierarchyOrder", Long.class, false, 10, 0);
    protected LdColumnInfo _columnParentGenreCode = cci("PARENT_GENRE_CODE", null, "parentGenreCode", String.class, false, 24, 0);
    protected LdColumnInfo _columnRUser = cci("R_USER", null, "RUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnRModule = cci("R_MODULE", null, "RModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnRTimestamp = cci("R_TIMESTAMP", null, "RTimestamp", java.sql.Timestamp.class, false, null, null);
    protected LdColumnInfo _columnUUser = cci("U_USER", null, "UUser", String.class, false, 100, 0);
    protected LdColumnInfo _columnUModule = cci("U_MODULE", null, "UModule", String.class, false, 100, 0);
    protected LdColumnInfo _columnUTimestamp = cci("U_TIMESTAMP", null, "UTimestamp", java.sql.Timestamp.class, false, null, null, OptimisticLockType.UPDATE_DATE);

    public LdColumnInfo columnGenreCode() { return _columnGenreCode; }
    public LdColumnInfo columnGenreName() { return _columnGenreName; }
    public LdColumnInfo columnHierarchyLevel() { return _columnHierarchyLevel; }
    public LdColumnInfo columnHierarchyOrder() { return _columnHierarchyOrder; }
    public LdColumnInfo columnParentGenreCode() { return _columnParentGenreCode; }
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
    public LdUniqueInfo getPrimaryUniqueInfo() { return cpui(columnGenreCode()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasTwoOrMorePrimaryKeys() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public LdForeignInfo foreignGenreSelf() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnParentGenreCode(), LdGenreDbm.getInstance().columnGenreCode());
        return cfi("genreSelf", this, LdGenreDbm.getInstance(), map, 0, false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public LdReferrerInfo referrerBookList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdBookDbm.getInstance().columnGenreCode());
        return cri("bookList", this, LdBookDbm.getInstance(), map, false);
    }
    public LdReferrerInfo referrerGenreSelfList() {
        Map<LdColumnInfo, LdColumnInfo> map = newLinkedHashMap(columnGenreCode(), LdGenreDbm.getInstance().columnParentGenreCode());
        return cri("genreSelfList", this, LdGenreDbm.getInstance(), map, false);
    }

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    public GenreRelationTrace createRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
        return new GenreRelationTrace(relationTraceFixHandler);
    }

    public GenreRelationTrace createRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
        return new GenreRelationTrace(relationList, relationTraceList);
    }

    public static class GenreRelationTrace extends AbstractRelationTrace {

        /**
         * Constructor for first step.
         * @param relationTraceFixHandler The handler of fixed relation trace. (Nullable)
         */
        public GenreRelationTrace(RelationTraceFixHandler relationTraceFixHandler) {
            super(relationTraceFixHandler);
        }

        /**
         * Constructor for relation step.
         * @param relationList The list of relation. (NotNull)
         * @param relationTraceList The list of relation trace. (NotNull)
         */
        public GenreRelationTrace(List<LdRelationInfo> relationList, List<AbstractRelationTrace> relationTraceList) {
            super(relationList, relationTraceList);
        }

        public LdGenreDbm.GenreRelationTrace foreignGenreSelf() {
            _relationList.add(LdGenreDbm.getInstance().foreignGenreSelf());
            return LdGenreDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdBookDbm.BookRelationTrace referrerBookList() {
            _relationList.add(LdGenreDbm.getInstance().referrerBookList());
            return LdBookDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }
        public LdGenreDbm.GenreRelationTrace referrerGenreSelfList() {
            _relationList.add(LdGenreDbm.getInstance().referrerGenreSelfList());
            return LdGenreDbm.getInstance().createRelationTrace(_relationList, _relationTraceList);
        }

        public RelationTrace columnGenreCode() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnGenreCode()); }
        public RelationTrace columnGenreName() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnGenreName()); }
        public RelationTrace columnHierarchyLevel() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnHierarchyLevel()); }
        public RelationTrace columnHierarchyOrder() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnHierarchyOrder()); }
        public RelationTrace columnParentGenreCode() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnParentGenreCode()); }
        public RelationTrace columnRUser() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnRUser()); }
        public RelationTrace columnRModule() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnRModule()); }
        public RelationTrace columnRTimestamp() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnRTimestamp()); }
        public RelationTrace columnUUser() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnUUser()); }
        public RelationTrace columnUModule() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnUModule()); }
        public RelationTrace columnUTimestamp() { return fixTrace(_relationList, LdGenreDbm.getInstance().columnUTimestamp()); }
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
    public String getEntityTypeName() { return "dbflute.ldb.exentity.LdGenre"; }
    public String getConditionBeanTypeName() { return "dbflute.ldb.cbean.bs.LdGenreCB"; }
    public String getDaoTypeName() { return "dbflute.ldb.exdao.LdGenreDao"; }
    public String getBehaviorTypeName() { return "dbflute.ldb.exbhv.LdGenreBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<LdGenre> getEntityType() { return LdGenre.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public LdEntity newEntity() { return newMyEntity(); }
    public LdGenre newMyEntity() { return new LdGenre(); }

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============  
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    public void acceptPrimaryKeyMap(LdEntity entity, Map<String, ? extends Object> primaryKeyMap) {
        doAcceptPrimaryKeyMap((LdGenre)entity, primaryKeyMap, _epsMap);
    }

    public void acceptPrimaryKeyMapString(LdEntity entity, String primaryKeyMapString) {
        MapStringUtil.acceptPrimaryKeyMapString(primaryKeyMapString, entity);
    }

    public void acceptColumnValueMap(LdEntity entity, Map<String, ? extends Object> columnValueMap) {
        doAcceptColumnValueMap((LdGenre)entity, columnValueMap, _epsMap);
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
    protected Map<String, Eps<LdGenre>> _epsMap = LdStringKeyMap.createAsFlexibleConcurrent();
    {
        setupEps(_epsMap, new EpsGenreCode(), columnGenreCode());
        setupEps(_epsMap, new EpsGenreName(), columnGenreName());
        setupEps(_epsMap, new EpsHierarchyLevel(), columnHierarchyLevel());
        setupEps(_epsMap, new EpsHierarchyOrder(), columnHierarchyOrder());
        setupEps(_epsMap, new EpsParentGenreCode(), columnParentGenreCode());
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
        findEps(_epsMap, propertyName).setup((LdGenre)entity, value);
    }
    
    public static class EpsGenreCode implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setGenreCode((String)v); }
    }
    public static class EpsGenreName implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setGenreName((String)v); }
    }
    public static class EpsHierarchyLevel implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setHierarchyLevel((Integer)v); }
    }
    public static class EpsHierarchyOrder implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setHierarchyOrder((Long)v); }
    }
    public static class EpsParentGenreCode implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setParentGenreCode((String)v); }
    }
    public static class EpsRUser implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setRUser((String)v); }
    }
    public static class EpsRModule implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setRModule((String)v); }
    }
    public static class EpsRTimestamp implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setRTimestamp((java.sql.Timestamp)v); }
    }
    public static class EpsUUser implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setUUser((String)v); }
    }
    public static class EpsUModule implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setUModule((String)v); }
    }
    public static class EpsUTimestamp implements Eps<LdGenre> {
        public void setup(LdGenre e, Object v) { e.setUTimestamp((java.sql.Timestamp)v); }
    }
}
