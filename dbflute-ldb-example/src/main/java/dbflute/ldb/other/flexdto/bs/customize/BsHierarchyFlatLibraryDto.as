/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs.customize {

import dbflute.ldb.other.flexdto.customize.*;

/**
 * The flex DTO of HierarchyFlatLibrary that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     LIBRARY_ID, LIBRARY_NAME, R_USER, R_TIMESTAMP, BASE_LIBRARY_ID, NEXT_LIBRARY_ID, NEXT_LIBRARY_NEXT_LIBRARY_ID, NEXT_LIBRARY_NEXT_LIBRARY_NAME, COLLECTION_ID, COLLECTION_ARRIVAL_DATE, COLLECTION_STATUS_ID, COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, COLLECTION_BOOK_ID, COLLECTION_BOOK_NAME, COLLECTION_BOOK_AUTHOR_ID, COLLECTION_BOOK_AUTHOR_NAME, LIBRARY_USER_LIBRARY_ID, LIBRARY_USER_LB_USER_ID, LENDING_LIBRARY_ID, LENDING_LB_USER_ID, LENDING_DATE, LENDING_U_USER, LENDING_U_MODULE, LB_USER_ID, LB_USER_NAME
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
public class BsHierarchyFlatLibraryDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _libraryId:String;

    private var _libraryName:String;

    private var _rUser:String;

    private var _rTimestamp:Date;

    private var _baseLibraryId:String;

    private var _nextLibraryId:String;

    private var _nextLibraryNextLibraryId:String;

    private var _nextLibraryNextLibraryName:String;

    private var _collectionId:String;

    private var _collectionArrivalDate:Date;

    private var _collectionStatusId:String;

    private var _collectionStatusCode:String;

    private var _collectionStatusName:String;

    private var _collectionBookId:String;

    private var _collectionBookName:String;

    private var _collectionBookAuthorId:String;

    private var _collectionBookAuthorName:String;

    private var _libraryUserLibraryId:String;

    private var _libraryUserLbUserId:String;

    private var _lendingLibraryId:String;

    private var _lendingLbUserId:String;

    private var _lendingDate:Date;

    private var _lendingUUser:String;

    private var _lendingUModule:String;

    private var _lbUserId:String;

    private var _lbUserName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
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

    public function get libraryName():String {
        return _libraryName;
    }

    public function set libraryName(libraryName:String):void {
        this._libraryName = libraryName;
    }

    public function get rUser():String {
        return _rUser;
    }

    public function set rUser(rUser:String):void {
        this._rUser = rUser;
    }

    public function get rTimestamp():Date {
        return _rTimestamp;
    }

    public function set rTimestamp(rTimestamp:Date):void {
        this._rTimestamp = rTimestamp;
    }

    public function get baseLibraryId():String {
        return _baseLibraryId;
    }

    public function set baseLibraryId(baseLibraryId:String):void {
        this._baseLibraryId = baseLibraryId;
    }

    public function get nextLibraryId():String {
        return _nextLibraryId;
    }

    public function set nextLibraryId(nextLibraryId:String):void {
        this._nextLibraryId = nextLibraryId;
    }

    public function get nextLibraryNextLibraryId():String {
        return _nextLibraryNextLibraryId;
    }

    public function set nextLibraryNextLibraryId(nextLibraryNextLibraryId:String):void {
        this._nextLibraryNextLibraryId = nextLibraryNextLibraryId;
    }

    public function get nextLibraryNextLibraryName():String {
        return _nextLibraryNextLibraryName;
    }

    public function set nextLibraryNextLibraryName(nextLibraryNextLibraryName:String):void {
        this._nextLibraryNextLibraryName = nextLibraryNextLibraryName;
    }

    public function get collectionId():String {
        return _collectionId;
    }

    public function set collectionId(collectionId:String):void {
        this._collectionId = collectionId;
    }

    public function get collectionArrivalDate():Date {
        return _collectionArrivalDate;
    }

    public function set collectionArrivalDate(collectionArrivalDate:Date):void {
        this._collectionArrivalDate = collectionArrivalDate;
    }

    public function get collectionStatusId():String {
        return _collectionStatusId;
    }

    public function set collectionStatusId(collectionStatusId:String):void {
        this._collectionStatusId = collectionStatusId;
    }

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

    public function get collectionBookId():String {
        return _collectionBookId;
    }

    public function set collectionBookId(collectionBookId:String):void {
        this._collectionBookId = collectionBookId;
    }

    public function get collectionBookName():String {
        return _collectionBookName;
    }

    public function set collectionBookName(collectionBookName:String):void {
        this._collectionBookName = collectionBookName;
    }

    public function get collectionBookAuthorId():String {
        return _collectionBookAuthorId;
    }

    public function set collectionBookAuthorId(collectionBookAuthorId:String):void {
        this._collectionBookAuthorId = collectionBookAuthorId;
    }

    public function get collectionBookAuthorName():String {
        return _collectionBookAuthorName;
    }

    public function set collectionBookAuthorName(collectionBookAuthorName:String):void {
        this._collectionBookAuthorName = collectionBookAuthorName;
    }

    public function get libraryUserLibraryId():String {
        return _libraryUserLibraryId;
    }

    public function set libraryUserLibraryId(libraryUserLibraryId:String):void {
        this._libraryUserLibraryId = libraryUserLibraryId;
    }

    public function get libraryUserLbUserId():String {
        return _libraryUserLbUserId;
    }

    public function set libraryUserLbUserId(libraryUserLbUserId:String):void {
        this._libraryUserLbUserId = libraryUserLbUserId;
    }

    public function get lendingLibraryId():String {
        return _lendingLibraryId;
    }

    public function set lendingLibraryId(lendingLibraryId:String):void {
        this._lendingLibraryId = lendingLibraryId;
    }

    public function get lendingLbUserId():String {
        return _lendingLbUserId;
    }

    public function set lendingLbUserId(lendingLbUserId:String):void {
        this._lendingLbUserId = lendingLbUserId;
    }

    public function get lendingDate():Date {
        return _lendingDate;
    }

    public function set lendingDate(lendingDate:Date):void {
        this._lendingDate = lendingDate;
    }

    public function get lendingUUser():String {
        return _lendingUUser;
    }

    public function set lendingUUser(lendingUUser:String):void {
        this._lendingUUser = lendingUUser;
    }

    public function get lendingUModule():String {
        return _lendingUModule;
    }

    public function set lendingUModule(lendingUModule:String):void {
        this._lendingUModule = lendingUModule;
    }

    public function get lbUserId():String {
        return _lbUserId;
    }

    public function set lbUserId(lbUserId:String):void {
        this._lbUserId = lbUserId;
    }

    public function get lbUserName():String {
        return _lbUserName;
    }

    public function set lbUserName(lbUserName:String):void {
        this._lbUserName = lbUserName;
    }

}

}
