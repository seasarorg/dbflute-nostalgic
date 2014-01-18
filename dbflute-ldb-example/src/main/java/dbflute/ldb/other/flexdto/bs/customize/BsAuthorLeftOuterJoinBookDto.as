/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs.customize {

import dbflute.ldb.other.flexdto.customize.*;

/**
 * The flex DTO of AuthorLeftOuterJoinBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     AUTHOR_ID, AUTHOR_NAME, AUTHOR_AGE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP, BOOK_ID, ISBN, BOOK_NAME, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, COLLECTION_ID
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
public class BsAuthorLeftOuterJoinBookDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _authorId:String;

    private var _authorName:String;

    private var _authorAge:String;

    private var _rUser:String;

    private var _rModule:String;

    private var _rTimestamp:Date;

    private var _uUser:String;

    private var _uModule:String;

    private var _uTimestamp:Date;

    private var _bookId:String;

    private var _isbn:String;

    private var _bookName:String;

    private var _publisherId:String;

    private var _genreCode:String;

    private var _openingPart:String;

    private var _maxLendingDateCount:String;

    private var _outOfUserSelectYn:String;

    private var _outOfUserSelectReason:String;

    private var _collectionId:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get authorId():String {
        return _authorId;
    }

    public function set authorId(authorId:String):void {
        this._authorId = authorId;
    }

    public function get authorName():String {
        return _authorName;
    }

    public function set authorName(authorName:String):void {
        this._authorName = authorName;
    }

    public function get authorAge():String {
        return _authorAge;
    }

    public function set authorAge(authorAge:String):void {
        this._authorAge = authorAge;
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

    public function get bookId():String {
        return _bookId;
    }

    public function set bookId(bookId:String):void {
        this._bookId = bookId;
    }

    public function get isbn():String {
        return _isbn;
    }

    public function set isbn(isbn:String):void {
        this._isbn = isbn;
    }

    public function get bookName():String {
        return _bookName;
    }

    public function set bookName(bookName:String):void {
        this._bookName = bookName;
    }

    public function get publisherId():String {
        return _publisherId;
    }

    public function set publisherId(publisherId:String):void {
        this._publisherId = publisherId;
    }

    public function get genreCode():String {
        return _genreCode;
    }

    public function set genreCode(genreCode:String):void {
        this._genreCode = genreCode;
    }

    public function get openingPart():String {
        return _openingPart;
    }

    public function set openingPart(openingPart:String):void {
        this._openingPart = openingPart;
    }

    public function get maxLendingDateCount():String {
        return _maxLendingDateCount;
    }

    public function set maxLendingDateCount(maxLendingDateCount:String):void {
        this._maxLendingDateCount = maxLendingDateCount;
    }

    public function get outOfUserSelectYn():String {
        return _outOfUserSelectYn;
    }

    public function set outOfUserSelectYn(outOfUserSelectYn:String):void {
        this._outOfUserSelectYn = outOfUserSelectYn;
    }

    public function get outOfUserSelectReason():String {
        return _outOfUserSelectReason;
    }

    public function set outOfUserSelectReason(outOfUserSelectReason:String):void {
        this._outOfUserSelectReason = outOfUserSelectReason;
    }

    public function get collectionId():String {
        return _collectionId;
    }

    public function set collectionId(collectionId:String):void {
        this._collectionId = collectionId;
    }

}

}
