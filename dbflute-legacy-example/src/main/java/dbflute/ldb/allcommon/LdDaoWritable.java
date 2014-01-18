package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.LdEntity;

/**
 * The interface of dao-writable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdDaoWritable extends LdDaoReadable {

    /**
     * Insert one entity that the type is entity-interface.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int create(LdEntity entity);

    /**
     * Update one entity that the type is entity-interface.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int modify(LdEntity entity);

    /**
     * Delete one entity that the type is entity-interface.
     * 
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int remove(LdEntity entity);

    /**
     * Insert several entities that the type is entity-interface.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int createList(java.util.List<LdEntity> entityList);

    /**
     * Update several entities that the type is entity-interface.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int modifyList(java.util.List<LdEntity> entityList);

    /**
     * Delete several entities that the type is entity-interface.
     * 
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int removeList(java.util.List<LdEntity> entityList);
}
