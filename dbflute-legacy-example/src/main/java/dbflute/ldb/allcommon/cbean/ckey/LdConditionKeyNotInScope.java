package dbflute.ldb.allcommon.cbean.ckey;


import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The condition-key of notInScope.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionKeyNotInScope extends LdConditionKey {

    /**
     * Constructor.
     */
    protected LdConditionKeyNotInScope() {
        _conditionKey = "notInScope";
        _operand = "not in";
    }

    /**
     * Is valid registration?
     * 
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @return Determination.
     */
    public boolean isValidRegistration(LdConditionValue conditionValue, Object value) {
        if (value == null) {
            return false;
        }
        if (value instanceof java.util.List && ((java.util.List)value).isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * This method implements super#doAddWhereClause().
     * 
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     */
    protected void doAddWhereClause(java.util.List<String> conditionList, String columnName, LdConditionValue value) {
        if (value.getNotInScope() == null) {
            return;
        }
        final java.util.List valueList = value.getNotInScope();
        final java.util.List<Object> checkedValueList = new java.util.ArrayList<Object>();
        for (final java.util.Iterator ite = valueList.iterator(); ite.hasNext(); ) {
            final Object checkTargetValue = ite.next();
            if (checkTargetValue != null) {;
                checkedValueList.add(checkTargetValue);
            }
        }
        if (checkedValueList.isEmpty()) {
            return;
        }
        conditionList.add(buildBindClause(columnName, value.getNotInScopeLocation(), "('a1', 'a2')"));
    }

    /**
     * This method implements super#doSetupConditionValue().
     * 
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        conditionValue.setNotInScope((java.util.List)value).setNotInScopeLocation(location);
    }
}
