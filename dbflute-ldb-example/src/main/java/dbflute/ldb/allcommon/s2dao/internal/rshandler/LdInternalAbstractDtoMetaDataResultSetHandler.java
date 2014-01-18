/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.rshandler;

import java.util.Map;
import java.util.Set;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.dao.DtoMetaData;
import org.seasar.dao.RowCreator;

import dbflute.ldb.allcommon.helper.LdStringSet;

/**
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class LdInternalAbstractDtoMetaDataResultSetHandler implements ResultSetHandler {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private DtoMetaData dtoMetaData;
    protected RowCreator rowCreator; // [DAO-118] (2007/08/25)

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * @param dtoMetaData Dto meta data. (NotNull)
     * @param rowCreator Row creator. (NotNull)
     */
    public LdInternalAbstractDtoMetaDataResultSetHandler(DtoMetaData dtoMetaData, RowCreator rowCreator) {
        this.dtoMetaData = dtoMetaData;
        this.rowCreator = rowCreator;
    }

	// ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    /**
     * @param columnNames The set of column name. (NotNull)
     * @return The map of row property cache. Map{String(columnName), PropertyType} (NotNull)
     * @throws SQLException
     */
    protected Map createPropertyCache(Set columnNames) throws SQLException {
        return rowCreator.createPropertyCache(columnNames, dtoMetaData);
    }

    /**
     * @param rs Result set. (NotNull)
     * @param propertyCache The map of property cache. Map{String(columnName), PropertyType} (NotNull)
     * @return Created row. (NotNull)
     * @throws SQLException
     */
    protected Object createRow(ResultSet rs, Map propertyCache) throws SQLException {
        final Class beanClass = dtoMetaData.getBeanClass();
        return rowCreator.createRow(rs, propertyCache, beanClass);
    }

    protected Set<String> createColumnNames(final ResultSetMetaData rsmd) throws SQLException {
        final int count = rsmd.getColumnCount();
        final Set<String> columnNames = LdStringSet.createAsCaseInsensitive();
        for (int i = 0; i < count; ++i) {
            final String columnName = rsmd.getColumnLabel(i + 1);
            final int pos = columnName.lastIndexOf('.'); // [DAO-41]
            if (-1 < pos) {
                columnNames.add(columnName.substring(pos + 1));
            } else {
                columnNames.add(columnName);
            }
        }
        return columnNames;
    }

    public DtoMetaData getDtoMetaData() {
        return dtoMetaData;
    }
}
