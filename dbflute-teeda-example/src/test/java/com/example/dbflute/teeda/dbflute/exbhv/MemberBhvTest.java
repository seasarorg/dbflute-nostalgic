package com.example.dbflute.teeda.dbflute.exbhv;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.extension.unit.S2TestCase;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ListResultBean;
import com.example.dbflute.teeda.dbflute.cbean.MemberCB;
import com.example.dbflute.teeda.dbflute.exentity.Member;

/**
 * @author jflute
 * @since 0.5.7 (2007/11/03 Monday)
 */
public class MemberBhvTest extends S2TestCase {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    private static final Log _log = LogFactory.getLog(MemberBhvTest.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              Set up
    //                                                                              ======
    @Override
    protected void setUp() {
        include("dbflute.dicon");
    }

    // ===================================================================================
    //                                                                                Test
    //                                                                                ====
    public void test_selectList_DbAccessOK() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertFalse(memberList.isEmpty());
        for (Member member : memberList) {
            _log.debug(member);
        }
    }
}
