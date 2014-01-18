package dbflute.ldb.exbhv;


/**
 * The behavior of BOOK.
 * @author DBFlute(AutoGenerator)
 */
public class LdBookBhv extends dbflute.ldb.bsbhv.LdBsBookBhv {
    //
    //    protected LdBookDao bookDao;
    //
    //    public LdPagingResultBean<LdBookCollectionStatistic> selectPageBookCollectionStatistic(
    //            final LdBookCollectionStatisticPmb pmb) {
    //        final LdPagingHandler<LdBookCollectionStatistic> callback = new LdPagingHandler<LdBookCollectionStatistic>() {
    //
    //            public LdPagingBean getPagingBean() {
    //                return pmb;
    //            }
    //
    //            public int count() {
    //                return getBookDao().selectCountBookCollectionStatistic(pmb);
    //            }
    //
    //            public List<LdBookCollectionStatistic> paging() {
    //                return getBookDao().selectListBookCollectionStatistic(pmb);
    //            }
    //
    //        };
    //        return new LdPagingInvoker<LdBookCollectionStatistic>(getTableDbName()).invokePaging(callback);
    //    }
    //
    //    public java.util.List<LdBook> selectListBookFromHierarchyFlat() {
    //        // Search
    //        final List<LdHierarchyFlatBook> hierarchyFlatBookList = getBookDao().selectListHierarchyFlatBook();
    //
    //        // Create hierarchy request
    //        final LdHierarchyBasicRequest<LdBook, BookRelationTrace> request = createHierarchyBasicRequest(hierarchyFlatBookList);
    //
    //        // Define source dbmeta
    //        final LdHierarchyFlatBookDbm sourceDbm = LdHierarchyFlatBookDbm.getInstance();
    //
    //        // Register column [primaryBookId]
    //        request.src(sourceDbm.columnPrimaryBookId()).dst().columnBookId();
    //
    //        // Register column [attributeBookName]
    //        request.src(sourceDbm.columnAttributeBookName()).dst().columnBookName();
    //
    //        // Register column [primaryAuthorId]
    //        request.src(sourceDbm.columnPrimaryAuthorId()).dst().foreignAuthor().columnAuthorId();
    //
    //        // Register column [attributeAuthorName]
    //        request.src(sourceDbm.columnAttributeAuthorName()).dst().foreignAuthor().columnAuthorName();
    //
    //        // Register column [primaryCollectionId]
    //        request.src(sourceDbm.columnPrimaryCollectionId());
    //        request.dst().referrerCollectionList().columnCollectionId();
    //
    //        // Register column [attributeArrivalDate]
    //        request.src(sourceDbm.columnAttributeArrivalDate());
    //        request.dst().referrerCollectionList().columnArrivalDate();
    //
    //        // Arrange hierarchy
    //        return arrangeHierarchy(request);
    //    }
}
