/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlhandler;

import javax.sql.DataSource;

import org.seasar.dao.BeanMetaData;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalUpdateAutoHandler extends LdInternalAbstractAutoHandler {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalUpdateAutoHandler(DataSource dataSource,
            StatementFactory statementFactory, BeanMetaData beanMetaData,
            PropertyType[] propertyTypes) {
        super(dataSource, statementFactory, beanMetaData, propertyTypes);
    }

    // ===================================================================================
    //                                                                            Override
    //                                                                            ========
	@Override
    protected void setupBindVariables(Object bean) {
        setupUpdateBindVariables(bean);
        setLoggingMessageSqlArgs(bindVariables);
    }

	@Override
    protected void postUpdateBean(Object bean, int ret) {
        updateVersionNoIfNeed(bean);
        updateTimestampIfNeed(bean);
    }
}
