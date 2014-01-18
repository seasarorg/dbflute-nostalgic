/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdBook;
import dbflute.ldb.other.simpledto.BookDto;

/**
 * The DTO mapper of BOOK that the type is TABLE.
 * <pre>
 * [primary-key]
 *     BOOK_ID
 *
 * [column-property]
 *     BOOK_ID, ISBN, BOOK_NAME, AUTHOR_ID, PUBLISHER_ID, GENRE_CODE, OPENING_PART, MAX_LENDING_DATE_COUNT, OUT_OF_USER_SELECT_YN, OUT_OF_USER_SELECT_REASON, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
 *
 * [foreign-property]
 *     author, genre, publisher, collectionStatusLookupAsNonExist
 *
 * [referrer-property]
 *     collectionList
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BOOK_ID
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
public class BookDtoMapper {

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
    public BookDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public BookDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BookDto> map(List<LdBook> bookList) {
        List<BookDto> dtoList = new ArrayList<BookDto>();
        for (LdBook book : bookList) {
            dtoList.add(map(book));
        }
        return dtoList;
    }

    public BookDto map(LdBook book) {
        String localKey = "BOOK@" + book.getDBMeta().extractPrimaryKeyMapString(book);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (BookDto)localDto;
        }
        BookDto dto = new BookDto();
        dto.setBookId(book.getBookId());
        dto.setIsbn(book.getIsbn());
        dto.setBookName(book.getBookName());
        dto.setAuthorId(book.getAuthorId());
        dto.setPublisherId(book.getPublisherId());
        dto.setGenreCode(book.getGenreCode());
        dto.setOpeningPart(book.getOpeningPart());
        dto.setMaxLendingDateCount(book.getMaxLendingDateCount());
        dto.setOutOfUserSelectYn(book.getOutOfUserSelectYn());
        dto.setOutOfUserSelectReason(book.getOutOfUserSelectReason());
        dto.setRUser(book.getRUser());
        dto.setRModule(book.getRModule());
        dto.setRTimestamp(book.getRTimestamp());
        dto.setUUser(book.getUUser());
        dto.setUModule(book.getUModule());
        dto.setUTimestamp(book.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (book.getAuthor() != null) {
            dbflute.ldb.exentity.LdAuthor relationEntity = book.getAuthor();
            String relationKey = "AUTHOR@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setAuthor((dbflute.ldb.other.simpledto.AuthorDto)cachedDto);
            } else {
                AuthorDtoMapper mapper = new AuthorDtoMapper(_relationDtoMap);
                dto.setAuthor(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getAuthor());
            }
        };
        if (book.getGenre() != null) {
            dbflute.ldb.exentity.LdGenre relationEntity = book.getGenre();
            String relationKey = "GENRE@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setGenre((dbflute.ldb.other.simpledto.GenreDto)cachedDto);
            } else {
                GenreDtoMapper mapper = new GenreDtoMapper(_relationDtoMap);
                dto.setGenre(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getGenre());
            }
        };
        if (book.getPublisher() != null) {
            dbflute.ldb.exentity.LdPublisher relationEntity = book.getPublisher();
            String relationKey = "PUBLISHER@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setPublisher((dbflute.ldb.other.simpledto.PublisherDto)cachedDto);
            } else {
                PublisherDtoMapper mapper = new PublisherDtoMapper(_relationDtoMap);
                dto.setPublisher(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getPublisher());
            }
        };
        if (book.getCollectionStatusLookupAsNonExist() != null) {
            dbflute.ldb.exentity.LdCollectionStatusLookup relationEntity = book.getCollectionStatusLookupAsNonExist();
            String relationKey = "COLLECTION_STATUS_LOOKUP@" + relationEntity.getDBMeta().extractPrimaryKeyMapString(relationEntity);
            Object cachedDto = _relationDtoMap.get(relationKey);
            if (cachedDto != null) {
                dto.setCollectionStatusLookupAsNonExist((dbflute.ldb.other.simpledto.CollectionStatusLookupDto)cachedDto);
            } else {
                CollectionStatusLookupDtoMapper mapper = new CollectionStatusLookupDtoMapper(_relationDtoMap);
                dto.setCollectionStatusLookupAsNonExist(mapper.map(relationEntity));
                _relationDtoMap.put(relationKey, dto.getCollectionStatusLookupAsNonExist());
            }
        };
        if (!book.getCollectionList().isEmpty()) {
            CollectionDtoMapper mapper = new CollectionDtoMapper(_relationDtoMap);
            dto.setCollectionList(mapper.map(book.getCollectionList()));
        };
        return dto;
    }
}
