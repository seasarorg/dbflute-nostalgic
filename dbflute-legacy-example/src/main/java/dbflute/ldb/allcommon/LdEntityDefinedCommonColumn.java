package dbflute.ldb.allcommon;

/**
 * The interface of entity defined common column.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface LdEntityDefinedCommonColumn extends LdEntity {

    /**
     * Get the value of rTime.
     * 
     * @return The value of rTime.
     */
    public java.sql.Timestamp getRTime();

    /**
     * Set the value of rTime.
     * 
     * @param v The value of rTime.
     */
    public void setRTime(java.sql.Timestamp v);

    /**
     * Has the setter of rTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRTime();
  
    /**
     * Get the value of uTime.
     * 
     * @return The value of uTime.
     */
    public java.sql.Timestamp getUTime();

    /**
     * Set the value of uTime.
     * 
     * @param v The value of uTime.
     */
    public void setUTime(java.sql.Timestamp v);

    /**
     * Has the setter of uTime been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUTime();
  
    /**
     * Get the value of rStaff.
     * 
     * @return The value of rStaff.
     */
    public String getRStaff();

    /**
     * Set the value of rStaff.
     * 
     * @param v The value of rStaff.
     */
    public void setRStaff(String v);

    /**
     * Has the setter of rStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedRStaff();
      
    /**
     * Classify the value of rStaff as Administrator.
     */
    public void classifyRStaffAdministrator();

    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministrator();

    /**
     * Is the value of rStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffAdministratorIfNullException();
    
    /**
     * Classify the value of rStaff as User.
     */
    public void classifyRStaffUser();

    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUser();

    /**
     * Is the value of rStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUserIfNullException();
    
    /**
     * Classify the value of rStaff as UtterStranger.
     */
    public void classifyRStaffUtterStranger();

    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStranger();

    /**
     * Is the value of rStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isRStaffUtterStrangerIfNullException();
      
    /**
     * Get the value of uStaff.
     * 
     * @return The value of uStaff.
     */
    public String getUStaff();

    /**
     * Set the value of uStaff.
     * 
     * @param v The value of uStaff.
     */
    public void setUStaff(String v);

    /**
     * Has the setter of uStaff been invoked?
     * 
     * @return Determination.
     */
    public boolean isSetterInvokedUStaff();
      
    /**
     * Classify the value of uStaff as Administrator.
     */
    public void classifyUStaffAdministrator();

    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministrator();

    /**
     * Is the value of uStaff 'Administrator'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffAdministratorIfNullException();
    
    /**
     * Classify the value of uStaff as User.
     */
    public void classifyUStaffUser();

    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUser();

    /**
     * Is the value of uStaff 'User'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUserIfNullException();
    
    /**
     * Classify the value of uStaff as UtterStranger.
     */
    public void classifyUStaffUtterStranger();

    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method returns false!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStranger();

    /**
     * Is the value of uStaff 'UtterStranger'?
     * The difference of capital letters and small letters is NOT distinguished.
     * If the value is null, this method throws exception!
     * 
     * @return Determanation.
     */
    public boolean isUStaffUtterStrangerIfNullException();
      
    /**
     * Extract common-column-value map-string.
     * 
     * @return Common-column-value map-string. (NotNull)
     */
    public String extractCommonColumnValueMapString();
}
