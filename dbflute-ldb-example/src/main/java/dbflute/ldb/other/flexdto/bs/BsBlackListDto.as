/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of BLACK_LIST that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_LIST_ID
 * 
 * [column]
 *     BLACK_LIST_ID, LB_USER_ID, BLACK_RANK, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_LIST_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LB_USER
 * 
 * [referrer-table]
 *     BLACK_ACTION
 * 
 * [foreign-property]
 *     lbUser
 * 
 * [referrer-property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsBlackListDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _blackListId:String;

    private var _lbUserId:String;

    private var _blackRank:String;

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

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    BlackActionDto;
    protected var _childrenBlackActionList:Array;/* of the entity 'BlackActionDto'. */

    public function get blackActionList():Array {
        if (_childrenBlackActionList == null) { _childrenBlackActionList = new Array(); }
        return _childrenBlackActionList;
    }

    public function set blackActionList(blackActionList:Array):void {
        this._childrenBlackActionList = blackActionList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get blackListId():String {
        return _blackListId;
    }

    public function set blackListId(blackListId:String):void {
        this._blackListId = blackListId;
    }

    public function get lbUserId():String {
        return _lbUserId;
    }

    public function set lbUserId(lbUserId:String):void {
        this._lbUserId = lbUserId;
    }

    public function get blackRank():String {
        return _blackRank;
    }

    public function set blackRank(blackRank:String):void {
        this._blackRank = blackRank;
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
