/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of LENDING_COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 * 
 * [column]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     COLLECTION, LENDING, LIBRARY_USER
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     collection, lending, libraryUser
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsLendingCollectionDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryId:String;

    private var _lbUserId:String;

    private var _lendingDate:Date;

    private var _collectionId:String;

    private var _returnLimitDate:Date;

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

    private var _parentLending:LendingDto;

    public function get lending():LendingDto {
        return _parentLending;
    }

    public function set lending(lending:LendingDto):void {
        _parentLending = lending;
    }

    private var _parentLibraryUser:LibraryUserDto;

    public function get libraryUser():LibraryUserDto {
        return _parentLibraryUser;
    }

    public function set libraryUser(libraryUser:LibraryUserDto):void {
        _parentLibraryUser = libraryUser;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

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

    public function get lendingDate():Date {
        return _lendingDate;
    }

    public function set lendingDate(lendingDate:Date):void {
        this._lendingDate = lendingDate;
    }

    public function get collectionId():String {
        return _collectionId;
    }

    public function set collectionId(collectionId:String):void {
        this._collectionId = collectionId;
    }

    public function get returnLimitDate():Date {
        return _returnLimitDate;
    }

    public function set returnLimitDate(returnLimitDate:Date):void {
        this._returnLimitDate = returnLimitDate;
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
