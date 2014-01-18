/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

public interface LdUnionQuery<UNION_CB extends LdConditionBean> {
    public void query(UNION_CB unionCB);
}
