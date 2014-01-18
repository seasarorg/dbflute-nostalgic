/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdBlackActionLookup;
import dbflute.ldb.other.simpledto.BlackActionLookupDto;

/**
 * The DTO mapper of BLACK_ACTION_LOOKUP that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_CODE
 *
 * [column-property]
 *     BLACK_ACTION_CODE, BLACK_ACTION_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     blackActionList
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
public class BlackActionLookupDtoMapper {

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
    public BlackActionLookupDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public BlackActionLookupDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BlackActionLookupDto> map(List<LdBlackActionLookup> blackActionLookupList) {
        List<BlackActionLookupDto> dtoList = new ArrayList<BlackActionLookupDto>();
        for (LdBlackActionLookup blackActionLookup : blackActionLookupList) {
            dtoList.add(map(blackActionLookup));
        }
        return dtoList;
    }

    public BlackActionLookupDto map(LdBlackActionLookup blackActionLookup) {
        String localKey = "BLACK_ACTION_LOOKUP@" + blackActionLookup.getDBMeta().extractPrimaryKeyMapString(blackActionLookup);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (BlackActionLookupDto)localDto;
        }
        BlackActionLookupDto dto = new BlackActionLookupDto();
        dto.setBlackActionCode(blackActionLookup.getBlackActionCode());
        dto.setBlackActionName(blackActionLookup.getBlackActionName());
        dto.setRUser(blackActionLookup.getRUser());
        dto.setRModule(blackActionLookup.getRModule());
        dto.setRTimestamp(blackActionLookup.getRTimestamp());
        dto.setUUser(blackActionLookup.getUUser());
        dto.setUModule(blackActionLookup.getUModule());
        dto.setUTimestamp(blackActionLookup.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (!blackActionLookup.getBlackActionList().isEmpty()) {
            BlackActionDtoMapper mapper = new BlackActionDtoMapper(_relationDtoMap);
            dto.setBlackActionList(mapper.map(blackActionLookup.getBlackActionList()));
        };
        return dto;
    }
}
