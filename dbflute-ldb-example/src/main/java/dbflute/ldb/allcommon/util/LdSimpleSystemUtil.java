/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.util;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdSimpleSystemUtil {

    // ===================================================================================
    //                                                                      Line Separator
    //                                                                      ==============
    public static String getLineSeparator() {
        // /- - - - - - - - - - - - - - - - - - - - - -
        // Because 'CR + LF' caused many trouble!
		// And Now 'LF' have little trouble. 
		// 
        // return System.getProperty("line.separator");
        // - - - - - - - - - -/
		return "\n";
    }
}
