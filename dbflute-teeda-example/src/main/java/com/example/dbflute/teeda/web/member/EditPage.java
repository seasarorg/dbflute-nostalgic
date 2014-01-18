package com.example.dbflute.teeda.web.member;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.validator.Required;

import com.example.dbflute.teeda.dbflute.allcommon.BehaviorSelector;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.SubQuery;
import com.example.dbflute.teeda.dbflute.allcommon.exception.EntityAlreadyDeletedException;
import com.example.dbflute.teeda.dbflute.cbean.MemberCB;
import com.example.dbflute.teeda.dbflute.cbean.MemberLoginCB;
import com.example.dbflute.teeda.dbflute.cbean.MemberSecurityCB;
import com.example.dbflute.teeda.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.teeda.dbflute.cbean.MemberWithdrawalCB;
import com.example.dbflute.teeda.dbflute.cbean.PurchaseCB;
import com.example.dbflute.teeda.dbflute.exbhv.MemberBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberLoginBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberSecurityBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberWithdrawalBhv;
import com.example.dbflute.teeda.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.teeda.dbflute.exentity.Member;
import com.example.dbflute.teeda.dbflute.exentity.MemberStatus;

/**
 * The page of member edit.
 * @author quiethic
 * @since 1.0 (2008/06/01 Sunday)
 */
public class EditPage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                           ID Property
    //                                           -----------
    public Integer memberId;

    // -----------------------------------------------------
    //                                       Update Property
    //                                       ---------------
    @Required
    public String memberName;

    @DateTimeConverter(pattern = "yyyy/MM/dd")
    public Date birthdate;

    @Required
    public String memberStatus;

    @Required
    public String memberAccount;

    // -----------------------------------------------------
    //                                      Display Property
    //                                      ----------------
    protected Member member;

    // -----------------------------------------------------
    //                                                 Items
    //                                                 -----
    public Map<String, String> memberStatusItems;

    // -----------------------------------------------------
    //                                              Behavior
    //                                              --------
    @Binding(bindingType = BindingType.MUST)
    public BehaviorSelector selector;

    /*
     *  DIするBehaviorの数が多い場合は、上記のようにBehaviorSelectorを
     *  DIしてselector.select(MemberBhv.class)とすると便利。
     *  
        @Binding(bindingType = BindingType.MUST)
        protected MemberBhv memberBhv;

        @Binding(bindingType = BindingType.MUST)
        protected MemberStatusBhv memberStatusBhv;
    */

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * ページの初期化処理を行います。
     * @return 処理終了後の遷移先ページのclass(Nullable)
     */
    public Class initialize() {
        if (memberId == null) {
            return SearchPage.class;
        }
        setupMemberStatusItems();
        if (!initializeMember() || !canUpdate()) {
            return SearchPage.class;
        }
        return null;
    }

    /**
     * 会員情報の更新処理を行います。
     * @return 更新処理終了後の遷移先ページのclass. (Nullable)
     */
    public Class doUpdate() {
        member = new Member();
        member.setMemberId(memberId);
        member.setMemberName(memberName);
        member.setBirthdate(birthdate);
        member.setMemberStatusCode(memberStatus);
        member.setMemberAccount(memberAccount);
        if (member.isMemberStatusCodeFormalized()) {
            member.setFormalizedDatetime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        } else {
            member.setFormalizedDatetime(null);
        }
        selector.select(MemberBhv.class).updateNonstrict(member); // TODO: [未実装] 排他制御
        return EditPage.class;
    }

    /**
     * 会員情報の削除処理を行います。
     * @return 削除処理終了後の遷移先のページのclass. (Nullable)
     */
    public Class doDelete() {
        deleteMemberChildren(memberId);
        Member deletedMember = new Member();
        deletedMember.setMemberId(memberId);
        selector.select(MemberBhv.class).deleteNonstrict(deletedMember); // TODO: [未実装] 排他制御
        return SearchPage.class;
    }

    /**
     * レンダリング前の処理を行います。
     * @return レンダリング前処理終了後の遷移先ページのclass. (Nullable)
     */
    public Class prerender() {
        return null;
    }

    // -----------------------------------------------------
    //                                                 Logic
    //                                                 -----
    /**
     * 会員ステータスコンボボックスを設定します。<br />
     * このメソッドはCreateページと重複したメソッドになりますが、サンプルのため
     * 基底クラスや共通ヘルパー等には抽出していません。
     */
    protected void setupMemberStatusItems() {
        final MemberStatusCB cb = new MemberStatusCB(); // 取得カラムを明示的に指定(限定)
        cb.specify().columnMemberStatusCode();
        cb.specify().columnMemberStatusName();
        cb.query().addOrderBy_DisplayOrder_Asc();
        final List<MemberStatus> memberStatusList = selector.select(MemberStatusBhv.class).selectList(cb);
        memberStatusItems = new LinkedHashMap<String, String>();
        for (MemberStatus status : memberStatusList) {
            memberStatusItems.put(status.getMemberStatusName(), status.getMemberStatusCode());
        }
    }

    /**
     * 会員情報を初期化します。
     * @return 初期化が成功した場合はtrue。それ以外はfalse。
     */
    protected boolean initializeMember() {
        try {
            member = selectMember(memberId);
        } catch (EntityAlreadyDeletedException e) {
            return false;
        }
        setupMemberToPage(member);
        return true;
    }

    /**
     * 会員情報が更新可能であるかを取得します。
     * @return 更新可能である場合はtrue。
     */
    protected boolean canUpdate() {
        return member != null && !member.isMemberStatusCodeWithdrawal();
    }

    /**
     * 会員IDを指定して会員情報を取得します。
     * @param memberId 会員ID. (NotNull: If it's null, throws the exception)
     * @return 会員情報. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted.
     */
    protected Member selectMember(Integer memberId) {
        if (memberId == null) {
            String msg = "The argument[memberId] should not be null!";
            throw new IllegalArgumentException(msg);
        }

        final MemberCB cb = new MemberCB();
        cb.query().setMemberId_Equal(memberId);

        // SpecifyDerivedRefererの機能により最終ログイン日時（会員テーブルの
        // 子テーブルの会員ログインテーブルよりログイン日時の最大値）を取得する。
        // 取得結果のMember(exentity)にプロパティを追加する必要があります。
        // Member#setLatestLoginDatetime/Member#getLatestLoginDatetime
        cb.specify().derivedMemberLoginList().max(new SubQuery<MemberLoginCB>() {
            public void query(MemberLoginCB subCB) {
                subCB.specify().columnLoginDatetime();
            }
        }, "latestLoginDatetime");

        return selector.select(MemberBhv.class).selectEntityWithDeletedCheck(cb);
    }

    /**
     * 会員情報をページに設定します。
     * @param targetMember 対象会員情報. (NotNull)
     */
    protected void setupMemberToPage(Member targetMember) {
        if (memberId == null) {
            String msg = "The argument[targetMember] should not be null!";
            throw new IllegalArgumentException(msg);
        }

        this.memberName = targetMember.getMemberName();
        this.birthdate = targetMember.getBirthdate();
        this.memberStatus = targetMember.getMemberStatusCode();
        this.memberAccount = targetMember.getMemberAccount();
    }

    /**
     * 会員情報の子テーブルの削除処理を行います。
     * ※通常、会員情報及びその子テーブルを削除することは少ないと思いますが、
     *   ここでは削除処理を実装するサンプルを簡単に表すため、削除処理を実装しています。
     * @param memberId 会員ID. (NotNull)
     */
    protected void deleteMemberChildren(Integer memberId) {
        if (memberId == null) {
            String msg = "The argument[memberId] should not be null!";
            throw new IllegalArgumentException(msg);
        }

        //購入情報の削除
        PurchaseBhv purchaseBhv = selector.select(PurchaseBhv.class);
        PurchaseCB purchaseCB = new PurchaseCB();
        purchaseCB.query().setMemberId_Equal(memberId);
        purchaseBhv.queryDelete(purchaseCB);

        //会員ログイン情報の削除
        MemberLoginBhv memberLoginBhv = selector.select(MemberLoginBhv.class);
        MemberLoginCB memberLoginCB = new MemberLoginCB();
        memberLoginCB.query().setMemberId_Equal(memberId);
        memberLoginBhv.queryDelete(memberLoginCB);

        //会員セキュリティ情報の削除
        MemberSecurityBhv memberSecurityBhv = selector.select(MemberSecurityBhv.class);
        MemberSecurityCB memberSecurityCB = new MemberSecurityCB();
        memberSecurityCB.query().setMemberId_Equal(memberId);
        memberSecurityBhv.queryDelete(memberSecurityCB);

        //会員退会情報の削除
        MemberWithdrawalBhv memberWithDrawalBhv = selector.select(MemberWithdrawalBhv.class);
        MemberWithdrawalCB memberWithdrawalCB = new MemberWithdrawalCB();
        memberWithdrawalCB.query().setMemberId_Equal(memberId);
        memberWithDrawalBhv.queryDelete(memberWithdrawalCB);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    @DateTimeConverter(pattern = "yyyy/MM/dd")
    public Timestamp getFormalizedDate() {
        return member != null ? member.getFormalizedDatetime() : null;
    }

    @DateTimeConverter(pattern = "yyyy/MM/dd hh:mm:ss")
    public Timestamp getMemberLatestLoginDatetime() {
        return member != null ? member.getLatestLoginDatetime() : null;
    }

    @DateTimeConverter(pattern = "yyyy/MM/dd hh:mm:ss")
    public Timestamp getMemberUpdateDatetime() {
        return member != null ? member.getUpdateDatetime() : null;
    }
}
