package dbflute.ldb.allcommon.bhv;

import dbflute.ldb.allcommon.LdDaoWritable;
import dbflute.ldb.allcommon.LdEntity;

/**
 * The interface of behavior-writable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdBehaviorWritable extends LdBehaviorReadable {

    /**
     * Get dao-writable.
     * 
     * @return Dao-writable. (NotNull)
     */
    public LdDaoWritable getDaoWritable();

    /**
     * Create entity. (Delegate-Method)
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int delegateCreateTx(LdEntity entity);

    /**
     * Modify entity. (Delegate-Method)
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int delegateModifyTx(LdEntity entity);

    /**
     * Remove entity. (Delegate-Method)
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int delegateRemoveTx(LdEntity entity);

    /**
     * Create several entity-list. (Delegate-Method)
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int delegateCreateListTx(java.util.List<LdEntity> entityList);

    /**
     * Modify several entity-list. (Delegate-Method)
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int delegateModifyListTx(java.util.List<LdEntity> entityList);

    /**
     * Remove several entity-list. (Delegate-Method)
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int delegateRemoveListTx(java.util.List<LdEntity> entityList);

    /**
     * Create or modify after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     */
    public int createOrModifyAfterSelectForUpdateTx(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Modify after select-for-update.
     * 
     * @param entity Entity.
     * @return Updated count.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public int modifyAfterSelectForUpdateTx(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Reflect(insert or update) from separated-file.
     * 
     * If transaction already started, The argument 'batchCount' is invalid. (Inherit the transaction)
     * 
     * @param filename Name of the file. (NotNull and NotEmpty)
     * @param encoding Encoding of the file. (NotNull and NotEmpty)
     * @param delimiter Delimiter of the file. (NotNull and NotEmpty)
     * @param batchCount Batch-count for transaction.
     * @param isErrorContinue If true, this method continue in spite of throwing the exception.   
     * @return The list of InsertOrUpdateExceptionResult. (NotNull)
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public java.util.List<OneEntityExceptionResult> reflectFromSeparatedFile(
            String filename, String encoding,
            String delimiter, int batchCount, boolean isErrorContinue
            ) throws java.io.FileNotFoundException, java.io.IOException;

    /**
     * Exception result for one entity. 
     */
    public static class OneEntityExceptionResult {
        protected String _primaryKeyMapString;
        protected LdEntity _entity;
        protected Exception _exception;
        
        public String getPrimaryKeyMapString() {
            return _primaryKeyMapString;
        }
        public void setPrimaryKeyMapString(String value) {
            _primaryKeyMapString = value;
        }
        public LdEntity getEntity() {
            return _entity;
        }
        public void setEntity(LdEntity value) {
            _entity = value;
        }
        public Exception getException() {
            return _exception;
        }
        public void setException(Exception value) {
            _exception = value;
        }
    }
}
