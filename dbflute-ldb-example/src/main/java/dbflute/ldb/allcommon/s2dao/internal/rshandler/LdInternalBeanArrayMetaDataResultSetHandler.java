/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.rshandler;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.seasar.dao.BeanMetaData;
import org.seasar.dao.RelationRowCreator;
import org.seasar.dao.RowCreator;

/**
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class LdInternalBeanArrayMetaDataResultSetHandler extends LdInternalBeanListMetaDataResultSetHandler {

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
	 * @param beanMetaData Bean meta data. (NotNull)
     * @param rowCreator Row creator. (NotNull)
     * @param relationRowCreator Relation row creator. (NotNul)
     */
    public LdInternalBeanArrayMetaDataResultSetHandler(BeanMetaData beanMetaData, RowCreator rowCreator, RelationRowCreator relationRowCreator) {
        super(beanMetaData, rowCreator, relationRowCreator);
    }
	
	// ===================================================================================
    //                                                                              Handle
    //                                                                              ======
    public Object handle(ResultSet rs) throws SQLException {
        List list = (List) super.handle(rs);
        return list.toArray((Object[]) Array.newInstance(getBeanMetaData().getBeanClass(), list.size()));
    }
}
