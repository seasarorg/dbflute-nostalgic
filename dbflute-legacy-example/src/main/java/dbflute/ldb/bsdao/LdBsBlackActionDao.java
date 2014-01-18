
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdBlackAction;

/**
 * The dao interface of BLACK_ACTION.
 * 
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column-property]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, EVIDENCE_PHOTOGRAPH, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     blackList, blackActionLookup
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
public interface LdBsBlackActionDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdBlackAction.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from BLACK_ACTION";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from BLACK_ACTION";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdBlackAction> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from BLACK_ACTION where BLACK_ACTION.BLACK_ACTION_ID = /*blackActionId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "blackActionId";

    public LdBlackAction getEntity(java.math.BigDecimal blackActionId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBlackActionCB cb = new LdBlackActionCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdBlackActionCB cb);

    /**
     * Select entity 'LdBlackAction' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBlackActionCB cb = new LdBlackActionCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdBlackAction entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdBlackAction selectEntity(dbflute.ldb.cbean.LdBlackActionCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBlackActionCB cb = new LdBlackActionCB();
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
    public java.util.List<LdBlackAction> selectList(dbflute.ldb.cbean.LdBlackActionCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdBlackAction entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdBlackAction entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdBlackAction entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdBlackAction> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdBlackAction> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdBlackAction> entityList);

}
