package dbflute.ldb.exbhv;

import java.util.List;

import dbflute.ldb.exentity.LdAuthor;

/**
 * The behavior of AUTHOR.
 * 
 * @author S2DaoGen (AutoGenerator)
 */
public class LdAuthorBhv extends dbflute.ldb.bsbhv.LdBsAuthorBhv {

    public List<LdAuthor> selectListAll() {
        return selectList(newMyConditionBean());
    }
}
