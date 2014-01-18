/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

/**
 * The interface of entity defined common column.
 * @author DBFlute(AutoGenerator)
 */
public interface LdEntityDefinedCommonColumn extends LdEntity {

    /**
     * Get the value of rUser.
     * @return The value of rUser. (Nullable)
     */
    public String getRUser();

    /**
     * Set the value of rUser.
     * @param rUser The value of rUser. (Nullable)
     */
    public void setRUser(String rUser);

    /**
     * Get the value of rModule.
     * @return The value of rModule. (Nullable)
     */
    public String getRModule();

    /**
     * Set the value of rModule.
     * @param rModule The value of rModule. (Nullable)
     */
    public void setRModule(String rModule);

    /**
     * Get the value of rTimestamp.
     * @return The value of rTimestamp. (Nullable)
     */
    public java.sql.Timestamp getRTimestamp();

    /**
     * Set the value of rTimestamp.
     * @param rTimestamp The value of rTimestamp. (Nullable)
     */
    public void setRTimestamp(java.sql.Timestamp rTimestamp);

    /**
     * Get the value of uUser.
     * @return The value of uUser. (Nullable)
     */
    public String getUUser();

    /**
     * Set the value of uUser.
     * @param uUser The value of uUser. (Nullable)
     */
    public void setUUser(String uUser);

    /**
     * Get the value of uModule.
     * @return The value of uModule. (Nullable)
     */
    public String getUModule();

    /**
     * Set the value of uModule.
     * @param uModule The value of uModule. (Nullable)
     */
    public void setUModule(String uModule);

    /**
     * Get the value of uTimestamp.
     * @return The value of uTimestamp. (Nullable)
     */
    public java.sql.Timestamp getUTimestamp();

    /**
     * Set the value of uTimestamp.
     * @param uTimestamp The value of uTimestamp. (Nullable)
     */
    public void setUTimestamp(java.sql.Timestamp uTimestamp);

    /**
	 * Enable common column auto set up. {for after disable because the default is enabled}
	 */
    public void enableCommonColumnAutoSetup();

    /**
	 * Disable common column auto set up.
	 */
    public void disableCommonColumnAutoSetup();
	
    /**
	 * Can the entity set up common column by auto?
	 * @return Determination.
	 */
	public boolean canCommonColumnAutoSetup();
}
