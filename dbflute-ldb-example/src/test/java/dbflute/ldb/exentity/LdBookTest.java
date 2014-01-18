package dbflute.ldb.exentity;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;

import dbflute.ldb.allcommon.LdCDef;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.cbean.LdListResultBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.testbase.LdBookAllDbTestCase;

/**
 * @author jflute
 */
public class LdBookTest extends LdBookAllDbTestCase {

    // ===================================================================================
    //                                                                        Look Foreign
    //                                                                        ============
    public void test_lookForeign_Tx() throws Exception {
        // ## Arrange ##
        final LdBook book = new LdBook();

        // ## Act & Assert ##
        // Author
        assertNull(book.getAuthor());
        assertNull(book.getAuthor());
        // Genre
        assertNull(book.getGenre());
        assertNull(book.getGenre());
    }

    // ===================================================================================
    //                                                                      Classification
    //                                                                      ==============
    public void test_classifyAsClassification_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();

        // ## Act ##
        book.classifyOutOfUserSelectYn(LdCDef.YesNo.Yes);

        // ## Assert ##
        final String code = book.getOutOfUserSelectYn();
        log(code);
        assertNotNull(code);
        assertEquals(LdCDef.YesNo.Yes.code(), code);
    }

    public void test_classifyAsClassification_null_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.classifyOutOfUserSelectYnYes();

        // ## Act ##
        book.classifyOutOfUserSelectYn(null);

        // ## Assert ##
        final String code = book.getOutOfUserSelectYn();
        log(code);
        assertNull(code);
    }

    public void test_getAsClassification_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.classifyOutOfUserSelectYn(LdCDef.YesNo.Yes);

        // ## Act ##
        final LdCDef.YesNo cls = book.getOutOfUserSelectYnAsYesNo();

        // ## Assert ##
        log(cls);
        assertNotNull(cls);
        assertEquals(LdCDef.YesNo.Yes, cls);
    }

    public void test_getAsClassification_null_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.classifyOutOfUserSelectYn(null);

        // ## Act ##
        final LdCDef.YesNo cls = book.getOutOfUserSelectYnAsYesNo();

        // ## Assert ##
        log(cls);
        assertNull(cls);
    }

    public void test_getClassificationName_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.classifyOutOfUserSelectYnYes();

        // ## Act ##
        final String name = book.getOutOfUserSelectYnName();

        // ## Assert ##
        log(name);
        assertNotNull(name);
    }

    public void test_getClassificationAlias_Tx() {
        // ## Arrange ##
        final LdBook book = new LdBook();
        book.classifyOutOfUserSelectYnYes();

        // ## Act ##
        final String alias = book.getOutOfUserSelectYnAlias();

        // ## Assert ##
        log(alias);
        assertNotNull(alias);
    }

    // ===================================================================================
    //                                                                         Has Foreign
    //                                                                         ===========
    public void test_hasForeignXxx_ForeignKeyIsNull_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookBhv bhv = getMyBhv();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Genre();
        cb.query().setIsbn_Equal("X0000000002");// Genre is null;

        // ## Act ##
        final LdBook entity = bhv.selectEntity(cb);
        assertNotNull(entity);

        // ## Assert ##
        assertNull(entity.getGenre());
    }

    public void test_hasForeignXxx_ForeienKeyIsDeadlink_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();
        final LdBookBhv bhv = getMyBhv();
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_CollectionStatusLookupAsNonExist();
        cb.query().setIsbn_Equal("X0000000001");// Genre is not null;

        // ## Act ##
        final LdBook entity = bhv.selectEntity(cb);
        assertNotNull(entity);

        // ## Assert ##
        assertNull(entity.getCollectionStatusLookupAsNonExist());
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public void test_getModifiedPropertyNames_ForRelation_ExpectEmpty_Tx() throws Exception {
        // ## Arrange ##
        final LdBookCB cb = new LdBookCB();
        cb.setupSelect_Author();

        // ## Act ##
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Assert ##
        boolean existsAuthor = false;
        for (LdBook entity : ls) {
            final LdAuthor author = entity.getAuthor();
            if (author != null) {
                _log.debug("author.getModifiedPropertyNames()=" + author.getModifiedPropertyNames());
                assertNotNull(author.getAuthorId());
                assertNotNull(author.getAuthorName());
                assertTrue("actual=" + author.getModifiedPropertyNames(), author.getModifiedPropertyNames().isEmpty());
                existsAuthor = true;
            }
        }
        assertTrue(existsAuthor);
    }

    public void test_hasModification_PlainEntity_Tx() {
        final LdBook entity = new LdBook();
        assertFalse(entity.hasModification());
        entity.setBookName("xxx");
        assertTrue(entity.hasModification());
    }

    public void test_hasModification_SelectedEntity_Tx() {
        // ## Arrange ##
        _help.replaceMyTableWithAll();

        final LdBookCB cb = new LdBookCB();
        final LdListResultBean<LdBook> ls = getMyBhv().selectList(cb);
        assertListNotEmtpy(ls);

        // ## Act & Assert ##
        for (LdBook book : ls) {
            assertFalse(book.hasModification());
            book.setBookName("xxx");
            assertTrue(book.hasModification());
        }
    }

    // ===================================================================================
    //                                                                             Extract
    //                                                                             =======
    public void test_Entity_extractAcceptPrimaryKeyMap_Tx() {
        {
            final List<LdEntity> ls = _help.getMyEntityList_BeforeInsert();
            for (Object object : ls) {
                final LdBook entity = (LdBook) object;
                entity.setBookId(new Integer(99999999));
                final LdBookCB cb = new LdBookCB();
                cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
                assertEquals(entity.getBookId(), cb.query().getBookId().getEqual());
            }
        }
        {
            final List<LdEntity> ls = _help.getMyEntityList_BeforeInsert();
            for (LdEntity object : ls) {
                final LdBook entity = (LdBook) object;
                entity.setBookId(new Integer(99999999));
                final LdBook acceptEntity = new LdBook();
                getDBMeta().acceptPrimaryKeyMapString(acceptEntity, getDBMeta().extractPrimaryKeyMapString(entity));
                assertEquals(entity.getBookId(), acceptEntity.getBookId());
            }
        }

        java.util.List<String> ss = new java.util.ArrayList<String>();
        ss.add("aaa");
        ss.add("bbb");
        final String[] array = new String[ss.size()];
        final Object[] toArray = ss.toArray(array);
        for (String string : array) {
            _log.debug("***: " + string);
        }
        for (Object string : toArray) {
            _log.debug("***: " + string);
        }
    }

    public void test_Entity_extractAcceptColumnValueMap_Tx() {
        final List<LdEntity> ls = _help.getMyEntityList_BeforeInsert();

        for (final LdEntity object : ls) {
            final LdBook entity = (LdBook) object;
            final LdBook acceptEntity = new LdBook();
            getDBMeta().acceptColumnValueMapString(acceptEntity, getDBMeta().extractColumnValueMapString(entity));
            final String actualView = getDBMeta().extractColumnValueMapString(acceptEntity);
            _log.debug("getDBMeta().extractColumnValueMapString(acceptEntity): " + actualView);
            _help.assertMyEntity(entity, acceptEntity);
        }
        for (final Object object : ls) {
            final LdBook entity = (LdBook) object;
            final LdBook acceptEntity = new LdBook();
            String mapString = getDBMeta().extractColumnValueMapString(entity);
            final String prefix = LdDBMeta.MAP_STRING_MAP_MARK + LdDBMeta.MAP_STRING_START_BRACE;
            if (!mapString.startsWith(prefix)) {
                fail("getDBMeta().extractPrimaryKeyMapString(entity) should start with " + prefix + " actual="
                        + mapString);
            }
            mapString = mapString.substring((LdDBMeta.MAP_STRING_MAP_MARK + LdDBMeta.MAP_STRING_START_BRACE).length());

            final String suffix = LdDBMeta.MAP_STRING_END_BRACE;
            if (!mapString.endsWith(suffix)) {
                fail("getDBMeta().extractPrimaryKeyMapString(entity) should end with " + suffix + " actual="
                        + mapString);
            }
            mapString = mapString.substring(0, mapString.length() - LdDBMeta.MAP_STRING_END_BRACE.length());
            getDBMeta().acceptColumnValueMapString(acceptEntity, mapString);
            _help.assertMyEntity(entity, acceptEntity);
        }

        for (final Object object : ls) {
            final LdBook entity = (LdBook) object;
            entity.setRTimestamp(new Timestamp(System.currentTimeMillis()));// Try type of Date.
            _log.debug("getDBMeta().extractPrimaryKeyMapString(entity): "
                    + getDBMeta().extractPrimaryKeyMapString(entity));
            // OK because of No Exception!
        }
        Collections.emptyList();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public void test_equals_otherEntityIsNull_Tx() throws Exception {
        // ## Arrange ##
        final LdBook entity = new LdBook();

        // ## Act & Assert ##
        assertFalse(entity.equals(null));
    }

    public void test_equals_primaryKeyIsNull_Tx() throws Exception {
        // ## Arrange ##
        final LdBook entity = new LdBook();
        final LdBook otherEntity = new LdBook();

        // ## Act & Assert ##
        assertTrue(entity.equals(otherEntity));
        entity.setBookId(new Integer(3));
        assertFalse(entity.equals(otherEntity));
        otherEntity.setBookId(new Integer(3));
        assertTrue(entity.equals(otherEntity));
        entity.setBookName("A");
        otherEntity.setBookName("B");
        assertTrue(entity.equals(otherEntity));
    }

    public void test_Entity_toString_Tx() {
        // Assert not throwing exception.
        final String toString = getDBMeta().newEntity().toString();
        assertNotNull(toString);
        _log.debug(toString);
    }

}
