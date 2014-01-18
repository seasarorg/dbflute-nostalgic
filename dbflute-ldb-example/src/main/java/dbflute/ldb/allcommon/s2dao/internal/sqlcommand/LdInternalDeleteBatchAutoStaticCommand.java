/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractBatchAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalDeleteBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalDeleteBatchAutoStaticCommand extends LdInternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalDeleteBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData, String[] propertyNames, boolean optimisticLockHandling) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, false);
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
        return newInternalBatchAutoHandler();
    }

    protected LdInternalDeleteBatchAutoHandler newInternalBatchAutoHandler() {
        return new LdInternalDeleteBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
    }

	@Override
    protected void setupSql() {
        setupDeleteSql();
    }

	@Override
    protected void setupPropertyTypes(String[] propertyNames) {
        setupDeletePropertyTypes(propertyNames);
    }
}
