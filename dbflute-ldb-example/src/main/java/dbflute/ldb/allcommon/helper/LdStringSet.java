/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper;

import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdStringSet implements Set<String> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static final Object DUMMY_VALUE = new Object();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final Map<String, Object> _internalMap;

    protected boolean _removeUnderscore;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected LdStringSet(boolean removeUnderscore, boolean concurrent) {
        _removeUnderscore = removeUnderscore;
        if (concurrent) {
            _internalMap = newConcurrentHashMap();
        } else {
            _internalMap = newHashMap();
        }
    }

    public static LdStringSet createAsFlexible() {
        return new LdStringSet(true, false);
    }

    public static LdStringSet createAsFlexibleConcurrent() {
        return new LdStringSet(true, true);
    }

    public static LdStringSet createAsCaseInsensitive() {
        return new LdStringSet(false, false);
    }

    public static LdStringSet createAsCaseInsensitiveConcurrent() {
        return new LdStringSet(false, true);
    }

    // ===================================================================================
    //                                                                        Map Emulator
    //                                                                        ============
    // -----------------------------------------------------
    //                                           Key Related
    //                                           -----------
    public boolean add(String value) {
        final String stringValue = convertStringKey(value);
        if (stringValue != null) {
            return _internalMap.put(stringValue, DUMMY_VALUE) != null;
        }
        return false;
    }

    public boolean remove(Object value) {
        final String stringValue = convertStringKey(value);
        if (stringValue != null) {
            return _internalMap.remove(stringValue) != null;
        }
        return false;
    }

    public boolean contains(Object value) {
        final String stringValue = convertStringKey(value);
        if (stringValue != null) {
            return _internalMap.containsKey(stringValue);
        }
        return false;
    }

    // -----------------------------------------------------
    //                                              Delegate
    //                                              --------
    public void clear() {
        _internalMap.clear();
    }

    public int size() {
        return _internalMap.size();
    }

    public boolean isEmpty() {
        return _internalMap.isEmpty();
    }

    public boolean addAll(Collection<? extends String> c) {
        boolean success = false;
        for (String s : c) {
            if (add(s)) {
                success = true;
            }
        }
        return success;
    }

    public boolean removeAll(Collection<?> c) {
        boolean success = false;
        for (Object s : c) {
            if (remove(s)) {
                success = true;
            }
        }
        return success;
    }

    public boolean containsAll(Collection<?> c) {
        for (Object s : c) {
            if (contains(s)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<String> iterator() {
        return _internalMap.keySet().iterator();
    }

    public boolean retainAll(Collection<?> c) {
        boolean success = false;
        for (Object s : c) {
            if (!contains(s)) {
                if (remove(s)) {
                    success = true;
                }
            }
        }
        return success;
    }

    public Object[] toArray() {
        return _internalMap.keySet().toArray();
    }

    public <T> T[] toArray(T[] a) {
        return _internalMap.keySet().toArray(a);
    }

    // ===================================================================================
    //                                                                       Key Converter
    //                                                                       =============
    protected String convertStringKey(Object value) {
        if (!(value instanceof String)) {
            return null;
        }
        return toLowerCase(removeUnderscore((String) value));
    }

    protected String removeUnderscore(String value) {
        if (_removeUnderscore) {
            return replace(value, "_", "");
        }
        return value;
    }

    protected String toLowerCase(String value) {
        return value.toLowerCase();
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected static String replace(String text, String fromText, String toText) {
        if (text == null || fromText == null || toText == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(100);
        int pos = 0;
        int pos2 = 0;
        while (true) {
            pos = text.indexOf(fromText, pos2);
            if (pos == 0) {
                sb.append(toText);
                pos2 = fromText.length();
            } else if (pos > 0) {
                sb.append(text.substring(pos2, pos));
                sb.append(toText);
                pos2 = pos + fromText.length();
            } else {
                sb.append(text.substring(pos2));
                break;
            }
        }
        return sb.toString();
    }

    protected static <KEY, VALUE> ConcurrentHashMap<KEY, VALUE> newConcurrentHashMap() {
        return new ConcurrentHashMap<KEY, VALUE>();
    }

    protected static <KEY, VALUE> HashMap<KEY, VALUE> newHashMap() {
        return new HashMap<KEY, VALUE>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    public boolean equals(Object obj) {
        return _internalMap.keySet().equals(obj);
    }

    @Override
    public int hashCode() {
        return _internalMap.keySet().hashCode();
    }

    @Override
    public String toString() {
        return _internalMap.keySet().toString();
    }
}