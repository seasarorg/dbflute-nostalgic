package dbflute.ldb;

import dbflute.DBFluteTestCase;
import dbflute.ldb.allcommon.LdDaoReadable;
import dbflute.ldb.allcommon.LdDaoSelector;
import dbflute.ldb.allcommon.LdDaoWritable;
import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;



public abstract class LdLdbTestCase extends DBFluteTestCase {

    /**
     * Constructor.
     */
    public LdLdbTestCase() {
    }

    /**
     * Constructor
     * 
     * @param name Test case name.
     */
    public LdLdbTestCase(String name) {
        super(name);
    }
    
    protected LdDaoSelector getDaoSelector() {
        return (LdDaoSelector)getComponent(LdDaoSelector.class);
    }
    
    protected String getTestDiconPath() {
        return "test-ldb.dicon";
    }

    protected LdDaoReadable getRDao(Class daoClazz) {
        return getDaoSelector().getRDao(daoClazz);
    }

    protected LdDaoWritable getWDao(Class daoClazz) {
        return getDaoSelector().getWDao(daoClazz);
    }

    protected LdBehaviorReadable getRBhv(Class bhvClazz) {
        return getDaoSelector().getRBhv(bhvClazz);
    }
    
    protected LdBehaviorWritable getWBhv(Class bhvClazz) {
        return getDaoSelector().getWBhv(bhvClazz);
    }
    
    protected String getTestDataDirectoryPath() {
        return "dbflute/ldb/testdata";
    }
}
