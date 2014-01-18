package com.example.dbflute.buri.fixedburi.engine;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AppUserDto implements java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Integer _userId;

    protected String _userName;

    private List<String> _roles;

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public Integer getUserId() {
        return _userId;
    }

    public void setUserId(Integer userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public List<String> getRoles() {
        return _roles;
    }

    public void setRoles(List<String> roles) {
        this._roles = roles;
    }

    public void addRoles(String role) {
        if (_roles == null) {
            _roles = new ArrayList<String>();
        }
        _roles.add(role);
    }
}
