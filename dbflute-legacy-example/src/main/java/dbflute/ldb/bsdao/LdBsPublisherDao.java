
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdPublisher;

/**
 * The dao interface of PUBLISHER.
 * 
 * <pre>
 * [primary-key]
 *     PUBLISHER_ID
 * 
 * [column-property]
 *     PUBLISHER_ID, PUBLISHER_NAME, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     
 * 
 * [refferer-property]
 *     bookList
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
public interface LdBsPublisherDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdPublisher.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from PUBLISHER";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from PUBLISHER";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdPublisher> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from PUBLISHER where PUBLISHER.PUBLISHER_ID = /*publisherId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "publisherId";

    public LdPublisher getEntity(java.math.BigDecimal publisherId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdPublisherCB cb = new LdPublisherCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdPublisherCB cb);

    /**
     * Select entity 'LdPublisher' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdPublisherCB cb = new LdPublisherCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdPublisher entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdPublisher selectEntity(dbflute.ldb.cbean.LdPublisherCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdPublisherCB cb = new LdPublisherCB();
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
    public java.util.List<LdPublisher> selectList(dbflute.ldb.cbean.LdPublisherCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdPublisher entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdPublisher entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdPublisher entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdPublisher> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdPublisher> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdPublisher> entityList);

}
