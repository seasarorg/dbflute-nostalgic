/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdNextLibrary;
import dbflute.ldb.other.simpledto.NextLibraryDto;

/**
 * The DTO mapper of NEXT_LIBRARY that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, NEXT_LIBRARY_ID
 *
 * [column-property]
 *     LIBRARY_ID, NEXT_LIBRARY_ID, DISTANCE_KM, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     libraryByNextId, libraryByBaseId
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
public class NextLibraryDtoMapper {

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
    public NextLibraryDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public NextLibraryDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<NextLibraryDto> map(List<LdNextLibrary> nextLibraryList) {
        List<NextLibraryDto> dtoList = new ArrayList<NextLibraryDto>();
        for (LdNextLibrary nextLibrary : nextLibraryList) {
            dtoList.add(map(nextLibrary));
        }
        return dtoList;
    }

    public NextLibraryDto map(LdNextLibrary nextLibrary) {
        String localKey = "NEXT_LIBRARY@" + nextLibrary.getDBMeta().extractPrimaryKeyMapString(nextLibrary);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (NextLibraryDto)localDto;
        }
        NextLibraryDto dto = new NextLibraryDto();
        dto.setLibraryId(nextLibrary.getLibraryId());
        dto.setNextLibraryId(nextLibrary.getNextLibraryId());
        dto.setDistanceKm(nextLibrary.getDistanceKm());
        dto.setRUser(nextLibrary.getRUser());
        dto.setRModule(nextLibrary.getRModule());
        dto.setRTimestamp(nextLibrary.getRTimestamp());
        dto.setUUser(nextLibrary.getUUser());
        dto.setUModule(nextLibrary.getUModule());
        dto.setUTimestamp(nextLibrary.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (nextLibrary.getLibraryByNextId() != null) {
            dbflute.ldb.exentity.LdLibrary relationEntity = nextLibrary.getLibraryByNextId();
            String relationKey = "LIBRARY@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibraryByNextId((dbflute.ldb.other.simpledto.LibraryDto)cachedDto);
            } else {
                LibraryDtoMapper mapper = new LibraryDtoMapper(_relationDtoMap);
                dto.setLibraryByNextId(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibraryByNextId());
            }
        };
        if (nextLibrary.getLibraryByBaseId() != null) {
            dbflute.ldb.exentity.LdLibrary relationEntity = nextLibrary.getLibraryByBaseId();
            String relationKey = "LIBRARY@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibraryByBaseId((dbflute.ldb.other.simpledto.LibraryDto)cachedDto);
            } else {
                LibraryDtoMapper mapper = new LibraryDtoMapper(_relationDtoMap);
                dto.setLibraryByBaseId(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibraryByBaseId());
            }
        };
        return dto;
    }
}
