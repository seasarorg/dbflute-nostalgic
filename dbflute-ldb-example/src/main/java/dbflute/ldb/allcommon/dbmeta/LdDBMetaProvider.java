/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta;

/**
 * The interface of DB meta.
 * @author DBFlute(AutoGenerator)
 */
public interface LdDBMetaProvider {

    /**
     * Provide the DB meta.
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (Nullable: If the DB meta is not found, it returns null)
     */
    public LdDBMeta provideDBMeta(String tableFlexibleName);

    /**
     * Provide the DB meta.
     * @param tableFlexibleName The flexible name of table. (NotNull)
     * @return The instance of DB meta. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdDBMetaNotFoundException When the DB meta is not found.
     */
    public LdDBMeta provideDBMetaChecked(String tableFlexibleName);
}
