package com.example.dbflute.teeda.dbflute.allcommon.cbean;

public interface ScalarQuery<CB extends ConditionBean> {
    public void query(CB cb);
}
