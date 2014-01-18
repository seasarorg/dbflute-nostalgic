package com.example.dbflute.teeda.web.include;

import java.util.List;

import com.example.dbflute.teeda.dbflute.allcommon.cbean.PagingResultBean;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.pagenavi.PageNumberLink;
import com.example.dbflute.teeda.dbflute.allcommon.cbean.pagenavi.PageNumberLinkSetupper;

/**
 * ページングナビゲーションPage. <br />
 * includeされて使用されることを前提としています。
 * 
 * @author sekima
 * @since 1.0 (2007/07/07)
 */
public class PagingnaviPage {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    public PagingResultBean<?> pagingResultBean;

    public String targetPageGetParamKeyName;

    // -----------------------------------------------------
    //                                             Page Item
    //                                             ---------
    public boolean displayPagingNavi;

    public int allRecordCount;

    public int allPageCount;

    public int currentPageNumber;

    public String prePageLinkHref;

    public String nextPageLinkHref;

    public boolean existPrePage;

    public boolean existNextPage;

    public List<PageNumberLink> pageNumberLinkItems;

    public int pageNumberLinkIndex;

    // -----------------------------------------------------
    //                                PageNumberLinkDto Item
    //                                ----------------------
    public int pageNumberElement;

    public String pageNumberLinkHref;

    public boolean current;

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    // -----------------------------------------------------
    //                                            initialize
    //                                            ----------
    public Class initialize() {
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
        // PagingResultBeanのHandling(PagingNavigationの作成)は、Teedaのinclude機能を使い、
        // 各画面で再利用することを推奨します。それにより、このMethodに記述しているLogicを
        // 各開発者に覚えてもらう必要がなくなります。(同時にBugも減ります)
        // 
        // 但し、PagingNavigationのLayoutが利用画面間で全て同じである必要があります。
        // それはTeedaのinclude機能の仕様となります。
        // もし、違うLayoutのPagingNavigationを表示しなければならない画面がある場合は、
        // Conditionを利用してLayoutを動的に切り替えるか、別のincludeを作成するかになります。
        // - - - - - - - - - -/

        // 【Paging検索結果の取得】
        // include元Pageから受け渡される。
        final PagingResultBean<?> pagingResult = pagingResultBean;

        // 【PagingNavigationの表示判定 -- 初期表示・検索結果なしの場合】
        // Paging検索結果(pagingResult)が存在しない場合は、検索していない or 検索結果なしと判断し、
        // PagingNavigationを表示しないようにする(Flagをfalseに設定)。
        // ここでは“検索していない”と“検索結果なし”をLayout上特に区別しないという仕様とする。
        if (pagingResult == null || pagingResult.isEmpty()) {
            displayPagingNavi = false;
            return null;
        }

        // 【PagingNavigationの出力判定 -- この時点では固定true】
        displayPagingNavi = true;

        // 【Paging検索結果の設定】
        // Paging検索結果の情報をPageに設定する。
        // 
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
        // 戻り値のPagingResultBeanからPagingNavigationに必要な情報が全て取得可能である。
        // 
        //   final PagingResultBean<Book> bookPage = bookBhv.selectPage(cb);
        //   final int allRecordCount = bookPage.getAllRecordCount();// Paging条件無しの時の全件Record数
        //   final java.util.List<Book> bookList = bookPage;// Paging検索結果一覧
        //   final int currentPageNumber = bookPage.getCurrentPageNumber();// 検索対象Page番号
        //   final int allPageCount = bookPage.getAllPageCount();// 総Page数
        //   final int currentStartRecordNumber = bookPage.getCurrentStartRecordNumber();// 現Pageの開始Page番号
        //   final int currentEndRecordNumber = bookPage.getCurrentEndRecordNumber();// 現Pageの終了Page番号
        //   final boolean existPrePage = bookPage.isExistPrePage();// 前Pageが存在するか否か
        //   final boolean existNextPage = bookPage.isExistNextPage();// 次Pageが存在するか否か
        // - - - - - - - - - -/
        allRecordCount = pagingResult.getAllRecordCount();
        currentPageNumber = pagingResult.getCurrentPageNumber();
        allPageCount = pagingResult.getAllPageCount();
        existPrePage = pagingResult.isExistPrePage();
        existNextPage = pagingResult.isExistNextPage();

        // 【PagingNavigation -- 前へ/次へLinkの設定】
        // TeedaのDynamicProperty機能を使って、“前へ”と“次へ”のLinkのHrefを設定する。
        nextPageLinkHref = createTargetPageNumberLink(currentPageNumber + 1);
        prePageLinkHref = createTargetPageNumberLink(currentPageNumber - 1);

        // 【PagingNavigation -- NavigationLinkの設定】
        // Page番号のLink{1, 2, 3, 4, 5, 6, 7, 8...}の設定をする。
        // 検索対象Page番号から前後3Pageを表示するという画面仕様とする。
        //   - 検索対象Page番号が1の場合 → 1, 2, 3
        //   - 検索対象Page番号が3の場合 → 1, 2, 3, 4, 5, 6
        //   - 検索対象Page番号が5の場合 → 2, 3, 4, 5, 6, 7, 8
        //   - 検索対象Page番号が5で7Pageまでしかない場合 → 2, 3, 4, 5, 6, 7
        // 
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
        // このようなPagingNavigationを以下のように作成することが可能です。
        // 
        // 1. 前後何Page表示するかを設定する。
        // 2. 表示すべきPageNumberLinkのListを作成する。
        // 
        //   ※ここではこの処理をMethod化していますが、
        //     それは単にJUnitでTestしやすいようにするためです。
        //       → createPageNumberLinkList(pagingResult);
        // 
        // 標準的なPropertyを備えるPageNumberLink-Classと、
        // そのClassの表示Linkとしての一覧の作成LogicをDBFluteが提供しています。
        // 「番号に対して付与するLink(Href)」だけはApplication固有Logicで作成します(して下さい)。
        // 
        // ex) createPageNumberLinkList(pagingResult)の実装
        // 
        //   pagingResult.setPageRangeSize(3);
        //   final PageNumberLinkSetupper<PageNumberLink> setupper = new PageNumberLinkSetupper<PageNumberLink>() {
        //       public PageNumberLink setup(int pageNumberElement, boolean current) {
        //           final String targetPageNumberLink = createTargetPageNumberLink(pageNumberElement);
        //           return new PageNumberLink().initialize(pageNumberElement, current, targetPageNumberLink);
        //       }
        //   };
        //   return pagingResult.pageRange().buildPageNumberLinkList(setupper);
        // - - - - - - - - - -/
        final List<PageNumberLink> pageNumberLinkList = createPageNumberLinkList(pagingResult);
        pageNumberLinkItems = pageNumberLinkList;

        return null;
    }

    /**
     * Create the list of page number link. <br />
     * 
     * @param pagingResult The bean of paging result. (NotNull)
     * @return The list of page number link. (NotNull)
     */
    protected List<PageNumberLink> createPageNumberLinkList(final PagingResultBean<?> pagingResult) {
        pagingResult.setPageRangeSize(3);// 本当はConfigなどから取得するのが好ましい
        final PageNumberLinkSetupper<PageNumberLink> setupper = new PageNumberLinkSetupper<PageNumberLink>() {
            public PageNumberLink setup(int pageNumberElement, boolean current) {
                final String targetPageNumberLink = createTargetPageNumberLink(pageNumberElement);
                return new PageNumberLink().initialize(pageNumberElement, current, targetPageNumberLink);
            }
        };
        return pagingResult.pageRange().buildPageNumberLinkList(setupper);
    }

    /**
     * Create target page number link.
     * 
     * @param pageNumber Target page number.
     * @return Target page number link. (NotNull)
     */
    protected String createTargetPageNumberLink(int pageNumber) {
        // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 【☆TIPS】
        // ここはApplicationによってLogicは変わると思われるので
        // 各Applicationにて実装します。
        // - - - - - - - - - -/
        return "?" + targetPageGetParamKeyName + "=" + pageNumber;
    }

    // -----------------------------------------------------
    //                                             prerender
    //                                             ---------
    public Class prerender() {
        return null;
    }
}
