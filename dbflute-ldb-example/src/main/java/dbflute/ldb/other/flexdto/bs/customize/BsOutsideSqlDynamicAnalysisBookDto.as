/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs.customize {

import dbflute.ldb.other.flexdto.customize.*;

/**
 * The flex DTO of OutsideSqlDynamicAnalysisBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsOutsideSqlDynamicAnalysisBookDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _bookId:String;

    private var _bookName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get bookId():String {
        return _bookId;
    }

    public function set bookId(bookId:String):void {
        this._bookId = bookId;
    }

    public function get bookName():String {
        return _bookName;
    }

    public function set bookName(bookName:String):void {
        this._bookName = bookName;
    }

}

}
