
package dbflute.ldb.bsdao;

import dbflute.ldb.exentity.LdBook;

/**
 * The dao interface of BOOK.
 * 
 * <pre>
 * [primary-key]
 *     BOOK_ID
 * 
 * [column-property]
 *     BOOK_ID, ISBN_NO, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, MAX_LENDING_DATE_COUNT, GENRE_CODE, OPENING_PART, R_TIME, U_TIME, R_STAFF, U_STAFF
 * 
 * [foreign-property]
 *     author, publisher, genre
 * 
 * [refferer-property]
 *     collectionList
 * 
 * [sequence]
 *     BOOK_BOOK_ID_INC
 * 
 * [identity]
 *     bookId
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
public interface LdBsBookDao extends dbflute.ldb.allcommon.LdDaoWritable {

    /** BEAN-Annotation. */
    public Class BEAN = dbflute.ldb.exentity.LdBook.class;

    /** SQL-Annotation for getCountAll(). */
    public static final String getCountAll_SQL = "select count(*) from BOOK";

    /**
     * Get count as all.
     * 
     * @return All count.
     */
    public int getCountAll();

    /** SQL-Annotation for getListAll(). */
    public static final String getListAll_SQL = "select * from BOOK";

    /**
     * Get list as all.
     * 
     * @return All list. (NotNull)
     */
    public java.util.List<LdBook> getListAll();

    /** SQL-Annotation for getEntity(). */
    public static final String getEntity_SQL = "select * from BOOK where BOOK.BOOK_ID = /*bookId*/null";

    /** Args-Annotation for getEntity(). */
    public static final String getEntity_ARGS = "bookId";

    public LdBook getEntity(java.math.BigDecimal bookId);

    /**
     * Select count by condition-bean.
     * Ignore fetchFirst() and fetchScope() and fetchPage(). But the fetch status of the condition-bean remains as it is.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBookCB cb = new LdBookCB();
     *   cb.query().setXxx_GreaterEqual(new BigDecimal(14));
     *   final int count = dao.${database.ConditionBeanSelectCountMethodName}(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected count. (NotNull)
     */
    public int selectCountIgnoreFetchScope(dbflute.ldb.cbean.LdBookCB cb);

    /**
     * Select entity 'LdBook' by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBookCB cb = new LdBookCB();
     *   cb.query().setXxxCode_Equal("abc");// It is assumed that this is the primary key...
     *   cb.lockForUpdate();
     *   final LdBook entity = dao.selectEntity(cb);
     * </pre>
     * 
     * @param cb Condition-bean. (NotNull)
     * @return Selected entity. If the select result is zero, it returns null. (Nullable)
     */
    public LdBook selectEntity(dbflute.ldb.cbean.LdBookCB cb);

    /**
     * Select list by condition-bean.
     * This select method generates SQL based on condition-bean.
     * <pre>
     * Example)
     *   final LdBookCB cb = new LdBookCB();
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
    public java.util.List<LdBook> selectList(dbflute.ldb.cbean.LdBookCB cb);


    /**
     * Insert one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Inserted count.
     */
    public int insert(LdBook entity);

    /**
     * Update one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Updated count.
     */
    public int update(LdBook entity);

    /**
     * Delete one entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Deleted count.
     */
    public int delete(LdBook entity);

    /**
     * Insert several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Inserted count.
     */
    public int insertList(java.util.List<LdBook> entityList);

    /**
     * Update several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Updated count.
     */
    public int updateList(java.util.List<LdBook> entityList);

    /**
     * Delete several entities.
     * 
     * @param entityList Entity-list. (NotNull)
     * @return Deleted count.
     */
    public int deleteList(java.util.List<LdBook> entityList);


    /** SQL-Annotation for selectNextVal(). */
    public String selectNextVal_SQL = "Unsupported";

    /**
     * Select next value as sequence.
     * 
     * @return Next value. (NotNull)
     */
    public java.math.BigDecimal selectNextVal();
}
