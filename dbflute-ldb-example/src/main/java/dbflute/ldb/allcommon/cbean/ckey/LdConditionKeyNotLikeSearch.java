/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.ckey;

import java.util.List;

import dbflute.ldb.allcommon.cbean.coption.LdConditionOption;
import dbflute.ldb.allcommon.cbean.coption.LdLikeSearchOption;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The condition-key of notLikeSearch.
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionKeyNotLikeSearch extends LdConditionKey {

    /**
     * Constructor.
     */
    protected LdConditionKeyNotLikeSearch() {
        _conditionKey = "notLikeSearch";
        _operand = "not like";
    }

    /**
     * Is valid registration?
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param callerName Caller name. (NotNull)
     * @return Determination.
     */
    public boolean isValidRegistration(LdConditionValue conditionValue, Object value, String callerName) {
        if (value == null) {
            return false;
        }
        return true;
    }

    /**
     * This method implements super#doAddWhereClause().
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     */
    protected void doAddWhereClause(List<String> conditionList, String columnName, LdConditionValue value) {
        throw new UnsupportedOperationException("doAddWhereClause without condition-option is unsupported!!!");
    }

    /**
     * This method implements super#doAddWhereClause().
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     * @param option Condition option. (NotNull)
     */
    protected void doAddWhereClause(List<String> conditionList, String columnName, LdConditionValue value, LdConditionOption option) {
        if (option == null) {
            String msg = "The argument[option] should not be null: columnName=" + columnName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (!(option instanceof LdLikeSearchOption)) {
            String msg = "The argument[option] should be LdLikeSearchOption: columnName=" + columnName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        final LdLikeSearchOption myOption = (LdLikeSearchOption)option;
        conditionList.add(buildBindClauseWithRearOption(columnName, value.getNotLikeSearchLocation(), myOption.getRearOption()));
    }

    /**
     * This method implements super#doSetupConditionValue().
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        throw new UnsupportedOperationException("doSetupConditionValue without condition-option is unsupported!!!");
    }

    /**
     * This method implements super#doSetupConditionValue().
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     * @param option Condition option. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location, LdConditionOption option) {
        conditionValue.setNotLikeSearch((String)value, (LdLikeSearchOption)option).setNotLikeSearchLocation(location);
    }
}
