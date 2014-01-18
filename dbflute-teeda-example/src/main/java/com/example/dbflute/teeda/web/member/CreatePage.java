package com.example.dbflute.teeda.web.member;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.teeda.extension.annotation.validator.Required;

import com.example.dbflute.teeda.dbflute.allcommon.BehaviorSelector;
import com.example.dbflute.teeda.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.teeda.dbflute.exbhv.MemberBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.teeda.dbflute.exentity.Member;
import com.example.dbflute.teeda.dbflute.exentity.MemberStatus;

/**
 * The page of member create.
 * @author quiethic
 * @since 1.0 (2008/06/01 Sunday)
 */
public class CreatePage {
    
    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                       Insert Property
    //                                       ---------------
    @Required
    public String memberName;
    
    public Date birthdate;
    
    @Required
    public String memberStatus;

    @Required
    public String memberAccount;

    // -----------------------------------------------------
    //                                                 Items
    //                                                 -----
    public Map<String, String> memberStatusItems;
    
    // -----------------------------------------------------
    //                                              Behavior
    //                                              --------
    @Binding(bindingType=BindingType.MUST)
    public BehaviorSelector selector;

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * ページの初期化処理を行います。
     * @return 処理終了後の遷移先ページのclass. (Nullable)
     */
    public Class initialize() {
        setupMemberStatusItems();
        return null;
    }

    /**
     * 会員情報の更新処理を行います。
     * @return 更新処理終了後の遷移先ページのclass. (Nullable)
     */
    public Class doOnceCreate() {
        Member member = new Member();        
        member.setMemberName(memberName);
        member.setBirthdate(birthdate);
        member.setMemberStatusCode(memberStatus);
        member.setMemberAccount(memberAccount);
        if(member.isMemberStatusCodeFormalized()) {
            member.setFormalizedDatetime(new Timestamp(Calendar.getInstance().getTimeInMillis()));
        }
        selector.select(MemberBhv.class).insert(member);
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
    protected void setupMemberStatusItems(){
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
}
