
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdCollectionStatusLookup;

/**
 * The dao interface of COLLECTION_STATUS_LOOKUP.
 * 
 * <pre>
 * [primary-key]
 *     COLLECTION_STATUS_CODE
 * 
 * [column-property]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     
 * 
 * [refferer-property]
 *     collectionStatusList
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [update-date]
 *     UTime
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBsCollectionStatusLookupDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdCollectionStatusLookup.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from COLLECTION_STATUS_LOOKUP";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from COLLECTION_STATUS_LOOKUP";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdCollectionStatusLookup> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from COLLECTION_STATUS_LOOKUP where COLLECTION_STATUS_LOOKUP.COLLECTION_STATUS_CODE = /*collectionStatusCode*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "collectionStatusCode";

    public LdCollectionStatusLookup getEntity(String collectionStatusCode);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdCollectionStatusLookupCB cb);

    /**
     * Select entity 'LdCollectionStatusLookup' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdCollectionStatusLookup entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdCollectionStatusLookup selectEntity(dbflute.ldb.cbean.LdCollectionStatusLookupCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionStatusLookupCB cb = new LdCollectionStatusLookupCB();
     *   cb.setupSelect_Xxx(); // Including the foreign table in select clause
     *   cb.query().setXxxName_PrefixSearch("abc");
     *   cb.query().setXxxStartDate_IsNotNull();
     *   cb.addOrderBy_PK_Asc().fetchFirst(20);
     *   final List resultList = dao.selectList(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected list. If the select result is zero, it returns empty list. (NotNull)
     */
    public java.util.List<LdCollectionStatusLookup> selectList(dbflute.ldb.cbean.LdCollectionStatusLookupCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdCollectionStatusLookup entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdCollectionStatusLookup entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdCollectionStatusLookup entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdCollectionStatusLookup> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdCollectionStatusLookup> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdCollectionStatusLookup> entityList);

}
