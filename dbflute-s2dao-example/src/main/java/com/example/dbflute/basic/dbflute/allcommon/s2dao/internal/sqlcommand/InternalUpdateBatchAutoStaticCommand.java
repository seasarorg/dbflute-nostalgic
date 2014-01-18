package com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractBatchAutoHandler;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalUpdateBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalUpdateBatchAutoStaticCommand extends InternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalUpdateBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling, boolean versionNoAutoIncrementOnMemory) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, versionNoAutoIncrementOnMemory);
    }

	// ===================================================================================
    //                                                                            Override
    //                                                                            ========
	@Override
    protected InternalAbstractAutoHandler createAutoHandler() {
        return createBatchAutoHandler();
    }

	@Override
    protected InternalAbstractBatchAutoHandler createBatchAutoHandler() {
        InternalUpdateBatchAutoHandler handler = newInternalBatchAutoHandler();
        handler.setVersionNoAutoIncrementOnMemory(versionNoAutoIncrementOnMemory);
        return handler;
    }

    protected InternalUpdateBatchAutoHandler newInternalBatchAutoHandler() {
        return new InternalUpdateBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
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
