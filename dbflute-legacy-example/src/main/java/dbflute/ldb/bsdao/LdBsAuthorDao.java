
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdAuthor;

/**
 * The dao interface of AUTHOR.
 * 
 * <pre>
 * [primary-key]
 *     AUTHOR_ID
 * 
 * [column-property]
 *     AUTHOR_ID, AUTHOR_NAME, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     
 * 
 * [refferer-property]
 *     bookList
 * 
 * [sequence]
 *     AUTHOR_AUTHOR_ID_INC
 * 
 * [identity]
 *     authorId
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
public interface LdBsAuthorDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdAuthor.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from AUTHOR";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from AUTHOR";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdAuthor> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from AUTHOR where AUTHOR.AUTHOR_ID = /*authorId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "authorId";

    public LdAuthor getEntity(java.math.BigDecimal authorId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdAuthorCB cb = new LdAuthorCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdAuthorCB cb);

    /**
     * Select entity 'LdAuthor' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdAuthorCB cb = new LdAuthorCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdAuthor entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdAuthor selectEntity(dbflute.ldb.cbean.LdAuthorCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdAuthorCB cb = new LdAuthorCB();
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
    public java.util.List<LdAuthor> selectList(dbflute.ldb.cbean.LdAuthorCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdAuthor entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdAuthor entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdAuthor entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdAuthor> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdAuthor> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdAuthor> entityList);


    /** SQL-Annotation for selectNextVal(). */
    public String selectNextVal_SQL = "Unsupported";

    /**
     * Select next value as sequence.
     * 
     * @return Next value. (NotNull)
     */
    public java.math.BigDecimal selectNextVal();
}
