
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdLbUser;

/**
 * The dao interface of LB_USER.
 * 
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column-property]
 *     LB_USER_ID, LB_USER_NAME, LIBRARY_ID, USER_PASSWORD, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     library
 * 
 * [refferer-property]
 *     blackListList, lendingList
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [update-date]
 *     
 * 
 * [version-no]
 *     
 * 
 * </pre>
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBsLbUserDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdLbUser.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from LB_USER";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from LB_USER";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdLbUser> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from LB_USER where LB_USER.LB_USER_ID = /*lbUserId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "lbUserId";

    public LdLbUser getEntity(java.math.BigDecimal lbUserId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLbUserCB cb = new LdLbUserCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdLbUserCB cb);

    /**
     * Select entity 'LdLbUser' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLbUserCB cb = new LdLbUserCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdLbUser entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdLbUser selectEntity(dbflute.ldb.cbean.LdLbUserCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdLbUserCB cb = new LdLbUserCB();
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
    public java.util.List<LdLbUser> selectList(dbflute.ldb.cbean.LdLbUserCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdLbUser entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdLbUser entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdLbUser entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdLbUser> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdLbUser> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdLbUser> entityList);

}
