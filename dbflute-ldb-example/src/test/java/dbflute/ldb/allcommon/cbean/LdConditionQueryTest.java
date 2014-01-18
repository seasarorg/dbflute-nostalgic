package dbflute.ldb.allcommon.cbean;

import dbflute.PlainTestCase;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.cq.LdBookCQ;
import dbflute.ldb.cbean.cq.LdGenreCQ;

/**
 * @author jflute
 * @since 0.5.8 (2007/11/28 Wednesday)
 */
public class LdConditionQueryTest extends PlainTestCase {

    public void test_invokeValue_by_propertyName() {
        // ## Arrange ##
        final String expectedBookName = "testValue";
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_Equal(expectedBookName);

        // ## Act ##
        final LdConditionValue value = cb.query().invokeValue("bookName");

        // ## Assert ##
        log("conditionValue=" + value);
        assertEquals(expectedBookName, value.getEqual());
    }

    public void test_invokeValue_by_columnName() {
        // ## Arrange ##
        final String expectedBookName = "testValue";
        final LdBookCB cb = new LdBookCB();
        cb.query().setBookName_Equal(expectedBookName);

        // ## Act ##
        final LdConditionValue value = cb.query().invokeValue("BOOK_NAME");

        // ## Assert ##
        log("conditionValue=" + value);
        assertEquals(expectedBookName, value.getEqual());
    }

    public void test_invokeQuery_by_propertyName() {
        // ## Arrange ##
        final Integer expectedBookId = 888;
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeQuery("bookId", "lessThan", expectedBookId);

        // ## Act ##
        final LdConditionValue value = cb.query().getBookId();

        // ## Assert ##
        log("conditionValue=" + value);
        assertEquals(expectedBookId, value.getLessThan());
        assertNull(value.getEqual());
        assertNull(value.getLessEqual());
    }

    public void test_invokeQuery_by_columnName() {
        // ## Arrange ##
        final Integer expectedBookId = 888;
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeQuery("BOOK_ID", "lessThan", expectedBookId);

        // ## Act ##
        final LdConditionValue value = cb.query().getBookId();

        // ## Assert ##
        log("conditionValue=" + value);
        assertEquals(expectedBookId, value.getLessThan());
        assertNull(value.getEqual());
        assertNull(value.getLessEqual());
    }

    public void test_invokeQuery_resolveRelation() throws Exception {
        // ## Arrange ##
        final Integer expectedAuthorId = 888;
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeQuery("author.authorId", "lessThan", expectedAuthorId);

        // ## Act ##
        final LdConditionValue value = cb.query().queryAuthor().getAuthorId();

        // ## Assert ##
        log("conditionValue=" + value);
        assertEquals(expectedAuthorId, value.getLessThan());
        assertNull(value.getEqual());
        assertNull(value.getLessEqual());
    }

    public void test_invokeOrderBy_by_propertyName() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeOrderBy("bookName", true);

        // ## Act ##
        final String orderByClause = cb.query().getSqlClause().getOrderByClause();

        // ## Assert ##
        log("orderByClause=" + orderByClause);
        assertTrue(orderByClause.contains("BOOK_NAME"));
    }

    public void test_invokeOrderBy_by_columnName() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeOrderBy("BOOK_NAME", true);

        // ## Act ##
        final String orderByClause = cb.query().getSqlClause().getOrderByClause();

        // ## Assert ##
        log("orderByClause=" + orderByClause);
        assertTrue(orderByClause.contains("BOOK_NAME"));
    }

    public void test_invokeOrderBy_resolveRelation() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.query().invokeOrderBy("author.authorName", true);

        // ## Act ##
        final String orderByClause = cb.query().queryAuthor().getSqlClause().getOrderByClause();

        // ## Assert ##
        log("orderByClause=" + orderByClause);
        assertTrue(orderByClause.contains("AUTHOR_NAME"));
    }

    public void test_convertFunctionToMethod() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        
        // ## Act & Assert ##
        assertEquals("countDistinct", cb.query().xconvertFunctionToMethod("count(distinct"));
        assertEquals("max", cb.query().xconvertFunctionToMethod("max"));
        assertEquals("count", cb.query().xconvertFunctionToMethod("count("));
    }

    public void test_toString() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();

        // ## Act ##
        final String localString = cb.query().toString();
        final String foreignString = cb.query().queryGenre().toString();

        // ## Assert ##
        log("localString=" + localString);
        log("foreignString=" + foreignString);
        assertNotNull(localString);
        assertNotNull(foreignString);
        assertTrue(localString.contains(LdBookCQ.class.getSimpleName()));
        assertTrue(localString.contains(cb.query().getAliasName()));
        assertTrue(foreignString.contains(LdGenreCQ.class.getSimpleName()));
        assertTrue(foreignString.contains(cb.query().queryGenre().getForeignPropertyName()));
        assertTrue(foreignString.contains(cb.query().queryGenre().getRelationPath()));
    }
}
