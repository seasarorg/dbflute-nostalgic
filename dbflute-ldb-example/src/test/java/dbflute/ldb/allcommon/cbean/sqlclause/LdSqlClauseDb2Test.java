package dbflute.ldb.allcommon.cbean.sqlclause;

import junit.framework.TestCase;

/**
 * @author jflute
 * @since 0.7.9 (2008/08/23 Saturday)
 */
public class LdSqlClauseDb2Test extends TestCase {

    public void test_lockForUpdate() {
        // ## Arrange ##
        final LdSqlClauseDb2 sqlClause = new LdSqlClauseDb2("dummy");

        // ## Act ##
        sqlClause.lockForUpdate();

        // ## Arrange ##
        assertTrue(sqlClause._lockSqlSuffix.contains("for update with RS"));
    }
    
    public void test_lockWithRR() {
        // ## Arrange ##
        final LdSqlClauseDb2 sqlClause = new LdSqlClauseDb2("dummy");
        
        // ## Act ##
        sqlClause.lockWithRR();
        
        // ## Arrange ##
        assertTrue(sqlClause._lockSqlSuffix.contains("with RR"));
    }

    public void test_lockWithRS() {
        // ## Arrange ##
        final LdSqlClauseDb2 sqlClause = new LdSqlClauseDb2("dummy");

        // ## Act ##
        sqlClause.lockWithRS();

        // ## Arrange ##
        assertTrue(sqlClause._lockSqlSuffix.contains("with RS"));
    }
    
    public void test_lockWithCS() {
        // ## Arrange ##
        final LdSqlClauseDb2 sqlClause = new LdSqlClauseDb2("dummy");
        
        // ## Act ##
        sqlClause.lockWithCS();
        
        // ## Arrange ##
        assertTrue(sqlClause._lockSqlSuffix.contains("with CS"));
    }
    
    public void test_lockWithUR() {
        // ## Arrange ##
        final LdSqlClauseDb2 sqlClause = new LdSqlClauseDb2("dummy");
        
        // ## Act ##
        sqlClause.lockWithUR();
        
        // ## Arrange ##
        assertTrue(sqlClause._lockSqlSuffix.contains("with UR"));
    }
}
