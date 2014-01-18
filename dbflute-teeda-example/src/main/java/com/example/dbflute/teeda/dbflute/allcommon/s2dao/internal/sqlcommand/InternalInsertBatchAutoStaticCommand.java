package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractBatchAutoHandler;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalInsertBatchAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalInsertBatchAutoStaticCommand extends InternalAbstractBatchAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalInsertBatchAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, false, false);
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
        return new InternalInsertBatchAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
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
