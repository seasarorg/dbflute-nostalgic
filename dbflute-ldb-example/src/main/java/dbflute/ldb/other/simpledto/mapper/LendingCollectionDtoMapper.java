/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLendingCollection;
import dbflute.ldb.other.simpledto.LendingCollectionDto;

/**
 * The DTO mapper of LENDING_COLLECTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID
 *
 * [column-property]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID, RETURN_LIMIT_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     collection, lending, libraryUser
 *
 * [referrer-property]
 *     
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
public class LendingCollectionDtoMapper {

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
    public LendingCollectionDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LendingCollectionDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LendingCollectionDto> map(List<LdLendingCollection> lendingCollectionList) {
        List<LendingCollectionDto> dtoList = new ArrayList<LendingCollectionDto>();
        for (LdLendingCollection lendingCollection : lendingCollectionList) {
            dtoList.add(map(lendingCollection));
        }
        return dtoList;
    }

    public LendingCollectionDto map(LdLendingCollection lendingCollection) {
        String localKey = "LENDING_COLLECTION@" + lendingCollection.getDBMeta().extractPrimaryKeyMapString(lendingCollection);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LendingCollectionDto)localDto;
        }
        LendingCollectionDto dto = new LendingCollectionDto();
        dto.setLibraryId(lendingCollection.getLibraryId());
        dto.setLbUserId(lendingCollection.getLbUserId());
        dto.setLendingDate(lendingCollection.getLendingDate());
        dto.setCollectionId(lendingCollection.getCollectionId());
        dto.setReturnLimitDate(lendingCollection.getReturnLimitDate());
        dto.setRUser(lendingCollection.getRUser());
        dto.setRModule(lendingCollection.getRModule());
        dto.setRTimestamp(lendingCollection.getRTimestamp());
        dto.setUUser(lendingCollection.getUUser());
        dto.setUModule(lendingCollection.getUModule());
        dto.setUTimestamp(lendingCollection.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (lendingCollection.getCollection() != null) {
            dbflute.ldb.exentity.LdCollection relationEntity = lendingCollection.getCollection();
            String relationKey = "COLLECTION@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setCollection((dbflute.ldb.other.simpledto.CollectionDto)cachedDto);
            } else {
                CollectionDtoMapper mapper = new CollectionDtoMapper(_relationDtoMap);
                dto.setCollection(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getCollection());
            }
        };
        if (lendingCollection.getLending() != null) {
            dbflute.ldb.exentity.LdLending relationEntity = lendingCollection.getLending();
            String relationKey = "LENDING@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLending((dbflute.ldb.other.simpledto.LendingDto)cachedDto);
            } else {
                LendingDtoMapper mapper = new LendingDtoMapper(_relationDtoMap);
                dto.setLending(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLending());
            }
        };
        if (lendingCollection.getLibraryUser() != null) {
            dbflute.ldb.exentity.LdLibraryUser relationEntity = lendingCollection.getLibraryUser();
            String relationKey = "LIBRARY_USER@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibraryUser((dbflute.ldb.other.simpledto.LibraryUserDto)cachedDto);
            } else {
                LibraryUserDtoMapper mapper = new LibraryUserDtoMapper(_relationDtoMap);
                dto.setLibraryUser(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibraryUser());
            }
        };
        return dto;
    }
}
