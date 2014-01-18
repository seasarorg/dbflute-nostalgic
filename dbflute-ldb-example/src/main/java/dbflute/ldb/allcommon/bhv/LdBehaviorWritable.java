/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv;

import java.util.List;

import dbflute.ldb.allcommon.LdEntity;

/**
 * The interface of behavior-writable.
 * @author DBFlute(AutoGenerator)
 */
public interface LdBehaviorWritable extends LdBehaviorReadable {

    // =====================================================================================
    //                                                                   Basic Entity Update
    //                                                                   ===================
    /**
     * Create.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void create(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Modify.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modify(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Modify non-strict.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modifyNonstrict(LdEntity entity);

    /**
     * Create or modify. <br />
     * {modify: modified only} <br />
     * This method is faster than createOrModifyAfterSelect().
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModify(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Create or modify non-strict. <br />
     * {modify: modified only} <br />
     * This method is faster than createOrModifyAfterSelect().
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModifyNonstrict(dbflute.ldb.allcommon.LdEntity entity);

    /**
     * Remove.
     * @param entity Entity. (NotNull)
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyDeletedException When the entity has already been deleted.
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public void remove(dbflute.ldb.allcommon.LdEntity entity);

    // =====================================================================================
    //                                                                    Basic Batch Update
    //                                                                    ==================
    /**
     * Lump create the list.
     * @param entityList The list of entity. (NotNull and NotEmpty)
     * @return The array of created count.
     */
    public int[] lumpCreate(List<LdEntity> entityList);

    /**
     * Lump modify the list.
     * @param entityList The list of entity. (NotNull and NotEmpty)
     * @return Modified count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated. And Only when s2dao's version is over 1.0.47 (contains 1.0.47).
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public int[] lumpModify(List<LdEntity> entityList);

    /**
     * Lump remove the list.
     * @param entityList The list of entity. (NotNull and NotEmpty)
     * @return Removed count.
     * @exception dbflute.ldb.allcommon.exception.LdEntityAlreadyUpdatedException When the entity has already been updated. And Only when s2dao's version is over 1.0.47 (contains 1.0.47).
     * @exception dbflute.ldb.allcommon.exception.LdEntityDuplicatedException When the entity has been duplicated.
     */
    public int[] lumpRemove(List<LdEntity> entityList);
}
