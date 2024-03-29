package dbflute.ldb.allcommon.cbean;

/**
 * Fetch-Narrowing-Bean context. (referring to s2pager)
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdFetchNarrowingBeanContext {

    /** The thread-local for this. */
    private static ThreadLocal<LdFetchNarrowingBean> _threadLocal = new ThreadLocal<LdFetchNarrowingBean>();

    /**
     * Get fetch-narrowing-bean on thread.
     * 
     * @return Condition-bean context. (Nullable)
     */
    public static LdFetchNarrowingBean getFetchNarrowingBeanOnThread() {
        return (LdFetchNarrowingBean)_threadLocal.get();
    }

    /**
     * Set fetch-narrowing-bean on thread.
     * 
     * @param cb Condition-bean. (NotNull)
     */
    public static void setFetchNarrowingBeanOnThread(LdFetchNarrowingBean cb) {
        if (cb == null) {
            String msg = "The argument[cb] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        _threadLocal.set(cb);
    }

    /**
     * Is existing fetch-narrowing-bean on thread?
     * 
     * @return Determination.
     */
    public static boolean isExistFetchNarrowingBeanOnThread() {
        return (_threadLocal.get() != null);
    }

    /**
     * Clear fetch-narrowing-bean on thread.
     */
    public static void clearFetchNarrowingBeanOnThread() {
        _threadLocal.set(null);
    }

    /**
     * Is the argument fetch-narrowing-bean?
     * 
     * @param dtoInstance Dto instance.
     * @return Determination.
     */
    public static boolean isTheArgumentFetchNarrowingBean(final Object dtoInstance) {
        if (dtoInstance instanceof LdFetchNarrowingBean) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Is the type fetch-narrowing-bean?
     * 
     * @param dtoClass DtoClass.
     * @return Determination.
     */
    public static boolean isTheTypeFetchNarrowingBean(final Class dtoClass) {
        if (LdFetchNarrowingBean.class.isAssignableFrom(dtoClass)) {
            return true;
        } else {
            return false;
        }
    }
}
