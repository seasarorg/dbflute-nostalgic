package com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractBatchAutoHandler;
import com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.sqlhandler.InternalDeleteBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalDeleteBatchAutoStaticCommand extends InternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalDeleteBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData, String[] propertyNames, boolean optimisticLockHandling) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, false);
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
        return newInternalBatchAutoHandler();
    }

    protected InternalDeleteBatchAutoHandler newInternalBatchAutoHandler() {
        return new InternalDeleteBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
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
