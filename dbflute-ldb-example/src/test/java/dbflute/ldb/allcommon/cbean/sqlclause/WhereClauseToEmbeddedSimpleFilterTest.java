package dbflute.ldb.allcommon.cbean.sqlclause;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.cbean.sqlclause.LdWhereClauseSimpleFilter.WhereClauseToEmbeddedSimpleFilter;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;

/**
 * 
 * @author jflute
 * @since 0.5.5 (2007/08/20)
 */
public class WhereClauseToEmbeddedSimpleFilterTest extends TestCase {

    public void test_WhereClauseToEmbeddedSimpleFilter_isTargetClause() throws Exception {
        final WhereClauseToEmbeddedSimpleFilter filter = new WhereClauseToEmbeddedSimpleFilter((LdColumnInfo)null);
        assertTrue(filter.isTargetClause("xxx.aaa xxx", "aaa"));
        assertTrue(filter.isTargetClause("xxx.bbb xxx", "bbb"));
        assertFalse(filter.isTargetClause("xxxaaa xxx", "aaa"));
        assertFalse(filter.isTargetClause("xxx.bbbxxx", "bbb"));
    }
}
