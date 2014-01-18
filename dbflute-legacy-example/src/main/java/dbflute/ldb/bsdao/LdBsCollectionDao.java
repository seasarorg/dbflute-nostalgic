
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdCollection;

/**
 * The dao interface of COLLECTION.
 * 
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column-property]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     library, book
 * 
 * [refferer-property]
 *     collectionStatusList, lendingCollectionList
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     collectionId
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
public interface LdBsCollectionDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdCollection.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from COLLECTION";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from COLLECTION";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdCollection> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from COLLECTION where COLLECTION.COLLECTION_ID = /*collectionId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "collectionId";

    public LdCollection getEntity(java.math.BigDecimal collectionId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionCB cb = new LdCollectionCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdCollectionCB cb);

    /**
     * Select entity 'LdCollection' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionCB cb = new LdCollectionCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdCollection entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdCollection selectEntity(dbflute.ldb.cbean.LdCollectionCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdCollectionCB cb = new LdCollectionCB();
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
    public java.util.List<LdCollection> selectList(dbflute.ldb.cbean.LdCollectionCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdCollection entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdCollection entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdCollection entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdCollection> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdCollection> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdCollection> entityList);

}
