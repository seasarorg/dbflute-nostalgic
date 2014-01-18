/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLibraryUser;
import dbflute.ldb.other.simpledto.LibraryUserDto;

/**
 * The DTO mapper of LIBRARY_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID, LB_USER_ID
 *
 * [column-property]
 *     LIBRARY_ID, LB_USER_ID, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     lbUser, library
 *
 * [referrer-property]
 *     lendingList, lendingCollectionList
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
public class LibraryUserDtoMapper {

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
    public LibraryUserDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LibraryUserDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LibraryUserDto> map(List<LdLibraryUser> libraryUserList) {
        List<LibraryUserDto> dtoList = new ArrayList<LibraryUserDto>();
        for (LdLibraryUser libraryUser : libraryUserList) {
            dtoList.add(map(libraryUser));
        }
        return dtoList;
    }

    public LibraryUserDto map(LdLibraryUser libraryUser) {
        String localKey = "LIBRARY_USER@" + libraryUser.getDBMeta().extractPrimaryKeyMapString(libraryUser);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LibraryUserDto)localDto;
        }
        LibraryUserDto dto = new LibraryUserDto();
        dto.setLibraryId(libraryUser.getLibraryId());
        dto.setLbUserId(libraryUser.getLbUserId());
        dto.setRUser(libraryUser.getRUser());
        dto.setRModule(libraryUser.getRModule());
        dto.setRTimestamp(libraryUser.getRTimestamp());
        dto.setUUser(libraryUser.getUUser());
        dto.setUModule(libraryUser.getUModule());
        dto.setUTimestamp(libraryUser.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (libraryUser.getLbUser() != null) {
            dbflute.ldb.exentity.LdLbUser relationEntity = libraryUser.getLbUser();
            String relationKey = "LB_USER@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLbUser((dbflute.ldb.other.simpledto.LbUserDto)cachedDto);
            } else {
                LbUserDtoMapper mapper = new LbUserDtoMapper(_relationDtoMap);
                dto.setLbUser(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLbUser());
            }
        };
        if (libraryUser.getLibrary() != null) {
            dbflute.ldb.exentity.LdLibrary relationEntity = libraryUser.getLibrary();
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
        if (!libraryUser.getLendingList().isEmpty()) {
            LendingDtoMapper mapper = new LendingDtoMapper(_relationDtoMap);
            dto.setLendingList(mapper.map(libraryUser.getLendingList()));
        };
        if (!libraryUser.getLendingCollectionList().isEmpty()) {
            LendingCollectionDtoMapper mapper = new LendingCollectionDtoMapper(_relationDtoMap);
            dto.setLendingCollectionList(mapper.map(libraryUser.getLendingCollectionList()));
        };
        return dto;
    }
}
