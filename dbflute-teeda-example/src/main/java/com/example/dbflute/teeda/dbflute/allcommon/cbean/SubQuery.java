package com.example.dbflute.teeda.dbflute.allcommon.cbean;

public interface SubQuery<SUB_CB extends ConditionBean> {
    public void query(SUB_CB subCB);
}
