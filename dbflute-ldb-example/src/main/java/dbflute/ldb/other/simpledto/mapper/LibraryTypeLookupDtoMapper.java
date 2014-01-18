/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLibraryTypeLookup;
import dbflute.ldb.other.simpledto.LibraryTypeLookupDto;

/**
 * The DTO mapper of LIBRARY_TYPE_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LIBRARY_TYPE_CODE
 *
 * [column-property]
 *     LIBRARY_TYPE_CODE, LIBRARY_TYPE_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     libraryList
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
public class LibraryTypeLookupDtoMapper {

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
    public LibraryTypeLookupDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LibraryTypeLookupDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LibraryTypeLookupDto> map(List<LdLibraryTypeLookup> libraryTypeLookupList) {
        List<LibraryTypeLookupDto> dtoList = new ArrayList<LibraryTypeLookupDto>();
        for (LdLibraryTypeLookup libraryTypeLookup : libraryTypeLookupList) {
            dtoList.add(map(libraryTypeLookup));
        }
        return dtoList;
    }

    public LibraryTypeLookupDto map(LdLibraryTypeLookup libraryTypeLookup) {
        String localKey = "LIBRARY_TYPE_LOOKUP@" + libraryTypeLookup.getDBMeta().extractPrimaryKeyMapString(libraryTypeLookup);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LibraryTypeLookupDto)localDto;
        }
        LibraryTypeLookupDto dto = new LibraryTypeLookupDto();
        dto.setLibraryTypeCode(libraryTypeLookup.getLibraryTypeCode());
        dto.setLibraryTypeName(libraryTypeLookup.getLibraryTypeName());
        dto.setRUser(libraryTypeLookup.getRUser());
        dto.setRModule(libraryTypeLookup.getRModule());
        dto.setRTimestamp(libraryTypeLookup.getRTimestamp());
        dto.setUUser(libraryTypeLookup.getUUser());
        dto.setUModule(libraryTypeLookup.getUModule());
        dto.setUTimestamp(libraryTypeLookup.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (!libraryTypeLookup.getLibraryList().isEmpty()) {
            LibraryDtoMapper mapper = new LibraryDtoMapper(_relationDtoMap);
            dto.setLibraryList(mapper.map(libraryTypeLookup.getLibraryList()));
        };
        return dto;
    }
}
