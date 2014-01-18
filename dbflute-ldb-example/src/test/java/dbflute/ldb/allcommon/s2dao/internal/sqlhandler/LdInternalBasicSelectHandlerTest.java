package dbflute.ldb.allcommon.s2dao.internal.sqlhandler;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.cbean.LdFetchNarrowingBean;
import dbflute.ldb.allcommon.cbean.LdSimplePagingBean;

/**
 * @author jflute
 */
public class LdInternalBasicSelectHandlerTest extends TestCase {

    public void test_isUseFetchNarrowingResultSetWrapper() throws Exception {
        final LdInternalBasicSelectHandler factory = new LdInternalBasicSelectHandler(null, null, null, null);
        {
            final LdSimplePagingBean spb = new LdSimplePagingBean();
            assertFalse(factory.isUseFetchNarrowingResultSetWrapper(spb));
        }
        {
            final LdSimplePagingBean spb = new LdSimplePagingBean();
            spb.checkSafetyResult(0);
            assertFalse(factory.isUseFetchNarrowingResultSetWrapper(spb));
        }
        {
            final LdSimplePagingBean spb = new LdSimplePagingBean();
            spb.fetchFirst(2);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(spb));
        }
        {
            final LdSimplePagingBean spb = new LdSimplePagingBean();
            spb.checkSafetyResult(1);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(spb));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(0, true, false, false);
            assertFalse(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(0, true, true, false);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(0, true, true, true);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(0, false, true, true);
            assertFalse(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(1, true, false, false);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
        {
            final LdFetchNarrowingBean bean = createFetchNarrowingBean(2, true, false, false);
            assertTrue(factory.isUseFetchNarrowingResultSetWrapper(bean));
        }
    }

    protected LdFetchNarrowingBean createFetchNarrowingBean(final int safetyMaxResultSize,
            final boolean fetchNarrowingEffective, final boolean fetchNarrowingLoopCountEffective,
            final boolean fetchNarrowingSkipStartIndexEffective) {
        final LdFetchNarrowingBean bean = new LdFetchNarrowingBean() {
            public int getFetchNarrowingLoopCount() {
                return 0;
            }

            public int getFetchNarrowingSkipStartIndex() {
                return 0;
            }

            public int getSafetyMaxResultSize() {
                return safetyMaxResultSize;
            }

            public boolean isFetchNarrowingEffective() {
                return fetchNarrowingEffective;
            }

            public boolean isFetchNarrowingLoopCountEffective() {
                return fetchNarrowingLoopCountEffective;
            }

            public boolean isFetchNarrowingSkipStartIndexEffective() {
                return fetchNarrowingSkipStartIndexEffective;
            }

            public void ignoreFetchNarrowing() {
            }

            public void restoreIgnoredFetchNarrowing() {
            }
        };
        return bean;
    }
}
