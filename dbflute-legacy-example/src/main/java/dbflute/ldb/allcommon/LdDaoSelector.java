package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;

/**
 * The interface of dao-selector.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdDaoSelector {

	/**
	 * Get dao-readable by dao type.
	 * 
	 * @param daoType Dao type. (NotNull)
	 * @return Dao-readable. (NotNull)
	 */
	public LdDaoReadable getRDao(Class daoType);

	/**
	 * Get dao-readable by entity.
	 * 
	 * @param entity Entity. (NotNull)
	 * @return Dao-readable. (NotNull)
	 */
	public LdDaoReadable getRDao(LdEntity entity);

    /**
     * Get dao-readable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getRDao(String tableMultiName);

	/**
	 * Get dao-writable by dao type.
	 * 
	 * @param daoType Dao type. (NotNull)
	 * @return Dao-writable. (NotNull)
	 */
	public LdDaoWritable getWDao(Class daoType);

	/**
	 * Get dao-writable by entity.
	 * 
	 * @param entity Entity. (NotNull)
	 * @return Dao-writable. (NotNull)
	 */
	public LdDaoWritable getWDao(LdEntity entity);

    /**
     * Get dao-writable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Dao-writable. (NotNull)
     */
    public LdDaoReadable getWDao(String tableMultiName);

	/**
	 * Get bhv-readable by bhv type.
	 * 
	 * @param bhvType Bhv type. (NotNull)
	 * @return Bhv-readable. (NotNull)
	 */
	public LdBehaviorReadable getRBhv(Class bhvType);

	/**
	 * Get bhv-readable by entity.
	 * 
	 * @param entity Entity. (NotNull)
	 * @return Bhv-readable. (NotNull)
	 */
	public LdBehaviorReadable getRBhv(LdEntity entity);

    /**
     * Get bhv-readable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Bhv-readable. (NotNull)
     */
    public LdBehaviorReadable getRBhv(String tableMultiName);

	/**
	 * Get bhv-writable by bhv type.
	 * 
	 * @param bhvType Bhv type. (NotNull)
	 * @return Bhv-writable. (NotNull)
	 */
	public LdBehaviorWritable getWBhv(Class bhvType);

	/**
	 * Get bhv-writable by entity.
	 * 
	 * @param entity Entity. (NotNull)
	 * @return Bhv-writable. (NotNull)
	 */
	public LdBehaviorWritable getWBhv(LdEntity entity);

    /**
     * Get bhv-writable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Bhv-writable. (NotNull)
     */
    public LdBehaviorWritable getWBhv(String tableMultiName);
}
