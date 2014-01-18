package com.example.dbflute.basic.dbflute.allcommon.cbean.sqlclause;

import com.example.dbflute.basic.dbflute.allcommon.cbean.ConditionBean;

/**
 * The creator of SQL clause.
 * @author DBFlute(AutoGenerator)
 */
public interface SqlClauseCreator {

	/**
	 * Create SQL clause. {for condition-bean}
	 * @param cb Condition-bean. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public SqlClause createSqlClause(ConditionBean cb);

	/**
	 * Create SQL clause.
	 * @param tableDbName The DB name of table. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public SqlClause createSqlClause(String tableDbName);
}
