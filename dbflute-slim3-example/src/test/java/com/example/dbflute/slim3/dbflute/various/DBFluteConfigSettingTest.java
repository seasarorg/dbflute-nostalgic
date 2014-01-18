package com.example.dbflute.slim3.dbflute.various;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.jdbc.StatementConfig;

import com.example.dbflute.slim3.dbflute.allcommon.DBFluteConfig;
import com.example.dbflute.slim3.dbflute.cbean.MemberCB;
import com.example.dbflute.slim3.dbflute.exbhv.MemberBhv;
import com.example.dbflute.slim3.dbflute.exentity.Member;
import com.example.dbflute.slim3.unit.ContainerTestCase;

/**
 * @author jflute
 * @since 0.6.2 (2008/01/26 Saturday)
 */
public class DBFluteConfigSettingTest extends ContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MemberBhv memberBhv;

    // ===================================================================================
    //                                                                              Set up
    //                                                                              ======
    /**
     * DBFluteConfigの設定をする実装。
     * <p>
     * 必ずContainerの初期化前に設定をすること。
     * </p>
     * <p>
     * デフォルトでロックが掛かっているので、そのロックを外してから設定する。
     * Containerの初期化時に自動的に再度ロックが掛かるようになっている。
     * </p>
     * 設定できる項目は以下の通り：
     * </p>
     * <ul>
     *     <li>StatementConfig</li>
     *     <li>InternalDebug</li>
     * </ul>
     * <p>
     * StatementConfigは以下の通り：
     * </p>
     * <ul>
     *     <li>ResultSetType</li>
     *     <li>QueryTimeout</li>
     *     <li>FetchSize</li>
     *     <li>MaxRows</li>
     * </ul>
     * <p>
     * InternalDebugは「DBFluteの内部的なデバッグログ出力を有効にするか否か」を示すが、
     * よほどのことがない限り開発中でもtrueにする必要はない。
     * </p>
     * @throws Throwable
     */
    @Override
    public void setUp() {
        // ロックを外す
        DBFluteConfig.getInstance().unlock();

        // StatementConfig(お試しとしてここでは色々設定)
        final StatementConfig config = new StatementConfig();
        config.typeForwardOnly().queryTimeout(10).fetchSize(7).maxRows(3);
        DBFluteConfig.getInstance().setDefaultStatementConfig(config);

        // InternalDebug(テストということでここではtrue)
        DBFluteConfig.getInstance().setInternalDebug(true);

        // 本来ならContainerの初期化が始まれば、自動的にロックが掛かるはずであるが、
        // dbflute-spring-exampleはContainerをテストごとに初期化をしないため、
        // ここでは明示的にロックするようにしている。
        // (これは単なるテストの仕組み上の都合である)
        DBFluteConfig.getInstance().lock();
        super.setUp();
    }

    /**
     * JUnit上だけの話ではあるが、最後にクリアすること。
     * でないと、一括実行時に他のテストに影響してしまうため。
     */
    @Override
    public void tearDown() {
        super.tearDown();
        DBFluteConfig.getInstance().clear();
    }

    // ===================================================================================
    //                                                                          Basic Test
    //                                                                          ==========
    public void test_defaultStatementConfig() throws Exception {
        // ## Arrange & Act & Assert ##
        assertNotNull(DBFluteConfig.getInstance().getDefaultStatementConfig());
    }

    public void test_setInternalDebug_Locked() throws Exception {
        // ## Arrange & Act & Assert ##
        assertTrue(DBFluteConfig.getInstance().isInternalDebug());
    }

    // ===================================================================================
    //                                                                  Configure Relation
    //                                                                  ==================
    public void test_ConditionBean_configure_Config_is_Request_Tx() throws Exception {
        // ## Arrange ##
        final MemberCB cb = new MemberCB();
        final StatementConfig statementConfig = new StatementConfig();
        statementConfig.typeScrollSensitive().fetchSize(123).maxRows(1);
        cb.configure(statementConfig);

        // ## Act ##
        final ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertEquals(1, memberList.size());
    }

    // Containerの再利用のため、テストの実行順序によって落ちてしまうためコメントアウト
    //    public void test_ConditionBean_no_configure_Config_is_Default_Tx() throws Exception {
    //        // ## Arrange ##
    //        final MemberCB cb = new MemberCB();
    //
    //        // ## Act ##
    //        final ListResultBean<Member> memberList = memberBhv.selectList(cb);
    //
    //        // ## Assert ##
    //        assertEquals(3, memberList.size());
    //    }

    public void test_StatementConfig_check_insert_update_delete_Tx() throws Exception {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("testName");
        member.setMemberAccount("testAccount");
        member.classifyMemberStatusCodeFormalized(); // 正式会員

        // ## Act & Assert ##
        // Expect no exception!
        memberBhv.insert(member);
        memberBhv.updateNonstrict(member);
        memberBhv.deleteNonstrict(member);
    }

    // ===================================================================================
    //                                                                          Log Format
    //                                                                          ==========
    public void test_LogDateFormat_Tx() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setBirthdate_GreaterEqual(new Date(cal.getTimeInMillis()));
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setLogDateFormat("yyyy/MM/dd HH$mm$ss.SSS");
        try {
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains("2008/06/15 12$34$56.123"));
        } finally {
            DBFluteConfig.getInstance().setLogDateFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_LogTimestampFormat_Tx() {
        // ## Arrange ##
        Calendar cal = Calendar.getInstance();
        cal.set(2008, 5, 15, 12, 34, 56);
        cal.set(Calendar.MILLISECOND, 123);
        MemberCB cb = new MemberCB();
        cb.query().setRegisterDatetime_GreaterEqual(new Timestamp(cal.getTimeInMillis()));
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setLogTimestampFormat("yyyy/MM/dd HH-mm-ss.SSS");
        try {
            // ## Act & Assert ##
            String sql = cb.toDisplaySql();
            log(sql);
            assertTrue(sql.contains("2008/06/15 12-34-56.123"));
        } finally {
            DBFluteConfig.getInstance().setLogTimestampFormat(null);
            DBFluteConfig.getInstance().lock();
        }
    }
}
