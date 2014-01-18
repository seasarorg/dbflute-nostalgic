
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdLendingCollection;

/**
 * The dao interface of LENDING_COLLECTION.
 * 
 * <pre>
 * [primary-key]
 *     LENDING_ID, COLLECTION_ID
 * 
 * [column-property]
 *     LENDING_ID, COLLECTION_ID, RETURN_LIMIT_DATE, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     collection, lending
 * 
 * [refferer-property]
 *     
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
public interface LdBsLendingCollectionDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdLendingCollection.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from LENDING_COLLECTION";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from LENDING_COLLECTION";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdLendingCollection> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from LENDING_COLLECTION where LENDING_COLLECTION.LENDING_ID = /*lendingId*/null and LENDING_COLLECTION.COLLECTION_ID = /*collectionId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "lendingId, collectionId";

    public LdLendingCollection getEntity(java.math.BigDecimal lendingId, java.math.BigDecimal collectionId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLendingCollectionCB cb = new LdLendingCollectionCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdLendingCollectionCB cb);

    /**
     * Select entity 'LdLendingCollection' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLendingCollectionCB cb = new LdLendingCollectionCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdLendingCollection entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdLendingCollection selectEntity(dbflute.ldb.cbean.LdLendingCollectionCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLendingCollectionCB cb = new LdLendingCollectionCB();
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
    public java.util.List<LdLendingCollection> selectList(dbflute.ldb.cbean.LdLendingCollectionCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdLendingCollection entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdLendingCollection entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdLendingCollection entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdLendingCollection> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdLendingCollection> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdLendingCollection> entityList);

}
