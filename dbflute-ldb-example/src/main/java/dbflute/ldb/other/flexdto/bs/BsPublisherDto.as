/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of PUBLISHER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     PUBLISHER_ID
 * 
 * [column]
 *     PUBLISHER_ID, PUBLISHER_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     PUBLISHER_ID
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
public class BsPublisherDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _publisherId:String;

    private var _publisherName:String;

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
    public function get publisherId():String {
        return _publisherId;
    }

    public function set publisherId(publisherId:String):void {
        this._publisherId = publisherId;
    }

    public function get publisherName():String {
        return _publisherName;
    }

    public function set publisherName(publisherName:String):void {
        this._publisherName = publisherName;
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
