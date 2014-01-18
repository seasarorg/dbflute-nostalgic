/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of AUTHOR that the type is TABLE.
 * <pre>
 * [primary-key]
 *     AUTHOR_ID
 * 
 * [column]
 *     AUTHOR_ID, AUTHOR_NAME, AUTHOR_AGE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     AUTHOR_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     BOOK
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     bookList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsAuthorDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _authorId:String;

    private var _authorName:String;

    private var _authorAge:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
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


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get authorId():String {
        return _authorId;
    }

    public function set authorId(authorId:String):void {
        this._authorId = authorId;
    }

    public function get authorName():String {
        return _authorName;
    }

    public function set authorName(authorName:String):void {
        this._authorName = authorName;
    }

    public function get authorAge():String {
        return _authorAge;
    }

    public function set authorAge(authorAge:String):void {
        this._authorAge = authorAge;
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
