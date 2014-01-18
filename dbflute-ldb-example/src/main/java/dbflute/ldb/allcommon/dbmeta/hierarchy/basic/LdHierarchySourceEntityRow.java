/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy.basic;


/**
 * @author DBFlute(AutoGenerator)
 */
public class LdHierarchySourceEntityRow implements dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceRow {

    protected Object sourceBean;

    public LdHierarchySourceEntityRow(Object sourceBean) {
        this.sourceBean = sourceBean;
    }

    public Object extractColumnValue(dbflute.ldb.allcommon.dbmeta.hierarchy.LdHierarchySourceColumn columnInfo) {
        if (!(columnInfo instanceof LdHierarchySourceEntityColumn)) {
            String msg = "The column info should be LdHierarchySourceEntityColumn! but: " + columnInfo;
            throw new IllegalStateException(msg);
        }
        final LdHierarchySourceEntityColumn sourceEntityColumn = (LdHierarchySourceEntityColumn) columnInfo;
        return invoke(sourceEntityColumn.findGetter(), sourceBean, new Object[] {});
    }

    private Object invoke(java.lang.reflect.Method method, Object target, Object[] args) {
        try {
            return method.invoke(target, args);
        } catch (java.lang.reflect.InvocationTargetException ex) {
            Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        } catch (IllegalAccessException ex) {
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        }
    }
}