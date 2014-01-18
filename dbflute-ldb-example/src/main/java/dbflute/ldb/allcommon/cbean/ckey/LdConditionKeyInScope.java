/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.ckey;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.coption.LdConditionOption;
import dbflute.ldb.allcommon.cbean.coption.LdInScopeOption;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The condition-key of inScope.
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionKeyInScope extends LdConditionKey {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdConditionKeyInScope.class);

    /**
     * Constructor.
     */
    protected LdConditionKeyInScope() {
        _conditionKey = "inScope";
        _operand = "in";
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
        if (value instanceof java.util.List && ((java.util.List<?>)value).isEmpty()) {
            return false;
        }
        if (value instanceof java.util.List) {
            if (conditionValue.hasInScope()) {
                if (conditionValue.equalInScope(((java.util.List<?>)value))) {
                    _log.debug("The value has already registered at " + callerName + ": value=" + value);
                    return false;
                } else {
                    conditionValue.overrideInScope(((java.util.List<?>)value));
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * This method implements super#doAddWhereClause().
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     */
    protected void doAddWhereClause(java.util.List<String> conditionList, String columnName, LdConditionValue value) {
        if (value.getInScope() == null) {
            return;
        }
        conditionList.add(buildBindClause(columnName, value.getInScopeLocation(), "('a1', 'a2')"));
    }

    /**
     * This method implements super#doAddWhereClause().
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     * @param option Condition option. (NotNull)
     */
    protected void doAddWhereClause(java.util.List<String> conditionList, String columnName, LdConditionValue value, LdConditionOption option) {
        if (option == null) {
            String msg = "The argument[option] should not be null: columnName=" + columnName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (!(option instanceof LdInScopeOption)) {
            String msg = "The argument[option] should be LdInScopeOption: columnName=" + columnName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        conditionList.add(buildBindClause(columnName, value.getInScopeLocation(), "('a1', 'a2')"));
    }

    /**
     * This method implements super#doSetupConditionValue().
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        conditionValue.setInScope((java.util.List<?>)value).setInScopeLocation(location);
    }

    /**
     * This method implements super#doSetupConditionValue().
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     * @param option Condition option. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location, LdConditionOption option) {
        conditionValue.setInScope((java.util.List<?>)value, (LdInScopeOption)option).setInScopeLocation(location);
    }
}
