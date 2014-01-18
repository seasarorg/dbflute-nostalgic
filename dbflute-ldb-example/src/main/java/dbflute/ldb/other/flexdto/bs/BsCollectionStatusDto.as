/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of COLLECTION_STATUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, COLLECTION_STATUS_LOOKUP
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, collectionStatusLookup
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsCollectionStatusDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _collectionId:String;

    private var _collectionStatusCode:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentCollection:CollectionDto;

    public function get collection():CollectionDto {
        return _parentCollection;
    }

    public function set collection(collection:CollectionDto):void {
        _parentCollection = collection;
    }

    private var _parentCollectionStatusLookup:CollectionStatusLookupDto;

    public function get collectionStatusLookup():CollectionStatusLookupDto {
        return _parentCollectionStatusLookup;
    }

    public function set collectionStatusLookup(collectionStatusLookup:CollectionStatusLookupDto):void {
        _parentCollectionStatusLookup = collectionStatusLookup;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get collectionId():String {
        return _collectionId;
    }

    public function set collectionId(collectionId:String):void {
        this._collectionId = collectionId;
    }

    public function get collectionStatusCode():String {
        return _collectionStatusCode;
    }

    public function set collectionStatusCode(collectionStatusCode:String):void {
        this._collectionStatusCode = collectionStatusCode;
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
