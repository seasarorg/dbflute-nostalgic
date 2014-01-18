/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption;


/**
 * The option of date-from-to.
 * <pre>
 * ex) fromDate:{2007/04/10 08:24:53} toDate:{2007/04/16 14:36:29}
 *
 *   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 *   new LdDateFromToOption(); 
 *     --&gt; column &gt;= '2007/04/10 00:00:00' and column &lt; '2007/04/17 00:00:00'
 *   - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 * 
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LdDateFromToOption extends LdFromToOption {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdDateFromToOption() {
        compareAsDate();
    }
}
