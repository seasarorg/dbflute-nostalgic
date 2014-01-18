/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdBlackAction;
import dbflute.ldb.other.simpledto.BlackActionDto;

/**
 * The DTO mapper of BLACK_ACTION that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_ACTION_ID
 *
 * [column-property]
 *     BLACK_ACTION_ID, BLACK_LIST_ID, BLACK_ACTION_CODE, BLACK_LEVEL, ACTION_DATE, EVIDENCE_PHOTOGRAPH, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     blackActionLookup, blackList
 *
 * [referrer-property]
 *     
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLACK_ACTION_ID
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
public class BlackActionDtoMapper {

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
    public BlackActionDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public BlackActionDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BlackActionDto> map(List<LdBlackAction> blackActionList) {
        List<BlackActionDto> dtoList = new ArrayList<BlackActionDto>();
        for (LdBlackAction blackAction : blackActionList) {
            dtoList.add(map(blackAction));
        }
        return dtoList;
    }

    public BlackActionDto map(LdBlackAction blackAction) {
        String localKey = "BLACK_ACTION@" + blackAction.getDBMeta().extractPrimaryKeyMapString(blackAction);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (BlackActionDto)localDto;
        }
        BlackActionDto dto = new BlackActionDto();
        dto.setBlackActionId(blackAction.getBlackActionId());
        dto.setBlackListId(blackAction.getBlackListId());
        dto.setBlackActionCode(blackAction.getBlackActionCode());
        dto.setBlackLevel(blackAction.getBlackLevel());
        dto.setActionDate(blackAction.getActionDate());
        dto.setEvidencePhotograph(blackAction.getEvidencePhotograph());
        dto.setRUser(blackAction.getRUser());
        dto.setRModule(blackAction.getRModule());
        dto.setRTimestamp(blackAction.getRTimestamp());
        dto.setUUser(blackAction.getUUser());
        dto.setUModule(blackAction.getUModule());
        dto.setUTimestamp(blackAction.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (blackAction.getBlackActionLookup() != null) {
            dbflute.ldb.exentity.LdBlackActionLookup relationEntity = blackAction.getBlackActionLookup();
            String relationKey = "BLACK_ACTION_LOOKUP@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setBlackActionLookup((dbflute.ldb.other.simpledto.BlackActionLookupDto)cachedDto);
            } else {
                BlackActionLookupDtoMapper mapper = new BlackActionLookupDtoMapper(_relationDtoMap);
                dto.setBlackActionLookup(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getBlackActionLookup());
            }
        };
        if (blackAction.getBlackList() != null) {
            dbflute.ldb.exentity.LdBlackList relationEntity = blackAction.getBlackList();
            String relationKey = "BLACK_LIST@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setBlackList((dbflute.ldb.other.simpledto.BlackListDto)cachedDto);
            } else {
                BlackListDtoMapper mapper = new BlackListDtoMapper(_relationDtoMap);
                dto.setBlackList(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getBlackList());
            }
        };
        return dto;
    }
}
