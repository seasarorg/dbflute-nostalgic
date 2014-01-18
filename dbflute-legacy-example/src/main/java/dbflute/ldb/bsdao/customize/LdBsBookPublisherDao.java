
package dbflute.ldb.bsdao.customize;

import dbflute.ldb.exentity.customize.LdBookPublisher;
import dbflute.ldb.allcommon.LdDaoReadable;

/**
 * The customize dao interface of BOOK_PUBLISHER.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBsBookPublisherDao extends LdDaoReadable {

    /** BEAN-Annotation. */
    public Class BEAN = LdBookPublisher.class;


    public String selectEntity_ARGS = "bookId";

    public LdBookPublisher selectEntity(String bookId);

    public String selectList_ARGS = "bookNamePrefix";

    public java.util.List<LdBookPublisher> selectList(String bookNamePrefix);

}
