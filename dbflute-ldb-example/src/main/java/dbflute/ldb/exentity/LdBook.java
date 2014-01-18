package dbflute.ldb.exentity;

import java.sql.Timestamp;


/**
 * The entity of BOOK.
 * 
 * @author S2DaoGen (AutoGenerator)
 */
public class LdBook extends dbflute.ldb.bsentity.LdBsBook {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _parentGenreName;
    protected String _generalString;
    protected Integer _generalInteger;
    protected Timestamp _generalTimestamp;
    protected Timestamp _generalTimestamp2;

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getParentGenreName() {
        return _parentGenreName;
    }

    public void setParentGenreName(String value) {
        this._parentGenreName = value;
    }
    
    public String getGeneralString() {
        return _generalString;
    }
    
    public void setGeneralString(String value) {
        this._generalString = value;
    }

    public Integer getGeneralInteger() {
        return _generalInteger;
    }
    
    public void setGeneralInteger(Integer generalInteger) {
        this._generalInteger = generalInteger;
    }

    public Timestamp getGeneralTimestamp() {
        return _generalTimestamp;
    }

    public void setGeneralTimestamp(Timestamp generalTimestamp) {
        this._generalTimestamp = generalTimestamp;
    }
    
    public Timestamp getGeneralTimestamp2() {
        return _generalTimestamp2;
    }
    
    public void setGeneralTimestamp2(Timestamp generalTimestamp2) {
        this._generalTimestamp2 = generalTimestamp2;
    }
}
