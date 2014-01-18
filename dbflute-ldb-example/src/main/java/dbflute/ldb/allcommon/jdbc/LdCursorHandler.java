/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * The handler of cursor.
 * @author DBFlute(AutoGenerator)
 */
public interface LdCursorHandler {

    /**
     * @param resultSet Result set. (NotNull)
     * @return Result
     * @throws java.sql.SQLException
     */
    Object handle(ResultSet resultSet) throws SQLException;
}
