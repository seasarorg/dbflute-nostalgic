package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalAbstractAutoHandler;
import com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.sqlhandler.InternalDeleteAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalDeleteAutoStaticCommand extends InternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalDeleteAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, false);
    }

	// ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected InternalAbstractAutoHandler createAutoHandler() {
        return new InternalDeleteAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
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
