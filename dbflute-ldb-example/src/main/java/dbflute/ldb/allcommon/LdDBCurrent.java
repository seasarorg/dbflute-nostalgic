/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;


/**
 * @author DBFlute(AutoGenerator)
 */
public class LdDBCurrent {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdDBCurrent.class);

    /** Singleton instance. */
    private static final LdDBCurrent _instance = new LdDBCurrent();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdDBDef _currentDBDef;
    {
        _currentDBDef = LdDBDef.codeOf("Derby");
        if (_currentDBDef == null) {
            _currentDBDef = LdDBDef.Unknown;
        }
    }
	
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    private LdDBCurrent() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get instance.
     * @return Singleton instance. (NotNull)
     */
    public static LdDBCurrent getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public void initializeCurrentDBDef(LdDBDef currentDBDef) {
	    if (_log.isInfoEnabled()) {
		    _log.info("...Setting currentDBDef: " + currentDBDef);
		}
		if (currentDBDef == null) {
		    String msg = "The argument 'currentDBDef' should not be null!";
		    throw new IllegalArgumentException(msg);
		}
        _currentDBDef = currentDBDef;
    }

    public LdDBDef currentDBDef() {
        return _currentDBDef;
    }

    public boolean isCurrentDBDef(LdDBDef currentDBDef) {
	    return _currentDBDef.equals(currentDBDef);
    }
}