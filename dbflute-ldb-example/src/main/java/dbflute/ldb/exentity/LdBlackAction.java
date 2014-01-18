package dbflute.ldb.exentity;

/**
 * The entity of BLACK_ACTION.
 * 
 * @author S2DaoGen (AutoGenerator)
 */
public class LdBlackAction extends dbflute.ldb.bsentity.LdBsBlackAction {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                       Modified Properties Extension
    //                                                       =============================
    /**
     * Get modified property names. (S2Dao uses this for updateModifiedProperties())
     * 
     * @return Modified property names. (NotNull)
     */
    public java.util.Set<String> getModifiedPropertyNames() {
        final ProxySetClearCallback callback = new ProxySetClearCallback() {
            public void clear() {
                showModifiedPropertyNamesExtension();
            }
        };
        return new ProxySet(super.getModifiedPropertyNames(), callback);
    }
    
    protected void showModifiedPropertyNamesExtension() {
        System.out.println("showModifiedPropertyNamesExtesion(): " + toString());
        callbackModifiedPropertyNamesExtension = true;
    }

    protected boolean callbackModifiedPropertyNamesExtension;

    public boolean isCallbackModifiedPropertyNamesExtension() {
        return callbackModifiedPropertyNamesExtension;
    }

    protected static class ProxySet extends java.util.HashSet<String> {

        private static final long serialVersionUID = 5086324526379669849L;

        protected java.util.Set<String> wrappedSet;

        protected ProxySetClearCallback callback;

        public ProxySet(java.util.Set<String> wrappedSet, ProxySetClearCallback callback) {
            this.wrappedSet = wrappedSet;
            this.callback = callback;
        }

        @Override
        public void clear() {
            wrappedSet.clear();
            callback.clear();
        }
    }

    protected static interface ProxySetClearCallback {
        public void clear();
    }

}
