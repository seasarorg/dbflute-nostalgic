/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractBatchAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalInsertBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalInsertBatchAutoStaticCommand extends LdInternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalInsertBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, false, false);
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
        return new LdInternalInsertBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
    }

	@Override
    protected void setupSql() {
        setupInsertSql();
    }

	@Override
    protected void setupPropertyTypes(String[] propertyNames) {
        setupInsertPropertyTypes(propertyNames);
    }
}
