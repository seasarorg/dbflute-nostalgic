/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractBatchAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalUpdateBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalUpdateBatchAutoStaticCommand extends LdInternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalUpdateBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, versionNoAutoIncrementOnMemory);
    }

	// ===================================================================================
    //                                                                            Override
    //                                                                            ========
	@Override
    protected LdInternalAbstractAutoHandler createAutoHandler() {
        return createBatchAutoHandler();
    }

	@Override
    protected LdInternalAbstractBatchAutoHandler createBatchAutoHandler() {
        LdInternalUpdateBatchAutoHandler handler = newInternalBatchAutoHandler();
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
        return handler;
    }

    protected LdInternalUpdateBatchAutoHandler newInternalBatchAutoHandler() {
        return new LdInternalUpdateBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
    }

	@Override
    protected void setupSql() {
        setupUpdateSql();
    }

	@Override
    protected void setupPropertyTypes(String[] propertyNames) {
        setupUpdatePropertyTypes(propertyNames);
    }
}
