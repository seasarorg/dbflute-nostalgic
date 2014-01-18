/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of LB_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 * 
 * [column]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LB_USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_LIST(AsOne)
 * 
 * [referrer-table]
 *     LIBRARY_USER, BLACK_LIST
 * 
 * [foreign-property]
 *     blackListAsOne
 * 
 * [referrer-property]
 *     libraryUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsLbUserDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _lbUserId:String;

    private var _lbUserName:String;

    private var _userPassword:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _childrenBlackListList:BlackListDto;

    public function get blackListAsOne():BlackListDto {
        return _childrenBlackListList;
    }

    public function set blackListAsOne(blackListAsOne:BlackListDto):void {
        _childrenBlackListList = blackListAsOne;
    }
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    LibraryUserDto;
    protected var _childrenLibraryUserList:Array;/* of the entity 'LibraryUserDto'. */

    public function get libraryUserList():Array {
        if (_childrenLibraryUserList == null) { _childrenLibraryUserList = new Array(); }
        return _childrenLibraryUserList;
    }

    public function set libraryUserList(libraryUserList:Array):void {
        this._childrenLibraryUserList = libraryUserList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get lbUserId():String {
        return _lbUserId;
    }

    public function set lbUserId(lbUserId:String):void {
        this._lbUserId = lbUserId;
    }

    public function get lbUserName():String {
        return _lbUserName;
    }

    public function set lbUserName(lbUserName:String):void {
        this._lbUserName = lbUserName;
    }

    public function get userPassword():String {
        return _userPassword;
    }

    public function set userPassword(userPassword:String):void {
        this._userPassword = userPassword;
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
