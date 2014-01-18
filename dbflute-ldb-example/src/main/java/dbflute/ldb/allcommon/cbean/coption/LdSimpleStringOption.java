/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption;


import dbflute.ldb.allcommon.cbean.coption.parts.LdSplitOptionParts;
import dbflute.ldb.allcommon.cbean.coption.parts.LdToUpperLowerCaseOptionParts;
import dbflute.ldb.allcommon.cbean.coption.parts.LdToSingleByteOptionParts;
import dbflute.ldb.allcommon.cbean.coption.parts.local.LdJapaneseOptionPartsAgent;
import dbflute.ldb.allcommon.util.LdSimpleStringUtil;

/**
 * The class of simple-string-option.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdSimpleStringOption implements LdConditionOption {

    protected LdSplitOptionParts _splitOptionParts;
    protected LdToUpperLowerCaseOptionParts _toUpperLowerCaseOptionParts;
    protected LdToSingleByteOptionParts _toSingleByteCaseOptionParts;
    protected LdJapaneseOptionPartsAgent _japaneseOptionPartsAgent;

    // =====================================================================================
    //                                                                           Rear Option
    //                                                                           ===========
    public String getRearOption() {
        return "";
    }

    // =====================================================================================
    //                                                                                 Split
    //                                                                                 =====
    protected LdSimpleStringOption doSplitBySpace() {
        getSplitOptionParts().splitBySpace();
        return this;
    }

    protected LdSimpleStringOption doSplitBySpace(int splitLimitCount) {
        getSplitOptionParts().splitBySpace(splitLimitCount);
        return this;
    }

    protected LdSimpleStringOption doSplitBySpaceContainsDoubleByte() {
        getSplitOptionParts().splitBySpaceContainsDoubleByte();
        return this;
    }

    protected LdSimpleStringOption doSplitBySpaceContainsDoubleByte(int splitLimitCount) {
        getSplitOptionParts().splitBySpaceContainsDoubleByte(splitLimitCount);
        return this;
    }

    protected LdSimpleStringOption doSplitByPipeLine() {
        getSplitOptionParts().splitByPipeLine();
        return this;
    }

    protected LdSimpleStringOption doSplitByPipeLine(int splitLimitCount) {
        getSplitOptionParts().splitByPipeLine(splitLimitCount);
        return this;
    }

    protected LdSplitOptionParts getSplitOptionParts() {
        if (_splitOptionParts == null) {
            _splitOptionParts = new LdSplitOptionParts();
        }
        return _splitOptionParts;
    }

    public boolean isSplit() {
        return getSplitOptionParts().isSplit();
    }

    public String[] generateSplitValueArray(String value) {
        return getSplitOptionParts().generateSplitValueArray(value);
    }

    // =====================================================================================
    //                                                                   To Upper/Lower Case
    //                                                                   ===================
    protected LdSimpleStringOption doToUpperCase() {
        getToUpperLowerCaseOptionParts().toUpperCase();
        return this;
    }

    protected LdSimpleStringOption doToLowerCase() {
        getToUpperLowerCaseOptionParts().toLowerCase();
        return this;
    }

    protected LdToUpperLowerCaseOptionParts getToUpperLowerCaseOptionParts() {
        if (_toUpperLowerCaseOptionParts == null) {
            _toUpperLowerCaseOptionParts = new LdToUpperLowerCaseOptionParts();
        }
        return _toUpperLowerCaseOptionParts;
    }

    // =====================================================================================
    //                                                                        To Single Byte
    //                                                                        ==============
    protected LdSimpleStringOption doToSingleByteSpace() {
        getToSingleByteOptionParts().toSingleByteSpace();
        return this;
    }

    protected LdSimpleStringOption doToSingleByteAlphabetNumber() {
        getToSingleByteOptionParts().toSingleByteAlphabetNumber();
        return this;
    }

    protected LdSimpleStringOption doToSingleByteAlphabetNumberMark() {
        getToSingleByteOptionParts().toSingleByteAlphabetNumberMark();
        return this;
    }

    protected LdToSingleByteOptionParts getToSingleByteOptionParts() {
        if (_toSingleByteCaseOptionParts == null) {
            _toSingleByteCaseOptionParts = new LdToSingleByteOptionParts();
        }
        return _toSingleByteCaseOptionParts;
    }

    // =====================================================================================
    //                                                                        To Double Byte
    //                                                                        ==============

    // =====================================================================================
    //                                                                              Japanese
    //                                                                              ========
    protected LdJapaneseOptionPartsAgent doLocalJapanese() {
        return getJapaneseOptionPartsAgent();
    }

    protected LdJapaneseOptionPartsAgent getJapaneseOptionPartsAgent() {
        if (_japaneseOptionPartsAgent == null) {
            _japaneseOptionPartsAgent = new LdJapaneseOptionPartsAgent();
        }
        return _japaneseOptionPartsAgent;
    }

    // =====================================================================================
    //                                                                            Real Value
    //                                                                            ==========
    public String generateRealValue(String value) {
        value = getToUpperLowerCaseOptionParts().generateRealValue(value);
        value = getToSingleByteOptionParts().generateRealValue(value);
        value = getJapaneseOptionPartsAgent().generateRealValue(value);
        return value;
    }

    // =====================================================================================
    //                                                                        General Helper
    //                                                                        ==============
    protected String replace(String text, String fromText, String toText) {
	    return LdSimpleStringUtil.replace(text, fromText, toText);
    }

    // =====================================================================================
    //                                                                              DeepCopy
    //                                                                              ========
    public Object createDeepCopy() {
        final LdSimpleStringOption deepCopy = newDeepCopyInstance();
        deepCopy._splitOptionParts = _splitOptionParts != null ? (LdSplitOptionParts)_splitOptionParts.createDeepCopy() : null;
        deepCopy._toUpperLowerCaseOptionParts = _toUpperLowerCaseOptionParts != null ? (LdToUpperLowerCaseOptionParts)_toUpperLowerCaseOptionParts.createDeepCopy() : null;
        deepCopy._toSingleByteCaseOptionParts = _toSingleByteCaseOptionParts != null ? (LdToSingleByteOptionParts)_toSingleByteCaseOptionParts.createDeepCopy() : null;
        deepCopy._japaneseOptionPartsAgent = _japaneseOptionPartsAgent != null ? (LdJapaneseOptionPartsAgent)_japaneseOptionPartsAgent.createDeepCopy() : null;
        return deepCopy;
    }
    protected LdSimpleStringOption newDeepCopyInstance() {
        return new LdSimpleStringOption();
    }
}
