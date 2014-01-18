/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption.parts;


/**
 * The class of condition-option-parts about toUpperCase/toLowerCase.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdToUpperLowerCaseOptionParts {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected boolean _toUpperCase;
    protected boolean _toLowerCase;

    // =====================================================================================
    //                                                                                  Main
    //                                                                                  ====
    public void toUpperCase() {
        _toUpperCase = true;
        _toLowerCase = false;
    }

    public void toLowerCase() {
        _toUpperCase = false;
        _toLowerCase = true;
    }

    // =====================================================================================
    //                                                                            Real Value
    //                                                                            ==========
    public String generateRealValue(String value) {
        if (value == null) {
            return value;
        }

        // To Upper/Lower Case
        if (_toUpperCase) {
            value = (value != null ? value.toUpperCase() : value);
        }
        if (_toLowerCase) {
            value = (value != null ? value.toLowerCase() : value);
        }
        return value;
    }

    // =====================================================================================
    //                                                                              DeepCopy
    //                                                                              ========
    public Object createDeepCopy() {
        final LdToUpperLowerCaseOptionParts deepCopy = new LdToUpperLowerCaseOptionParts();
        deepCopy._toUpperCase = _toUpperCase;
        deepCopy._toLowerCase = _toLowerCase;
        return deepCopy;
    }
}
