/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaData;

import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalAbstractAutoHandler;
import dbflute.ldb.allcommon.s2dao.internal.sqlhandler.LdInternalDeleteAutoHandler;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalDeleteAutoStaticCommand extends LdInternalAbstractAutoStaticCommand {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalDeleteAutoStaticCommand(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            String[] propertyNames, boolean optimisticLockHandling) {
        super(dataSource, statementFactory, beanMetaData, propertyNames, optimisticLockHandling, false);
    }

	// ===================================================================================
    //                                                                            Override
    //                                                                            ========
    @Override
    protected LdInternalAbstractAutoHandler createAutoHandler() {
        return new LdInternalDeleteAutoHandler(getDataSource(), getStatementFactory(), getBeanMetaData(), getPropertyTypes());
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
