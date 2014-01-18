/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdCommonColumnAutoSetupper;
import dbflute.ldb.allcommon.bhv.core.command.LdAbstractEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdAbstractListEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdInsertEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdUpdateEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdUpdateNonstrictEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdDeleteEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdDeleteNonstrictEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdBatchInsertEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdBatchUpdateEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdBatchUpdateNonstrictEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdBatchDeleteEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdBatchDeleteNonstrictEntityCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdQueryDeleteCBCommand;
import dbflute.ldb.allcommon.bhv.core.command.LdQueryUpdateEntityCBCommand;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.helper.LdMapStringBuilder;
import dbflute.ldb.allcommon.helper.LdMapStringBuilderImpl;

import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionOption;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionResult;
import dbflute.ldb.allcommon.bhv.batch.LdTokenFileReflectionFailure;

import dbflute.ldb.allcommon.helper.token.file.LdFileToken;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingCallback;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingRowResource;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingHeaderInfo;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingOption;
import dbflute.ldb.allcommon.helper.token.file.impl.LdFileTokenImpl;

/**
 * The abstract class of writable behavior.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdAbstractBehaviorWritable extends LdAbstractBehaviorReadable implements LdBehaviorWritable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Map-string map-mark. */
    private static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string start-brace. */
    private static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    private static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    private static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    private static final String MAP_STRING_EQUAL = "@=";

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected LdCommonColumnAutoSetupper _commonColumnAutoSetupper;

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    // -----------------------------------------------------
    //                                                Create
    //                                                ------
    /**
     * Create.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void create(LdEntity entity) {
        doCreate(entity);
    }

    protected abstract void doCreate(LdEntity entity);

    // -----------------------------------------------------
    //                                                Modify
    //                                                ------
    /**
     * Modify.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modify(LdEntity entity) {
        doModify(entity);
    }

    protected abstract void doModify(LdEntity entity);

    /**
     * Modify non strict.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modifyNonstrict(LdEntity entity) {
        doModifyNonstrict(entity);
    }

    protected abstract void doModifyNonstrict(LdEntity entity);

    // -----------------------------------------------------
    //                                      Create or Modify
    //                                      ----------------
    /**
     * {@inheritDoc}
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModify(dbflute.ldb.allcommon.LdEntity entity) {
        assertEntityNotNull(entity);
        doCreateOrUpdate(entity);
    }

    protected abstract void doCreateOrUpdate(LdEntity entity);

    /**
     * {@inheritDoc}
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModifyNonstrict(dbflute.ldb.allcommon.LdEntity entity) {
        assertEntityNotNull(entity);
        doCreateOrUpdateNonstrict(entity);
    }

    protected abstract void doCreateOrUpdateNonstrict(LdEntity entity);

    // -----------------------------------------------------
    //                                                Remove
    //                                                ------
    /**
     * Remove.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void remove(dbflute.ldb.allcommon.LdEntity entity) {
        assertEntityNotNull(entity);
        callRemove(entity);
    }

    protected abstract void doRemove(LdEntity entity);

    // ===================================================================================
    //                                                       Entity Update Internal Helper
    //                                                       =============================
    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected <ENTITY extends LdEntity> void helpUpdateInternally(ENTITY entity, InternalUpdateCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        assertEntityHasVersionNoValue(entity);
        assertEntityHasUpdateDateValue(entity);
        final int updatedCount = callback.callbackDelegateUpdate(entity);
        if (updatedCount == 0) {
            String msg = "The entity was Not Found! it has already been deleted: entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException(msg);
        } else if (updatedCount > 1) {
            String msg = "The entity was Too Many! it has been duplicated. It should be the only one! But the updatedCount=" + updatedCount;
            msg = msg + ": entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg);
        }
    }

    protected static interface InternalUpdateCallback<ENTITY extends LdEntity> {
        public int callbackDelegateUpdate(ENTITY entity);
    }

    protected <ENTITY extends LdEntity> void helpUpdateNonstrictInternally(ENTITY entity, InternalUpdateNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int updatedCount = callback.callbackDelegateUpdateNonstrict(entity);
        if (updatedCount == 0) {
            String msg = "The entity was Not Found! it has already been deleted: entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException(msg);
        } else if (updatedCount > 1) {
            String msg = "The entity was Too Many! it has been duplicated. It should be the only one! But the updatedCount=" + updatedCount;
            msg = msg + ": entity=" + entity;
        }
    }

    protected static interface InternalUpdateNonstrictCallback<ENTITY extends LdEntity> {
        public int callbackDelegateUpdateNonstrict(ENTITY entity);
    }

    // -----------------------------------------------------
    //                                        InsertOrUpdate
    //                                        --------------
    protected <ENTITY extends LdEntity, CB_TYPE extends LdConditionBean>
            void helpInsertOrUpdateInternally(ENTITY entity, InternalInsertOrUpdateCallback<ENTITY, CB_TYPE> callback) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            callback.callbackInsert(entity);
        } else {
            RuntimeException exception = null;
            try {
                callback.callbackUpdate(entity);
            } catch (dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException e) {
                if (e.getRows() == 0) {
                    exception = e;
                }
            } catch (dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException e) {
                exception = e;
            } catch (OptimisticLockColumnValueNullException e) {
                exception = e;
            }
            if (exception != null) {
                final CB_TYPE cb = callback.callbackNewMyConditionBean();
                cb.acceptPrimaryKeyMapString(getDBMeta().extractPrimaryKeyMapString(entity));
                if (callback.callbackSelectCount(cb) == 0) {
                    callback.callbackInsert(entity);
                } else {
                    throw exception;
                }
            }
        }
    }

    protected static interface InternalInsertOrUpdateCallback<ENTITY extends LdEntity, CB_TYPE extends LdConditionBean> {
        public void callbackInsert(ENTITY entity);
        public void callbackUpdate(ENTITY entity);
        public CB_TYPE callbackNewMyConditionBean();
        public int callbackSelectCount(CB_TYPE cb);
    }

    protected <ENTITY extends LdEntity> void helpInsertOrUpdateInternally(ENTITY entity, InternalInsertOrUpdateNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            callback.callbackInsert(entity);
        } else {
            try {
                callback.callbackUpdateNonstrict(entity);
            } catch (dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException e) {
                callback.callbackInsert(entity);
            } catch (dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException e) {
                callback.callbackInsert(entity);
            }
        }
    }

    protected static interface InternalInsertOrUpdateNonstrictCallback<ENTITY extends LdEntity> {
        public void callbackInsert(ENTITY entity);
        public void callbackUpdateNonstrict(ENTITY entity);
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    protected <ENTITY extends LdEntity> void helpDeleteInternally(ENTITY entity, InternalDeleteCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        assertEntityHasVersionNoValue(entity);
        assertEntityHasUpdateDateValue(entity);
        final int deletedCount = callback.callbackDelegateDelete(entity);
        if (deletedCount == 0) {
            String msg = "The entity was Not Found! The entity has already been deleted: entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException(msg);
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteCallback<ENTITY extends LdEntity> {
        public int callbackDelegateDelete(ENTITY entity);
    }

    protected <ENTITY extends LdEntity> void helpDeleteNonstrictInternally(ENTITY entity, InternalDeleteNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int deletedCount = callback.callbackDelegateDeleteNonstrict(entity);
        if (deletedCount == 0) {
            String msg = "The entity was Not Found! The entity has already been deleted: entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException(msg);
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteNonstrictCallback<ENTITY extends LdEntity> {
        public int callbackDelegateDeleteNonstrict(ENTITY entity);
    }

    protected <ENTITY extends LdEntity> void helpDeleteNonstrictIgnoreDeletedInternally(ENTITY entity, InternalDeleteNonstrictIgnoreDeletedCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int deletedCount = callback.callbackDelegateDeleteNonstrict(entity);
        if (deletedCount == 0) {
            return;
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new dbflute.ldb.allcommon.exception.LdEntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteNonstrictIgnoreDeletedCallback<ENTITY extends LdEntity> {
        public int callbackDelegateDeleteNonstrict(ENTITY entity);
    }

    // ===================================================================================
    //                                                                         Lump Update
    //                                                                         ===========
    /**
     * Lump create the list.
     * @param entityList Entity list. (NotNull and NotEmpty)
     * @return The array of created count.
     */
    public int[] lumpCreate(List<LdEntity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callCreateList(entityList);
    }

    /**
     * Lump Modify the list.
     * @param entityList Entity list. (NotNull and NotEmpty)
     * @return Modified count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException If s2dao's version is over 1.0.47 (contains 1.0.47).
     */
    public int[] lumpModify(List<LdEntity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callModifyList(entityList);
    }

    /**
     * Lump remove the list.
     * @param entityList Entity list. (NotNull and NotEmpty)
     * @return Removed count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException If s2dao's version is over 1.0.47 (contains 1.0.47).
     */
    public int[] lumpRemove(List<LdEntity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callRemoveList(entityList);
    }

    /**
     * Inject sequence to primary key if it needs.
     * @param entity Entity. (NotNull)
     */
    protected void injectSequenceToPrimaryKeyIfNeeds(LdEntity entity) {
        final LdDBMeta dbmeta = entity.getDBMeta();
        if (!dbmeta.hasSequence() || dbmeta.hasTwoOrMorePrimaryKeys() || entity.hasPrimaryKeyValue()) {
            return;
        }
        final java.math.BigDecimal sequenceValue = readNextVal();
        final String columnDbName = dbmeta.getPrimaryUniqueInfo().getFirstColumn().getColumnDbName();
        final java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        map.put(columnDbName, sequenceValue.toString());
        dbmeta.acceptPrimaryKeyMap(entity, map);
    }

    // =====================================================================================
    //                                                                            Token File
    //                                                                            ==========
    /**
     * Get the executor of token file reflection.
     * @return The executor of token file output. (NotNull)
     */
    public TokenFileReflectionExecutor tokenFileReflection() {
        return new TokenFileReflectionExecutor();
    }

    /**
     * The executor of token file reflection.
     */
    public class TokenFileReflectionExecutor {

        /**
         * Reflect(insert or update) token file to this table. <br />
         * The supported column types are String, Number and Date.
         * @param filename The name of the file. (NotNull and NotEmpty)
         * @param tokenFileReflectionOption token-file-reflection-option. (NotNull and Required{delimiter and encoding})
         * @return The result of token file reflection. (NotNull)
         * @throws java.io.FileNotFoundException The file is not found.
         * @throws java.io.IOException The IO exception occurred.
         */
        public LdTokenFileReflectionResult reflectTokenFile(String filename, LdTokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertStringNotNullAndNotTrimmedEmpty("filename", filename);
            assertFileTokenReflectionOption(tokenFileReflectionOption);

            final LdTokenFileReflectionResult result = buildTokenFileReflectionResult();
            final LdFileTokenizingCallback fileTokenizingCallback = buildFileTokenReflectionFileTokenizingCallback(tokenFileReflectionOption, result);
            final LdFileTokenizingOption fileTokenizingOption = buildFileTokenReflectionFileTokenizingOption(tokenFileReflectionOption);
            final LdFileToken fileToken = new LdFileTokenImpl();
            fileToken.tokenize(filename, fileTokenizingCallback, fileTokenizingOption);
            return result;
        }

        /**
         * Reflect(insert or update) token file to this table. <br />
         * The supported column types are String, Number and Date.
         * @param inputStream The input stream. (NotNull and NotClosed)
         * @param tokenFileReflectionOption token-file-reflection-option. (NotNull and Required{delimiter and encoding})
         * @return The result of token file reflection. (NotNull)
         * @throws java.io.FileNotFoundException The file is not found.
         * @throws java.io.IOException The IO exception occurred.
         */
        public LdTokenFileReflectionResult reflectTokenFile(java.io.InputStream inputStream, LdTokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("inputStream", inputStream);
            assertFileTokenReflectionOption(tokenFileReflectionOption);

            final LdTokenFileReflectionResult result = buildTokenFileReflectionResult();
            final LdFileTokenizingCallback fileTokenizingCallback = buildFileTokenReflectionFileTokenizingCallback(tokenFileReflectionOption, result);
            final LdFileTokenizingOption fileTokenizingOption = buildFileTokenReflectionFileTokenizingOption(tokenFileReflectionOption);
            final LdFileToken fileToken = new LdFileTokenImpl();
            fileToken.tokenize(inputStream, fileTokenizingCallback, fileTokenizingOption);
            return result;
        }

        protected void assertFileTokenReflectionOption(LdTokenFileReflectionOption tokenFileReflectionOption) {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);
        }

        protected LdTokenFileReflectionResult buildTokenFileReflectionResult() {
            final LdTokenFileReflectionResult result = new LdTokenFileReflectionResult();
            final java.util.List<LdTokenFileReflectionFailure> failureList = new java.util.ArrayList<LdTokenFileReflectionFailure>();
            result.setFailureList(failureList);
            return result;
        }

        protected LdFileTokenizingCallback buildFileTokenReflectionFileTokenizingCallback(LdTokenFileReflectionOption tokenFileReflectionOption, final LdTokenFileReflectionResult result) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            final boolean interruptIfError = tokenFileReflectionOption.isInterruptIfError();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);
            final java.util.List<LdTokenFileReflectionFailure> failureList = result.getFailureList();
            assertObjectNotNull("failureList", failureList);

            final LdFileTokenizingCallback fileTokenizingCallback = new LdFileTokenizingCallback() {
                public void handleRowResource(LdFileTokenizingRowResource fileTokenizingRowResource) {
                    final LdFileTokenizingHeaderInfo fileTokenizingHeaderInfo = fileTokenizingRowResource.getFileTokenizingHeaderInfo();
                    final java.util.List<String> columnNameList = fileTokenizingHeaderInfo.getColumnNameList();
                    final java.util.List<String> valueList = fileTokenizingRowResource.getValueList();

                    // Set up columnNameList of result object.
                    if (result.getColumnNameList() == null) {
                        result.setColumnNameList(columnNameList);
                    }

                    LdEntity entity = null;
                    try {
                        // Create entity by the list of value composed of String.
                        entity = createEntityByStringValueList(columnNameList, valueList);

                        // Create or modify as non-strict.
                        doCreateOrUpdateNonstrict(entity);

                        // Increment successCount of result object.
                        result.incrementSuccessCount();
                    } catch (RuntimeException e) {
                        if (interruptIfError) {
                            throw e;
                        }
                        final LdTokenFileReflectionFailure failure = new LdTokenFileReflectionFailure();
                        failure.setColumnNameList(columnNameList);
                        failure.setValueList(valueList);
                        failure.setRowString(fileTokenizingRowResource.getRowString());
                        failure.setRowNumber(fileTokenizingRowResource.getRowNumber());
                        failure.setLineNumber(fileTokenizingRowResource.getLineNumber());
                        if (entity != null) {
                            failure.setEntity(entity);
                        }
                        failure.setException(e);
                        failureList.add(failure);
                    }
                }
            };
            return fileTokenizingCallback;
        }

        protected LdEntity createEntityByStringValueList(java.util.List<String> columnNameList, java.util.List<String> valueList) {
            final LdMapStringBuilder builder = new LdMapStringBuilderImpl();
            builder.setMsMapMark(MAP_STRING_MAP_MARK);
            builder.setMsStartBrace(MAP_STRING_START_BRACE);
            builder.setMsEndBrace(MAP_STRING_END_BRACE);
            builder.setMsDelimiter(MAP_STRING_DELIMITER);
            builder.setMsEqual(MAP_STRING_EQUAL);
            builder.setColumnNameList(columnNameList);
            final String mapString = builder.buildFromList(valueList);

            final LdEntity entity = getDBMeta().newEntity();
            getDBMeta().acceptColumnValueMapString(entity, mapString);
            return entity;
        }

        protected LdFileTokenizingOption buildFileTokenReflectionFileTokenizingOption(LdTokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);

            final LdFileTokenizingOption fileTokenizingOption = new LdFileTokenizingOption();
            fileTokenizingOption.setEncoding(encoding);
            fileTokenizingOption.setDelimiter(delimiter);
            if (tokenFileReflectionOption.isHandleEmptyAsNull()) {
                fileTokenizingOption.handleEmptyAsNull();
            }
            return fileTokenizingOption;
        }
    }

    // =====================================================================================
    //                                                                       Delegate Method
    //                                                                       ===============
    // -----------------------------------------------------
    //                                                Insert
    //                                                ------
    /**
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Inserted count.
     */
    protected int callCreate(LdEntity entity) {
        if (!processBeforeInsert(entity)) { return 1;/*as Normal End*/ }
        return doCallCreate(entity);
    }
    protected abstract int doCallCreate(LdEntity entity);

    /**
     * Process before insert.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeInsert(LdEntity entity) {
        if (!determineExecuteInsert(entity)) { return false; }
        assertEntityNotNull(entity);// If this table use identity, the entity does not have primary-key.
        frameworkFilterEntityOfInsert(entity);
        filterEntityOfInsert(entity);
        assertEntityOfInsert(entity);
        return true;
    }

    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    /**
     * {modified only}
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Updated count.
     */
    protected int callModify(LdEntity entity) {
        if (!processBeforeUpdate(entity)) { return 1;/*as Normal End*/ }
        return doCallModify(entity);
    }
    protected abstract int doCallModify(LdEntity entity);

    /**
     * Process before update.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeUpdate(LdEntity entity) {
        if (!determineExecuteUpdate(entity)) { return false; }
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        frameworkFilterEntityOfUpdate(entity);
        filterEntityOfUpdate(entity);
        assertEntityOfUpdate(entity);
        return true;
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    /**
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Deleted count.
     */
    protected int callRemove(LdEntity entity) {
        if (!processBeforeDelete(entity)) { return 1;/*as Normal End*/ }
        return doCallRemove(entity);
    }
    protected abstract int doCallRemove(LdEntity entity);

    /**
     * Process before delete.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeDelete(LdEntity entity) {
        if (!determineExecuteDelete(entity)) { return false; }
        assertEntityNotNullAndHasPrimaryKeyValue(entity);
        frameworkFilterEntityOfDelete(entity);
        filterEntityOfDelete(entity);
        assertEntityOfDelete(entity);
        return true;
    }

    // -----------------------------------------------------
    //                                    Pre-Process Insert
    //                                    ------------------
    /**
     * Determine execution of insert.
     * @param entity Entity. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean determineExecuteInsert(LdEntity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of insert.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfInsert(LdEntity targetEntity) {
        injectSequenceToPrimaryKeyIfNeeds(targetEntity);
        setupCommonColumnOfInsertIfNeeds(targetEntity);
    }

    /**
     * Set up common columns of insert if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void setupCommonColumnOfInsertIfNeeds(LdEntity targetEntity) {
        final LdCommonColumnAutoSetupper setupper = getCommonColumnAutoSetupper();
        assertCommonColumnAutoSetupperNotNull();
        setupper.handleCommonColumnOfInsertIfNeeds(targetEntity);
    }

    private void assertCommonColumnAutoSetupperNotNull() {
        if (_commonColumnAutoSetupper == null) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "Not found the auto set-upper of common column as behavior's attribute!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the definition of the set-upper at your component configuration of DBFlute." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Your Behavior's Attributes]" + getLineSeparator();
            msg = msg + "  _behaviorCommandInvoker   : " + _behaviorCommandInvoker + getLineSeparator();
            msg = msg + "  _behaviorSelector         : " + _behaviorSelector + getLineSeparator();
            msg = msg + "  _commonColumnAutoSetupper : " + _commonColumnAutoSetupper + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalStateException(msg);
        }
    }

    /**
     * Filter the entity of insert.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfInsert(LdEntity targetEntity) {
    }

    /**
     * Assert the entity of insert.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfInsert(LdEntity entity) {
    }

    // -----------------------------------------------------
    //                                    Pre-Process Update
    //                                    ------------------
    /**
     * Determine execution of update.
     * @param entity Entity. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean determineExecuteUpdate(LdEntity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of update.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfUpdate(LdEntity targetEntity) {
        setupCommonColumnOfUpdateIfNeeds(targetEntity);
    }

    /**
     * Set up common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void setupCommonColumnOfUpdateIfNeeds(LdEntity targetEntity) {
        final LdCommonColumnAutoSetupper setupper = getCommonColumnAutoSetupper();
        assertCommonColumnAutoSetupperNotNull();
        setupper.handleCommonColumnOfUpdateIfNeeds(targetEntity);
    }
    
    /**
     * Filter the entity of update.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfUpdate(LdEntity targetEntity) {
    }

    /**
     * Assert the entity of update.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfUpdate(LdEntity entity) {
    }

    // -----------------------------------------------------
    //                                    Pre-Process Delete
    //                                    ------------------
    /**
     * Determine execution of delete.
     * @param entity Entity. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean determineExecuteDelete(LdEntity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of delete.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfDelete(LdEntity targetEntity) {
    }
    
    /**
     * Filter the entity of delete.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfDelete(LdEntity targetEntity) {
    }

    /**
     * Assert the entity of delete.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfDelete(LdEntity entity) {
    }

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Inserted count.
     */
    protected int[] callCreateList(List<LdEntity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeInsertInternally(entityList);
        return doCreateList(entityList);
    }
    protected abstract int[] doCreateList(List<LdEntity> entityList);

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Updated count.
     */
    protected int[] callModifyList(List<LdEntity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeUpdateInternally(entityList);
        return doModifyList(entityList);
    }
    protected abstract int[] doModifyList(List<LdEntity> entityList);

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Deleted count.
     */
    protected int[] callRemoveList(List<LdEntity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeDeleteInternally(entityList);
        return doRemoveList(entityList);
    }
    protected abstract int[] doRemoveList(List<LdEntity> entityList);

    protected void assertEntityHasVersionNoValue(LdEntity entity) {
        if (!getDBMeta().hasVersionNo()) {
            return;
        }
        if (hasVersionNoValue(entity)) {
            return;
        }
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The value of 'version no' on the entity was Not Found!" + getLineSeparator() + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the existence of the value of 'version no' on the entity." + getLineSeparator();
        msg = msg + "You called the method in which the check for optimistic lock is indispensable. " + getLineSeparator();
        msg = msg + "So 'version no' is required on the entity. " + getLineSeparator();
        msg = msg + "In addition, please confirm the necessity of optimistic lock. It might possibly be unnecessary." + getLineSeparator() + getLineSeparator();
        msg = msg + "[Entity]" + getLineSeparator();
        msg = msg + "entity to string = " + entity + getLineSeparator();
        msg = msg + "entity to map    = " + entity.getDBMeta().convertToColumnValueMap(entity) + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new OptimisticLockColumnValueNullException(msg);
    }

    protected void assertEntityHasUpdateDateValue(LdEntity entity) {
        if (!getDBMeta().hasUpdateDate()) {
            return;
        }
        if (hasUpdateDateValue(entity)) {
            return;
        }
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The value of 'update date' on the entity was Not Found!" + getLineSeparator() + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the existence of the value of 'update date' on the entity." + getLineSeparator();
        msg = msg + "You called the method in which the check for optimistic lock is indispensable. " + getLineSeparator();
        msg = msg + "So 'update date' is required on the entity. " + getLineSeparator();
        msg = msg + "In addition, please confirm the necessity of optimistic lock. It might possibly be unnecessary." + getLineSeparator() + getLineSeparator();
        msg = msg + "[Entity]" + getLineSeparator();
        msg = msg + "entity to string = " + entity + getLineSeparator();
        msg = msg + "entity to map    = " + entity.getDBMeta().convertToColumnValueMap(entity) + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new OptimisticLockColumnValueNullException(msg);
    }

    public static class OptimisticLockColumnValueNullException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public OptimisticLockColumnValueNullException(String msg) {
            super(msg);
        }
    }

    // ===================================================================================
    //                                                     Delegate Method Internal Helper
    //                                                     ===============================
    protected <ENTITY extends LdEntity> List<ENTITY> helpFilterBeforeInsertInternally(List<ENTITY> entityList) {
        final List<ENTITY> filteredList = new ArrayList<ENTITY>();
        for (final Iterator<ENTITY> ite = entityList.iterator(); ite.hasNext(); ) {
            final ENTITY entity = ite.next();
            if (!processBeforeInsert(entity)) { continue; }
            filteredList.add(entity);
        }
        return filteredList;
    }

    protected <ENTITY extends LdEntity> List<ENTITY> helpFilterBeforeUpdateInternally(List<ENTITY> entityList) {
        final List<ENTITY> filteredList = new ArrayList<ENTITY>();
        for (final Iterator<ENTITY> ite = entityList.iterator(); ite.hasNext(); ) {
            final ENTITY entity = ite.next();
            if (!processBeforeUpdate(entity)) { continue; }
            filteredList.add(entity);
        }
        return filteredList;
    }

    protected <ENTITY extends LdEntity> List<ENTITY> helpFilterBeforeDeleteInternally(List<ENTITY> entityList) {
        final List<ENTITY> filteredList = new ArrayList<ENTITY>();
        for (final Iterator<ENTITY> ite = entityList.iterator(); ite.hasNext(); ) {
            final ENTITY entity = ite.next();
            if (!processBeforeDelete(entity)) { continue; }
            filteredList.add(entity);
        }
        return filteredList;
    }
    
    // ===================================================================================
    //                                                                    Behavior Command
    //                                                                    ================
    protected LdInsertEntityCommand createInsertEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createInsertEntityCommand");
        return xsetupEntityCommand(new LdInsertEntityCommand(), entity);
    }

    protected LdUpdateEntityCommand createUpdateEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createUpdateEntityCommand");
        return xsetupEntityCommand(new LdUpdateEntityCommand(), entity);
    }

    protected LdUpdateNonstrictEntityCommand createUpdateNonstrictEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createUpdateNonstrictEntityCommand");
        return xsetupEntityCommand(new LdUpdateNonstrictEntityCommand(), entity);
    }

    protected LdDeleteEntityCommand createDeleteEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createDeleteEntityCommand");
        return xsetupEntityCommand(new LdDeleteEntityCommand(), entity);
    }

    protected LdDeleteNonstrictEntityCommand createDeleteNonstrictEntityCommand(LdEntity entity) {
        assertBehaviorCommandInvoker("createDeleteNonstrictEntityCommand");
        return xsetupEntityCommand(new LdDeleteNonstrictEntityCommand(), entity);
    }

    private <COMMAND extends LdAbstractEntityCommand> COMMAND xsetupEntityCommand(COMMAND command, LdEntity entity) {
        command.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setEntityType(entity.getClass());
        command.setEntity(entity);
        return command;
    }

    protected LdBatchInsertEntityCommand createBatchInsertEntityCommand(List<? extends LdEntity> entityList) {
        assertBehaviorCommandInvoker("createBatchInsertEntityCommand");
        return xsetupListEntityCommand(new LdBatchInsertEntityCommand(), entityList);
    }

    protected LdBatchUpdateEntityCommand createBatchUpdateEntityCommand(List<? extends LdEntity> entityList) {
        assertBehaviorCommandInvoker("createBatchUpdateEntityCommand");
        return xsetupListEntityCommand(new LdBatchUpdateEntityCommand(), entityList);
    }

    protected LdBatchUpdateNonstrictEntityCommand createBatchUpdateNonstrictEntityCommand(List<? extends LdEntity> entityList) {
        assertBehaviorCommandInvoker("createBatchUpdateNonstrictEntityCommand");
        return xsetupListEntityCommand(new LdBatchUpdateNonstrictEntityCommand(), entityList);
    }

    protected LdBatchDeleteEntityCommand createBatchDeleteEntityCommand(List<? extends LdEntity> entityList) {
        assertBehaviorCommandInvoker("createBatchDeleteEntityCommand");
        return xsetupListEntityCommand(new LdBatchDeleteEntityCommand(), entityList);
    }

    protected LdBatchDeleteNonstrictEntityCommand createBatchDeleteNonstrictEntityCommand(List<? extends LdEntity> entityList) {
        assertBehaviorCommandInvoker("createBatchDeleteNonstrictEntityCommand");
        return xsetupListEntityCommand(new LdBatchDeleteNonstrictEntityCommand(), entityList);
    }

    /**
     * @param <COMMAND> The type of behavior command for list entity.
     * @param command The command of behavior. (NotNull)
     * @param entityList The list of entity. (NotNull, NotEmpty)
     * @return The command of behavior. (NotNull)
     */
    private <COMMAND extends LdAbstractListEntityCommand> COMMAND xsetupListEntityCommand(COMMAND command, List<? extends LdEntity> entityList) {
        if (entityList.isEmpty()) {
            String msg = "The argument 'entityList' should not be empty: " + entityList;
            throw new IllegalStateException(msg);
        }
        command.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setEntityType(entityList.get(0).getClass()); // *The list should not be empty!
        command.setEntityList(entityList);
        return command;
    }

    protected LdQueryDeleteCBCommand createQueryDeleteCBCommand(LdConditionBean cb) {
        assertBehaviorCommandInvoker("createQueryDeleteCBCommand");
        final LdQueryDeleteCBCommand cmd = new LdQueryDeleteCBCommand();
        cmd.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(cmd);
        cmd.setConditionBeanType(cb.getClass());
        cmd.setConditionBean(cb);
        return cmd;
    }

    protected LdQueryUpdateEntityCBCommand createQueryUpdateEntityCBCommand(LdEntity entity, LdConditionBean cb) {
        assertBehaviorCommandInvoker("createQueryUpdateEntityCBCommand");
        final LdQueryUpdateEntityCBCommand cmd = new LdQueryUpdateEntityCBCommand();
        cmd.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(cmd);
        cmd.setConditionBeanType(cb.getClass());
        cmd.setConditionBean(cb);
        cmd.setEntityType(entity.getClass());
        cmd.setEntity(entity);
        return cmd;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the auto set-upper of common column.
     * @return The auto set-upper of common column. (Nullable: But normally NotNull)
     */
    protected LdCommonColumnAutoSetupper getCommonColumnAutoSetupper() {
        return _commonColumnAutoSetupper;
    }

    /**
     * Set the auto set-upper of common column.
     * @param commonColumnAutoSetupper The auto set-upper of common column. (NotNull)
     */
    public void setCommonColumnAutoSetupper(LdCommonColumnAutoSetupper commonColumnAutoSetupper) {
        this._commonColumnAutoSetupper = commonColumnAutoSetupper;
    }
}
