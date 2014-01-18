/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of GENRE that the type is TABLE.
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 * 
 * [column]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     GENRE
 * 
 * [referrer-table]
 *     BOOK, GENRE
 * 
 * [foreign-property]
 *     genreSelf
 * 
 * [referrer-property]
 *     bookList, genreSelfList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsGenreDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _genreCode:String;

    private var _genreName:String;

    private var _hierarchyLevel:String;

    private var _hierarchyOrder:String;

    private var _parentGenreCode:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentGenreSelf:GenreDto;

    public function get genreSelf():GenreDto {
        return _parentGenreSelf;
    }

    public function set genreSelf(genreSelf:GenreDto):void {
        _parentGenreSelf = genreSelf;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    BookDto;
    protected var _childrenBookList:Array;/* of the entity 'BookDto'. */

    public function get bookList():Array {
        if (_childrenBookList == null) { _childrenBookList = new Array(); }
        return _childrenBookList;
    }

    public function set bookList(bookList:Array):void {
        this._childrenBookList = bookList;
    }

    GenreDto;
    protected var _childrenGenreSelfList:Array;/* of the entity 'GenreDto'. */

    public function get genreSelfList():Array {
        if (_childrenGenreSelfList == null) { _childrenGenreSelfList = new Array(); }
        return _childrenGenreSelfList;
    }

    public function set genreSelfList(genreSelfList:Array):void {
        this._childrenGenreSelfList = genreSelfList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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

    public function get hierarchyLevel():String {
        return _hierarchyLevel;
    }

    public function set hierarchyLevel(hierarchyLevel:String):void {
        this._hierarchyLevel = hierarchyLevel;
    }

    public function get hierarchyOrder():String {
        return _hierarchyOrder;
    }

    public function set hierarchyOrder(hierarchyOrder:String):void {
        this._hierarchyOrder = hierarchyOrder;
    }

    public function get parentGenreCode():String {
        return _parentGenreCode;
    }

    public function set parentGenreCode(parentGenreCode:String):void {
        this._parentGenreCode = parentGenreCode;
    }

    public function get rUser():String {
        return _rUser;
    }

    public function set rUser(rUser:String):void {
        this._rUser = rUser;
    }

    public function get rModule():String {
        return _rModule;
    }

    public function set rModule(rModule:String):void {
        this._rModule = rModule;
    }

    public function get rTimestamp():Date {
        return _rTimestamp;
    }

    public function set rTimestamp(rTimestamp:Date):void {
        this._rTimestamp = rTimestamp;
    }

    public function get uUser():String {
        return _uUser;
    }

    public function set uUser(uUser:String):void {
        this._uUser = uUser;
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

    public function set uTimestamp(uTimestamp:Date):void {
        this._uTimestamp = uTimestamp;
    }

}

}
