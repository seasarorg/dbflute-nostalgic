/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of BLACK_ACTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 * 
 * [column]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     BLACK_ACTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BLACK_ACTION_LOOKUP, BLACK_LIST
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     blackActionLookup, blackList
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsBlackActionDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _blackActionId:String;

    private var _blackListId:String;

    private var _blackActionCode:String;

    private var _blackLevel:String;

    private var _actionDate:Date;

    private var _evidencePhotograph:Object;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentBlackActionLookup:BlackActionLookupDto;

    public function get blackActionLookup():BlackActionLookupDto {
        return _parentBlackActionLookup;
    }

    public function set blackActionLookup(blackActionLookup:BlackActionLookupDto):void {
        _parentBlackActionLookup = blackActionLookup;
    }

    private var _parentBlackList:BlackListDto;

    public function get blackList():BlackListDto {
        return _parentBlackList;
    }

    public function set blackList(blackList:BlackListDto):void {
        _parentBlackList = blackList;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get blackActionId():String {
        return _blackActionId;
    }

    public function set blackActionId(blackActionId:String):void {
        this._blackActionId = blackActionId;
    }

    public function get blackListId():String {
        return _blackListId;
    }

    public function set blackListId(blackListId:String):void {
        this._blackListId = blackListId;
    }

    public function get blackActionCode():String {
        return _blackActionCode;
    }

    public function set blackActionCode(blackActionCode:String):void {
        this._blackActionCode = blackActionCode;
    }

    public function get blackLevel():String {
        return _blackLevel;
    }

    public function set blackLevel(blackLevel:String):void {
        this._blackLevel = blackLevel;
    }

    public function get actionDate():Date {
        return _actionDate;
    }

    public function set actionDate(actionDate:Date):void {
        this._actionDate = actionDate;
    }

    public function get evidencePhotograph():Object {
        return _evidencePhotograph;
    }

    public function set evidencePhotograph(evidencePhotograph:Object):void {
        this._evidencePhotograph = evidencePhotograph;
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
