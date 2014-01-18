package com.example.dbflute.lucy.unit;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.seasar.dbflute.util.DfReflectionUtil;
import org.seasar.dbflute.util.DfStringUtil;
import org.t2framework.lucy.Lucy;
import org.t2framework.lucy.tx.TransactionWrapper;
import org.t2framework.lucy.ut.LucyTestCase;

/**
 * The abstract test case for application components of Lucy.
 * @author jflute
 * @since 0.9.0 (2009/01/17 Saturday)
 */
public abstract class BasicLucyTestCase extends LucyTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                           Lucy Object
    //                                           -----------
    /** The transaction (wrapper). {Lucy Object} */
    protected TransactionWrapper transaction;

    // -----------------------------------------------------
    //                                Bound Fields(Internal)
    //                                ----------------------
    /** The bound fields. (Internal)*/
    private List<Field> boundFields;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() {
        initializeApplicationContext();
        initializeFields();
        beginTransaction();
    }

    protected void initializeApplicationContext() {
        Lucy lucy = getLucy();
        String[] configurations = getConfigurations();
        for (String configuration : configurations) {
            lucy.load(configuration);
        }
    }

    protected abstract String[] getConfigurations();

    /**
     * Testクラスのフィールドに指定されたComponentがLucy上に存在すれば、
     * そのインスタンスを取得してそのフィールドに設定する。
     * Testをやりやすくするための処理であってLucyの機能とは何も関係ない。
     */
    protected void initializeFields() {
        try {
            bindFields();
        } catch (Throwable e) {
            String msg = "bindFields() threw the exception!";
            throw new IllegalStateException(msg, e);
        }
    }

    /**
     * トランザクションを開始。テストメソッドには全てトランザクションを発生させることとする。
     * 実際のアプリケーションのプログラムではこのようなやり方ではなく、
     * インターセプタを利用してトランザクションを発生させる。
     */
    protected void beginTransaction() {
        transaction = (TransactionWrapper) getLucy().get("txPro");
        try {
            transaction.begin();
            transaction.setRollbackOnly();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    public void tearDown() {
        rollbackTransaction();
        destroyFields();
        destroyApplicationContext();
    }

    protected void rollbackTransaction() {
        try {
            transaction.end();
        } catch (Exception e) {
            throw new IllegalStateException(e);
        } finally {
            transaction = null;
        }
    }

    protected void destroyFields() {
        unbindFields();
    }

    protected void destroyApplicationContext() {
        // Do nothing!
    }

    // ===================================================================================
    //                                                                       Field Binding
    //                                                                       =============
    /**
     * 各々のテストケースで利用するフィールドにオブジェクトをバインディング。{S2Unitを参考}
     * @throws Throwable
     */
    protected void bindFields() throws Throwable {
        boundFields = new ArrayList<Field>();
        for (Class<?> clazz = getClass(); clazz != BasicLucyTestCase.class && clazz != null; clazz = clazz
                .getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; ++i) {
                bindField(fields[i]);
            }
        }
    }

    protected void bindField(Field field) {
        if (!isAutoBindable(field)) {
        }
        field.setAccessible(true);
        if (DfReflectionUtil.getValue(field, this) != null) {
            return;
        }
        String name = normalizeName(field.getName());
        Object component = null;
        if (hasComponent(name)) {
            component = getComponent(name);
        }
        if (component != null) {
            DfReflectionUtil.setValue(field, this, component);
            boundFields.add(field);
        }
    }

    protected String normalizeName(String name) {
        return DfStringUtil.replace(name, "_", "");
    }

    protected boolean isAutoBindable(Field field) {
        int modifiers = field.getModifiers();
        return !Modifier.isStatic(modifiers) && !Modifier.isFinal(modifiers) && !field.getType().isPrimitive();
    }

    protected void unbindFields() {
        for (int i = 0; i < boundFields.size(); ++i) {
            Field field = (Field) boundFields.get(i);
            try {
                field.set(this, null);
            } catch (IllegalArgumentException e) {
                System.err.println(e);
            } catch (IllegalAccessException e) {
                System.err.println(e);
            }
        }
        boundFields.clear();
        boundFields = null;
    }

    // ===================================================================================
    //                                                                  Component Provider
    //                                                                  ==================
    protected Object getComponent(String name) {
        return getLucy().get(name);
    }

    protected boolean hasComponent(String name) {
        return getLucy().hasComponent(name);
    }
}
