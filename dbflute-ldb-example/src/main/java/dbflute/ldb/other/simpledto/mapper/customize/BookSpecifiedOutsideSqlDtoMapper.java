/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper.customize;

import java.util.List;
import java.util.ArrayList;

import dbflute.ldb.exentity.customize.LdBookSpecifiedOutsideSql;
import dbflute.ldb.other.simpledto.customize.BookSpecifiedOutsideSqlDto;

/**
 * The DTO mapper of BookSpecifiedOutsideSql that the type is null.
 * <pre>
 * [primary-key]
 *     BOOK_ID
 *
 * [column-property]
 *     BOOK_ID, BOOK_NAME, COLLECTION_COUNT, OUT_OF_USER_SELECT_YN, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public class BookSpecifiedOutsideSqlDtoMapper {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BookSpecifiedOutsideSqlDtoMapper() {
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BookSpecifiedOutsideSqlDto> map(List<LdBookSpecifiedOutsideSql> bookSpecifiedOutsideSqlList) {
        List<BookSpecifiedOutsideSqlDto> dtoList = new ArrayList<BookSpecifiedOutsideSqlDto>();
        for (LdBookSpecifiedOutsideSql bookSpecifiedOutsideSql : bookSpecifiedOutsideSqlList) {
            dtoList.add(map(bookSpecifiedOutsideSql));
        }
        return dtoList;
    }

    public BookSpecifiedOutsideSqlDto map(LdBookSpecifiedOutsideSql bookSpecifiedOutsideSql) {
        BookSpecifiedOutsideSqlDto dto = new BookSpecifiedOutsideSqlDto();
        dto.setBookId(bookSpecifiedOutsideSql.getBookId());
        dto.setBookName(bookSpecifiedOutsideSql.getBookName());
        dto.setCollectionCount(bookSpecifiedOutsideSql.getCollectionCount());
        dto.setOutOfUserSelectYn(bookSpecifiedOutsideSql.getOutOfUserSelectYn());
        dto.setRUser(bookSpecifiedOutsideSql.getRUser());
        dto.setRModule(bookSpecifiedOutsideSql.getRModule());
        dto.setRTimestamp(bookSpecifiedOutsideSql.getRTimestamp());
        dto.setUUser(bookSpecifiedOutsideSql.getUUser());
        dto.setUModule(bookSpecifiedOutsideSql.getUModule());
        dto.setUTimestamp(bookSpecifiedOutsideSql.getUTimestamp());
        return dto;
    }
}
