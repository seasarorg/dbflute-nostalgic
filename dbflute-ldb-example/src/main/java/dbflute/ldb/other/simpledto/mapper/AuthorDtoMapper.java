/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdAuthor;
import dbflute.ldb.other.simpledto.AuthorDto;

/**
 * The DTO mapper of AUTHOR that the type is TABLE.
 * <pre>
 * [primary-key]
 *     AUTHOR_ID
 *
 * [column-property]
 *     AUTHOR_ID, AUTHOR_NAME, AUTHOR_AGE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     bookList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     AUTHOR_ID
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
public class AuthorDtoMapper {

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
    public AuthorDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public AuthorDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<AuthorDto> map(List<LdAuthor> authorList) {
        List<AuthorDto> dtoList = new ArrayList<AuthorDto>();
        for (LdAuthor author : authorList) {
            dtoList.add(map(author));
        }
        return dtoList;
    }

    public AuthorDto map(LdAuthor author) {
        String localKey = "AUTHOR@" + author.getDBMeta().extractPrimaryKeyMapString(author);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (AuthorDto)localDto;
        }
        AuthorDto dto = new AuthorDto();
        dto.setAuthorId(author.getAuthorId());
        dto.setAuthorName(author.getAuthorName());
        dto.setAuthorAge(author.getAuthorAge());
        dto.setRUser(author.getRUser());
        dto.setRModule(author.getRModule());
        dto.setRTimestamp(author.getRTimestamp());
        dto.setUUser(author.getUUser());
        dto.setUModule(author.getUModule());
        dto.setUTimestamp(author.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (!author.getBookList().isEmpty()) {
            BookDtoMapper mapper = new BookDtoMapper(_relationDtoMap);
            dto.setBookList(mapper.map(author.getBookList()));
        };
        return dto;
    }
}
