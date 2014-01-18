package dbflute.ldb.allcommon.cbean.ckey;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The condition-key of lessThan.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionKeyLessThan extends LdConditionKey {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdConditionKeyLessThan.class);

    /**
     * Constructor.
     */
    protected LdConditionKeyLessThan() {
        _conditionKey = "lessThan";
        _operand = "<";
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
        Object valueObject = conditionValue.getLessThan();
        if (valueObject != null && valueObject.equals(value)) {
            _log.warn("The value has already registered at " + _conditionKey + ": " + valueObject + " = " + value);
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
        if (value.getLessThan() == null) {
            return;
        }
        conditionList.add(buildBindClause(columnName, value.getLessThanLocation()));
    }

    /**
     * This method implements super#doSetupConditionValue().
     * 
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        conditionValue.setLessThan(value).setLessThanLocation(location);
    }
}
