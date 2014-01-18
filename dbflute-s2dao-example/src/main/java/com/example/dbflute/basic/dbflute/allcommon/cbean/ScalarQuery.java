package com.example.dbflute.basic.dbflute.allcommon.cbean;

public interface ScalarQuery<CB extends ConditionBean> {
    public void query(CB cb);
}
