package dbflute.ldb.cbean;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.LdSubQuery;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * Test of BsBookDao
 * 
 * @author jflute
 */
public class LdBookCBInlineTest extends LdBookAllDbTestCase {

    private static final Log _log = LogFactory.getLog(LdBookCBInlineTest.class);

    public void test_selectList_InlineView_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().inline().setAuthorId_Equal(authorId);
        cb.query().setBookName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertEquals(new Integer(String.valueOf(authorId)), entity.getAuthorId());
        }
    }

    public void test_selectList_Equal_OnClause_at_MyTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act & Assert ##
        final LdBookCB cb = new LdBookCB();
        try {
            cb.query().on().setAuthorId_Equal(authorId);
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_selectList_InlineView_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().queryAuthor().inline().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            _log.debug(entity.getBookName() + " -- " + entity.getAuthor());
            if (entity.getAuthorId().equals(authorId)) {
                assertEquals(authorId, entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorName());
            } else {
                assertNull("Unknown instance: " + entity.getAuthor(), entity.getAuthor());
                assertFalse(entity.getAuthor() != null);
            }
        }
    }

    public void test_selectList_Equal_OnClause_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().queryAuthor().on().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            _log.debug(entity.getBookName() + " -- " + entity.getAuthor());
            if (entity.getAuthorId().equals(authorId)) {
                assertEquals(authorId, entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorName());
            } else {
                assertNull("Unknown instance: " + entity.getAuthor(), entity.getAuthor());
                assertFalse(entity.getAuthor() != null);
            }
        }
    }

    public void test_selectList_Equal_InlineViewAndOnClause_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer authorId = new Integer(3);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().queryAuthor().inline().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().on().setAuthorId_Equal(authorId);
        cb.query().queryAuthor().setAuthorName_Equal(null);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            _log.debug(entity.getBookName() + " -- " + entity.getAuthor());
            if (entity.getAuthorId().equals(authorId)) {
                assertEquals(authorId, entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorId());
                assertNotNull(entity.getAuthor().getAuthorName());
            } else {
                assertNull("Unknown instance: " + entity.getAuthor(), entity.getAuthor());
                assertFalse(entity.getAuthor() != null);
            }
        }
    }

    public void test_selectList_InlineView_InScopeSubQuery_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        cb.query().queryAuthor().inline().inScopeBookList(new LdSubQuery<LdBookCB>() {
            public void query(LdBookCB subCB) {
                subCB.query().setPublisherId_Equal(3);
            }
        });
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            _log.debug(entity.getBookName() + " -- " + entity.getAuthor());
        }
    }

    public void test_selectList_OnClause_InScopeSubQuery_at_ForeignTable_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        try {
            cb.query().queryAuthor().on().inScopeBookList(new LdSubQuery<LdBookCB>() {
                public void query(LdBookCB subCB) {
                    subCB.query().setPublisherId_Equal(3);
                }
            });
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_selectList_InlineView_ExistsSubQuery_at_ForeignTable_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();
        final LdBookCB bookSubCB = new LdBookCB();
        bookSubCB.query().setPublisherId_Equal(3);

        // ## Act ##
        try {
            cb.query().queryAuthor().inline().existsBookList(new LdSubQuery<LdBookCB>() {
                public void query(LdBookCB subCB) {
                    subCB.query().setPublisherId_Equal(3);
                }
            });
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }

    public void test_selectList_OnClause_ExistsSubQuery_at_ForeignTable_Tx() {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        try {
            cb.query().queryAuthor().on().existsBookList(new LdSubQuery<LdBookCB>() {
                public void query(LdBookCB subCB) {
                    subCB.query().setPublisherId_Equal(3);
                }
            });
            fail();
        } catch (UnsupportedOperationException e) {
            // OK
            _log.debug(e.getMessage());
        }
    }
}
