/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption.parts.local;


import dbflute.ldb.allcommon.helper.character.LdJapaneseCharacter;
import dbflute.ldb.allcommon.helper.character.impl.LdJapaneseCharacterImpl;

/**
 * The class of condition-option-parts-agent.
 * @author DBFlute(AutoGenerator)
 */
public class LdJapaneseOptionPartsAgent {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected boolean _toDoubleByteKatakana;
    protected boolean _removeLastLongVowel;
    private LdJapaneseCharacter _japaneseCharacter;

    // =====================================================================================
    //                                                                                  Main
    //                                                                                  ====
    public boolean isToDoubleByteKatakana() {
        return _toDoubleByteKatakana;
    }

    public void toDoubleByteKatakana() {
        _toDoubleByteKatakana = true;
    }

    public boolean isRemoveLastLongVowel() {
        return _removeLastLongVowel;
    }
    public void removeLastLongVowel() {
        _removeLastLongVowel = true;
    }

    // =====================================================================================
    //                                                                            Real Value
    //                                                                            ==========
    public String generateRealValue(String value) {
        if (value == null) {
            return value;
        }

        // To Double Byte
        if (_toDoubleByteKatakana) {
            value = getJapaneseCharacter().toDoubleByteKatakana(value);
        }

        // Remove
        if (_removeLastLongVowel) {
            if (value != null && value.endsWith("\u30fc")) {
                value = value.substring(0, value.length() - "\u30fc".length());
            }
        }
        return value;
    }

    // =====================================================================================
    //                                                                                Helper
    //                                                                                ======
    protected LdJapaneseCharacter getJapaneseCharacter() {
        if (_japaneseCharacter == null) {
            _japaneseCharacter = new LdJapaneseCharacterImpl();
        }
        return _japaneseCharacter;
    }

    // =====================================================================================
    //                                                                              DeepCopy
    //                                                                              ========
    public Object createDeepCopy() {
        final LdJapaneseOptionPartsAgent deepCopy = new LdJapaneseOptionPartsAgent();
        deepCopy._toDoubleByteKatakana = _toDoubleByteKatakana;
        deepCopy._removeLastLongVowel = _removeLastLongVowel;
        return deepCopy;
    }
}
