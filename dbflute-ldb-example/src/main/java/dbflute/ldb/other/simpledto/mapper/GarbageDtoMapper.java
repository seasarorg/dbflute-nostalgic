/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;

import dbflute.ldb.exentity.LdGarbage;
import dbflute.ldb.other.simpledto.GarbageDto;

/**
 * The DTO mapper of GARBAGE that the type is TABLE.
 * <pre>
 * [primary-key]
 *     
 *
 * [column-property]
 *     GARBAGE_MEMO, GARBAGE_TIME, GARBAGE_COUNT, R_USER, R_TIMESTAMP, U_USER, U_TIMESTAMP
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
public class GarbageDtoMapper {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public GarbageDtoMapper() {
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<GarbageDto> map(List<LdGarbage> garbageList) {
        List<GarbageDto> dtoList = new ArrayList<GarbageDto>();
        for (LdGarbage garbage : garbageList) {
            dtoList.add(map(garbage));
        }
        return dtoList;
    }

    public GarbageDto map(LdGarbage garbage) {
        GarbageDto dto = new GarbageDto();
        dto.setGarbageMemo(garbage.getGarbageMemo());
        dto.setGarbageTime(garbage.getGarbageTime());
        dto.setGarbageCount(garbage.getGarbageCount());
        dto.setRUser(garbage.getRUser());
        dto.setRTimestamp(garbage.getRTimestamp());
        dto.setUUser(garbage.getUUser());
        dto.setUTimestamp(garbage.getUTimestamp());
        return dto;
    }
}
