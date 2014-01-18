/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;

import dbflute.ldb.exentity.LdGarbagePlus;
import dbflute.ldb.other.simpledto.GarbagePlusDto;

/**
 * The DTO mapper of GARBAGE_PLUS that the type is TABLE.
 * <pre>
 * [primary-key]
 *     
 *
 * [column-property]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     
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
public class GarbagePlusDtoMapper {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public GarbagePlusDtoMapper() {
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<GarbagePlusDto> map(List<LdGarbagePlus> garbagePlusList) {
        List<GarbagePlusDto> dtoList = new ArrayList<GarbagePlusDto>();
        for (LdGarbagePlus garbagePlus : garbagePlusList) {
            dtoList.add(map(garbagePlus));
        }
        return dtoList;
    }

    public GarbagePlusDto map(LdGarbagePlus garbagePlus) {
        GarbagePlusDto dto = new GarbagePlusDto();
        dto.setGarbageMemo(garbagePlus.getGarbageMemo());
        dto.setGarbageTime(garbagePlus.getGarbageTime());
        dto.setGarbageCount(garbagePlus.getGarbageCount());
        dto.setRUser(garbagePlus.getRUser());
        dto.setRModule(garbagePlus.getRModule());
        dto.setRTimestamp(garbagePlus.getRTimestamp());
        dto.setUUser(garbagePlus.getUUser());
        dto.setUModule(garbagePlus.getUModule());
        dto.setUTimestamp(garbagePlus.getUTimestamp());
        return dto;
    }
}
