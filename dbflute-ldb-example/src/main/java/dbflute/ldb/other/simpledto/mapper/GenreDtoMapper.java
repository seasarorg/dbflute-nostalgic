/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdGenre;
import dbflute.ldb.other.simpledto.GenreDto;

/**
 * The DTO mapper of GENRE that the type is TABLE.
 * <pre>
 * [primary-key]
 *     GENRE_CODE
 *
 * [column-property]
 *     GENRE_CODE, GENRE_NAME, HIERARCHY_LEVEL, HIERARCHY_ORDER, PARENT_GENRE_CODE, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     genreSelf
 *
 * [referrer-property]
 *     bookList, genreSelfList
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
public class GenreDtoMapper {

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
    public GenreDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public GenreDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<GenreDto> map(List<LdGenre> genreList) {
        List<GenreDto> dtoList = new ArrayList<GenreDto>();
        for (LdGenre genre : genreList) {
            dtoList.add(map(genre));
        }
        return dtoList;
    }

    public GenreDto map(LdGenre genre) {
        String localKey = "GENRE@" + genre.getDBMeta().extractPrimaryKeyMapString(genre);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (GenreDto)localDto;
        }
        GenreDto dto = new GenreDto();
        dto.setGenreCode(genre.getGenreCode());
        dto.setGenreName(genre.getGenreName());
        dto.setHierarchyLevel(genre.getHierarchyLevel());
        dto.setHierarchyOrder(genre.getHierarchyOrder());
        dto.setParentGenreCode(genre.getParentGenreCode());
        dto.setRUser(genre.getRUser());
        dto.setRModule(genre.getRModule());
        dto.setRTimestamp(genre.getRTimestamp());
        dto.setUUser(genre.getUUser());
        dto.setUModule(genre.getUModule());
        dto.setUTimestamp(genre.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (genre.getGenreSelf() != null) {
            dbflute.ldb.exentity.LdGenre relationEntity = genre.getGenreSelf();
            String relationKey = "GENRE@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setGenreSelf((dbflute.ldb.other.simpledto.GenreDto)cachedDto);
            } else {
                GenreDtoMapper mapper = new GenreDtoMapper(_relationDtoMap);
                dto.setGenreSelf(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getGenreSelf());
            }
        };
        if (!genre.getBookList().isEmpty()) {
            BookDtoMapper mapper = new BookDtoMapper(_relationDtoMap);
            dto.setBookList(mapper.map(genre.getBookList()));
        };
        if (!genre.getGenreSelfList().isEmpty()) {
            GenreDtoMapper mapper = new GenreDtoMapper(_relationDtoMap);
            dto.setGenreSelfList(mapper.map(genre.getGenreSelfList()));
        };
        return dto;
    }
}
