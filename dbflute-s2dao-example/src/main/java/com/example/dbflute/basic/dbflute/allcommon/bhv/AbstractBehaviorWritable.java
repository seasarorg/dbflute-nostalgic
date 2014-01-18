package com.example.dbflute.basic.dbflute.allcommon.bhv;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.example.dbflute.basic.dbflute.allcommon.Entity;
import com.example.dbflute.basic.dbflute.allcommon.CommonColumnAutoSetupper;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.AbstractEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.AbstractListEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.InsertEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.UpdateEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.UpdateNonstrictEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.DeleteEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.DeleteNonstrictEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.BatchInsertEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.BatchUpdateEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.BatchUpdateNonstrictEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.BatchDeleteEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.BatchDeleteNonstrictEntityCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.QueryDeleteCBCommand;
import com.example.dbflute.basic.dbflute.allcommon.bhv.core.command.QueryUpdateEntityCBCommand;
import com.example.dbflute.basic.dbflute.allcommon.cbean.ConditionBean;
import com.example.dbflute.basic.dbflute.allcommon.dbmeta.DBMeta;
import com.example.dbflute.basic.dbflute.allcommon.helper.MapStringBuilder;
import com.example.dbflute.basic.dbflute.allcommon.helper.MapStringBuilderImpl;

import com.example.dbflute.basic.dbflute.allcommon.bhv.batch.TokenFileReflectionOption;
import com.example.dbflute.basic.dbflute.allcommon.bhv.batch.TokenFileReflectionResult;
import com.example.dbflute.basic.dbflute.allcommon.bhv.batch.TokenFileReflectionFailure;

import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.FileToken;
import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.FileTokenizingCallback;
import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.FileTokenizingRowResource;
import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.FileTokenizingHeaderInfo;
import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.FileTokenizingOption;
import com.example.dbflute.basic.dbflute.allcommon.helper.token.file.impl.FileTokenImpl;

/**
 * The abstract class of writable behavior.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBehaviorWritable extends AbstractBehaviorReadable implements BehaviorWritable {

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
    protected CommonColumnAutoSetupper _commonColumnAutoSetupper;

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    // -----------------------------------------------------
    //                                                Create
    //                                                ------
    /**
     * Create.
     * @param entity Entity. (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void create(Entity entity) {
        doCreate(entity);
    }

    protected abstract void doCreate(Entity entity);

    // -----------------------------------------------------
    //                                                Modify
    //                                                ------
    /**
     * Modify.
     * @param entity Entity. (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modify(Entity entity) {
        doModify(entity);
    }

    protected abstract void doModify(Entity entity);

    /**
     * Modify non strict.
     * @param entity Entity. (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modifyNonstrict(Entity entity) {
        doModifyNonstrict(entity);
    }

    protected abstract void doModifyNonstrict(Entity entity);

    // -----------------------------------------------------
    //                                      Create or Modify
    //                                      ----------------
    /**
     * {@inheritDoc}
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModify(com.example.dbflute.basic.dbflute.allcommon.Entity entity) {
        assertEntityNotNull(entity);
        doCreateOrUpdate(entity);
    }

    protected abstract void doCreateOrUpdate(Entity entity);

    /**
     * {@inheritDoc}
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModifyNonstrict(com.example.dbflute.basic.dbflute.allcommon.Entity entity) {
        assertEntityNotNull(entity);
        doCreateOrUpdateNonstrict(entity);
    }

    protected abstract void doCreateOrUpdateNonstrict(Entity entity);

    // -----------------------------------------------------
    //                                                Remove
    //                                                ------
    /**
     * Remove.
     * @param entity Entity. (NotNull)
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void remove(com.example.dbflute.basic.dbflute.allcommon.Entity entity) {
        assertEntityNotNull(entity);
        callRemove(entity);
    }

    protected abstract void doRemove(Entity entity);

    // ===================================================================================
    //                                                       Entity Update Internal Helper
    //                                                       =============================
    // -----------------------------------------------------
    //                                                Update
    //                                                ------
    protected <ENTITY extends Entity> void helpUpdateInternally(ENTITY entity, InternalUpdateCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        assertEntityHasVersionNoValue(entity);
        assertEntityHasUpdateDateValue(entity);
        final int updatedCount = callback.callbackDelegateUpdate(entity);
        if (updatedCount == 0) {
            String msg = "The entity was Not Found! it has already been deleted: entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException(msg);
        } else if (updatedCount > 1) {
            String msg = "The entity was Too Many! it has been duplicated. It should be the only one! But the updatedCount=" + updatedCount;
            msg = msg + ": entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException(msg);
        }
    }

    protected static interface InternalUpdateCallback<ENTITY extends Entity> {
        public int callbackDelegateUpdate(ENTITY entity);
    }

    protected <ENTITY extends Entity> void helpUpdateNonstrictInternally(ENTITY entity, InternalUpdateNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int updatedCount = callback.callbackDelegateUpdateNonstrict(entity);
        if (updatedCount == 0) {
            String msg = "The entity was Not Found! it has already been deleted: entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException(msg);
        } else if (updatedCount > 1) {
            String msg = "The entity was Too Many! it has been duplicated. It should be the only one! But the updatedCount=" + updatedCount;
            msg = msg + ": entity=" + entity;
        }
    }

    protected static interface InternalUpdateNonstrictCallback<ENTITY extends Entity> {
        public int callbackDelegateUpdateNonstrict(ENTITY entity);
    }

    // -----------------------------------------------------
    //                                        InsertOrUpdate
    //                                        --------------
    protected <ENTITY extends Entity, CB_TYPE extends ConditionBean>
            void helpInsertOrUpdateInternally(ENTITY entity, InternalInsertOrUpdateCallback<ENTITY, CB_TYPE> callback) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            callback.callbackInsert(entity);
        } else {
            RuntimeException exception = null;
            try {
                callback.callbackUpdate(entity);
            } catch (com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException e) {
                if (e.getRows() == 0) {
                    exception = e;
                }
            } catch (com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException e) {
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

    protected static interface InternalInsertOrUpdateCallback<ENTITY extends Entity, CB_TYPE extends ConditionBean> {
        public void callbackInsert(ENTITY entity);
        public void callbackUpdate(ENTITY entity);
        public CB_TYPE callbackNewMyConditionBean();
        public int callbackSelectCount(CB_TYPE cb);
    }

    protected <ENTITY extends Entity> void helpInsertOrUpdateInternally(ENTITY entity, InternalInsertOrUpdateNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        if (!entity.hasPrimaryKeyValue()) {
            callback.callbackInsert(entity);
        } else {
            try {
                callback.callbackUpdateNonstrict(entity);
            } catch (com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException e) {
                callback.callbackInsert(entity);
            } catch (com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException e) {
                callback.callbackInsert(entity);
            }
        }
    }

    protected static interface InternalInsertOrUpdateNonstrictCallback<ENTITY extends Entity> {
        public void callbackInsert(ENTITY entity);
        public void callbackUpdateNonstrict(ENTITY entity);
    }

    // -----------------------------------------------------
    //                                                Delete
    //                                                ------
    protected <ENTITY extends Entity> void helpDeleteInternally(ENTITY entity, InternalDeleteCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        assertEntityHasVersionNoValue(entity);
        assertEntityHasUpdateDateValue(entity);
        final int deletedCount = callback.callbackDelegateDelete(entity);
        if (deletedCount == 0) {
            String msg = "The entity was Not Found! The entity has already been deleted: entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException(msg);
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteCallback<ENTITY extends Entity> {
        public int callbackDelegateDelete(ENTITY entity);
    }

    protected <ENTITY extends Entity> void helpDeleteNonstrictInternally(ENTITY entity, InternalDeleteNonstrictCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int deletedCount = callback.callbackDelegateDeleteNonstrict(entity);
        if (deletedCount == 0) {
            String msg = "The entity was Not Found! The entity has already been deleted: entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyDeletedException(msg);
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteNonstrictCallback<ENTITY extends Entity> {
        public int callbackDelegateDeleteNonstrict(ENTITY entity);
    }

    protected <ENTITY extends Entity> void helpDeleteNonstrictIgnoreDeletedInternally(ENTITY entity, InternalDeleteNonstrictIgnoreDeletedCallback<ENTITY> callback) {
        assertEntityNotNull(entity);
        final int deletedCount = callback.callbackDelegateDeleteNonstrict(entity);
        if (deletedCount == 0) {
            return;
        } else if (deletedCount > 1) {
            String msg = "The deleted entity was duplicated. It should be the only one! But the deletedCount=" + deletedCount;
            msg = msg + ": entity=" + entity;
            throw new com.example.dbflute.basic.dbflute.allcommon.exception.EntityDuplicatedException(msg);
        }
    }

    protected static interface InternalDeleteNonstrictIgnoreDeletedCallback<ENTITY extends Entity> {
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
    public int[] lumpCreate(List<Entity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callCreateList(entityList);
    }

    /**
     * Lump Modify the list.
     * @param entityList Entity list. (NotNull and NotEmpty)
     * @return Modified count.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException If s2dao's version is over 1.0.47 (contains 1.0.47).
     */
    public int[] lumpModify(List<Entity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callModifyList(entityList);
    }

    /**
     * Lump remove the list.
     * @param entityList Entity list. (NotNull and NotEmpty)
     * @return Removed count.
     * @exception com.example.dbflute.basic.dbflute.allcommon.exception.EntityAlreadyUpdatedException If s2dao's version is over 1.0.47 (contains 1.0.47).
     */
    public int[] lumpRemove(List<Entity> entityList) {
        assertListNotNullAndNotEmpty(entityList);
        return callRemoveList(entityList);
    }

    /**
     * Inject sequence to primary key if it needs.
     * @param entity Entity. (NotNull)
     */
    protected void injectSequenceToPrimaryKeyIfNeeds(Entity entity) {
        final DBMeta dbmeta = entity.getDBMeta();
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
        public TokenFileReflectionResult reflectTokenFile(String filename, TokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertStringNotNullAndNotTrimmedEmpty("filename", filename);
            assertFileTokenReflectionOption(tokenFileReflectionOption);

            final TokenFileReflectionResult result = buildTokenFileReflectionResult();
            final FileTokenizingCallback fileTokenizingCallback = buildFileTokenReflectionFileTokenizingCallback(tokenFileReflectionOption, result);
            final FileTokenizingOption fileTokenizingOption = buildFileTokenReflectionFileTokenizingOption(tokenFileReflectionOption);
            final FileToken fileToken = new FileTokenImpl();
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
        public TokenFileReflectionResult reflectTokenFile(java.io.InputStream inputStream, TokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("inputStream", inputStream);
            assertFileTokenReflectionOption(tokenFileReflectionOption);

            final TokenFileReflectionResult result = buildTokenFileReflectionResult();
            final FileTokenizingCallback fileTokenizingCallback = buildFileTokenReflectionFileTokenizingCallback(tokenFileReflectionOption, result);
            final FileTokenizingOption fileTokenizingOption = buildFileTokenReflectionFileTokenizingOption(tokenFileReflectionOption);
            final FileToken fileToken = new FileTokenImpl();
            fileToken.tokenize(inputStream, fileTokenizingCallback, fileTokenizingOption);
            return result;
        }

        protected void assertFileTokenReflectionOption(TokenFileReflectionOption tokenFileReflectionOption) {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);
        }

        protected TokenFileReflectionResult buildTokenFileReflectionResult() {
            final TokenFileReflectionResult result = new TokenFileReflectionResult();
            final java.util.List<TokenFileReflectionFailure> failureList = new java.util.ArrayList<TokenFileReflectionFailure>();
            result.setFailureList(failureList);
            return result;
        }

        protected FileTokenizingCallback buildFileTokenReflectionFileTokenizingCallback(TokenFileReflectionOption tokenFileReflectionOption, final TokenFileReflectionResult result) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            final boolean interruptIfError = tokenFileReflectionOption.isInterruptIfError();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);
            final java.util.List<TokenFileReflectionFailure> failureList = result.getFailureList();
            assertObjectNotNull("failureList", failureList);

            final FileTokenizingCallback fileTokenizingCallback = new FileTokenizingCallback() {
                public void handleRowResource(FileTokenizingRowResource fileTokenizingRowResource) {
                    final FileTokenizingHeaderInfo fileTokenizingHeaderInfo = fileTokenizingRowResource.getFileTokenizingHeaderInfo();
                    final java.util.List<String> columnNameList = fileTokenizingHeaderInfo.getColumnNameList();
                    final java.util.List<String> valueList = fileTokenizingRowResource.getValueList();

                    // Set up columnNameList of result object.
                    if (result.getColumnNameList() == null) {
                        result.setColumnNameList(columnNameList);
                    }

                    Entity entity = null;
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
                        final TokenFileReflectionFailure failure = new TokenFileReflectionFailure();
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

        protected Entity createEntityByStringValueList(java.util.List<String> columnNameList, java.util.List<String> valueList) {
            final MapStringBuilder builder = new MapStringBuilderImpl();
            builder.setMsMapMark(MAP_STRING_MAP_MARK);
            builder.setMsStartBrace(MAP_STRING_START_BRACE);
            builder.setMsEndBrace(MAP_STRING_END_BRACE);
            builder.setMsDelimiter(MAP_STRING_DELIMITER);
            builder.setMsEqual(MAP_STRING_EQUAL);
            builder.setColumnNameList(columnNameList);
            final String mapString = builder.buildFromList(valueList);

            final Entity entity = getDBMeta().newEntity();
            getDBMeta().acceptColumnValueMapString(entity, mapString);
            return entity;
        }

        protected FileTokenizingOption buildFileTokenReflectionFileTokenizingOption(TokenFileReflectionOption tokenFileReflectionOption) throws java.io.FileNotFoundException, java.io.IOException {
            assertObjectNotNull("tokenFileReflectionOption", tokenFileReflectionOption);

            final String encoding = tokenFileReflectionOption.getEncoding();
            final String delimiter = tokenFileReflectionOption.getDelimiter();
            assertStringNotNullAndNotTrimmedEmpty("encoding", encoding);
            assertObjectNotNull("delimiter", delimiter);

            final FileTokenizingOption fileTokenizingOption = new FileTokenizingOption();
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
    protected int callCreate(Entity entity) {
        if (!processBeforeInsert(entity)) { return 1;/*as Normal End*/ }
        return doCallCreate(entity);
    }
    protected abstract int doCallCreate(Entity entity);

    /**
     * Process before insert.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeInsert(Entity entity) {
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
    protected int callModify(Entity entity) {
        if (!processBeforeUpdate(entity)) { return 1;/*as Normal End*/ }
        return doCallModify(entity);
    }
    protected abstract int doCallModify(Entity entity);

    /**
     * Process before update.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeUpdate(Entity entity) {
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
    protected int callRemove(Entity entity) {
        if (!processBeforeDelete(entity)) { return 1;/*as Normal End*/ }
        return doCallRemove(entity);
    }
    protected abstract int doCallRemove(Entity entity);

    /**
     * Process before delete.
     * @param entity Entity that the type is entity interface. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean processBeforeDelete(Entity entity) {
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
    protected boolean determineExecuteInsert(Entity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of insert.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfInsert(Entity targetEntity) {
        injectSequenceToPrimaryKeyIfNeeds(targetEntity);
        setupCommonColumnOfInsertIfNeeds(targetEntity);
    }

    /**
     * Set up common columns of insert if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void setupCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final CommonColumnAutoSetupper setupper = getCommonColumnAutoSetupper();
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
    protected void filterEntityOfInsert(Entity targetEntity) {
    }

    /**
     * Assert the entity of insert.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfInsert(Entity entity) {
    }

    // -----------------------------------------------------
    //                                    Pre-Process Update
    //                                    ------------------
    /**
     * Determine execution of update.
     * @param entity Entity. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean determineExecuteUpdate(Entity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of update.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfUpdate(Entity targetEntity) {
        setupCommonColumnOfUpdateIfNeeds(targetEntity);
    }

    /**
     * Set up common columns of update if it needs.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void setupCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final CommonColumnAutoSetupper setupper = getCommonColumnAutoSetupper();
        assertCommonColumnAutoSetupperNotNull();
        setupper.handleCommonColumnOfUpdateIfNeeds(targetEntity);
    }
    
    /**
     * Filter the entity of update.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfUpdate(Entity targetEntity) {
    }

    /**
     * Assert the entity of update.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfUpdate(Entity entity) {
    }

    // -----------------------------------------------------
    //                                    Pre-Process Delete
    //                                    ------------------
    /**
     * Determine execution of delete.
     * @param entity Entity. (NotNull)
     * @return Execution Determination. (true: execute / false: non)
     */
    protected boolean determineExecuteDelete(Entity entity) {
        return true;
    }

    /**
     * {Framework Method} Filter the entity of delete.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void frameworkFilterEntityOfDelete(Entity targetEntity) {
    }
    
    /**
     * Filter the entity of delete.
     * @param targetEntity Target entity that the type is entity interface. (NotNull)
     */
    protected void filterEntityOfDelete(Entity targetEntity) {
    }

    /**
     * Assert the entity of delete.
     * @param entity Entity that the type is entity interface. (NotNull)
     */
    protected void assertEntityOfDelete(Entity entity) {
    }

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Inserted count.
     */
    protected int[] callCreateList(List<Entity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeInsertInternally(entityList);
        return doCreateList(entityList);
    }
    protected abstract int[] doCreateList(List<Entity> entityList);

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Updated count.
     */
    protected int[] callModifyList(List<Entity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeUpdateInternally(entityList);
        return doModifyList(entityList);
    }
    protected abstract int[] doModifyList(List<Entity> entityList);

    /**
     * @param entityList Entity list that the type is entity interface. (NotNull)
     * @return Deleted count.
     */
    protected int[] callRemoveList(List<Entity> entityList) {
        assertObjectNotNull("entityList", entityList);
        helpFilterBeforeDeleteInternally(entityList);
        return doRemoveList(entityList);
    }
    protected abstract int[] doRemoveList(List<Entity> entityList);

    protected void assertEntityHasVersionNoValue(Entity entity) {
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

    protected void assertEntityHasUpdateDateValue(Entity entity) {
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
    protected <ENTITY extends Entity> List<ENTITY> helpFilterBeforeInsertInternally(List<ENTITY> entityList) {
        final List<ENTITY> filteredList = new ArrayList<ENTITY>();
        for (final Iterator<ENTITY> ite = entityList.iterator(); ite.hasNext(); ) {
            final ENTITY entity = ite.next();
            if (!processBeforeInsert(entity)) { continue; }
            filteredList.add(entity);
        }
        return filteredList;
    }

    protected <ENTITY extends Entity> List<ENTITY> helpFilterBeforeUpdateInternally(List<ENTITY> entityList) {
        final List<ENTITY> filteredList = new ArrayList<ENTITY>();
        for (final Iterator<ENTITY> ite = entityList.iterator(); ite.hasNext(); ) {
            final ENTITY entity = ite.next();
            if (!processBeforeUpdate(entity)) { continue; }
            filteredList.add(entity);
        }
        return filteredList;
    }

    protected <ENTITY extends Entity> List<ENTITY> helpFilterBeforeDeleteInternally(List<ENTITY> entityList) {
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
    protected InsertEntityCommand createInsertEntityCommand(Entity entity) {
        assertBehaviorCommandInvoker("createInsertEntityCommand");
        return xsetupEntityCommand(new InsertEntityCommand(), entity);
    }

    protected UpdateEntityCommand createUpdateEntityCommand(Entity entity) {
        assertBehaviorCommandInvoker("createUpdateEntityCommand");
        return xsetupEntityCommand(new UpdateEntityCommand(), entity);
    }

    protected UpdateNonstrictEntityCommand createUpdateNonstrictEntityCommand(Entity entity) {
        assertBehaviorCommandInvoker("createUpdateNonstrictEntityCommand");
        return xsetupEntityCommand(new UpdateNonstrictEntityCommand(), entity);
    }

    protected DeleteEntityCommand createDeleteEntityCommand(Entity entity) {
        assertBehaviorCommandInvoker("createDeleteEntityCommand");
        return xsetupEntityCommand(new DeleteEntityCommand(), entity);
    }

    protected DeleteNonstrictEntityCommand createDeleteNonstrictEntityCommand(Entity entity) {
        assertBehaviorCommandInvoker("createDeleteNonstrictEntityCommand");
        return xsetupEntityCommand(new DeleteNonstrictEntityCommand(), entity);
    }

    private <COMMAND extends AbstractEntityCommand> COMMAND xsetupEntityCommand(COMMAND command, Entity entity) {
        command.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(command);
        command.setEntityType(entity.getClass());
        command.setEntity(entity);
        return command;
    }

    protected BatchInsertEntityCommand createBatchInsertEntityCommand(List<? extends Entity> entityList) {
        assertBehaviorCommandInvoker("createBatchInsertEntityCommand");
        return xsetupListEntityCommand(new BatchInsertEntityCommand(), entityList);
    }

    protected BatchUpdateEntityCommand createBatchUpdateEntityCommand(List<? extends Entity> entityList) {
        assertBehaviorCommandInvoker("createBatchUpdateEntityCommand");
        return xsetupListEntityCommand(new BatchUpdateEntityCommand(), entityList);
    }

    protected BatchUpdateNonstrictEntityCommand createBatchUpdateNonstrictEntityCommand(List<? extends Entity> entityList) {
        assertBehaviorCommandInvoker("createBatchUpdateNonstrictEntityCommand");
        return xsetupListEntityCommand(new BatchUpdateNonstrictEntityCommand(), entityList);
    }

    protected BatchDeleteEntityCommand createBatchDeleteEntityCommand(List<? extends Entity> entityList) {
        assertBehaviorCommandInvoker("createBatchDeleteEntityCommand");
        return xsetupListEntityCommand(new BatchDeleteEntityCommand(), entityList);
    }

    protected BatchDeleteNonstrictEntityCommand createBatchDeleteNonstrictEntityCommand(List<? extends Entity> entityList) {
        assertBehaviorCommandInvoker("createBatchDeleteNonstrictEntityCommand");
        return xsetupListEntityCommand(new BatchDeleteNonstrictEntityCommand(), entityList);
    }

    /**
     * @param <COMMAND> The type of behavior command for list entity.
     * @param command The command of behavior. (NotNull)
     * @param entityList The list of entity. (NotNull, NotEmpty)
     * @return The command of behavior. (NotNull)
     */
    private <COMMAND extends AbstractListEntityCommand> COMMAND xsetupListEntityCommand(COMMAND command, List<? extends Entity> entityList) {
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

    protected QueryDeleteCBCommand createQueryDeleteCBCommand(ConditionBean cb) {
        assertBehaviorCommandInvoker("createQueryDeleteCBCommand");
        final QueryDeleteCBCommand cmd = new QueryDeleteCBCommand();
        cmd.setTableDbName(getTableDbName());
        _behaviorCommandInvoker.injectComponentProperty(cmd);
        cmd.setConditionBeanType(cb.getClass());
        cmd.setConditionBean(cb);
        return cmd;
    }

    protected QueryUpdateEntityCBCommand createQueryUpdateEntityCBCommand(Entity entity, ConditionBean cb) {
        assertBehaviorCommandInvoker("createQueryUpdateEntityCBCommand");
        final QueryUpdateEntityCBCommand cmd = new QueryUpdateEntityCBCommand();
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
    protected CommonColumnAutoSetupper getCommonColumnAutoSetupper() {
        return _commonColumnAutoSetupper;
    }

    /**
     * Set the auto set-upper of common column.
     * @param commonColumnAutoSetupper The auto set-upper of common column. (NotNull)
     */
    public void setCommonColumnAutoSetupper(CommonColumnAutoSetupper commonColumnAutoSetupper) {
        this._commonColumnAutoSetupper = commonColumnAutoSetupper;
    }
}
