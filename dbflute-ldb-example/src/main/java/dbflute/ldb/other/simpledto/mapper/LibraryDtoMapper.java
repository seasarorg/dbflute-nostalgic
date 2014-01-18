/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLibrary;
import dbflute.ldb.other.simpledto.LibraryDto;

/**
 * The DTO mapper of LIBRARY that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_ID
 *
 * [column-property]
 *     LIBRARY_ID, LIBRARY_NAME, LIBRARY_TYPE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     libraryTypeLookup, nextLibraryAsNext, libraryUserAsUser
 *
 * [referrer-property]
 *     collectionList, libraryUserList, nextLibraryByNextIdList, nextLibraryByBaseIdList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LIBRARY_ID
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
public class LibraryDtoMapper {

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
    public LibraryDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LibraryDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LibraryDto> map(List<LdLibrary> libraryList) {
        List<LibraryDto> dtoList = new ArrayList<LibraryDto>();
        for (LdLibrary library : libraryList) {
            dtoList.add(map(library));
        }
        return dtoList;
    }

    public LibraryDto map(LdLibrary library) {
        String localKey = "LIBRARY@" + library.getDBMeta().extractPrimaryKeyMapString(library);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LibraryDto)localDto;
        }
        LibraryDto dto = new LibraryDto();
        dto.setLibraryId(library.getLibraryId());
        dto.setLibraryName(library.getLibraryName());
        dto.setLibraryTypeCode(library.getLibraryTypeCode());
        dto.setRUser(library.getRUser());
        dto.setRModule(library.getRModule());
        dto.setRTimestamp(library.getRTimestamp());
        dto.setUUser(library.getUUser());
        dto.setUModule(library.getUModule());
        dto.setUTimestamp(library.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (library.getLibraryTypeLookup() != null) {
            dbflute.ldb.exentity.LdLibraryTypeLookup relationEntity = library.getLibraryTypeLookup();
            String relationKey = "LIBRARY_TYPE_LOOKUP@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibraryTypeLookup((dbflute.ldb.other.simpledto.LibraryTypeLookupDto)cachedDto);
            } else {
                LibraryTypeLookupDtoMapper mapper = new LibraryTypeLookupDtoMapper(_relationDtoMap);
                dto.setLibraryTypeLookup(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibraryTypeLookup());
            }
        };
        if (library.getNextLibraryAsNext() != null) {
            dbflute.ldb.exentity.LdNextLibrary relationEntity = library.getNextLibraryAsNext();
            String relationKey = "NEXT_LIBRARY@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setNextLibraryAsNext((dbflute.ldb.other.simpledto.NextLibraryDto)cachedDto);
            } else {
                NextLibraryDtoMapper mapper = new NextLibraryDtoMapper(_relationDtoMap);
                dto.setNextLibraryAsNext(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getNextLibraryAsNext());
            }
        };
        if (library.getLibraryUserAsUser() != null) {
            dbflute.ldb.exentity.LdLibraryUser relationEntity = library.getLibraryUserAsUser();
            String relationKey = "LIBRARY_USER@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setLibraryUserAsUser((dbflute.ldb.other.simpledto.LibraryUserDto)cachedDto);
            } else {
                LibraryUserDtoMapper mapper = new LibraryUserDtoMapper(_relationDtoMap);
                dto.setLibraryUserAsUser(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getLibraryUserAsUser());
            }
        };
        if (!library.getCollectionList().isEmpty()) {
            CollectionDtoMapper mapper = new CollectionDtoMapper(_relationDtoMap);
            dto.setCollectionList(mapper.map(library.getCollectionList()));
        };
        if (!library.getLibraryUserList().isEmpty()) {
            LibraryUserDtoMapper mapper = new LibraryUserDtoMapper(_relationDtoMap);
            dto.setLibraryUserList(mapper.map(library.getLibraryUserList()));
        };
        if (!library.getNextLibraryByNextIdList().isEmpty()) {
            NextLibraryDtoMapper mapper = new NextLibraryDtoMapper(_relationDtoMap);
            dto.setNextLibraryByNextIdList(mapper.map(library.getNextLibraryByNextIdList()));
        };
        if (!library.getNextLibraryByBaseIdList().isEmpty()) {
            NextLibraryDtoMapper mapper = new NextLibraryDtoMapper(_relationDtoMap);
            dto.setNextLibraryByBaseIdList(mapper.map(library.getNextLibraryByBaseIdList()));
        };
        return dto;
    }
}
