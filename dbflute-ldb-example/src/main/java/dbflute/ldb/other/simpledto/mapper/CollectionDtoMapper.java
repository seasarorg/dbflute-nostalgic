/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdCollection;
import dbflute.ldb.other.simpledto.CollectionDto;

/**
 * The DTO mapper of COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 *
 * [column-property]
 *     COLLECTION_ID, LIBRARY_ID, BOOK_ID, ARRIVAL_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     book, library, collectionStatusAsOne
 *
 * [referrer-property]
 *     lendingCollectionList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     COLLECTION_ID
 *
 * [update-date]
 *     U_TIMESTAMP
 *
 * [version-no]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class CollectionDtoMapper {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Map<String, Object> _relationDtoMap;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public CollectionDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public CollectionDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<CollectionDto> map(List<LdCollection> collectionList) {
        List<CollectionDto> dtoList = new ArrayList<CollectionDto>();
        for (LdCollection collection : collectionList) {
            dtoList.add(map(collection));
        }
        return dtoList;
    }

    public CollectionDto map(LdCollection collection) {
        String localKey = "COLLECTION@" + collection.getDBMeta().extractPrimaryKeyMapString(collection);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (CollectionDto)localDto;
        }
        CollectionDto dto = new CollectionDto();
        dto.setCollectionId(collection.getCollectionId());
        dto.setLibraryId(collection.getLibraryId());
        dto.setBookId(collection.getBookId());
        dto.setArrivalDate(collection.getArrivalDate());
        dto.setRUser(collection.getRUser());
        dto.setRModule(collection.getRModule());
        dto.setRTimestamp(collection.getRTimestamp());
        dto.setUUser(collection.getUUser());
        dto.setUModule(collection.getUModule());
        dto.setUTimestamp(collection.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (collection.getBook() != null) {
            dbflute.ldb.exentity.LdBook relationEntity = collection.getBook();
            String relationKey = "BOOK@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setBook((dbflute.ldb.other.simpledto.BookDto)cachedDto);
            } else {
                BookDtoMapper mapper = new BookDtoMapper(_relationDtoMap);
                dto.setBook(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getBook());
            }
        };
        if (collection.getLibrary() != null) {
            dbflute.ldb.exentity.LdLibrary relationEntity = collection.getLibrary();
            String relationKey = "LIBRARY@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibrary((dbflute.ldb.other.simpledto.LibraryDto)cachedDto);
            } else {
                LibraryDtoMapper mapper = new LibraryDtoMapper(_relationDtoMap);
                dto.setLibrary(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibrary());
            }
        };
        if (collection.getCollectionStatusAsOne() != null) {
            dbflute.ldb.exentity.LdCollectionStatus relationEntity = collection.getCollectionStatusAsOne();
            String relationKey = "${foreignKey.foreignTable.name}@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setCollectionStatusAsOne((dbflute.ldb.other.simpledto.CollectionStatusDto)cachedDto);
            } else {
                CollectionStatusDtoMapper mapper = new CollectionStatusDtoMapper(_relationDtoMap);
                dto.setCollectionStatusAsOne(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getCollectionStatusAsOne());
            }
        };
        if (!collection.getLendingCollectionList().isEmpty()) {
            LendingCollectionDtoMapper mapper = new LendingCollectionDtoMapper(_relationDtoMap);
            dto.setLendingCollectionList(mapper.map(collection.getLendingCollectionList()));
        };
        return dto;
    }
}
