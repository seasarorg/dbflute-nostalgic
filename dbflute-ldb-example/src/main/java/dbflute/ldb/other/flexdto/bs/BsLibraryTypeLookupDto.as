/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of LIBRARY_TYPE_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_TYPE_CODE
 * 
 * [column]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     LIBRARY
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     libraryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsLibraryTypeLookupDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryTypeCode:String;

    private var _libraryTypeName:String;

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
    LibraryDto;
    protected var _childrenLibraryList:Array;/* of the entity 'LibraryDto'. */

    public function get libraryList():Array {
        if (_childrenLibraryList == null) { _childrenLibraryList = new Array(); }
        return _childrenLibraryList;
    }

    public function set libraryList(libraryList:Array):void {
        this._childrenLibraryList = libraryList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get libraryTypeCode():String {
        return _libraryTypeCode;
    }

    public function set libraryTypeCode(libraryTypeCode:String):void {
        this._libraryTypeCode = libraryTypeCode;
    }

    public function get libraryTypeName():String {
        return _libraryTypeName;
    }

    public function set libraryTypeName(libraryTypeName:String):void {
        this._libraryTypeName = libraryTypeName;
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
