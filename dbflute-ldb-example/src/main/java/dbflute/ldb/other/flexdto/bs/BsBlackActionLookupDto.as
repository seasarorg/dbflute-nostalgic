/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of BLACK_ACTION_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_CODE
 * 
 * [column]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     BLACK_ACTION
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     blackActionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsBlackActionLookupDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _blackActionCode:String;

    private var _blackActionName:String;

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
    public function get blackActionCode():String {
        return _blackActionCode;
    }

    public function set blackActionCode(blackActionCode:String):void {
        this._blackActionCode = blackActionCode;
    }

    public function get blackActionName():String {
        return _blackActionName;
    }

    public function set blackActionName(blackActionName:String):void {
        this._blackActionName = blackActionName;
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
