package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand;


import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class InternalAbstractBatchAutoStaticCommand extends InternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalAbstractBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, versionNoAutoIncrementOnMemory);
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public Object execute(Object[] args) {
        final InternalAbstractBatchAutoHandler handler = createBatchAutoHandler();
        handler.setOptimisticLockHandling(optimisticLockHandling);
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
		handler.setSql(getSql());
		// The logging message SQL of procedure is unnecessary.
        // handler.setLoggingMessageSqlArgs(args);
        return handler.executeBatch(args);
    }

    protected abstract InternalAbstractBatchAutoHandler createBatchAutoHandler();
}
