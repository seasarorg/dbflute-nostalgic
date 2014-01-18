/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdBlackList;
import dbflute.ldb.other.simpledto.BlackListDto;

/**
 * The DTO mapper of BLACK_LIST that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BLACK_LIST_ID
 *
 * [column-property]
 *     BLACK_LIST_ID, LB_USER_ID, BLACK_RANK, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     lbUser
 *
 * [referrer-property]
 *     blackActionList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLACK_LIST_ID
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
public class BlackListDtoMapper {

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
    public BlackListDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public BlackListDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BlackListDto> map(List<LdBlackList> blackListList) {
        List<BlackListDto> dtoList = new ArrayList<BlackListDto>();
        for (LdBlackList blackList : blackListList) {
            dtoList.add(map(blackList));
        }
        return dtoList;
    }

    public BlackListDto map(LdBlackList blackList) {
        String localKey = "BLACK_LIST@" + blackList.getDBMeta().extractPrimaryKeyMapString(blackList);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (BlackListDto)localDto;
        }
        BlackListDto dto = new BlackListDto();
        dto.setBlackListId(blackList.getBlackListId());
        dto.setLbUserId(blackList.getLbUserId());
        dto.setBlackRank(blackList.getBlackRank());
        dto.setRUser(blackList.getRUser());
        dto.setRModule(blackList.getRModule());
        dto.setRTimestamp(blackList.getRTimestamp());
        dto.setUUser(blackList.getUUser());
        dto.setUModule(blackList.getUModule());
        dto.setUTimestamp(blackList.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (blackList.getLbUser() != null) {
            dbflute.ldb.exentity.LdLbUser relationEntity = blackList.getLbUser();
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
        if (!blackList.getBlackActionList().isEmpty()) {
            BlackActionDtoMapper mapper = new BlackActionDtoMapper(_relationDtoMap);
            dto.setBlackActionList(mapper.map(blackList.getBlackActionList()));
        };
        return dto;
    }
}
