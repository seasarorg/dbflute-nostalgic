package com.example.dbflute.teeda.dbflute.allcommon.bhv.core;

import javax.sql.DataSource;

import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.dao.BeanMetaDataFactory;
import org.seasar.dao.ValueTypeFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface BehaviorCommandComponentSetup {

    public void setDataSource(DataSource dataSource);
    public void setStatementFactory(StatementFactory statementFactory);
    public void setBeanMetaDataFactory(BeanMetaDataFactory beanMetaDataFactory);
    public void setValueTypeFactory(ValueTypeFactory valueTypeFactory);
    public void setSqlFileEncoding(String sqlFileEncoding);
}
