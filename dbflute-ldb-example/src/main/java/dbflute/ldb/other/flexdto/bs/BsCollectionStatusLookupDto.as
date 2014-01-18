/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of COLLECTION_STATUS_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_STATUS_CODE
 * 
 * [column]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     testSeq
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
 *     COLLECTION_STATUS
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     collectionStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsCollectionStatusLookupDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _collectionStatusCode:String;

    private var _collectionStatusName:String;

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
    CollectionStatusDto;
    protected var _childrenCollectionStatusList:Array;/* of the entity 'CollectionStatusDto'. */

    public function get collectionStatusList():Array {
        if (_childrenCollectionStatusList == null) { _childrenCollectionStatusList = new Array(); }
        return _childrenCollectionStatusList;
    }

    public function set collectionStatusList(collectionStatusList:Array):void {
        this._childrenCollectionStatusList = collectionStatusList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get collectionStatusCode():String {
        return _collectionStatusCode;
    }

    public function set collectionStatusCode(collectionStatusCode:String):void {
        this._collectionStatusCode = collectionStatusCode;
    }

    public function get collectionStatusName():String {
        return _collectionStatusName;
    }

    public function set collectionStatusName(collectionStatusName:String):void {
        this._collectionStatusName = collectionStatusName;
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
