/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.util;

import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdSimpleStringUtil {

    protected static final String[] EMPTY_STRINGS = new String[0];

    // ===================================================================================
    //                                                                             Replace
    //                                                                             =======
    public static String replace(String text, String fromText, String toText) {
        if(text == null || fromText == null || toText == null) {
            return null;
		}
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        int pos2 = 0;
        do {
            pos = text.indexOf(fromText, pos2);
            if(pos == 0) {
                sb.append(toText);
                pos2 = fromText.length();
            } else
            if(pos > 0) {
                sb.append(text.substring(pos2, pos));
                sb.append(toText);
                pos2 = pos + fromText.length();
            } else {
                sb.append(text.substring(pos2));
                return sb.toString();
            }
        } while(true);
    }

    // ===================================================================================
    //                                                                               Split
    //                                                                               =====
    public static String[] split(final String str, final String delimiter) {
        if (str == null || str.trim().length() == 0) {
            return EMPTY_STRINGS;
        }
        final List<String> list = new ArrayList<String>();
        final StringTokenizer st = new StringTokenizer(str, delimiter);
        while (st.hasMoreElements()) {
            list.add(st.nextToken());
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    // ===================================================================================
    //                                                                     Initial Convert
    //                                                                     ===============
    public static String initCap(String str) {
	    assertObjectNotNull("str", str);
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
	
    public static String initUncap(String str) {
	    assertObjectNotNull("str", str);
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected static void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }
}
