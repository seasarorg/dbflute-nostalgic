package com.example.dbflute.slim3.unit;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.TransactionManager;

import org.seasar.dbflute.util.DfReflectionUtil;
import org.seasar.dbflute.util.DfStringUtil;
import org.slim3.commons.exception.NameNotFoundRuntimeException;
import org.slim3.container.S3Container;
import org.slim3.container.S3ContainerFactory;

/**
 * The abstract test case for application components of Slim3.
 * @author jflute
 * @since 0.9.4 (2009/03/17 Tuesday)
 */
public abstract class AppSlim3TestCase extends PlainTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                          Static Cache
    //                                          ------------
    protected static S3Container cachedContainer;

    // -----------------------------------------------------
    //                                          Slim3 Object
    //                                          ------------
    /** The container of Slim3. {Slim3 Object} */
    protected static S3Container container;

    // -----------------------------------------------------
    //                                    Transaction Object
    //                                    ------------------
    /** The transaction manager for platform. {Transaction Object} */
    protected TransactionManager transactionManager;

    // -----------------------------------------------------
    //                                Bound Fields(Internal)
    //                                ----------------------
    /** The bound fields. (Internal)*/
    private List<Field> boundFields;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    /**
     * Set up various components for test.
     */
    @Override
    public void setUp() {
        initializeContainer();
        initializeFields();
        beginTransaction();
    }

    protected void initializeContainer() {
        if (cachedContainer != null) {
            container = cachedContainer;
            return;
        }
        setupApplicationModule();
        setupTransactionModule();
        container = S3ContainerFactory.getInstance().getContainer();
        cachedContainer = container;
    }

    protected abstract void setupApplicationModule();

    protected abstract void setupTransactionModule();

    protected void initializeFields() {
        try {
            bindFields();
        } catch (Throwable e) {
            String msg = "bindFields() threw the exception!";
            throw new IllegalStateException(msg, e);
        }
    }

    protected abstract void beginTransaction();

    @Override
    public void tearDown() {
        rollbackTransaction();
        destroyFields();
        destroyContainer();
    }

    protected abstract void rollbackTransaction();

    protected void destroyFields() {
        unbindFields();
    }

    protected void destroyContainer() {
        // Do nothing because of caching!
    }

    // ===================================================================================
    //                                                                       Field Binding
    //                                                                       =============
    protected void bindFields() throws Throwable {
        boundFields = new ArrayList<Field>();
        for (Class<?> clazz = getClass(); clazz != AppSlim3TestCase.class && clazz != null; clazz = clazz
                .getSuperclass()) {
            Field[] fields = clazz.getDeclaredFields();
            for (int i = 0; i < fields.length; ++i) {
                bindField(fields[i]);
            }
        }
    }

    protected void bindField(Field field) {
        if (!isAutoBindable(field)) {
            return;
        }
        field.setAccessible(true);
        if (DfReflectionUtil.getValue(field, this) != null) {
            return;
        }
        Class<?> type = field.getType();
        Object component = null;
        try {
            component = container.lookup(type.getSimpleName());
        } catch (NameNotFoundRuntimeException e) {
            try {
                component = container.lookup(type.getName());
            } catch (NameNotFoundRuntimeException ignored) {
                return;
            }
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

    protected boolean isSimpleType(Class<?> type) {
        return String.class.isAssignableFrom(type) || Date.class.isAssignableFrom(type)
                || Number.class.isAssignableFrom(type) || byte[].class.isAssignableFrom(type)
                || Boolean.class.isAssignableFrom(type);
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
    //                                                                   Instance Provider
    //                                                                   =================
    protected Object getInstance(Class<?> type) {
        try {
            return container.lookup(type.getSimpleName());
        } catch (NameNotFoundRuntimeException ignored) {
            return container.lookup(type.getName());
        }
    }

    protected boolean hasInstance(Class<?> type) {
        try {
            getInstance(type);
            return true;
        } catch (NameNotFoundRuntimeException e) {
            return false;
        }
    }
}
