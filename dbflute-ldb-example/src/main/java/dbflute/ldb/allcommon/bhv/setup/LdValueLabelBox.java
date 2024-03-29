/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.bhv.setup;

/**
 * The class of Value-Label Box.
 * @author DBFlute(AutoGenerator)
 */
public class LdValueLabelBox {

    protected Object _value;

    protected String _label;

    public void setValueLabel(Object value, String label) {
        this._value = value;
        this._label = label;
    }

    public Object getValue() {
        return _value;
    }

    public String getLabel() {
        return _label;
    }
}
