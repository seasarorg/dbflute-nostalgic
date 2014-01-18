/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption;

import java.util.Calendar;
import java.util.Date;

import dbflute.ldb.allcommon.cbean.ckey.LdConditionKey;

/**
 * The option of from-to.
 * <pre>
 * ex) fromDate:{2007/04/10 08:24:53} toDate:{2007/04/16 14:36:29}
 *
 *   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 *   new LdFromToOption().compareAsDate(); 
 *     --&gt; column &gt;= '2007/04/10 00:00:00' and column &lt; '2007/04/17 00:00:00'
 *   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 *
 *   new LdFromToOption(); 
 *     --&gt; column &gt;= '2007/04/10 08:24:53' and column &lt;= '2007/04/16 14:36:29'
 *
 *   new LdFromToOption().greaterThan(); 
 *     --&gt; column &gt; '2007/04/10 08:24:53' and column &lt;= '2007/04/16 14:36:29'
 *
 *   new LdFromToOption().lessThan(); 
 *     --&gt; column &gt;= '2007/04/10 08:24:53' and column &lt; '2007/04/16 14:36:29'
 *
 *   new LdFromToOption().greaterThan().lessThan(); 
 *     --&gt; column &gt; '2007/04/10 08:24:53' and column &lt; '2007/04/16 14:36:29'
 * 
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdFromToOption implements LdConditionOption {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected boolean _fromDateGreaterThan;

    protected boolean _toDateLessThan;

    protected boolean _compareAsDate;

    // ===================================================================================
    //                                                            Interface Implementation
    //                                                            ========================
    public String getRearOption() {
        String msg = "Thie option does not use getRearOption()!";
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    public LdFromToOption greaterThan() {
        _fromDateGreaterThan = true; return this;
    }

    public LdFromToOption lessThan() {
        _toDateLessThan = true; return this;
    }

    /**
     * Compare as date.
     * <pre>
     * ex) fromDate:{2007/04/10 08:24:53} toDate:{2007/04/16 14:36:29}
     *
     *   new LdFromToOption().compareAsDate();
     *     --&gt; column &gt;= '2007/04/10 00:00:00' and column &lt; '2007/04/17 00:00:00'
     * 
     * This method ignore greaterThan() and lessThan().
     * </pre>
     * @return this. (NotNull)
     */
    public LdFromToOption compareAsDate() {
        _compareAsDate = true; return this;
    }

    // ===================================================================================
    //                                                                       Internal Main
    //                                                                       =============
    /**
     * Filter the date as From. It requires this method is called before getFromDateConditionKey().
     * @param fromDate The date as From. (Nullable: If the value is null, it returns null)
     * @return The filtered date as From. (Nullable)
     */
    public Date filterFromDate(Date fromDate) {
        if (fromDate == null) {
            return null;
        }
        if (_compareAsDate) {
            final Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(fromDate.getTime());
            clearCalendarHourMinuteSecondMilli(cal);
            final Date cloneDate = (Date) fromDate.clone();
            cloneDate.setTime(cal.getTimeInMillis());
            return cloneDate;
        }
        return fromDate;
    }

    /**
     * Filter the date as To. It requires this method is called before getToDateConditionKey().
     * @param toDate The date as To. (Nullable: If the value is null, it returns null)
     * @return The filtered date as To. (Nullable)
     */
    public Date filterToDate(Date toDate) {
        if (toDate == null) {
            return null;
        }
        if (_compareAsDate) {
            final Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(toDate.getTime());
            clearCalendarHourMinuteSecondMilli(cal);
            addCalendarNextDay(cal);// Key Point!
            final Date cloneDate = (Date) toDate.clone();
            cloneDate.setTime(cal.getTimeInMillis());
            return cloneDate;
        }
        return toDate;
    }

    /**
     * Get the condition-key of the from-date. It requires this method is called after filterFromDate().
     * @return The condition-key of the from-date. (NotNull)
     */
    public LdConditionKey getFromDateConditionKey() {
        if (_compareAsDate) {
            return LdConditionKey.CK_GREATER_EQUAL;
        }
        if (_fromDateGreaterThan) {
            return LdConditionKey.CK_GREATER_THAN;// Default!
        } else {
            return LdConditionKey.CK_GREATER_EQUAL;// Default!
        }
    }

    /**
     * Get the condition-key of the to-date. It requires this method is called after filterToDate().
     * @return The condition-key of the to-date. (NotNull)
     */
    public LdConditionKey getToDateConditionKey() {
        if (_compareAsDate) {
            return LdConditionKey.CK_LESS_THAN;
        }
        if (_toDateLessThan) {
            return LdConditionKey.CK_LESS_THAN;// Default!
        } else {
            return LdConditionKey.CK_LESS_EQUAL;// Default!
        }
    }

    // ===================================================================================
    //                                                                     Calendar Helper
    //                                                                     ===============
    protected void addCalendarNextDay(Calendar cal) {
        cal.add(Calendar.DAY_OF_MONTH, 1);
    }

    protected void clearCalendarHourMinuteSecondMilli(Calendar cal) {
        cal.clear(Calendar.MILLISECOND);
        cal.clear(Calendar.SECOND);
        cal.clear(Calendar.MINUTE);
        cal.set(Calendar.HOUR_OF_DAY, cal.getActualMinimum(Calendar.HOUR_OF_DAY));
    }
}
