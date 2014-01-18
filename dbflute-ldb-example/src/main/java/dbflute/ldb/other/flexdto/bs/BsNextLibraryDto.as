/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of NEXT_LIBRARY that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, NEXT_LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, NEXT_LIBRARY_ID, DISTANCE_KM, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     libraryByNextId, libraryByBaseId
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsNextLibraryDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryId:String;

    private var _nextLibraryId:String;

    private var _distanceKm:Number;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentLibraryByNextId:LibraryDto;

    public function get libraryByNextId():LibraryDto {
        return _parentLibraryByNextId;
    }

    public function set libraryByNextId(libraryByNextId:LibraryDto):void {
        _parentLibraryByNextId = libraryByNextId;
    }

    private var _parentLibraryByBaseId:LibraryDto;

    public function get libraryByBaseId():LibraryDto {
        return _parentLibraryByBaseId;
    }

    public function set libraryByBaseId(libraryByBaseId:LibraryDto):void {
        _parentLibraryByBaseId = libraryByBaseId;
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

    public function get nextLibraryId():String {
        return _nextLibraryId;
    }

    public function set nextLibraryId(nextLibraryId:String):void {
        this._nextLibraryId = nextLibraryId;
    }

    public function get distanceKm():Number {
        return _distanceKm;
    }

    public function set distanceKm(distanceKm:Number):void {
        this._distanceKm = distanceKm;
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
