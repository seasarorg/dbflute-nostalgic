/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean;

public interface LdScalarQuery<CB extends LdConditionBean> {
    public void query(CB cb);
}
