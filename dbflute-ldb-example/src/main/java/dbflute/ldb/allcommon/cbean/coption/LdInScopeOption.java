/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption;


import dbflute.ldb.allcommon.cbean.coption.parts.local.LdJapaneseOptionPartsAgent;

/**
 * The class of in-scope-option.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdInScopeOption extends LdSimpleStringOption {

    // =====================================================================================
    //                                                                                 Split
    //                                                                                 =====
    public LdInScopeOption splitBySpace() {
        return (LdInScopeOption)doSplitBySpace();
    }

    public LdInScopeOption splitBySpace(int splitLimitCount) {
        return (LdInScopeOption)doSplitBySpace(splitLimitCount);
    }

    public LdInScopeOption splitBySpaceContainsDoubleByte() {
        return (LdInScopeOption)doSplitBySpaceContainsDoubleByte();
    }

    public LdInScopeOption splitBySpaceContainsDoubleByte(int splitLimitCount) {
        return (LdInScopeOption)doSplitBySpaceContainsDoubleByte(splitLimitCount);
    }

    public LdInScopeOption splitByPipeLine() {
        return (LdInScopeOption)doSplitByPipeLine();
    }

    public LdInScopeOption splitByPipeLine(int splitLimitCount) {
        return (LdInScopeOption)doSplitByPipeLine(splitLimitCount);
    }

    // =====================================================================================
    //                                                                   To Upper/Lower Case
    //                                                                   ===================
    public LdInScopeOption toUpperCase() {
        return (LdInScopeOption)doToUpperCase();
    }

    public LdInScopeOption toLowerCase() {
        return (LdInScopeOption)doToLowerCase();
    }

    // =====================================================================================
    //                                                                        To Single Byte
    //                                                                        ==============
    public LdInScopeOption toSingleByteSpace() {
        return (LdInScopeOption)doToSingleByteSpace();
    }

    public LdInScopeOption toSingleByteAlphabetNumber() {
        return (LdInScopeOption)doToSingleByteAlphabetNumber();
    }

    public LdInScopeOption toSingleByteAlphabetNumberMark() {
        return (LdInScopeOption)doToSingleByteAlphabetNumberMark();
    }

    // =====================================================================================
    //                                                                        To Double Byte
    //                                                                        ==============

    // =====================================================================================
    //                                                                              Japanese
    //                                                                              ========
    public LdJapaneseOptionPartsAgent localJapanese() {
        return doLocalJapanese();
    }

    // =====================================================================================
    //                                                                            Real Value
    //                                                                            ==========
    public java.util.List<String> generateRealValueList(java.util.List<String> valueList) {
        final java.util.List<String> resultList = new java.util.ArrayList<String>();
        for (final java.util.Iterator<String> ite = valueList.iterator(); ite.hasNext(); ) {
            final String value = ite.next();
            resultList.add(generateRealValue(value));
        }
        return resultList;
    }
}
