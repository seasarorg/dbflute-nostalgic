package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.various;

import javax.sql.DataSource;

import org.seasar.dao.Dbms;
import org.seasar.extension.jdbc.PropertyType;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalIdentifierIdentityGenerator extends InternalIdentifierAbstractGenerator {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalIdentifierIdentityGenerator(PropertyType propertyType, Dbms dbms) {
        super(propertyType, dbms);
    }

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    public void setIdentifier(Object bean, DataSource ds) {
        Object value = executeSql(ds, getDbms().getIdentitySelectString(), null);
        reflectIdentifier(bean, value);
    }
	
    public boolean isSelfGenerate() {
        return false;
    }
}
