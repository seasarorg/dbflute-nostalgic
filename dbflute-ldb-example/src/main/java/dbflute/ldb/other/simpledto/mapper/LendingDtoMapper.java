/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLending;
import dbflute.ldb.other.simpledto.LendingDto;

/**
 * The DTO mapper of LENDING that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE
 *
 * [column-property]
 *     LIBRARY_ID, LB_USER_ID, LENDING_DATE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     libraryUser
 *
 * [referrer-property]
 *     lendingCollectionList
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
public class LendingDtoMapper {

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
    public LendingDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LendingDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LendingDto> map(List<LdLending> lendingList) {
        List<LendingDto> dtoList = new ArrayList<LendingDto>();
        for (LdLending lending : lendingList) {
            dtoList.add(map(lending));
        }
        return dtoList;
    }

    public LendingDto map(LdLending lending) {
        String localKey = "LENDING@" + lending.getDBMeta().extractPrimaryKeyMapString(lending);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LendingDto)localDto;
        }
        LendingDto dto = new LendingDto();
        dto.setLibraryId(lending.getLibraryId());
        dto.setLbUserId(lending.getLbUserId());
        dto.setLendingDate(lending.getLendingDate());
        dto.setRUser(lending.getRUser());
        dto.setRModule(lending.getRModule());
        dto.setRTimestamp(lending.getRTimestamp());
        dto.setUUser(lending.getUUser());
        dto.setUModule(lending.getUModule());
        dto.setUTimestamp(lending.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (lending.getLibraryUser() != null) {
            dbflute.ldb.exentity.LdLibraryUser relationEntity = lending.getLibraryUser();
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
        if (!lending.getLendingCollectionList().isEmpty()) {
            LendingCollectionDtoMapper mapper = new LendingCollectionDtoMapper(_relationDtoMap);
            dto.setLendingCollectionList(mapper.map(lending.getLendingCollectionList()));
        };
        return dto;
    }
}
