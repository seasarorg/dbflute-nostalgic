/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of GARBAGE_PLUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public class BsGarbagePlusDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _garbageMemo:String;

    private var _garbageTime:Date;

    private var _garbageCount:String;

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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get garbageMemo():String {
        return _garbageMemo;
    }

    public function set garbageMemo(garbageMemo:String):void {
        this._garbageMemo = garbageMemo;
    }

    public function get garbageTime():Date {
        return _garbageTime;
    }

    public function set garbageTime(garbageTime:Date):void {
        this._garbageTime = garbageTime;
    }

    public function get garbageCount():String {
        return _garbageCount;
    }

    public function set garbageCount(garbageCount:String):void {
        this._garbageCount = garbageCount;
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
