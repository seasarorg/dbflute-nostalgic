/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdCollectionStatusLookup;
import dbflute.ldb.other.simpledto.CollectionStatusLookupDto;

/**
 * The DTO mapper of COLLECTION_STATUS_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     COLLECTION_STATUS_CODE
 *
 * [column-property]
 *     COLLECTION_STATUS_CODE, COLLECTION_STATUS_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     collectionStatusList
 *
 * [sequence]
 *     testSeq
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
public class CollectionStatusLookupDtoMapper {

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
    public CollectionStatusLookupDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public CollectionStatusLookupDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<CollectionStatusLookupDto> map(List<LdCollectionStatusLookup> collectionStatusLookupList) {
        List<CollectionStatusLookupDto> dtoList = new ArrayList<CollectionStatusLookupDto>();
        for (LdCollectionStatusLookup collectionStatusLookup : collectionStatusLookupList) {
            dtoList.add(map(collectionStatusLookup));
        }
        return dtoList;
    }

    public CollectionStatusLookupDto map(LdCollectionStatusLookup collectionStatusLookup) {
        String localKey = "COLLECTION_STATUS_LOOKUP@" + collectionStatusLookup.getDBMeta().extractPrimaryKeyMapString(collectionStatusLookup);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (CollectionStatusLookupDto)localDto;
        }
        CollectionStatusLookupDto dto = new CollectionStatusLookupDto();
        dto.setCollectionStatusCode(collectionStatusLookup.getCollectionStatusCode());
        dto.setCollectionStatusName(collectionStatusLookup.getCollectionStatusName());
        dto.setRUser(collectionStatusLookup.getRUser());
        dto.setRModule(collectionStatusLookup.getRModule());
        dto.setRTimestamp(collectionStatusLookup.getRTimestamp());
        dto.setUUser(collectionStatusLookup.getUUser());
        dto.setUModule(collectionStatusLookup.getUModule());
        dto.setUTimestamp(collectionStatusLookup.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (!collectionStatusLookup.getCollectionStatusList().isEmpty()) {
            CollectionStatusDtoMapper mapper = new CollectionStatusDtoMapper(_relationDtoMap);
            dto.setCollectionStatusList(mapper.map(collectionStatusLookup.getCollectionStatusList()));
        };
        return dto;
    }
}
