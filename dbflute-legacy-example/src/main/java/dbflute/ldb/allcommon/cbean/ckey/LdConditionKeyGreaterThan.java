package dbflute.ldb.allcommon.cbean.ckey;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The condition-key of greaterThan.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdConditionKeyGreaterThan extends LdConditionKey {

    /** Log-instance. */
    private static final Log _log = LogFactory.getLog(LdConditionKeyGreaterThan.class);

    /**
     * Constructor.
     */
    protected LdConditionKeyGreaterThan() {
        _conditionKey = "greaterThan";
        _operand = ">";
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
        Object valueObject = conditionValue.getGreaterThan();
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
        if (value.getGreaterThan() == null) {
            return;
        }
        conditionList.add(buildBindClause(columnName, value.getGreaterThanLocation()));
    }

    /**
     * This method implements super#doSetupConditionValue().
     * 
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        conditionValue.setGreaterThan(value).setGreaterThanLocation(location);
    }
}
