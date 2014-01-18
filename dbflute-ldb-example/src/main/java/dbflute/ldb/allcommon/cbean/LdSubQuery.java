/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

public interface LdSubQuery<SUB_CB extends LdConditionBean> {
    public void query(SUB_CB subCB);
}
