package dbflute.ldb.exentity;


/**
 * The entity of BOOK.
 * 
 * @author S2DaoGen (AutoGenerator)
 */
public class LdBook extends dbflute.ldb.bsentity.LdBsBook {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    protected String _parentGenreName;

    public String getParentGenreName() {
        return _parentGenreName;
    }

    public void setParentGenreName(String value) {
        this._parentGenreName = value;
    }
}
