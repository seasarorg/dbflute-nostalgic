
package dbflute.ldb.allcommon.bhv;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.helper.LdMapStringBuilder;
import dbflute.ldb.allcommon.helper.LdMapStringBuilderImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The abstract class of behavior-writable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBehaviorWritable extends LdAbstractBehaviorReadable implements LdBehaviorWritable {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdAbstractBehaviorWritable.class);

    // =====================================================================================
    //                                                                           Constructor
    //                                                                           ===========
    /**
     * Constructor.
     */
    public LdAbstractBehaviorWritable() {
    }

    // =====================================================================================
    //                                                                       Delegate Method
    //                                                                       ===============
    /**
     * This method implements the method that is declared at super.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int delegateCreateTx(LdEntity entity) {
        assertEntityNotNull(entity);// If this table use identity, the entity does not have primary-key.
        filterEntityOfInsert(entity);
        assertEntityOfInsert(entity);
        return getDaoWritable().create(entity);
    }

    /**
     * Filter the entity of insert.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void filterEntityOfInsert(LdEntity entity) {
    }

    /**
     * Assert the entity of insert.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void assertEntityOfInsert(LdEntity entity) {
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int delegateModifyTx(LdEntity entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        filterEntityOfUpdate(entity);
        assertEntityOfUpdate(entity);
        return getDaoWritable().modify(entity);
    }

    /**
     * Filter the entity of update.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void filterEntityOfUpdate(LdEntity entity) {
    }

    /**
     * Assert the entity of update.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void assertEntityOfUpdate(LdEntity entity) {
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int delegateRemoveTx(LdEntity entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        filterEntityOfDelete(entity);
        assertEntityOfDelete(entity);
        return getDaoWritable().remove(entity);
    }

    /**
     * Filter the entity of delete.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void filterEntityOfDelete(LdEntity entity) {
    }

    /**
     * Assert the entity of delete
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     */
    protected void assertEntityOfDelete(LdEntity entity) {
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int delegateCreateListTx(java.util.List<LdEntity> entityList) {
        assertListNotNullAndEmpty(entityList);
        for (final java.util.Iterator ite = entityList.iterator(); ite.hasNext(); ) {
            final LdEntity entity = (LdEntity)ite.next();
            filterEntityOfInsert(entity);
            assertEntityOfInsert(entity);
        }
        return getDaoWritable().createList(entityList);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int delegateModifyListTx(java.util.List<LdEntity> entityList) {
        assertListNotNullAndEmpty(entityList);
        for (final java.util.Iterator ite = entityList.iterator(); ite.hasNext(); ) {
            final LdEntity entity = (LdEntity)ite.next();
            filterEntityOfUpdate(entity);
            assertEntityOfUpdate(entity);
        }
        return getDaoWritable().modifyList(entityList);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int delegateRemoveListTx(java.util.List<LdEntity> entityList) {
        assertListNotNullAndEmpty(entityList);
        for (final java.util.Iterator ite = entityList.iterator(); ite.hasNext(); ) {
            final LdEntity entity = (LdEntity)ite.next();
            filterEntityOfDelete(entity);
            assertEntityOfDelete(entity);
        }
        return getDaoWritable().removeList(entityList);
    }

    // =====================================================================================
    //                                                                    Dao Various Method
    //                                                                    ==================
    /**
     * Create or modify after select-for-update.
     * 
     * @param entity Entity. This must contain primary-key value at least. (NotNull)
     * @return Updated count.
     */
    public int createOrModifyAfterSelectForUpdateTx(dbflute.ldb.allcommon.LdEntity entity) {
        assertEntityNotNull(entity);
        final String mapString = entity.extractPrimaryKeyMapString();
        dbflute.ldb.allcommon.LdEntity currentEntity = null;
        try {
            currentEntity = readForUpdateByPKMapStringWithDeletedCheckTx(mapString);
        } catch (dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException e) {
            return delegateCreateTx(entity);
        }
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        mergeEntity(entity, currentEntity);
        return delegateModifyTx(currentEntity);
    }

    /**
     * This method implements the method that is declared at super.
     * 
     * @param entity Entity having primary-key value. (NotNull)
     * @return Updated count.
     * @exception dbflute.ldb.allcommon.exception.LdRecordHasAlreadyBeenDeletedException
     */
    public int modifyAfterSelectForUpdateTx(LdEntity entity) {
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        final LdEntity currentEntity = readForUpdateByPKMapStringWithDeletedCheckTx(entity.extractPrimaryKeyMapString());
        mergeEntity(entity, currentEntity);
        return delegateModifyTx(currentEntity);
    }

    /**
     * Merge entity.
     * Copy the column data of sourceEntity that the setter has been invoked to destinationEntity.
     * 
     * @param sourceEntity Source entity. (NotNull)
     * @param destinationEntity Destination entity. (NotNull)
     */
    abstract protected void mergeEntity(LdEntity sourceEntity, LdEntity destinationEntity);

    /**
     * Reflect(insert or update) from separated-file.
     * 
     * If transaction already started, The argument 'batchCount' is invalid. (Inherit the transaction)
     * 
     * @param filename Name of the file. (NotNull and NotEmpty)
     * @param encoding Encoding of the file. (NotNull and NotEmpty)
     * @param delimiter Delimiter of the file. (NotNull and NotEmpty)
     * @param batchCount Batch-count for transaction. If this value is 0, all records are done in one transaction.
     * @param isErrorContinue If true, this method continue in spite of throwing the exception.   
     * @return The list of InsertOrUpdateExceptionResult. (NotNull)
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public java.util.List<OneEntityExceptionResult> reflectFromSeparatedFile(
            String filename, String encoding,
            String delimiter, int batchCount, boolean isErrorContinue
            ) throws java.io.FileNotFoundException, java.io.IOException {
        assertStringNotNullAndNotTrimmedEmpty("filename", filename);
        assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
        assertObjectNotNull("delimiter", delimiter);
        final java.util.List<OneEntityExceptionResult> exceptionList = new java.util.ArrayList<OneEntityExceptionResult>();

        java.io.FileInputStream fis = null;
        java.io.InputStreamReader ir = null;
        java.io.BufferedReader br = null;
        try {
            fis = new java.io.FileInputStream(filename);
            ir = new java.io.InputStreamReader(fis, encoding);
            br = new java.io.BufferedReader(ir);

            final LdMapStringBuilder builder = new LdMapStringBuilderImpl();
            builder.setMsMapMark(MAP_STRING_MAP_MARK);
            builder.setMsStartBrace(MAP_STRING_START_BRACE);
            builder.setMsEndBrace(MAP_STRING_END_BRACE);
            builder.setMsDelimiter(MAP_STRING_DELIMITER);
            builder.setMsEqual(MAP_STRING_EQUAL);
            final java.util.List<LdEntity> entityList = new java.util.ArrayList<LdEntity>();
            int count = 0;
            while (true) {
                ++count;

                final String lineString = br.readLine();
                if (lineString == null) {
                    if (entityList.size() > 0) {
                        final java.util.List<OneEntityExceptionResult> tmpList = reflectAfterSelectForUpdateTx(entityList, isErrorContinue);
                        exceptionList.addAll(tmpList);
                        entityList.clear();
                    }
                    break;
                }
                if (count == 1) {
                    builder.setColumnNames(lineString.split(delimiter));
                    continue;
                }

                final String mapString = builder.buildByDelimiter(lineString, delimiter);
                final LdEntity entity = getDBMeta().newEntity();
                entity.acceptColumnValueMapString(mapString);
                entityList.add(entity);

                if (entityList.size() == batchCount) {
                    final java.util.List<OneEntityExceptionResult> tmpList = reflectAfterSelectForUpdateTx(entityList, isErrorContinue);
                    exceptionList.addAll(tmpList);
                    entityList.clear();
                }
            }
        } catch (java.io.FileNotFoundException e) {
            throw e;
        } catch (java.io.IOException e) {
            throw e;
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ir != null) {
                    ir.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (java.io.IOException ignored) {
                _log.warn("File-close threw the exception: ", ignored);
            }
        }
        return exceptionList;
    }

    /**
     * Reflect(insert or update) from separated-file.
     * 
     * If transaction already started, The argument 'batchCount' is invalid. (Inherit the transaction)
     * 
     * @param entityList The list of entity that is reflection target. (NotNull)
     * @param isErrorContinue If true, this method continue in spite of throwing the exception.
     * @return The list of InsertOrUpdateExceptionResult. (NotNull)
     */
    public java.util.List<OneEntityExceptionResult> reflectAfterSelectForUpdateTx(java.util.List<LdEntity> entityList,
            boolean isErrorContinue) {
        final java.util.List<OneEntityExceptionResult> exceptionList = new java.util.ArrayList<OneEntityExceptionResult>();
        for (LdEntity entity : entityList) {
            try {
                createOrModifyAfterSelectForUpdateTx(entity);
            } catch (RuntimeException e) {
                if (isErrorContinue) {
                    final OneEntityExceptionResult result = new OneEntityExceptionResult();
                    result.setPrimaryKeyMapString(entity.extractPrimaryKeyMapString());
                    result.setEntity(entity);
                    result.setException(e);
                    exceptionList.add(result);
                    continue;
                }
                throw e;
            }
        }
        return exceptionList;
    }
}
