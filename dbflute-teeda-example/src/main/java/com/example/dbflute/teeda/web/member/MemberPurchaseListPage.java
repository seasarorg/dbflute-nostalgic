package com.example.dbflute.teeda.web.member;

import java.sql.Timestamp;
import java.util.List;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;
import org.seasar.teeda.extension.annotation.convert.NumberConverter;

import com.example.dbflute.teeda.dbflute.allcommon.BehaviorSelector;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingResultBean;
import com.example.dbflute.teeda.dbflute.cbean.MemberCB;
import com.example.dbflute.teeda.dbflute.cbean.PurchaseCB;
import com.example.dbflute.teeda.dbflute.exbhv.MemberBhv;
import com.example.dbflute.teeda.dbflute.exbhv.PurchaseBhv;
import com.example.dbflute.teeda.dbflute.exentity.Member;
import com.example.dbflute.teeda.dbflute.exentity.Purchase;
import com.example.dbflute.teeda.web.include.PagingnaviPage;

/**
 * The page of member purchase list.
 * @author quiethic
 * @since 1.0 (2007/06/22 Sunday)
 */
public class MemberPurchaseListPage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public Integer memberId;
    public String memberName;
    
    // -----------------------------------------------------
    //                                                 Items
    //                                                 -----
    public int purchaseListIndex;
    public List<Purchase> purchaseListItems;
    
    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    @Binding(bindingType = BindingType.MUST)
    public PagingnaviPage pagingnaviPage;

    public int targetPage;

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
     * @return 画面遷移を行わないためnullを返却します。
     */
    public Class initialize() {
        if(memberId == null) {
            return SearchPage.class;
        }
        return null;
    }

    /**
     * 削除処理を行います。
     * @return 画面遷移を行わないので、nullを返却します。
     */
    public Class doDelete() {
        Purchase deletePurchase = new Purchase();
        deletePurchase.setPurchaseId(current().getPurchaseId());
        selector.select(PurchaseBhv.class).deleteNonstrict(deletePurchase); // TODO: [未実装] 排他制御
        return MemberPurchaseListPage.class;
    }

    /**
     * ページレンダリング前の処理を行います。
     * @return 画面遷移を行わないためnullを返却します。
     */
    public Class prerender() {
        setupMemberInformation(); // 会員情報の設定
        searchMemberPurchaseList(); // 会員購入履歴の検索
        return null;
    }
    
    // -----------------------------------------------------
    //                                                 Logic
    //                                                 -----
    /**
     * 会員情報を設定します。
     */
    protected void setupMemberInformation() {
        MemberCB cb = new MemberCB(); // 取得カラムを明示的に指定(限定)
        cb.specify().columnMemberName();
        cb.query().setMemberId_Equal(memberId);
        Member member = selector.select(MemberBhv.class).selectEntity(cb);
        if(member != null) {
            memberName = member.getMemberName();
        }
    }

    /**
     * 会員購入リストを検索します。
     */
    protected void searchMemberPurchaseList() {
        PagingResultBean<Purchase> purchasePage = selectPurchasePage(memberId); 
        this.purchaseListItems = purchasePage;
        pagingnaviPage.pagingResultBean = purchasePage;
        pagingnaviPage.targetPageGetParamKeyName = "memberId=" + memberId.toString() + "&amp;" + "targetPage";
    }

    /**
     * ページング制御された会員購入リストを取得し、取得結果を返却します。
     * @param memberId 会員ID. (Nullable: If it's null, returns empty paging-result-bean.)
     * @return 会員購入リスト. (NotNull)
     */
    public PagingResultBean<Purchase> selectPurchasePage(Integer memberId){
        if(memberId == null) {
            return new PagingResultBean<Purchase>();
        }
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Product();                       // Productを取得対象に
        cb.query().setMemberId_Equal(memberId);         // 会員IDが一致する
        cb.query().addOrderBy_PurchaseDatetime_Desc();  // 購入日時の降順でソート
        int pageSize = 4;                               // 本当はConfigなどから取得するのが好ましい
        cb.paging(pageSize, targetPage);                // ページング設定処理
        return selector.select(PurchaseBhv.class).selectPage(cb);
    }
    
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                               ForEach
    //                                               -------
    protected Purchase current(){
        if (purchaseListItems == null || purchaseListItems.isEmpty()) {
            String msg = "The purchaseListItems had no item so DON'T invoke this method: purchaseListItems=" + purchaseListItems;
            throw new IllegalStateException(msg);
        }
        return purchaseListItems.get(purchaseListIndex);
    }
    
    // - - - - - - - - - - - -
    //                 Element
    //                 - - - -
    public String getRowStyle() {
        // 背景色を、偶数行の時は白、それ以外はグレーにする
        if (purchaseListIndex % 2 == 0) {
            return "background-color: #FFFFFF;";
        }
        return "background-color: #EEEEEE;";
    }

    @DateTimeConverter(pattern = "yyyy/MM/dd HH:mm:ss")
    public Timestamp getPurchaseDatetime() {
        return current().getPurchaseDatetime();
    }

    public String getProductName() {
        return current().getProduct().getProductName();
    }

    @NumberConverter(pattern="#,##0")
    public Integer getPurchasePrice() {
        return current().getPurchasePrice();
    }

    @NumberConverter(pattern="#,##0")
    public Integer getPurchaseCount() {
        return current().getPurchaseCount();
    }

    public boolean isPaymentComplete() {
        return current().isPaymentCompleteFlgTrue();
    }

    public boolean isNotPaymentComplete() {
        return current().isPaymentCompleteFlgFalse();
    }
}
