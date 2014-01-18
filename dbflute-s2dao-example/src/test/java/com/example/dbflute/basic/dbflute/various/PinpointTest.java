package com.example.dbflute.basic.dbflute.various;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.example.dbflute.basic.dbflute.allcommon.bhv.core.BehaviorCommandInvoker;
import com.example.dbflute.basic.dbflute.allcommon.cbean.ListResultBean;
import com.example.dbflute.basic.dbflute.allcommon.cbean.ScalarQuery;
import com.example.dbflute.basic.dbflute.allcommon.cbean.SubQuery;
import com.example.dbflute.basic.dbflute.allcommon.cbean.UnionQuery;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.info.ColumnInfo;
import com.example.dbflute.basic.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.basic.dbflute.cbean.MemberCB;
import com.example.dbflute.basic.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.basic.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.basic.dbflute.exbhv.MemberBhv;
import com.example.dbflute.basic.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.basic.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import com.example.dbflute.basic.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import com.example.dbflute.basic.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import com.example.dbflute.basic.dbflute.exentity.Member;
import com.example.dbflute.basic.dbflute.exentity.MemberStatus;
import com.example.dbflute.basic.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.6.0 (2008/01/16 Wednesday)
 */
public class PinpointTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private MemberStatusBhv memberStatusBhv;
    private BehaviorCommandInvoker behaviorCommandInvoker;

    // ===================================================================================
    //                                                                          ColumnInfo
    //                                                                          ==========
    public void test_columnInfo_columnAlias_Tx() {
        // ## Arrange & Act ##
        ColumnInfo columnInfo = MemberDbm.getInstance().columnMemberName();

        // ## Assert ##
        assertNotNull(columnInfo);
        assertNotNull(columnInfo.getColumnDbName());
        assertNotNull(columnInfo.getPropertyName());
        assertNotNull(columnInfo.getPropertyType());
        assertNull(columnInfo.getColumnAlias()); // because it does not use alias definition.
    }

    // ===================================================================================
    //                                                            (Specify)DerivedReferrer
    //                                                            ========================
    public void test_derivedReferrer_union_of_subQuery_Tx() {
        // ## Arrange ##
        List<Member> expectedList = selectListAllWithLatestLoginDatetime();
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
                subCB.query().setLoginMobileFlg_Equal_True();
                subCB.union(new UnionQuery<MemberLoginCB>() {
                    public void query(MemberLoginCB unionCB) {
                        unionCB.query().setLoginMobileFlg_Equal_False();
                    }
                });
            }
        }, Member.PROP_latestLoginDatetime);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        int index = 0;
        for (Member member : memberList) {
            Member expectedMember = expectedList.get(index);
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + latestLoginDatetime);
            assertEquals(expectedMember.getLatestLoginDatetime(), latestLoginDatetime);
            ++index;
        }
    }

    protected List<Member> selectListAllWithLatestLoginDatetime() {
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, "LATEST_LOGIN_DATETIME");
        cb.query().addOrderBy_MemberId_Asc();
        return memberBhv.selectList(cb);
    }

    public void test_derivedReferrer_other_union_Tx() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, "LATEST_LOGIN_DATETIME");
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Provisional();
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        for (Member member : memberList) {
            Date latestLoginDatetime = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + latestLoginDatetime);
        }
    }

    public void test_derivedReferrer_other_union_specifiedDerivedOrderBy_Tx() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
                subCB.query().setLoginMobileFlg_Equal_True();
                subCB.union(new UnionQuery<MemberLoginCB>() {
                    public void query(MemberLoginCB unionCB) {
                        unionCB.query().setLoginMobileFlg_Equal_False();
                    }
                });
            }
        }, Member.PROP_latestLoginDatetime);
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Withdrawal();
            }
        });
        cb.query().addSpecifiedDerivedOrderBy_Asc(Member.PROP_latestLoginDatetime);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        for (Member member : memberList) {
            log(member.getMemberName() + ", " + member.getLatestLoginDatetime());
        }
    }

    // ===================================================================================
    //                                                                         ScalarQuery
    //                                                                         ===========
    public void test_scalarQuery_max_union_Tx() {
        // ## Arrange ##
        Date expected = memberBhv.scalarSelect(Date.class).max(new ScalarQuery<MemberCB>() {
            public void query(MemberCB cb) {
                cb.specify().columnBirthdate();
            }
        });
        MemberCB cb = new MemberCB();
        cb.query().scalar_Equal().max(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnBirthdate();
                subCB.query().setMemberStatusCode_Equal_Formalized();
                subCB.union(new UnionQuery<MemberCB>() {
                    public void query(MemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Provisional();
                    }
                });
                subCB.union(new UnionQuery<MemberCB>() {
                    public void query(MemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Withdrawal();
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        for (Member member : memberList) {
            Date Birthdate = member.getBirthdate();
            log(member.getMemberName() + ", " + Birthdate);
            assertEquals(expected, Birthdate);
        }
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    public void test_update_NoModified_Tx() {
        // ## Arrange ##
        final MemberStatusCB cb = memberStatusBhv.newMyConditionBean();
        cb.query().setMemberStatusCode_Equal_Formalized();
        final MemberStatus memberStatus = memberStatusBhv.selectEntityWithDeletedCheck(cb);

        // ## Act & Assert ##
        memberStatusBhv.update(memberStatus); // Expect no exception!
    }

    public void test_outsideSql_selectCursor_initialized_Tx() throws Exception {
        // ## Arrange ##
        behaviorCommandInvoker.clearExecutionCache();
        PurchaseSummaryMemberPmb pmb = new PurchaseSummaryMemberPmb();
        pmb.setMemberStatusCode_Formalized();
        PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                }
                return null;
            }
        };

        // ## Act & Assert ##
        memberBhv.outsideSql().cursorHandling().selectCursor(MemberBhv.PATH_selectPurchaseSummaryMember, pmb, handler);
        assertEquals(1, behaviorCommandInvoker.getExecutionCacheSize());
        memberBhv.outsideSql().cursorHandling().selectCursor(MemberBhv.PATH_selectPurchaseSummaryMember, pmb, handler);
        assertEquals(1, behaviorCommandInvoker.getExecutionCacheSize()); // should be reused!
    }
}
