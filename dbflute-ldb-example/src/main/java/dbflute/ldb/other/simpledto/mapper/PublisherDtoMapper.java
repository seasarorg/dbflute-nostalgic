/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.other.simpledto.mapper;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import dbflute.ldb.exentity.LdPublisher;
import dbflute.ldb.other.simpledto.PublisherDto;

/**
 * The DTO mapper of PUBLISHER that the type is TABLE.
 * <pre>
 * [primary-key]
 *     PUBLISHER_ID
 *
 * [column-property]
 *     PUBLISHER_ID, PUBLISHER_NAME, R_USER, R_MODULE, R_TIMESTAMP, U_USER, U_MODULE, U_TIMESTAMP
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
 *     PUBLISHER_ID
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
public class PublisherDtoMapper {

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
    public PublisherDtoMapper() {
        _relationDtoMap = new HashMap<String, Object>();
    }

    public PublisherDtoMapper(Map<String, Object> relationDtoMap) {
        _relationDtoMap = relationDtoMap;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public List<PublisherDto> map(List<LdPublisher> publisherList) {
        List<PublisherDto> dtoList = new ArrayList<PublisherDto>();
        for (LdPublisher publisher : publisherList) {
            dtoList.add(map(publisher));
        }
        return dtoList;
    }

    public PublisherDto map(LdPublisher publisher) {
        String localKey = "PUBLISHER@" + publisher.getDBMeta().extractPrimaryKeyMapString(publisher);
        Object localDto = _relationDtoMap.get(localKey);
        if (localDto != null) {
            return (PublisherDto)localDto;
        }
        PublisherDto dto = new PublisherDto();
        dto.setPublisherId(publisher.getPublisherId());
        dto.setPublisherName(publisher.getPublisherName());
        dto.setRUser(publisher.getRUser());
        dto.setRModule(publisher.getRModule());
        dto.setRTimestamp(publisher.getRTimestamp());
        dto.setUUser(publisher.getUUser());
        dto.setUModule(publisher.getUModule());
        dto.setUTimestamp(publisher.getUTimestamp());
        _relationDtoMap.put(localKey, dto);
        if (!publisher.getBookList().isEmpty()) {
            BookDtoMapper mapper = new BookDtoMapper(_relationDtoMap);
            dto.setBookList(mapper.map(publisher.getBookList()));
        };
        return dto;
    }
}
