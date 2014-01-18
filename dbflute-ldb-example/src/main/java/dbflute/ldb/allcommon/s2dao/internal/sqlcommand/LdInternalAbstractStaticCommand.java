/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdInternalAbstractStaticCommand extends LdInternalAbstractSqlCommand {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private BeanMetaData beanMetaData;

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalAbstractStaticCommand(DataSource dataSource, StatementFactory statementFactory, BeanMetaData beanMetaData) {
        super(dataSource, statementFactory);
        this.beanMetaData = beanMetaData;
    }

	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public BeanMetaData getBeanMetaData() {
        return beanMetaData;
    }
}
