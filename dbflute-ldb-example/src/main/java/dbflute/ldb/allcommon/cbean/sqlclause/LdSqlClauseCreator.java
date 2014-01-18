/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.sqlclause;

import dbflute.ldb.allcommon.cbean.LdConditionBean;

/**
 * The creator of SQL clause.
 * @author DBFlute(AutoGenerator)
 */
public interface LdSqlClauseCreator {

	/**
	 * Create SQL clause. {for condition-bean}
	 * @param cb Condition-bean. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public LdSqlClause createSqlClause(LdConditionBean cb);

	/**
	 * Create SQL clause.
	 * @param tableDbName The DB name of table. (NotNull) 
	 * @return SQL clause. (NotNull)
	 */
    public LdSqlClause createSqlClause(String tableDbName);
}
