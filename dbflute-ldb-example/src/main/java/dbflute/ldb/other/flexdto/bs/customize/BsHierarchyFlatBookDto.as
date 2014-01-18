/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.flexdto.bs.customize {

import dbflute.ldb.other.flexdto.customize.*;

/**
 * The flex DTO of HierarchyFlatBook that the type is null.
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     PRIMARY_BOOK_ID, ATTRIBUTE_BOOK_NAME, PRIMARY_AUTHOR_ID, ATTRIBUTE_AUTHOR_NAME, PRIMARY_COLLECTION_ID, ATTRIBUTE_ARRIVAL_DATE, ATTRIBUTE_COLLECTION_STATUS_CODE, PRIMARY_COLLECTION_STATUS_CODE, ATTRIBUTE_COLLECTION_STATUS_NAME
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
public class BsHierarchyFlatBookDto {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private var _primaryBookId:String;

    private var _attributeBookName:String;

    private var _primaryAuthorId:String;

    private var _attributeAuthorName:String;

    private var _primaryCollectionId:String;

    private var _attributeArrivalDate:Date;

    private var _attributeCollectionStatusCode:String;

    private var _primaryCollectionStatusCode:String;

    private var _attributeCollectionStatusName:String;


    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public function get primaryBookId():String {
        return _primaryBookId;
    }

    public function set primaryBookId(primaryBookId:String):void {
        this._primaryBookId = primaryBookId;
    }

    public function get attributeBookName():String {
        return _attributeBookName;
    }

    public function set attributeBookName(attributeBookName:String):void {
        this._attributeBookName = attributeBookName;
    }

    public function get primaryAuthorId():String {
        return _primaryAuthorId;
    }

    public function set primaryAuthorId(primaryAuthorId:String):void {
        this._primaryAuthorId = primaryAuthorId;
    }

    public function get attributeAuthorName():String {
        return _attributeAuthorName;
    }

    public function set attributeAuthorName(attributeAuthorName:String):void {
        this._attributeAuthorName = attributeAuthorName;
    }

    public function get primaryCollectionId():String {
        return _primaryCollectionId;
    }

    public function set primaryCollectionId(primaryCollectionId:String):void {
        this._primaryCollectionId = primaryCollectionId;
    }

    public function get attributeArrivalDate():Date {
        return _attributeArrivalDate;
    }

    public function set attributeArrivalDate(attributeArrivalDate:Date):void {
        this._attributeArrivalDate = attributeArrivalDate;
    }

    public function get attributeCollectionStatusCode():String {
        return _attributeCollectionStatusCode;
    }

    public function set attributeCollectionStatusCode(attributeCollectionStatusCode:String):void {
        this._attributeCollectionStatusCode = attributeCollectionStatusCode;
    }

    public function get primaryCollectionStatusCode():String {
        return _primaryCollectionStatusCode;
    }

    public function set primaryCollectionStatusCode(primaryCollectionStatusCode:String):void {
        this._primaryCollectionStatusCode = primaryCollectionStatusCode;
    }

    public function get attributeCollectionStatusName():String {
        return _attributeCollectionStatusName;
    }

    public function set attributeCollectionStatusName(attributeCollectionStatusName:String):void {
        this._attributeCollectionStatusName = attributeCollectionStatusName;
    }

}

}
