package dbflute.ldb.exbhv;

import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookBhvOutsideSqlBasicTest extends LdBookAllDbTestCase {

    public void test_dummy_Tx() throws Exception {
    }
    
    //    // ===================================================================================
    //    //                                                                           Attribute
    //    //                                                                           =========
    //    protected LdBookBhv ldBookBhv;
    //
    //    // ===================================================================================
    //    //                                                                Specified OutsideSql
    //    //                                                                ====================
    //    protected static String SQL_BASE = "dbflute/ldb/sqldir";
    //    protected static String SQL_BOOK_BASE = SQL_BASE + "/book";
    //
    //    protected static String SQL_selectCount = SQL_BOOK_BASE + "/selectCount.sql";
    //
    //    protected static String SQL_selectEntity = SQL_BOOK_BASE + "/selectEntity.sql";
    //
    //    protected static String SQL_selectEntityUsingSuffix = SQL_BOOK_BASE + "/selectEntityUsingSuffix.sql";
    //
    //    protected static String SQL_selectIdList = SQL_BOOK_BASE + "/selectIdList.sql";
    //
    //    protected static String SQL_selectList = SQL_BOOK_BASE + "/selectList.sql";
    //
    //    protected static String SQL_selectListUsingDynamicBinding = SQL_BOOK_BASE + "/selectListUsingDynamicBinding.sql";
    //
    //    protected static String SQL_selectListUsingParameterMap = SQL_BOOK_BASE + "/selectListUsingParameterMap.sql";
    //
    //    protected static String SQL_selectPage = SQL_BOOK_BASE + "/selectPage.sql";
    //
    //    protected static String SQL_selectPageUsingParameterMap = SQL_BOOK_BASE + "/selectPageUsingParameterMap.sql";
    //
    //    protected static String SQL_update = SQL_BOOK_BASE + "/update.sql";
    //    protected static String SQL_updateTwiceTest = SQL_BOOK_BASE + "/updateTwiceTest.sql";
    //
    //    protected static String SQL_selectWrongBindVariableComment = SQL_BOOK_BASE
    //            + "/wrong/selectWrongBindVariableComment.sql";
    //
    //    protected static String SQL_selectWrongEmbeddedValueComment = SQL_BOOK_BASE
    //            + "/wrong/selectWrongEmbeddedValueComment.sql";
    //
    //    protected static String SQL_selectWrongIfComment = SQL_BOOK_BASE + "/wrong/selectWrongIfComment.sql";
    //
    //    // -----------------------------------------------------
    //    //                                          Select Count
    //    //                                          ------------
    //    public void test_outsideSql_selectCount_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //        final String path = SQL_selectCount;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final Integer count = bhv.outsideSql().entityHandling().selectEntity(path, pmb, Integer.class);
    //
    //        // ## Assert ##
    //        _log.debug("count=" + count);
    //        assertNotNull(count);
    //        assertNotSame(0, count);
    //    }
    //
    //    public void test_outsideSql_selectCountWithDeletedCheck_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectCount;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final Integer count = bhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, Integer.class);
    //
    //        // ## Assert ##
    //        _log.debug("count=" + count);
    //        assertNotNull(count);
    //        assertNotSame(0, count);
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                         Select Entity
    //    //                                         -------------
    //    public void test_outsideSql_selectEntity_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntity;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookId(new BigDecimal(1));
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final LdBookSpecifiedOutsideSql entity = bhv.outsideSql().entityHandling().selectEntity(path, pmb,
    //                LdBookSpecifiedOutsideSql.class);
    //
    //        // ## Assert ##
    //        assertNotNull(entity);
    //    }
    //
    //    public void test_outsideSql_selectEntity_DuplicatedResult_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntity;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //            bhv.outsideSql().entityHandling().selectEntity(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdEntityDuplicatedException e) {
    //            // OK
    //            log(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectEntityWithDeletedCheck_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntity;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookId(new BigDecimal(1));
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final LdBookSpecifiedOutsideSql entity = bhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path,
    //                pmb, LdBookSpecifiedOutsideSql.class);
    //
    //        // ## Assert ##
    //        assertNotNull(entity);
    //    }
    //
    //    public void test_outsideSql_selectEntityWithDeletedCheck_DuplicatedResult_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntity;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //            bhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdEntityDuplicatedException e) {
    //            // OK
    //            log(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectEntityWithDeletedCheck_AlreadyDeletedResult_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntity;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //            pmb.setBookId(new BigDecimal(99999));
    //            bhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdEntityAlreadyDeletedException e) {
    //            // OK
    //            log(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectEntityUsingSuffix_and_ArgumentNull_Success_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectEntityUsingSuffix;
    //        final Class<String> entityType = String.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final String result = bhv.outsideSql().entityHandling().selectEntityWithDeletedCheck(path, null, entityType);
    //
    //        // ## Assert ##
    //        assertNotNull(result);
    //        assertEquals("WELCOME!", result);
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                         Select IdList
    //    //                                         -------------
    //    public void test_outsideSql_selectIdList_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectIdList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<Integer> idList = bhv.outsideSql().selectList(path, pmb, Integer.class);
    //
    //        // ## Assert ##
    //        assertNotNull(idList);
    //        assertListNotEmtpy(idList);
    //        for (Integer bookId : idList) {
    //            _log.debug("bookId=" + bookId);
    //            assertNotNull(bookId);
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                           Select List
    //    //                                           -----------
    //    public void test_outsideSql_selectList_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_DomainEntity_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBook> entityType = LdBook.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBook> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBook entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_ArgumentMap_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final Map<String, Object> pmb = new HashMap<String, Object>();
    //        pmb.put("bookName", "S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_ConsecutiveExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        {
    //            final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //            // ## Assert ##
    //            assertListNotEmtpy(ls);
    //            for (LdBookSpecifiedOutsideSql entity : ls) {
    //                _log.debug(entity);
    //                final String bookName = entity.getBookName();
    //                if (!bookName.startsWith("S2Dao")) {
    //                    fail("bookName should starts with 'S2Dao'");
    //                }
    //            }
    //        }
    //
    //        pmb.setBookName("ずばり");
    //        // ## Act ##
    //        {
    //            final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //            // ## Assert ##
    //            assertListNotEmtpy(ls);
    //            for (LdBookSpecifiedOutsideSql entity : ls) {
    //                _log.debug(entity);
    //                final String bookName = entity.getBookName();
    //                if (!bookName.startsWith("ずばり")) {
    //                    fail("bookName should starts with 'ずばり'");
    //                }
    //            }
    //        }
    //
    //        pmb.setBookName("ずばり");
    //        // ## Act ##
    //        {
    //            final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().dynamicBinding().selectList(path, pmb,
    //                    entityType);
    //
    //            // ## Assert ##
    //            assertListNotEmtpy(ls);
    //            for (LdBookSpecifiedOutsideSql entity : ls) {
    //                _log.debug(entity);
    //                final String bookName = entity.getBookName();
    //                if (!bookName.startsWith("ずばり")) {
    //                    fail("bookName should starts with 'ずばり'");
    //                }
    //            }
    //        }
    //
    //        pmb.setBookName("S2Dao");
    //        // ## Act ##
    //        {
    //            final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, pmb, entityType);
    //
    //            // ## Assert ##
    //            assertListNotEmtpy(ls);
    //            for (LdBookSpecifiedOutsideSql entity : ls) {
    //                _log.debug(entity);
    //                final String bookName = entity.getBookName();
    //                if (!bookName.startsWith("S2Dao")) {
    //                    fail("bookName should starts with 'S2Dao'");
    //                }
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_autoPaging_selectList_FirstPage_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().autoPaging().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        assertEquals(2, ls.size());
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_autoPaging_selectList_SecondPage_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().autoPaging().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        assertEquals(2, ls.size());
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_manualPaging_selectList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().manualPaging().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        final LdBookCB cb = new LdBookCB();
    //        cb.query().setBookName_PrefixSearch("S2Dao");
    //        final int expectedAllRecordCount = bhv.selectCount(cb);
    //        assertEquals(expectedAllRecordCount, ls.size()); // Because Derby doesn't support manual paging!
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_dynamicBinding_selectList_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectListUsingDynamicBinding;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("/*pmb.dynamicBindingProperty*/");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().dynamicBinding().selectList(path, pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectListUsingParameterMap_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectListUsingParameterMap;
    //        final Map<String, Object> parameterMap = new HashMap<String, Object>();
    //        parameterMap.put("bookName", "S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, parameterMap, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectListUsingParameterMap_DifferenceGenericType_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectListUsingParameterMap;
    //        final Map<Object, String> parameterMap = new HashMap<Object, String>();
    //        parameterMap.put("bookName", "S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> ls = bhv.outsideSql().selectList(path, parameterMap, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(ls);
    //        for (LdBookSpecifiedOutsideSql entity : ls) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_configure_statementConfig_ExecuteOK_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        final LdStatementConfig statementConfig = new LdStatementConfig();
    //        statementConfig.typeForwardOnly().fetchSize(7).queryTimeout(3).maxRows(999);
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> bookList = bhv.outsideSql().configure(statementConfig).selectList(path,
    //                pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(bookList);
    //        for (LdBookSpecifiedOutsideSql entity : bookList) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_configure_statementConfig_maxRows_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        final LdStatementConfig statementConfig = new LdStatementConfig();
    //        statementConfig.maxRows(2);
    //
    //        // ## Act ##
    //        final List<LdBookSpecifiedOutsideSql> bookList = bhv.outsideSql().configure(statementConfig).selectList(path,
    //                pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(bookList);
    //        assertTrue(bhv.outsideSql().selectList(path, pmb, entityType).size() > 2);
    //        assertEquals(2, bookList.size());
    //    }
    //
    //    public void test_outsideSql_selectList_as_valueLabel_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        // ## Act ##
    //        final List<Map<String, Object>> s2daoBookList = getMyBhv().selectValueLabelS2DaoBook();
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(s2daoBookList);
    //        for (Map<String, Object> element : s2daoBookList) {
    //            final Object value = element.get("value");
    //            final String label = (String) element.get("label");
    //            _log.debug(value + " - " + label);
    //            assertNotNull(value);
    //            assertNotNull(label);
    //            assertTrue(label.contains("S2Dao"));
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_byOtherPmb_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        getBehaviorSelector().initializeConditionBeanMetaData();
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        bhv.outsideSql().selectList(path, pmb, entityType);
    //        bhv.outsideSql().selectList(path, pmb, entityType);
    //        final OtherPmb otherPmb = new OtherPmb();
    //        otherPmb.setBookName("OtherPmb");
    //        bhv.outsideSql().selectList(path, otherPmb, entityType);// Expected non exception!
    //        bhv.outsideSql().selectList(path, otherPmb, entityType);// Expected non exception and using cache!
    //        bhv.outsideSql().selectList(path, pmb, entityType);// Expected using cache!
    //    }
    //
    //    public static class OtherPmb {
    //        protected java.math.BigDecimal _bookId;
    //        protected String _bookName;
    //        protected String _collectionStatusCode;
    //
    //        public java.math.BigDecimal getBookId() {
    //            return _bookId;
    //        }
    //
    //        public void setBookId(java.math.BigDecimal id) {
    //            _bookId = id;
    //        }
    //
    //        public String getBookName() {
    //            return _bookName;
    //        }
    //
    //        public void setBookName(String name) {
    //            _bookName = name;
    //        }
    //
    //        public String getCollectionStatusCode() {
    //            return _collectionStatusCode;
    //        }
    //
    //        public void setCollectionStatusCode(String statusCode) {
    //            _collectionStatusCode = statusCode;
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_behaviorSqlPath_Tx() throws Exception {
    //        // ## Arrange ##
    //        final String path = "selectList";
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bookBhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        bookBhv.outsideSql().selectList(path, pmb, entityType);// Expect no exception!
    //    }
    //
    //    public void test_outsideSql_selectList_behaviorSqlPath_NotFound_Tx() throws Exception {
    //        // ## Arrange ##
    //        final String path = "selectNoExist";
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bookBhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            bookBhv.outsideSql().selectList(path, pmb, entityType);
    //            fail();
    //        } catch (LdOutsideSqlNotFoundException e) {
    //            // OK
    //            log(e.getMessage());
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                           Select Page
    //    //                                           -----------
    //    public void test_outsideSql_autoPaging_selectPage_SecondPage_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectPage;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final LdPagingResultBean<LdBookSpecifiedOutsideSql> page = bhv.outsideSql().autoPaging().selectPage(path, pmb,
    //                entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(page);
    //        assertEquals(2, page.size());
    //        final LdBookCB cb = new LdBookCB();
    //        cb.query().setBookName_PrefixSearch("S2Dao");
    //        assertEquals(bhv.selectCount(cb), page.getAllRecordCount());
    //        for (LdBookSpecifiedOutsideSql entity : page) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_manualPaging_selectPage_FirstPage_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectPage;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(1);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final LdPagingResultBean<LdBookSpecifiedOutsideSql> page = bhv.outsideSql().manualPaging().selectPage(path,
    //                pmb, entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(page);
    //        final LdBookCB cb = new LdBookCB();
    //        cb.query().setBookName_PrefixSearch("S2Dao");
    //        final int expectedAllRecordCount = bhv.selectCount(cb);
    //        assertEquals(expectedAllRecordCount, page.size()); // Because Derby doesn't support manual paging!
    //        assertEquals(expectedAllRecordCount, page.getAllRecordCount());
    //        for (LdBookSpecifiedOutsideSql entity : page) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_autoPaging_selectPage_UsingParameterMap_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectPageUsingParameterMap;
    //        final LdSimplePagingBean pmb = new LdSimplePagingBean();
    //        pmb.addParameter("bookName", "S2Dao");
    //        pmb.fetchFirst(2);
    //        pmb.fetchPage(2);
    //        final Class<LdBookSpecifiedOutsideSql> entityType = LdBookSpecifiedOutsideSql.class;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final LdPagingResultBean<LdBookSpecifiedOutsideSql> page = bhv.outsideSql().autoPaging().selectPage(path, pmb,
    //                entityType);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(page);
    //        assertEquals(2, page.size());
    //        final LdBookCB cb = new LdBookCB();
    //        cb.query().setBookName_PrefixSearch("S2Dao");
    //        assertEquals(bhv.selectCount(cb), page.getAllRecordCount());
    //        for (LdBookSpecifiedOutsideSql entity : page) {
    //            _log.debug(entity);
    //            final String bookName = entity.getBookName();
    //            if (!bookName.startsWith("S2Dao")) {
    //                fail("bookName should starts with 'S2Dao'");
    //            }
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                         Select Cursor
    //    //                                         -------------
    //    public void test_outsideSql_selectCursor_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        final List<Map<String, Object>> traceList = new ArrayList<Map<String, Object>>();
    //        final LdCursorHandler handler = new LdCursorHandler() {
    //            public Object handle(ResultSet resultSet) throws SQLException {
    //                while (resultSet.next()) {
    //                    final Map<String, Object> traceMap = new HashMap<String, Object>();
    //                    final Integer bookId = resultSet.getInt("BOOK_ID");
    //                    final String bookName = resultSet.getString("BOOK_NAME");
    //                    traceMap.put("bookId", bookId);
    //                    traceMap.put("bookName", bookName);
    //                    traceList.add(traceMap);
    //                }
    //                return null;
    //            }
    //        };
    //
    //        // ## Act ##
    //        bhv.outsideSql().cursorHandling().selectCursor(path, pmb, handler);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(traceList);
    //        for (Map<String, Object> traceMap : traceList) {
    //            final Integer bookId = (Integer) traceMap.get("bookId");
    //            final String bookName = (String) traceMap.get("bookName");
    //            _log.debug("bookId=" + bookId + " bookName=" + bookName);
    //            assertNotNull(bookId);
    //            assertNotNull(bookName);
    //        }
    //    }
    //
    //    public void test_outsideSql_selectCursor_dynamicBinding_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        final List<Map<String, Object>> traceList = new ArrayList<Map<String, Object>>();
    //        final LdCursorHandler handler = new LdCursorHandler() {
    //            public Object handle(ResultSet resultSet) throws SQLException {
    //                while (resultSet.next()) {
    //                    final Map<String, Object> traceMap = new HashMap<String, Object>();
    //                    final Integer bookId = resultSet.getInt("BOOK_ID");
    //                    final String bookName = resultSet.getString("BOOK_NAME");
    //                    traceMap.put("bookId", bookId);
    //                    traceMap.put("bookName", bookName);
    //                    traceList.add(traceMap);
    //                }
    //                return null;
    //            }
    //        };
    //
    //        // ## Act ##
    //        bhv.outsideSql().cursorHandling().dynamicBinding().selectCursor(path, pmb, handler);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(traceList);
    //        for (Map<String, Object> traceMap : traceList) {
    //            final Integer bookId = (Integer) traceMap.get("bookId");
    //            final String bookName = (String) traceMap.get("bookName");
    //            _log.debug("bookId=" + bookId + " bookName=" + bookName);
    //            assertNotNull(bookId);
    //            assertNotNull(bookName);
    //        }
    //    }
    //
    //    public void test_outsideSql_dynamicBinding_selectCursor_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectList;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        final List<Map<String, Object>> traceList = new ArrayList<Map<String, Object>>();
    //        final LdCursorHandler handler = new LdCursorHandler() {
    //            public Object handle(ResultSet resultSet) throws SQLException {
    //                while (resultSet.next()) {
    //                    final Map<String, Object> traceMap = new HashMap<String, Object>();
    //                    final Integer bookId = resultSet.getInt("BOOK_ID");
    //                    final String bookName = resultSet.getString("BOOK_NAME");
    //                    traceMap.put("bookId", bookId);
    //                    traceMap.put("bookName", bookName);
    //                    traceList.add(traceMap);
    //                }
    //                return null;
    //            }
    //        };
    //
    //        // ## Act ##
    //        bhv.outsideSql().dynamicBinding().cursorHandling().selectCursor(path, pmb, handler);
    //
    //        // ## Assert ##
    //        assertListNotEmtpy(traceList);
    //        for (Map<String, Object> traceMap : traceList) {
    //            final Integer bookId = (Integer) traceMap.get("bookId");
    //            final String bookName = (String) traceMap.get("bookName");
    //            _log.debug("bookId=" + bookId + " bookName=" + bookName);
    //            assertNotNull(bookId);
    //            assertNotNull(bookName);
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                               Execute
    //    //                                               -------
    //    public void test_outsideSql_execute_BehaviorQueryPath_update_NormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = LdBookBhv.PATH_update;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final int count = bhv.outsideSql().execute(path, pmb);
    //        bhv.outsideSql().execute(path, pmb);
    //
    //        // ## Assert ##
    //        assertNotNull(count);
    //        assertNotSame(0, count);
    //        assertNotSame(1, count);
    //        {
    //            final LdBookCB cb = bhv.newMyConditionBean();
    //            cb.query().setBookName_PrefixSearch("S2Dao");
    //            final LdListResultBean<LdBook> ls = bhv.selectList(cb);
    //            assertListEmtpy(ls);
    //            for (LdBook book : ls) {
    //                final String bookName = book.getBookName();
    //                assertEquals("update", bookName);
    //            }
    //        }
    //
    //        // Same Table Other SQL
    //        {
    //            pmb.setBookName("update");
    //            final int twiceCount = bhv.outsideSql().execute(LdBookBhv.PATH_updateTwiceTest, pmb);
    //            assertNotNull(twiceCount);
    //            assertNotSame(0, twiceCount);
    //            assertNotSame(1, twiceCount);
    //            final LdBookCB cb = bhv.newMyConditionBean();
    //            cb.query().setBookName_PrefixSearch("S2Dao");
    //            final LdListResultBean<LdBook> ls = bhv.selectList(cb);
    //            assertListEmtpy(ls);
    //            for (LdBook book : ls) {
    //                final String bookName = book.getBookName();
    //                assertEquals("updateTwiceTest", bookName);
    //            }
    //        }
    //
    //        // Other Table Same Name SQL
    //        {
    //            final LdAuthorBhv authorBhv = getBehaviorSelector().select(LdAuthorBhv.class);
    //            final LdAuthor author = new LdAuthor();
    //            author.setAuthorId(3);
    //            authorBhv.outsideSql().execute(LdAuthorBhv.PATH_update, author);
    //            LdAuthor actualAuthor = authorBhv.selectByPKValueWithDeletedCheck(3);
    //            String authorName = actualAuthor.getAuthorName();
    //            assertEquals("update", authorName);
    //        }
    //    }
    //
    //    public void test_outsideSql_execute_BehaviorQueryPath_update_NoPmb_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = LdBookBhv.PATH_updateNoPmb;
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final int count = bhv.outsideSql().execute(path, null);
    //        bhv.outsideSql().execute(path, null);
    //
    //        // ## Assert ##
    //        assertNotSame(0, count);
    //        {
    //            final LdBookCB cb = bhv.newMyConditionBean();
    //            final LdListResultBean<LdBook> ls = bhv.selectList(cb);
    //            for (LdBook book : ls) {
    //                final String bookName = book.getBookName();
    //                assertEquals("updateNoPmb", bookName);
    //            }
    //        }
    //
    //        // Other Table Same Name SQL
    //        {
    //            final LdAuthorBhv authorBhv = getBehaviorSelector().select(LdAuthorBhv.class);
    //            authorBhv.outsideSql().execute(LdAuthorBhv.PATH_updateNoPmb, null);
    //            final List<LdAuthor> ls = authorBhv.selectListAll();
    //            for (LdAuthor author : ls) {
    //                String authorName = author.getAuthorName();
    //                assertEquals("updateNoPmb", authorName);
    //            }
    //        }
    //    }
    //
    //    public void test_outsideSql_execute_UpdateNormalExecution_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_update;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act ##
    //        final int count = bhv.outsideSql().execute(path, pmb);
    //        bhv.outsideSql().execute(path, pmb);
    //
    //        // ## Assert ##
    //        assertNotNull(count);
    //        assertNotSame(0, count);
    //        assertNotSame(1, count);
    //        {
    //            final LdBookCB cb = bhv.newMyConditionBean();
    //            cb.query().setBookName_PrefixSearch("S2Dao");
    //            final LdListResultBean<LdBook> ls = bhv.selectList(cb);
    //            assertListEmtpy(ls);
    //            for (LdBook book : ls) {
    //                final String bookName = book.getBookName();
    //                assertEquals("update", bookName);
    //            }
    //        }
    //
    //        pmb.setBookName("update");
    //        final int twiceCount = bhv.outsideSql().execute(SQL_updateTwiceTest, pmb);
    //        assertNotNull(twiceCount);
    //        assertNotSame(0, twiceCount);
    //        assertNotSame(1, twiceCount);
    //        {
    //            final LdBookCB cb = bhv.newMyConditionBean();
    //            cb.query().setBookName_PrefixSearch("S2Dao");
    //            final LdListResultBean<LdBook> ls = bhv.selectList(cb);
    //            assertListEmtpy(ls);
    //            for (LdBook book : ls) {
    //                final String bookName = book.getBookName();
    //                assertEquals("updateTwiceTest", bookName);
    //            }
    //        }
    //    }
    //
    //    // -----------------------------------------------------
    //    //                                         Wrong Comment
    //    //                                         -------------
    //    public void test_outsideSql_selectList_WrongBindVariableComment_Tx() throws Exception {
    //        // ## Arrange ##
    //
    //        final String path = SQL_selectWrongBindVariableComment;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            bhv.outsideSql().selectList(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdBindVariableCommentNotFoundPropertyException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_WrongEmbeddedValueComment_Tx() throws Exception {
    //        // ## Arrange ##
    //        final String path = SQL_selectWrongEmbeddedValueComment;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            bhv.outsideSql().selectList(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdEmbeddedValueCommentNotFoundPropertyException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
    //
    //    public void test_outsideSql_selectList_WrongIfComment_Tx() throws Exception {
    //        // ## Arrange ##
    //        final String path = SQL_selectWrongIfComment;
    //        final LdBookSpecifiedOutsideSqlPmb pmb = new LdBookSpecifiedOutsideSqlPmb();
    //        pmb.setBookName("S2Dao");
    //        final LdBookBhv bhv = getMyBhv();
    //
    //        // ## Act & Assert ##
    //        try {
    //            bhv.outsideSql().selectList(path, pmb, LdBookSpecifiedOutsideSql.class);
    //            fail();
    //        } catch (LdIfCommentWrongExpressionException e) {
    //            // OK
    //            _log.debug(e.getMessage());
    //        }
    //    }
}
