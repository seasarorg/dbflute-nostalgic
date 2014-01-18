package com.example.dbflute.basic.dbflute.allcommon.s2dao.internal.various;

import javax.sql.DataSource;

import org.seasar.dao.Dbms;
import org.seasar.extension.jdbc.PropertyType;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalIdentifierAssignedGenerator extends InternalIdentifierAbstractGenerator {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalIdentifierAssignedGenerator(PropertyType propertyType, Dbms dbms) {
        super(propertyType, dbms);
    }

    // ===================================================================================
    //                                                                      Implementation
    //                                                                      ==============
    public void setIdentifier(Object bean, DataSource ds) {
    }

    public boolean isSelfGenerate() {
        return true;
    }
}
