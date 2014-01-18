package dbflute.ldb.testbase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.cbean.LdAuthorCB;
import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.cbean.LdCollectionCB;
import dbflute.ldb.cbean.LdCollectionStatusCB;
import dbflute.ldb.cbean.LdPublisherCB;
import dbflute.ldb.exbhv.LdAuthorBhv;
import dbflute.ldb.exbhv.LdBookBhv;
import dbflute.ldb.exbhv.LdCollectionBhv;
import dbflute.ldb.exbhv.LdCollectionStatusBhv;
import dbflute.ldb.exbhv.LdPublisherBhv;
import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.exentity.LdPublisher;

/**
 * @author jflute
 */
public abstract class LdBookAllDbTestCase extends LdAllGeneralDbTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdBookBhv ldBookBhv;

    protected final MyHelpObject _help = this.new MyHelpObjectImpl();

    @Override
    final protected LdDBMeta getDBMeta() {
        return LdBookDbm.getInstance();
    }

    final protected LdBookBhv getMyBhv() {
        return getBehaviorSelector().select(LdBookBhv.class);
    }

    protected void deleteSelf() {
        deleteReferrers();
        getBehaviorSelector().select(LdBookBhv.class).queryDelete(new LdBookCB());
    }

    protected void deleteReferrers() {
        getBehaviorSelector().select(LdCollectionStatusBhv.class).queryDelete(new LdCollectionStatusCB());
        getBehaviorSelector().select(LdCollectionBhv.class).queryDelete(new LdCollectionCB());
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    public class MyHelpObjectImpl extends AbstractMyHelpObject {

        public List<LdEntity> getMyEntityList_BeforeInsert() {
            final List<LdEntity> entityList = new ArrayList<LdEntity>();
            {
                final LdBook entity = new LdBook();
                //                entity.setBookId(new Integer("9999901"));
                entity.setBookName("test_insertObj01 of " + LdBookDbm.getInstance().getTablePropertyName());
                entity.setIsbn("X999999901");
                entity.setMaxLendingDateCount(new Integer("11"));

                {
                    LdAuthorCB cb = new LdAuthorCB();
                    cb.query().addOrderBy_AuthorId_Asc();
                    cb.fetchFirst(1);
                    LdAuthor author = getBehaviorSelector().select(LdAuthorBhv.class).selectEntityWithDeletedCheck(cb);
                    entity.setAuthorId(author.getAuthorId());
                }
                {
                    LdPublisherCB cb = new LdPublisherCB();
                    cb.query().addOrderBy_PublisherId_Asc();
                    cb.fetchFirst(1);
                    LdPublisher publisher = getBehaviorSelector().select(LdPublisherBhv.class)
                            .selectEntityWithDeletedCheck(cb);
                    entity.setPublisherId(publisher.getPublisherId());
                }
                entity.setGenreCode("HOWTO-MAHJONG");
                entity.setOpeningPart("getMyEntityList_BeforeInsert() of 9999901");
                entity.classifyOutOfUserSelectYnNo();
                entity.setOutOfUserSelectReason(null);
                entityList.add(entity);
            }
            {
                final LdBook entity = new LdBook();
                //                entity.setBookId(new Integer("9999902"));
                entity.setBookName("test_insertObj02 of " + LdBookDbm.getInstance().getTablePropertyName());
                entity.setIsbn("X999999902");
                entity.setMaxLendingDateCount(new Integer("12"));

                {
                    LdAuthorCB cb = new LdAuthorCB();
                    cb.query().addOrderBy_AuthorId_Asc();
                    cb.fetchFirst(1);
                    LdAuthor author = getBehaviorSelector().select(LdAuthorBhv.class).selectEntityWithDeletedCheck(cb);
                    entity.setAuthorId(author.getAuthorId());
                }
                {
                    LdPublisherCB cb = new LdPublisherCB();
                    cb.query().addOrderBy_PublisherId_Asc();
                    cb.fetchFirst(1);
                    LdPublisher publisher = getBehaviorSelector().select(LdPublisherBhv.class)
                            .selectEntityWithDeletedCheck(cb);
                    entity.setPublisherId(publisher.getPublisherId());
                }
                entity.classifyOutOfUserSelectYnYes();
                entity.setOutOfUserSelectReason("I don't know!");
                entityList.add(entity);
            }
            return entityList;
        }

        public List<LdEntity> getMyEntityList_BeforeUpdate() {
            final List<LdEntity> entityList = new ArrayList<LdEntity>();
            {
                final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
                cb.query().addOrderBy_BookId_Asc();
                cb.fetchFirst(1);
                LdBook book = getMyBhv().selectEntityWithDeletedCheck(cb);
                final LdBook entity = book;
                entity.setMaxLendingDateCount(new Integer("11"));
                entity.setIsbn("X999999901");
                entity.setGenreCode("NOVEL-KATA");
                entity.classifyOutOfUserSelectYnNo();
                entity.setOutOfUserSelectReason(null);
                entityList.add(entity);
            }
            {
                final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
                cb.query().addOrderBy_BookId_Asc();
                cb.fetchFirst(1);
                LdBook book = getMyBhv().selectEntityWithDeletedCheck(cb);
                final LdBook entity = book;
                entity.setMaxLendingDateCount(new Integer("12"));
                entity.setIsbn("X999999902");
                entity.setOpeningPart("getMyEntityList_BeforeUpdate() of getDataTable_Book().getRow(1)");
                entity.classifyOutOfUserSelectYnYes();
                entity.setOutOfUserSelectReason("I don't know!");
                entityList.add(entity);
            }
            return entityList;
        }

        public List<LdEntity> getMyEntityList_BeforeDelete() {
            final List<LdEntity> entityList = new ArrayList<LdEntity>();
            {
                final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
                cb.query().addOrderBy_BookId_Asc();
                cb.fetchFirst(1);
                LdBook book = getMyBhv().selectEntityWithDeletedCheck(cb);
                entityList.add(book);
            }
            {
                final LdBookCB cb = (LdBookCB) getBehaviorReadable().newConditionBean();
                cb.query().addOrderBy_BookId_Asc();
                cb.fetchFirst(2);
                LdBook book = getMyBhv().selectList(cb).get(1);
                entityList.add(book);
            }
            return entityList;
        }

        public void assertMyEntity(LdEntity expectedEntity, LdEntity actualEntity) {
            assertNotNull("The argument[expectedEntity] must not be null.", expectedEntity);
            assertNotNull("The argument[actualEntity] must not be null.", actualEntity);

            final LdBook expected = (LdBook) expectedEntity;
            final LdBook actual = (LdBook) actualEntity;

            assertEquals(expected.getBookId(), actual.getBookId());
            assertEquals(expected.getBookName(), actual.getBookName());
            assertEquals(expected.getIsbn(), actual.getIsbn());
            assertEquals(expected.getMaxLendingDateCount(), actual.getMaxLendingDateCount());
            assertEquals(expected.getAuthorId(), actual.getAuthorId());
            assertEquals(expected.getPublisherId(), actual.getPublisherId());

            assertEquals(expected.getGenreCode(), actual.getGenreCode());
            assertEquals(expected.getOpeningPart(), actual.getOpeningPart());

            assertEquals(expected.getOutOfUserSelectYn(), actual.getOutOfUserSelectYn());
            assertEquals(expected.getOutOfUserSelectReason(), actual.getOutOfUserSelectReason());

            assertEquals(expected.getAuthor(), actual.getAuthor());
            assertEquals(expected.getPublisher(), actual.getPublisher());
        }

        public void assertMyParentEntityNull(LdEntity actualEntity) {
            final LdBook actual = (LdBook) actualEntity;
            {
                String msg = "Author must be null: But --> " + actual.getAuthor();
                assertNull(msg, actual.getAuthor());
            }
            {
                String msg = "Publisher must be null: But --> " + actual.getPublisher();
                assertNull(msg, actual.getPublisher());
            }
        }

        public void assertMyChildEntityNull(LdEntity actualEntity) {
            final LdBook actual = (LdBook) actualEntity;

            {
                assertFalse(actual.getCollectionList().size() > 0);
                assertNotNull(actual.getCollectionList());
            }
        }

        public Comparator<LdEntity> getPrimaryKeyAscComparator() {
            return new Comparator<LdEntity>() {
                public int compare(LdEntity arg0, LdEntity arg1) {
                    final LdBook xx = (LdBook) arg0;
                    final LdBook yy = (LdBook) arg1;
                    return xx.getBookId().compareTo(yy.getBookId());
                }
            };
        }
    }
}
