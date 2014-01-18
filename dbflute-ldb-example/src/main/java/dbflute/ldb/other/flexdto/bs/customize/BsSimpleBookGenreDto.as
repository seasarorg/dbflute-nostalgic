/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs.customize {

import dbflute.ldb.other.flexdto.customize.*;

/**
 * The flex DTO of SimpleBookGenre(null).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     BOOK_ID, BOOK_NAME, GENRE_CODE, GENRE_NAME, PARENT_GENRE_CODE, PARENT_GENRE_NAME, AUTHOR_ID, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     ${table.identityColumnName}
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
public class BsSimpleBookGenreDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _bookId:Number;

    private var _bookName:String;

    private var _genreCode:String;

    private var _genreName:String;

    private var _parentGenreCode:String;

    private var _parentGenreName:String;

    private var _authorId:Number;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get bookId():Number {
        return _bookId;
    }

    public function set bookId(bookId:Integer):void {
        this._bookId = bookId;
    }

    public function get bookName():String {
        return _bookName;
    }

    public function set bookName(bookName:String):void {
        this._bookName = bookName;
    }

    public function get genreCode():String {
        return _genreCode;
    }

    public function set genreCode(genreCode:String):void {
        this._genreCode = genreCode;
    }

    public function get genreName():String {
        return _genreName;
    }

    public function set genreName(genreName:String):void {
        this._genreName = genreName;
    }

    public function get parentGenreCode():String {
        return _parentGenreCode;
    }

    public function set parentGenreCode(parentGenreCode:String):void {
        this._parentGenreCode = parentGenreCode;
    }

    public function get parentGenreName():String {
        return _parentGenreName;
    }

    public function set parentGenreName(parentGenreName:String):void {
        this._parentGenreName = parentGenreName;
    }

    public function get authorId():Number {
        return _authorId;
    }

    public function set authorId(authorId:Integer):void {
        this._authorId = authorId;
    }

    public function get uModule():String {
        return _uModule;
    }

    public function set uModule(uModule:String):void {
        this._uModule = uModule;
    }

    public function get uTimestamp():Date {
        return _uTimestamp;
    }

    public function set uTimestamp(uTimestamp:java.sql.Timestamp):void {
        this._uTimestamp = uTimestamp;
    }

}

}
