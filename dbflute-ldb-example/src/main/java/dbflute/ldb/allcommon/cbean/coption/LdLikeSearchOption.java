/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.coption;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import dbflute.ldb.allcommon.LdDBDef;
import dbflute.ldb.allcommon.bhv.core.LdResourceContext;
import dbflute.ldb.allcommon.cbean.coption.parts.local.LdJapaneseOptionPartsAgent;

/**
 * The class of like-search-option.
 * @author DBFlute(AutoGenerator)
 */
public class LdLikeSearchOption extends LdSimpleStringOption {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final String LIKE_PREFIX = "prefix";
    protected static final String LIKE_SUFFIX = "suffix";
    protected static final String LIKE_CONTAIN = "contain";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _like;
    protected String _escape;
    protected boolean _asOrSplit;
    protected List<LikeAsOrCallback> _likeAsOrCallbackList;

    // ===================================================================================
    //                                                                         Rear Option
    //                                                                         ===========
    public String getRearOption() {
        if (_escape == null || _escape.trim().length() == 0) {
            return "";
        }
        return " escape '" + _escape + "'";
    }

    // ===================================================================================
    //                                                                                AsOr
    //                                                                                ====
    /** @deprecated */
    public static interface LikeAsOrCallback {
        public String getAdditionalTargetPropertyName();
        public String filterValue(String currentValue);
        public LdLikeSearchOption filterOption(LdLikeSearchOption optionDeepCopyWithoutCallback);
    }

	/** @deprecated */
    public static abstract class DefaultLikeAsOrCallback implements LikeAsOrCallback {
        public String filterValue(String currentValue) {
            return currentValue;
        }
        public LdLikeSearchOption filterOption(LdLikeSearchOption optionDeepCopyWithoutCallback) {
            return optionDeepCopyWithoutCallback;
        }
    }

    public boolean hasLikeAsOrCallback() {
        return _likeAsOrCallbackList != null && !_likeAsOrCallbackList.isEmpty();
    }
	
    public List<LikeAsOrCallback> getLikeAsOrCallbackList() {
		if (_likeAsOrCallbackList == null) {
		    _likeAsOrCallbackList = new ArrayList<LikeAsOrCallback>();
		}
        return _likeAsOrCallbackList;
    }

	/** 
     * @param likeAsOrCallback Callback.
     * @deprecated
     */
    public void addLikeAsOrCallback(LikeAsOrCallback likeAsOrCallback) {
        getLikeAsOrCallbackList().add(likeAsOrCallback);
    }

    public void clearLikeAsOrCallback() {
        getLikeAsOrCallbackList().clear();
    }

    // ===================================================================================
    //                                                                                Like
    //                                                                                ====
    public LdLikeSearchOption likePrefix() {
        _like = LIKE_PREFIX;
        return this;
    }
    public LdLikeSearchOption likeSuffix() {
        _like = LIKE_SUFFIX;
        return this;
    }
    public LdLikeSearchOption likeContain() {
        _like = LIKE_CONTAIN;
        return this;
    }

    // ===================================================================================
    //                                                                              Escape
    //                                                                              ======
    public LdLikeSearchOption escapeByPipeLine() {
        _escape = "|";
        return this;
    }

    public LdLikeSearchOption escapeByAtMark() {
        _escape = "@";
        return this;
    }

    public LdLikeSearchOption escapeBySlash() {
        _escape = "/";
        return this;
    }

    public LdLikeSearchOption escapeByBackSlash() {
        _escape = "\\";
        return this;
    }

    // ===================================================================================
    //                                                                               Split
    //                                                                               =====
    public LdLikeSearchOption splitBySpace() {
        return (LdLikeSearchOption)doSplitBySpace();
    }

    public LdLikeSearchOption splitBySpace(int splitLimitCount) {
        return (LdLikeSearchOption)doSplitBySpace(splitLimitCount);
    }

    public LdLikeSearchOption splitBySpaceContainsDoubleByte() {
        return (LdLikeSearchOption)doSplitBySpaceContainsDoubleByte();
    }

    public LdLikeSearchOption splitBySpaceContainsDoubleByte(int splitLimitCount) {
        return (LdLikeSearchOption)doSplitBySpaceContainsDoubleByte(splitLimitCount);
    }

    public LdLikeSearchOption splitByPipeLine() {
        return (LdLikeSearchOption)doSplitByPipeLine();
    }

    public LdLikeSearchOption splitByPipeLine(int splitLimitCount) {
        return (LdLikeSearchOption)doSplitByPipeLine(splitLimitCount);
    }
	
	public LdLikeSearchOption asOrSplit() {
	    _asOrSplit = true;
		return this;
	}
	
	public boolean isAsOrSplit() {
	    return _asOrSplit;
	}

    // ===================================================================================
    //                                                                 To Upper/Lower Case
    //                                                                 ===================
    public LdLikeSearchOption toUpperCase() {
        return (LdLikeSearchOption)doToUpperCase();
    }

    public LdLikeSearchOption toLowerCase() {
        return (LdLikeSearchOption)doToLowerCase();
    }

    // ===================================================================================
    //                                                                      To Single Byte
    //                                                                      ==============
    public LdLikeSearchOption toSingleByteSpace() {
        return (LdLikeSearchOption)doToSingleByteSpace();
    }

    public LdLikeSearchOption toSingleByteAlphabetNumber() {
        return (LdLikeSearchOption)doToSingleByteAlphabetNumber();
    }

    public LdLikeSearchOption toSingleByteAlphabetNumberMark() {
        return (LdLikeSearchOption)doToSingleByteAlphabetNumberMark();
    }

    // ===================================================================================
    //                                                                      To Double Byte
    //                                                                      ==============

    // ===================================================================================
    //                                                                            Japanese
    //                                                                            ========
    public LdJapaneseOptionPartsAgent localJapanese() {
        return doLocalJapanese();
    }

    // ===================================================================================
    //                                                                          Real Value
    //                                                                          ==========
    public String generateRealValue(String value) {
        value = super.generateRealValue(value);

        // Escape
        if (_escape != null && _escape.trim().length() != 0) {
            String tmp = replace(value, _escape, _escape + _escape);
            tmp = replace(tmp, "%", _escape + "%");
            tmp = replace(tmp, "_", _escape + "_");
            if (isCurrentDBDef(LdDBDef.Oracle)) {
                tmp = replace(tmp, "\uff05", _escape + "\uff05");
                tmp = replace(tmp, "\uff3f", _escape + "\uff3f");
            }
            value = tmp;
        }
        final String wildCard = "%";
        if (_like == null || _like.trim().length() == 0) {
            return value;
        } else if (_like.equals(LIKE_PREFIX)) {
            return value + wildCard;
        } else if (_like.equals(LIKE_SUFFIX)) {
            return wildCard + value;
        } else if (_like.equals(LIKE_CONTAIN)) {
            return wildCard + value + wildCard;
        } else {
            String msg = "The like was wrong string: " + _like;
            throw new IllegalStateException(msg);
        }
    }

    protected boolean isCurrentDBDef(LdDBDef currentDBDef) {
	    return LdResourceContext.isCurrentDBDef(currentDBDef);
    }

    // ===================================================================================
    //                                                                            DeepCopy
    //                                                                            ========
    public Object createDeepCopy() {
        final LdLikeSearchOption deepCopy = (LdLikeSearchOption)super.createDeepCopy();
        deepCopy._like = _like;
        deepCopy._escape = _escape;
		if (hasLikeAsOrCallback()) {
            for (Iterator<LikeAsOrCallback> ite = _likeAsOrCallbackList.iterator(); ite.hasNext(); ) {
                deepCopy.addLikeAsOrCallback((LikeAsOrCallback)ite.next());
            }
		}
        return deepCopy;
    }

    protected LdSimpleStringOption newDeepCopyInstance() {
        return new LdLikeSearchOption();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public String toString() {
        return "like=" + _like + ", escape=" + _escape + ", split=" + isSplit() + ", asOrSplit = " + _asOrSplit;  
    }
}
