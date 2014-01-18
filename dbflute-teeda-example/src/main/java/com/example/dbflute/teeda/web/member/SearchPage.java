package com.example.dbflute.teeda.web.member;

import java.sql.Timestamp;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;
import org.seasar.teeda.extension.annotation.convert.DateTimeConverter;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.ListResultBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingResultBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.SubQuery;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.coption.LikeSearchOption;
import com.example.dbflute.teeda.dbflute.cbean.MemberCB;
import com.example.dbflute.teeda.dbflute.cbean.MemberStatusCB;
import com.example.dbflute.teeda.dbflute.cbean.PurchaseCB;
import com.example.dbflute.teeda.dbflute.exbhv.MemberBhv;
import com.example.dbflute.teeda.dbflute.exbhv.MemberStatusBhv;
import com.example.dbflute.teeda.dbflute.exentity.Member;
import com.example.dbflute.teeda.dbflute.exentity.MemberStatus;
import com.example.dbflute.teeda.web.include.PagingnaviPage;

/**
 * The page of member search.
 * @author jflute
 * @author sekima
 * @author quiethic
 * @since 1.0 (2007/06/10 Sunday)
 */
public class SearchPage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                             Condition
    //                                             ---------
    public String condMemberName;

    public String condMemberStatus;

    public String condPurchaseProductName;

    public Map<String, String> condMemberStatusItems;

    public boolean condUnpaid;

    @DateTimeConverter(pattern = "yyyy/MM/dd")
    public Date condFormalizedDateFrom;

    @DateTimeConverter(pattern = "yyyy/MM/dd")
    public Date condFormalizedDateTo;

    // -----------------------------------------------------
    //                                                 Items
    //                                                 -----
    public List<Member> resultItems;

    public int resultIndex;

    // -----------------------------------------------------
    //                                                Paging
    //                                                ------
    @Binding(bindingType = BindingType.MUST)
    public PagingnaviPage pagingnaviPage;

    public int targetPage;

    // -----------------------------------------------------
    //                                              Behavior
    //                                              --------
    @Binding(bindingType = BindingType.MUST)
    protected MemberBhv memberBhv;

    @Binding(bindingType = BindingType.MUST)
    protected MemberStatusBhv memberStatusBhv;

    // -----------------------------------------------------
    //                                              TakeOver
    //                                              --------    
    public static final String goCreate_TAKE_OVER = "type=never";

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * Initialize.
     * <pre>
     * 1. 検索条件の“会員のSelectBox”を構築する。
     * 2. 検索条件の“会員ステータスのSelectBox”を構築する。
     * 3. 本一覧のPaging検索を実行する。(Page番号が指定されているならば)
     * </pre>
     * @return Next page class. (Nullable: If it's null, it comes back to this page.)
     */
    public Class initialize() {
        // 【会員ステータスSelectBox構築】
        // Value = 会員ステータスコード
        // Label = 会員ステータス名
        MemberStatusCB cb = new MemberStatusCB(); // 取得カラムを明示的に指定(限定)
        cb.specify().columnMemberStatusCode();
        cb.specify().columnMemberStatusName();
        cb.query().addOrderBy_DisplayOrder_Asc();
        ListResultBean<MemberStatus> memberStatusList = memberStatusBhv.selectList(cb);
        condMemberStatusItems = new LinkedHashMap<String, String>();
        for (MemberStatus status : memberStatusList) {
            condMemberStatusItems.put(status.getMemberStatusName(), status.getMemberStatusCode());
        }

        // 【本一覧のPaging検索】
        // 検索対象Page番号が指定されている場合は検索する。
        if (targetPage > 0) {
            // 本一覧のPaging検索を実行する。
            // Paging検索結果をPaingResultBeanとして受け取る。
            // 
            // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
            // 特にDBFluteのTIPSというわけではありませんが...
            // 検索処理はMethod化します。それによりJUnitでの自動Testがしやすくなるためです。
            // - - - - - - - - - -/
            PagingResultBean<Member> memberPage = selectPage();

            // Paging検索結果一覧を設定する。
            resultItems = memberPage;

            // PagingNavigation処理をinclude先のPageにて行うため、Paging検索結果をPagingnaviPageに渡す。
            // 
            // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
            // 特にDBFluteのTIPSというわけではありませんが...
            // PagingNavigationの表示処理はTeedaのInclude機能を利用して、そのInclude先のPageにて行います。
            // それにより、
            //   ・PagingNavigation部分のLayoutを再利用できる。(他の検索一覧画面が再利用)
            //   ・PagingNavigation部分の表示処理を再利用できる。(同上)
            //   ・PagingResultBeanの利用を開発者に隠蔽する。(誰か一人が最初に作れば良い)
            //   ・PagingNavigation処理を局所化してBUGの発生を抑える。(自動Testも一箇所で済む)
            // のMeritが得られます。
            // - - - - - - - - - -/
            pagingnaviPage.pagingResultBean = memberPage;

            // Page番号LinkのGet-ParameterのKey値をPagingnaviPageに渡す。
            // 
            // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
            // PagingNavigationで利用するhrefのPage番号のKey文字列は、
            // Pageによって違うかもしれないので明示的にInclude先に渡します。
            // もし、Application全体で統一とかであれば全く不要ですね。
            // - - - - - - - - - -/
            pagingnaviPage.targetPageGetParamKeyName = "targetPage";
        }

        return null;
    }

    /**
     * Do search.
     * @return Next page class. (Nullable: If it's null, it comes back to this page.)
     */
    public Class doSearch() {
        // PostBackイベント内では検索せず、ページ番号を設定するのみ。
        //  自画面へリダイレクトし、initializeで検索・描画を行う。
        targetPage = 1;
        return SearchPage.class;
    }

    /**
     * Pre-render.
     * @return Next page class. (Nullable: If it's null, it comes back to this page.)
     */
    public Class prerender() {
        return null;
    }
    
    // -----------------------------------------------------
    //                                                 Logic
    //                                                 -----
    /**
     * Select page.
     * @return Paging-result-bean. (NotNull)
     */
    protected PagingResultBean<Member> selectPage() {
        MemberCB cb = new MemberCB();

        // 【関連テーブルの取得】
        cb.setupSelect_MemberStatus();
        cb.setupSelect_MemberWithdrawalAsOne().withWithdrawalReason();

        // 【会員名の中間一致】
        cb.query().setMemberName_LikeSearch(condMemberName, new LikeSearchOption().likeContain().escapeByPipeLine());

        // 【購入商品名の中間一致 & 未払いの有無】
        if ((condPurchaseProductName != null && condPurchaseProductName.trim().length() > 0) || condUnpaid) {
            cb.query().existsPurchaseList(new SubQuery<PurchaseCB>() {
                public void query(PurchaseCB subCB) {
                    LikeSearchOption option = new LikeSearchOption().likeContain().escapeByPipeLine();
                    subCB.query().queryProduct().setProductName_LikeSearch(condPurchaseProductName, option);
                    if (condUnpaid) {
                        subCB.query().setPaymentCompleteFlg_Equal_False();
                    }
                }
            });
        }

        // 【会員ステータスの絞込み】
        cb.query().setMemberStatusCode_Equal(condMemberStatus);

        // 【正式会員日時の日付範囲】
        cb.query().setFormalizedDatetime_DateFromTo(condFormalizedDateFrom, condFormalizedDateTo);

        // 【会員の購入履歴の数（子テーブルの集計）】
        // (Specify)DerivedReferrerの機能を用いて、子テーブルである購入情報テーブルを集計
        cb.specify().derivedPurchaseList().count(new SubQuery<PurchaseCB>(){
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseId();
            }
        }, "COUNT_OF_PURCHASE");        

        // 【並び順：更新日時の降順, 会員IDの昇順】
        cb.query().addOrderBy_UpdateDatetime_Desc();
        cb.query().addOrderBy_MemberId_Asc();
        
        // 【Paging条件】
        // Paging条件を設定する。
        // “1PageのSize”は、画面において固定である。
        // “検索対象Page番号”は、Parameterで取得した値を指定する。
        int pageSize = 4;// 本当はConfigなどから取得するのが好ましい
        cb.paging(pageSize, targetPage);

        // 【Paging検索】
        // Pagingの検索を実行する。
        // 
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
        // BehaviorのselectPageを利用することにより、以下の処理が一気に行われます。
        // 
        //   1. Paging条件無しの時の全件Record数の検索 → select count(*) from xxx
        //   2. Paging条件ありでの検索 → select ... from xxx limit 20 offset 40
        //   3. {1}と{2}の結果から総Page数や次Page存在判定などの計算
        // 
        // 検索から結果のHandlingまで全て自動生成されたBehaviorのMethod内にて解決されるため、
        // Application開発者がこの部分でBUGを発生させることはなくなります。
        // (特に{3}の処理は一般にBUGが発生しやすい領域である)
        // - - - - - - - - - -/
        return memberBhv.selectPage(cb);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // -----------------------------------------------------
    //                                               ForEach
    //                                               -------
    protected Member current() {
        if (resultItems == null || resultItems.isEmpty()) {
            String msg = "The resultItems had no item so DON'T invoke this method: resultItems=" + resultItems;
            throw new IllegalStateException(msg);
        }
        return resultItems.get(resultIndex);
    }

    // - - - - - - - - - - - -
    //                 Element
    //                 - - - -
    public String getRowStyle() {
        // 背景色を、偶数行の時は白、それ以外はグレーにする
        if (resultIndex % 2 == 0) {
            return "background-color: #FFFFFF;";
        }
        return "background-color: #EEEEEE;";
    }

    public String getMemberId() {
        return current().getMemberId().toString();
    }

    public String getMemberName() {
        return current().getMemberName();
    }

    public String getMemberStatusName() {
        return current().getMemberStatus().getMemberStatusName();
    }

    public Date getMemberFormalizedDate() {
        // この一覧での表示は、正式会員日時ではなく正式会員日である。
        // 時分秒は要らない。また、物理名もDatetimeではなくDateである。
        return current().getFormalizedDatetime();
    }

    @DateTimeConverter(pattern = "yyyy/MM/dd HH:mm:ss")
    public Timestamp getMemberUpdateDatetime() {
        return current().getUpdateDatetime();
    }

    public boolean isEditable() {
        return !current().isMemberStatusCodeWithdrawal();
    }
    
    public boolean isPurchaseLinkVisible(){
        return current().getCountOfPurchase() > 0;
    }
}
