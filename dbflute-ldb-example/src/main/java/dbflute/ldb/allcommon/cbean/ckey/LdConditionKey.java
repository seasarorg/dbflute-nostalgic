/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.ckey;

import java.util.List;

import dbflute.ldb.allcommon.cbean.coption.LdConditionOption;
import dbflute.ldb.allcommon.cbean.cvalue.LdConditionValue;

/**
 * The abstract class of condition-key.
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdConditionKey {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Mark of replaced value. */
    public static final String MARK_OF_REPLACED_VALUE = "ReplacedValue";

    /** The condition key of equal. */
    public static final LdConditionKey CK_EQUAL = new LdConditionKeyEqual();

    /** The condition key of notEqual. */
    public static final LdConditionKey CK_NOT_EQUAL = new LdConditionKeyNotEqual();

    /** The condition key of greaterThan. */
    public static final LdConditionKey CK_GREATER_THAN = new LdConditionKeyGreaterThan();

    /** The condition key of lessrThan. */
    public static final LdConditionKey CK_LESS_THAN = new LdConditionKeyLessThan();

    /** The condition key of greaterEqual. */
    public static final LdConditionKey CK_GREATER_EQUAL = new LdConditionKeyGreaterEqual();

    /** The condition key of lessEqual. */
    public static final LdConditionKey CK_LESS_EQUAL = new LdConditionKeyLessEqual();

    /** The condition key of prefixSearch. */
    public static final LdConditionKey CK_PREFIX_SEARCH = new LdConditionKeyPrefixSearch();

    /** The condition key of inScope. */
    public static final LdConditionKey CK_IN_SCOPE = new LdConditionKeyInScope();

    /** The condition key of notInScope. */
    public static final LdConditionKey CK_NOT_IN_SCOPE = new LdConditionKeyNotInScope();

    /** The condition key of likeSearch. */
    public static final LdConditionKey CK_LIKE_SEARCH = new LdConditionKeyLikeSearch();

    /** The condition key of notLikeSearch. */
    public static final LdConditionKey CK_NOT_LIKE_SEARCH = new LdConditionKeyNotLikeSearch();

    /** The condition key of isNull. */
    public static final LdConditionKey CK_IS_NULL = new LdConditionKeyIsNull();

    /** The condition key of isNotNull. */
    public static final LdConditionKey CK_IS_NOT_NULL = new LdConditionKeyIsNotNull();

    /** Dummy-object for IsNull and IsNotNull and so on... */
    protected static final Object DUMMY_OBJECT = new Object();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** Condition-key. */
    protected String _conditionKey;

    /** Operand. */
    protected String _operand;

    // ===================================================================================
    //                                                                          Validation
    //                                                                          ==========
    /**
     * Is valid registration?
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param callerName Caller name. (NotNull)
     * @return Determination.
     */
    abstract public boolean isValidRegistration(LdConditionValue conditionValue, Object value, String callerName);

    // ===================================================================================
    //                                                                        Where Clause
    //                                                                        ============
    /**
     * Add where clause.
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     * @return this.
     */
    public LdConditionKey addWhereClause(java.util.List<String> conditionList, String columnName, LdConditionValue value) {
        if (value == null) {
            String msg = "Argument[value] must not be null:";
            throw new IllegalArgumentException(msg + " value=" + value + " this.toString()=" + toString());
        }
        doAddWhereClause(conditionList, columnName, value);
        return this;
    }

    /**
     * Add where clause.
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     * @param option Condition option. (NotNull)
     * @return this.
     */
    public LdConditionKey addWhereClause(java.util.List<String> conditionList, String columnName, LdConditionValue value, LdConditionOption option) {
        if (value == null) {
            String msg = "Argument[value] must not be null:";
            throw new IllegalArgumentException(msg + " value=" + value + " this.toString()=" + toString());
        }
        doAddWhereClause(conditionList, columnName, value, option);
        return this;
    }

    /**
     * Do add where clause.
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     */
    abstract protected void doAddWhereClause(List<String> conditionList, String columnName, LdConditionValue value);

    /**
     * Do add where clause.
     * @param conditionList Condition list. (NotNull)
     * @param columnName Column name. (NotNull)
     * @param value Condition value. (NotNull)
     * @param option Condition option. (NotNull)
     */
    abstract protected void doAddWhereClause(List<String> conditionList, String columnName, LdConditionValue value, LdConditionOption option);

    // ===================================================================================
    //                                                                     Condition Value
    //                                                                     ===============
    /**
     * Setup condition value.
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (Nullable)
     * @param location Location. (Nullable)
     * @return Condition value. (The same as argument[conditionValue]) (NotNull)
     */
    public LdConditionValue setupConditionValue(LdConditionValue conditionValue, Object value, String location) {
        if (conditionValue == null) {
            String msg = "Argument[conditionValue] must not be null:";
            throw new IllegalArgumentException(msg + " value=" + value + " this.toString()=" + toString());
        }
        doSetupConditionValue(conditionValue, value, location);
        return conditionValue;
    }

    /**
     * Setup condition value.
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (Nullable)
     * @param location Location. (Nullable)
     * @param option Condition option. (NotNull)
     * @return Condition value. (The same as argument[conditionValue]) (NotNull)
     */
    public LdConditionValue setupConditionValue(LdConditionValue conditionValue, Object value, String location, LdConditionOption option) {
        if (conditionValue == null) {
            String msg = "Argument[conditionValue] must not be null:";
            throw new IllegalArgumentException(msg + " value=" + value + " this.toString()=" + toString());
        }
        doSetupConditionValue(conditionValue, value, location, option);
        return conditionValue;
    }

    /**
     * Do setup condition value.
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     */
    abstract protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location);

    /**
     * Do setup condition value.
     * @param conditionValue Condition value. (NotNull)
     * @param value Value. (NotNull)
     * @param location Location. (NotNull)
     * @param option Condition option. (NotNull)
     */
    abstract protected void doSetupConditionValue(LdConditionValue conditionValue, Object value, String location, LdConditionOption option);

    // ===================================================================================
    //                                                                         Bind Clause
    //                                                                         ===========
    /**
     * Build bind clause. (for s2dao)
     * @param columnName Column name. (NotNull)
     * @param location Location. (NotNull)
     * @return Bind clause. (NotNull)
     */
    protected String buildBindClause(String columnName, String location) {
        return columnName + " " + getOperand() + " " + "/*dto." + location + "*/null";
    }

    /**
     * Build bind clause. (for s2dao)
     * @param columnName Column name. (NotNull)
     * @param location Location. (NotNull)
     * @param rearOption Rear option. (NotNull)
     * @return Bind clause. (NotNull)
     */
    protected String buildBindClauseWithRearOption(String columnName, String location, String rearOption) {
        return columnName + " " + getOperand() + " " + "/*dto." + location + "*/null" + rearOption;
    }

    /**
     * Build bind clause. (for s2dao)
     * @param columnName Column name. (NotNull)
     * @param location Location. (NotNull)
     * @param dummyValue Dummy value. (NotNull)
     * @return Bind clause. (NotNull)
     */
    protected String buildBindClause(String columnName, String location, String dummyValue) {
        return columnName + " " + getOperand() + " " + "/*dto." + location + "*/" + dummyValue;
    }

    /**
     * Build clause without value.
     * @param columnName Column name. (NotNull)
     * @return Clause without value. (NotNull)
     */
    protected String buildClauseWithoutValue(String columnName) {
        return columnName + " " + getOperand();
    }

    /**
     * Get wild-card.
     * @return Wild-card.
     */
    protected String getWildCard() {
        return "%";
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * {@inheritDoc}
     * Returns hash-code of this condition-key string.
     * @return HashCode.
     */
    public int hashCode() {
        return getConditionKey().hashCode();
    }

    /**
     * {@inheritDoc}
     * If the condition-key of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other instanceof LdConditionKey) {
            if (this.getConditionKey().equals(((LdConditionKey)other).getConditionKey())) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     * @return View-string of condition key information.
     */
    public String toString() {
        return "LdConditionKey: " + getConditionKey() + " " + getOperand() + " wild-card=[" + getWildCard() + "]";
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get condition-key.
     * @return Condition-key.
     */
    public String getConditionKey() {
        return _conditionKey;
    }

    /**
     * Get operand.
     * @return Operand.
     */
    public String getOperand() {
        return _operand;
    }
}
