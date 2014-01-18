/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of LIBRARY_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LB_USER, LIBRARY
 * 
 * [referrer-table]
 *     LENDING, LENDING_COLLECTION
 * 
 * [foreign-property]
 *     lbUser, library
 * 
 * [referrer-property]
 *     lendingList, lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsLibraryUserDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryId:String;

    private var _lbUserId:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentLbUser:LbUserDto;

    public function get lbUser():LbUserDto {
        return _parentLbUser;
    }

    public function set lbUser(lbUser:LbUserDto):void {
        _parentLbUser = lbUser;
    }

    private var _parentLibrary:LibraryDto;

    public function get library():LibraryDto {
        return _parentLibrary;
    }

    public function set library(library:LibraryDto):void {
        _parentLibrary = library;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    LendingDto;
    protected var _childrenLendingList:Array;/* of the entity 'LendingDto'. */

    public function get lendingList():Array {
        if (_childrenLendingList == null) { _childrenLendingList = new Array(); }
        return _childrenLendingList;
    }

    public function set lendingList(lendingList:Array):void {
        this._childrenLendingList = lendingList;
    }

    LendingCollectionDto;
    protected var _childrenLendingCollectionList:Array;/* of the entity 'LendingCollectionDto'. */

    public function get lendingCollectionList():Array {
        if (_childrenLendingCollectionList == null) { _childrenLendingCollectionList = new Array(); }
        return _childrenLendingCollectionList;
    }

    public function set lendingCollectionList(lendingCollectionList:Array):void {
        this._childrenLendingCollectionList = lendingCollectionList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get libraryId():String {
        return _libraryId;
    }

    public function set libraryId(libraryId:String):void {
        this._libraryId = libraryId;
    }

    public function get lbUserId():String {
        return _lbUserId;
    }

    public function set lbUserId(lbUserId:String):void {
        this._lbUserId = lbUserId;
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
