/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs {

import dbflute.ldb.other.flexdto.*;

/**
 * The flex DTO of COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 * 
 * [column]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     COLLECTION_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     BOOK, LIBRARY, COLLECTION_STATUS(AsOne)
 * 
 * [referrer-table]
 *     LENDING_COLLECTION, COLLECTION_STATUS
 * 
 * [foreign-property]
 *     book, library, collectionStatusAsOne
 * 
 * [referrer-property]
 *     lendingCollectionList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class BsCollectionDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _collectionId:String;

    private var _libraryId:String;

    private var _bookId:String;

    private var _arrivalDate:Date;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    private var _parentBook:BookDto;

    public function get book():BookDto {
        return _parentBook;
    }

    public function set book(book:BookDto):void {
        _parentBook = book;
    }

    private var _parentLibrary:LibraryDto;

    public function get library():LibraryDto {
        return _parentLibrary;
    }

    public function set library(library:LibraryDto):void {
        _parentLibrary = library;
    }

    private var _childrenCollectionStatusList:CollectionStatusDto;

    public function get collectionStatusAsOne():CollectionStatusDto {
        return _childrenCollectionStatusList;
    }

    public function set collectionStatusAsOne(collectionStatusAsOne:CollectionStatusDto):void {
        _childrenCollectionStatusList = collectionStatusAsOne;
    }
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    LendingCollectionDto;
    protected var _childrenLendingCollectionList:Array;/* of the entity 'LendingCollectionDto'. */

    public function get lendingCollectionList():Array {
        if (_childrenLendingCollectionList == null) { _childrenLendingCollectionList = new Array(); }
        return _childrenLendingCollectionList;
    }

    public function set lendingCollectionList(lendingCollectionList:Array):void {
        this._childrenLendingCollectionList = lendingCollectionList;
    }


    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get collectionId():String {
        return _collectionId;
    }

    public function set collectionId(collectionId:String):void {
        this._collectionId = collectionId;
    }

    public function get libraryId():String {
        return _libraryId;
    }

    public function set libraryId(libraryId:String):void {
        this._libraryId = libraryId;
    }

    public function get bookId():String {
        return _bookId;
    }

    public function set bookId(bookId:String):void {
        this._bookId = bookId;
    }

    public function get arrivalDate():Date {
        return _arrivalDate;
    }

    public function set arrivalDate(arrivalDate:Date):void {
        this._arrivalDate = arrivalDate;
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
