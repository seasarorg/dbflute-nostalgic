/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;


import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdInternalAbstractBatchAutoStaticCommand extends LdInternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalAbstractBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, versionNoAutoIncrementOnMemory);
    }

	// ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @Override
    public Object execute(Object[] args) {
        final LdInternalAbstractBatchAutoHandler handler = createBatchAutoHandler();
        handler.setOptimisticLockHandling(optimisticLockHandling);
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
		handler.setSql(getSql());
		// The logging message SQL of procedure is unnecessary.
        // handler.setLoggingMessageSqlArgs(args);
        return handler.executeBatch(args);
    }

    protected abstract LdInternalAbstractBatchAutoHandler createBatchAutoHandler();
}
