/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of LIBRARY that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     LIBRARY_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     LIBRARY_TYPE_LOOKUP, NEXT_LIBRARY(AsNext), LIBRARY_USER(AsUser)
 * 
 * [referrer-table]
 *     COLLECTION, LIBRARY_USER, NEXT_LIBRARY
 * 
 * [foreign-property]
 *     libraryTypeLookup, nextLibraryAsNext, libraryUserAsUser
 * 
 * [referrer-property]
 *     collectionList, libraryUserList, nextLibraryByNextIdList, nextLibraryByBaseIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsLibraryDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryId:String;

    private var _libraryName:String;

    private var _libraryTypeCode:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentLibraryTypeLookup:LibraryTypeLookupDto;

    public function get libraryTypeLookup():LibraryTypeLookupDto {
        return _parentLibraryTypeLookup;
    }

    public function set libraryTypeLookup(libraryTypeLookup:LibraryTypeLookupDto):void {
        _parentLibraryTypeLookup = libraryTypeLookup;
    }

    private var _parentNextLibraryAsNext:NextLibraryDto;

    public function get nextLibraryAsNext():NextLibraryDto {
        return _parentNextLibraryAsNext;
    }

    public function set nextLibraryAsNext(nextLibraryAsNext:NextLibraryDto):void {
        _parentNextLibraryAsNext = nextLibraryAsNext;
    }

    private var _parentLibraryUserAsUser:LibraryUserDto;

    public function get libraryUserAsUser():LibraryUserDto {
        return _parentLibraryUserAsUser;
    }

    public function set libraryUserAsUser(libraryUserAsUser:LibraryUserDto):void {
        _parentLibraryUserAsUser = libraryUserAsUser;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    CollectionDto;
    protected var _childrenCollectionList:Array;/* of the entity 'CollectionDto'. */

    public function get collectionList():Array {
        if (_childrenCollectionList == null) { _childrenCollectionList = new Array(); }
        return _childrenCollectionList;
    }

    public function set collectionList(collectionList:Array):void {
        this._childrenCollectionList = collectionList;
    }

    LibraryUserDto;
    protected var _childrenLibraryUserList:Array;/* of the entity 'LibraryUserDto'. */

    public function get libraryUserList():Array {
        if (_childrenLibraryUserList == null) { _childrenLibraryUserList = new Array(); }
        return _childrenLibraryUserList;
    }

    public function set libraryUserList(libraryUserList:Array):void {
        this._childrenLibraryUserList = libraryUserList;
    }

    NextLibraryDto;
    protected var _childrenNextLibraryByNextIdList:Array;/* of the entity 'NextLibraryDto'. */

    public function get nextLibraryByNextIdList():Array {
        if (_childrenNextLibraryByNextIdList == null) { _childrenNextLibraryByNextIdList = new Array(); }
        return _childrenNextLibraryByNextIdList;
    }

    public function set nextLibraryByNextIdList(nextLibraryByNextIdList:Array):void {
        this._childrenNextLibraryByNextIdList = nextLibraryByNextIdList;
    }

    NextLibraryDto;
    protected var _childrenNextLibraryByBaseIdList:Array;/* of the entity 'NextLibraryDto'. */

    public function get nextLibraryByBaseIdList():Array {
        if (_childrenNextLibraryByBaseIdList == null) { _childrenNextLibraryByBaseIdList = new Array(); }
        return _childrenNextLibraryByBaseIdList;
    }

    public function set nextLibraryByBaseIdList(nextLibraryByBaseIdList:Array):void {
        this._childrenNextLibraryByBaseIdList = nextLibraryByBaseIdList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get libraryId():String {
        return _libraryId;
    }

    public function set libraryId(libraryId:String):void {
        this._libraryId = libraryId;
    }

    public function get libraryName():String {
        return _libraryName;
    }

    public function set libraryName(libraryName:String):void {
        this._libraryName = libraryName;
    }

    public function get libraryTypeCode():String {
        return _libraryTypeCode;
    }

    public function set libraryTypeCode(libraryTypeCode:String):void {
        this._libraryTypeCode = libraryTypeCode;
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
