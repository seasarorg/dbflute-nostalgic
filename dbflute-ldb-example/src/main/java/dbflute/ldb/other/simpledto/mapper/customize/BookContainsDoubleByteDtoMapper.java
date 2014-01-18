/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper.customize;

import java.util.List;
import java.util.ArrayList;

import dbflute.ldb.exentity.customize.LdBookContainsDoubleByte;
import dbflute.ldb.other.simpledto.customize.BookContainsDoubleByteDto;

/**
 * The DTO mapper of BookContainsDoubleByte that the type is null.
 * <pre>
 * [primary-key]
 *     
 *
 * [column-property]
 *     BOOK_ID, BOOK_NAME_WITH_SPACE, COLLECTION_COUNT, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
public class BookContainsDoubleByteDtoMapper {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BookContainsDoubleByteDtoMapper() {
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<BookContainsDoubleByteDto> map(List<LdBookContainsDoubleByte> bookContainsDoubleByteList) {
        List<BookContainsDoubleByteDto> dtoList = new ArrayList<BookContainsDoubleByteDto>();
        for (LdBookContainsDoubleByte bookContainsDoubleByte : bookContainsDoubleByteList) {
            dtoList.add(map(bookContainsDoubleByte));
        }
        return dtoList;
    }

    public BookContainsDoubleByteDto map(LdBookContainsDoubleByte bookContainsDoubleByte) {
        BookContainsDoubleByteDto dto = new BookContainsDoubleByteDto();
        dto.setBookId(bookContainsDoubleByte.getBookId());
        dto.setBookNameWithSpace(bookContainsDoubleByte.getBookNameWithSpace());
        dto.setCollectionCount(bookContainsDoubleByte.getCollectionCount());
        dto.setRUser(bookContainsDoubleByte.getRUser());
        dto.setRModule(bookContainsDoubleByte.getRModule());
        dto.setRTimestamp(bookContainsDoubleByte.getRTimestamp());
        dto.setUUser(bookContainsDoubleByte.getUUser());
        dto.setUModule(bookContainsDoubleByte.getUModule());
        dto.setUTimestamp(bookContainsDoubleByte.getUTimestamp());
        return dto;
    }
}
