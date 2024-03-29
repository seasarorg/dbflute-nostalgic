package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;

import com.example.dbflute.teeda.dbflute.allcommon.DBDef;
import com.example.dbflute.teeda.dbflute.allcommon.bhv.core.ResourceContext;
import com.example.dbflute.teeda.dbflute.allcommon.exception.EntityAlreadyDeletedException;
import com.example.dbflute.teeda.dbflute.allcommon.exception.EntityDuplicatedException;
import com.example.dbflute.teeda.dbflute.allcommon.exception.BatchEntityAlreadyUpdatedException;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalAbstractBatchAutoHandler extends InternalAbstractAutoHandler {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(InternalAbstractBatchAutoHandler.class);

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalAbstractBatchAutoHandler(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData, PropertyType[] propertyTypes) {
        super(dataSource, statementFactory, beanMetaData, propertyTypes);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    public int execute(Object[] args) {
        List<?> list = null;
        if (args[0] instanceof Object[]) {
            list = Arrays.asList((Object[]) args[0]);
        } else if (args[0] instanceof List) {
            list = (List<?>) args[0];
        }
        if (list == null) {
            throw new IllegalArgumentException("args[0]");
        }
        int[] ret = execute(list);
        int updatedRow = 0;
        for (int i = 0; i < ret.length; i++) {
            if (ret[i] > 0) {
                updatedRow += ret[i];
            }
        }
        return updatedRow;
    }

    public int[] executeBatch(Object[] args) {
        List<?> list = null;
        if (args[0] instanceof Object[]) {
            list = Arrays.asList((Object[]) args[0]);
        } else if (args[0] instanceof List) {
            list = (List<?>) args[0];
        }
        if (list == null) {
            throw new IllegalArgumentException("args[0]");
        }
        return execute(list);
    }

    public int[] execute(List<?> list, Class<?>[] argTypes) {
        return execute(list);
    }

    public int[] execute(List<?> list) {
        if (list == null) {
            throw new IllegalArgumentException("list");
        }
		if (list.isEmpty()) {
		    if (_log.isDebugEnabled()) {
                _log.debug("Skip executeBatch() bacause of the empty list.");
            }
			return new int[0];
		}
        final Connection connection = getConnection();
        try {
            final PreparedStatement ps = prepareStatement(connection);
            try {
                for (Iterator<?> iter = list.iterator(); iter.hasNext();) {
                    final Object bean = (Object) iter.next();
                    prepareBatchElement(ps, bean);
                }
                final int[] result = executeBatch(ps, list);
                handleBatchUpdateResultWithOptimisticLock(ps, list, result);
                return result;
            } finally {
                close(ps);
            }
        } finally {
            close(connection);
        }
        // Reflection to bean is unsupported at batch update.
        // postBatchUpdateBean(...);
    }

    protected void prepareBatchElement(PreparedStatement ps, Object bean) {
        setupBindVariables(bean);
        logSql(getBindVariables(), getArgTypes(getBindVariables()));
        bindArgs(ps, getBindVariables(), getBindVariableValueTypes());
        addBatch(ps);
    }

    // ===================================================================================
    //                                                                     Optimistic Lock
    //                                                                     ===============
    protected void handleBatchUpdateResultWithOptimisticLock(PreparedStatement ps, List<?> list, int[] result) {
        if (isCurrentDBDef(DBDef.Oracle)) {
            final int updateCount;
            try {
                updateCount = ps.getUpdateCount();
            } catch (SQLException e) {
                handleSQLException(e, ps);
                return; // Unreachable!
            }
            handleBatchUpdateResultWithOptimisticLockByUpdateCount(list, updateCount);
        } else {
            handleBatchUpdateResultWithOptimisticLockByResult(list, result);
        }
    }
    
    protected boolean isCurrentDBDef(DBDef currentDBDef) {
	    return ResourceContext.isCurrentDBDef(currentDBDef);
    }

    protected void handleBatchUpdateResultWithOptimisticLockByUpdateCount(List<?> list, int updateCount) {
        if (list.isEmpty()) {
            return;// for Safety!
        }
        if (updateCount < 0) {
            return;// for Safety!
        }
        final int entityCount = list.size();
        if (updateCount < entityCount) {
            if (isOptimisticLockHandling()) {
                throw new BatchEntityAlreadyUpdatedException(list.get(0), 0, updateCount);
            } else {
                String msg = "The entity have already deleted:";
                msg = msg + " updateCount=" + updateCount;
                msg = msg + " entityCount=" + entityCount;
                msg = msg + " allEntities=" + list;
                throw new EntityAlreadyDeletedException(msg);
            }
        }
    }

    protected void handleBatchUpdateResultWithOptimisticLockByResult(List<?> list, int[] result) {
        if (list.isEmpty()) {
            return;// for Safety!
        }
        final int[] updatedCountArray = result;
        final int entityCount = list.size();
        int index = 0;
        boolean alreadyUpdated = false;
        for (int oneUpdateCount : updatedCountArray) {
            if (entityCount <= index) {
                break;// for Safety!
            }
            if (oneUpdateCount == 0) {
                alreadyUpdated = true;
                break;
            } else if (oneUpdateCount > 1) {
                String msg = "The entity updated two or more records in batch update:";
                msg = msg + " entity=" + list.get(index);
                msg = msg + " updatedCount=" + oneUpdateCount;
                msg = msg + " allEntities=" + list;
                throw new EntityDuplicatedException(msg);
            }
            ++index;
        }
        if (alreadyUpdated) {
            int updateCount = 0;
            for (int oneUpdateCount : updatedCountArray) {
                updateCount = updateCount + oneUpdateCount;
            }
            if (isOptimisticLockHandling()) {
                throw new BatchEntityAlreadyUpdatedException(list.get(index), 0, updateCount);
            } else {
                String msg = "The entity have already deleted:";
                msg = msg + " entity=" + list.get(index);
                msg = msg + " updateCount=" + updateCount;
                msg = msg + " allEntities=" + list;
                throw new EntityAlreadyDeletedException(msg);
            }
        }
    }

    // ===================================================================================
    //                                                                      JDBC Delegator
    //                                                                      ==============
    protected int[] executeBatch(PreparedStatement ps, List<?> list) {
        try {
            return ps.executeBatch();
        } catch (SQLException e) {
            handleSQLException(e, ps, true);
            return null; // Unreachable!
        }
    }
	
    protected void addBatch(PreparedStatement ps) {
        try {
            ps.addBatch();
        } catch (SQLException e) {
            handleSQLException(e, ps);
        }
    }
}
