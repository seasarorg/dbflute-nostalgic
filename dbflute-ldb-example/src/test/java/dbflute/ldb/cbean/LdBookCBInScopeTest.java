package dbflute.ldb.cbean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookCBInScopeTest extends LdBookAllDbTestCase {

    public void test_selectList_InScope_NullList_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_InScope(null);

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        final LdListResultBean<LdBook> expected = getMyBhv().selectList(new LdBookCB());
        assertEquals(expected.size(), ls.size());
        assertEquals(expected, ls);
    }

    public void test_selectList_InScope_EmptyList_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        cb.query().setAuthorId_InScope(new ArrayList<Integer>());

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        final LdListResultBean<LdBook> expected = getMyBhv().selectList(new LdBookCB());
        assertEquals(expected.size(), ls.size());
        assertEquals(expected, ls);
    }

    public void test_selectList_InScope_NullOnlyList_Tx() throws Exception {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        final List<Integer> authorIdList = new ArrayList<Integer>();
        authorIdList.add(null);
        authorIdList.add(null);
        cb.query().setAuthorId_InScope(authorIdList);

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        final LdListResultBean<LdBook> expected = getMyBhv().selectList(new LdBookCB());
        assertEquals(expected.size(), ls.size());
        assertEquals(expected, ls);
    }

    public void test_selectList_InScope_as_HashSet_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer publisherId = new Integer(3);
        final Integer nonExistPublisherId = new Integer(9999);
        final Set<Integer> publisherIdSet = new HashSet<Integer>();
        publisherIdSet.add(publisherId);
        publisherIdSet.add(nonExistPublisherId);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Publisher();
        cb.query().queryPublisher().setPublisherId_InScope(publisherIdSet);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(new Integer(String.valueOf(publisherId)), entity.getPublisher().getPublisherId());
        }
    }

    public void test_selectList_InScope_as_ArrayList_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer publisherId = new Integer(3);
        final Integer nonExistPublisherId = new Integer(9999);
        final List<Integer> publisherIdList = new ArrayList<Integer>();
        publisherIdList.add(publisherId);
        publisherIdList.add(nonExistPublisherId);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Publisher();
        cb.query().queryPublisher().setPublisherId_InScope(publisherIdList);
        final List<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            assertNotSame(new Integer(String.valueOf(publisherId)), entity.getPublisher().getPublisherId());
        }
    }

    public void test_selectList_Inline_InScope_at_ForeignTable_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final Integer publisherId = new Integer(3);
        final Integer nonExistPublisherId = new Integer(9999);
        final List<Integer> publisherIdList = new ArrayList<Integer>();
        publisherIdList.add(publisherId);
        publisherIdList.add(nonExistPublisherId);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Publisher();
        cb.query().queryPublisher().inline().setPublisherId_InScope(publisherIdList);
        final List<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(ls);
        for (final Iterator<LdBook> ite = ls.iterator(); ite.hasNext();) {
            final LdBook entity = (LdBook) ite.next();
            if (entity.getPublisherId().equals(publisherId)) {
                assertNotNull(entity.getPublisher());
                assertEquals(publisherId, entity.getPublisher().getPublisherId());
            } else {
                assertNull(entity.getPublisher());
            }
        }
    }
    
    public void test_selectList_InScope_NullIntegerValueOnly_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final int countAll = getMyBhv().getCountAll();
        final List<Integer> publisherIdList = new ArrayList<Integer>();
        publisherIdList.add(null);
        publisherIdList.add(null);

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setPublisherId_InScope(publisherIdList);
        final List<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(ls);
        assertEquals(countAll, ls.size());
    }
    
    public void test_selectList_InScope_NullEmptyStringValueOnly_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final int countAll = getMyBhv().getCountAll();
        final List<String> genreCodeList = new ArrayList<String>();
        genreCodeList.add("");
        genreCodeList.add(null);
        genreCodeList.add("");

        // ## Act ##
        final LdBookCB cb = new LdBookCB();
        cb.query().setGenreCode_InScope(genreCodeList);
        final List<LdBook> ls = getMyBhv().selectList(cb);

        // ## Assert ##
        assertListNotEmtpy(ls);
        assertEquals(countAll, ls.size());
    }
}
