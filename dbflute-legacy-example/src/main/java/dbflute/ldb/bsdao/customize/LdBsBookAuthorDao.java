
package dbflute.ldb.bsdao.customize;

import dbflute.ldb.exentity.customize.LdBookAuthor;
import dbflute.ldb.allcommon.LdDaoReadable;

import dbflute.ldb.allcommon.cbean.LdSimplePagingBean;

import dbflute.ldb.allcommon.cbean.sqlclause.LdOrderByClause;

/**
 * The customize dao interface of BOOK_AUTHOR.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBsBookAuthorDao extends LdDaoReadable {

    /** BEAN-Annotation. */
    public Class BEAN = LdBookAuthor.class;


    public String selectEntity_ARGS = "bookId";

    public LdBookAuthor selectEntity(String bookId);

    public String selectList_ARGS = "bookNamePrefix";

    public java.util.List<LdBookAuthor> selectList(String bookNamePrefix);

}
