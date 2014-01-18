/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdCollectionStatus;
import dbflute.ldb.other.simpledto.CollectionStatusDto;

/**
 * The DTO mapper of COLLECTION_STATUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_ID
 *
 * [column-property]
 *     COLLECTION_ID, COLLECTION_STATUS_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     collection, collectionStatusLookup
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
public class CollectionStatusDtoMapper {

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
    public CollectionStatusDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public CollectionStatusDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<CollectionStatusDto> map(List<LdCollectionStatus> collectionStatusList) {
        List<CollectionStatusDto> dtoList = new ArrayList<CollectionStatusDto>();
        for (LdCollectionStatus collectionStatus : collectionStatusList) {
            dtoList.add(map(collectionStatus));
        }
        return dtoList;
    }

    public CollectionStatusDto map(LdCollectionStatus collectionStatus) {
        String localKey = "COLLECTION_STATUS@" + collectionStatus.getDBMeta().extractPrimaryKeyMapString(collectionStatus);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (CollectionStatusDto)localDto;
        }
        CollectionStatusDto dto = new CollectionStatusDto();
        dto.setCollectionId(collectionStatus.getCollectionId());
        dto.setCollectionStatusCode(collectionStatus.getCollectionStatusCode());
        dto.setRUser(collectionStatus.getRUser());
        dto.setRModule(collectionStatus.getRModule());
        dto.setRTimestamp(collectionStatus.getRTimestamp());
        dto.setUUser(collectionStatus.getUUser());
        dto.setUModule(collectionStatus.getUModule());
        dto.setUTimestamp(collectionStatus.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (collectionStatus.getCollection() != null) {
            dbflute.ldb.exentity.LdCollection relationEntity = collectionStatus.getCollection();
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
        if (collectionStatus.getCollectionStatusLookup() != null) {
            dbflute.ldb.exentity.LdCollectionStatusLookup relationEntity = collectionStatus.getCollectionStatusLookup();
            String relationKey = "COLLECTION_STATUS_LOOKUP@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setCollectionStatusLookup((dbflute.ldb.other.simpledto.CollectionStatusLookupDto)cachedDto);
            } else {
                CollectionStatusLookupDtoMapper mapper = new CollectionStatusLookupDtoMapper(_relationDtoMap);
                dto.setCollectionStatusLookup(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getCollectionStatusLookup());
            }
        };
        return dto;
    }
}
