/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption.parts;


import dbflute.ldb.allcommon.helper.character.LdGeneralCharacter;
import dbflute.ldb.allcommon.helper.character.impl.LdGeneralCharacterImpl;

/**
 * The interface of condition-option.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdToSingleByteOptionParts {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected boolean _toSingleByteSpace;
    protected boolean _toSingleByteAlphabetNumber;
    protected boolean _toSingleByteAlphabetNumberMark;

    private LdGeneralCharacter _generalCharacter;

    // =====================================================================================
    //                                                                                  Main
    //                                                                                  ====
    public boolean isToSingleByteSpace() {
        return _toSingleByteSpace;
    }
    public void toSingleByteSpace() {
        _toSingleByteSpace = true;
    }

    public void toSingleByteAlphabetNumber() {
        _toSingleByteAlphabetNumber = true;
    }

    public void toSingleByteAlphabetNumberMark() {
        _toSingleByteAlphabetNumberMark = true;
    }

    // =====================================================================================
    //                                                                            Real Value
    //                                                                            ==========
    public String generateRealValue(String value) {
        if (value == null) {
            return value;
        }

        // To Single Byte
        if (_toSingleByteSpace) {
            value = (value != null ? value.replaceAll("\u3000", " ") : value);
        }
        if (_toSingleByteAlphabetNumberMark) {
            value = getGeneralCharacter().toSingleByteAlphabetNumberMark(value);
        } else if (_toSingleByteAlphabetNumber) {
            value = getGeneralCharacter().toSingleByteAlphabetNumber(value);
        }
        return value;
    }

    // =====================================================================================
    //                                                                                Helper
    //                                                                                ======
    protected LdGeneralCharacter getGeneralCharacter() {
        if (_generalCharacter == null) {
            _generalCharacter = new LdGeneralCharacterImpl();
        }
        return _generalCharacter;
    }

    // =====================================================================================
    //                                                                              DeepCopy
    //                                                                              ========
    public Object createDeepCopy() {
        final LdToSingleByteOptionParts deepCopy = new LdToSingleByteOptionParts();
        deepCopy._toSingleByteSpace = _toSingleByteSpace;
        deepCopy._toSingleByteAlphabetNumber = _toSingleByteAlphabetNumber;
        deepCopy._toSingleByteAlphabetNumberMark = _toSingleByteAlphabetNumberMark;
        return deepCopy;
    }
}
