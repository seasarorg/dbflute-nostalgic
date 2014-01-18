/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdLbUser;
import dbflute.ldb.other.simpledto.LbUserDto;

/**
 * The DTO mapper of LB_USER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     LB_USER_ID
 *
 * [column-property]
 *     LB_USER_ID, LB_USER_NAME, USER_PASSWORD, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     blackListAsOne
 *
 * [referrer-property]
 *     libraryUserList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LB_USER_ID
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
public class LbUserDtoMapper {

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
    public LbUserDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public LbUserDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<LbUserDto> map(List<LdLbUser> lbUserList) {
        List<LbUserDto> dtoList = new ArrayList<LbUserDto>();
        for (LdLbUser lbUser : lbUserList) {
            dtoList.add(map(lbUser));
        }
        return dtoList;
    }

    public LbUserDto map(LdLbUser lbUser) {
        String localKey = "LB_USER@" + lbUser.getDBMeta().extractPrimaryKeyMapString(lbUser);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (LbUserDto)localDto;
        }
        LbUserDto dto = new LbUserDto();
        dto.setLbUserId(lbUser.getLbUserId());
        dto.setLbUserName(lbUser.getLbUserName());
        dto.setUserPassword(lbUser.getUserPassword());
        dto.setRUser(lbUser.getRUser());
        dto.setRModule(lbUser.getRModule());
        dto.setRTimestamp(lbUser.getRTimestamp());
        dto.setUUser(lbUser.getUUser());
        dto.setUModule(lbUser.getUModule());
        dto.setUTimestamp(lbUser.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (lbUser.getBlackListAsOne() != null) {
            dbflute.ldb.exentity.LdBlackList relationEntity = lbUser.getBlackListAsOne();
            String relationKey = "${foreignKey.foreignTable.name}@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setBlackListAsOne((dbflute.ldb.other.simpledto.BlackListDto)cachedDto);
            } else {
                BlackListDtoMapper mapper = new BlackListDtoMapper(_relationDtoMap);
                dto.setBlackListAsOne(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getBlackListAsOne());
            }
        };
        if (!lbUser.getLibraryUserList().isEmpty()) {
            LibraryUserDtoMapper mapper = new LibraryUserDtoMapper(_relationDtoMap);
            dto.setLibraryUserList(mapper.map(lbUser.getLibraryUserList()));
        };
        return dto;
    }
}
