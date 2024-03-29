/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.various;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.PropertyDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.util.ClassUtil;
import org.seasar.framework.util.ConstructorUtil;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.dao.Dbms;
import org.seasar.dao.IdentifierGenerator;

import dbflute.ldb.allcommon.util.LdSimpleStringUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalIdentifierGeneratorFactory {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private static Map<String, Class<?>> generatorClasses = new HashMap<String, Class<?>>();

    static {
        addIdentifierGeneratorClass("assigned", LdInternalIdentifierAssignedGenerator.class);
        addIdentifierGeneratorClass("identity", LdInternalIdentifierIdentityGenerator.class);
        addIdentifierGeneratorClass("sequence", LdInternalIdentifierSequenceGenerator.class);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private LdInternalIdentifierGeneratorFactory() {
    }

    // ===================================================================================
    //                                                                Identifier Generator
    //                                                                ====================
    public static void addIdentifierGeneratorClass(String name, Class<?> clazz) {
        generatorClasses.put(name, clazz);
    }

    public static IdentifierGenerator createIdentifierGenerator(PropertyType propertyType, Dbms dbms) {
        return createIdentifierGenerator(propertyType, dbms, null);
    }

    public static IdentifierGenerator createIdentifierGenerator(PropertyType propertyType, Dbms dbms, String annotation) {
        if (propertyType == null) {
            String msg = "The argument[propertyType] should not be null: dbms=" + dbms + " annotation=" + annotation;
            throw new IllegalArgumentException(msg);
        }
        if (dbms == null) {
            String msg = "The argument[dbms] should not be null: propertyType=" + propertyType + " annotation=" + annotation;
            throw new IllegalArgumentException(msg);
        }
        if (annotation == null) {
            return new LdInternalIdentifierAssignedGenerator(propertyType, dbms);
        }
        String[] array = LdSimpleStringUtil.split(annotation, "=, ");
        Class<?> clazz = getGeneratorClass(array[0]);
        IdentifierGenerator generator = createIdentifierGenerator(clazz, propertyType, dbms);
        for (int i = 1; i < array.length; i += 2) {
            setProperty(generator, array[i].trim(), array[i + 1].trim());
        }
        return generator;
    }

    protected static Class<?> getGeneratorClass(String name) {
        Class<?> clazz = generatorClasses.get(name);
        if (clazz != null) {
            return clazz;
        }
        return ClassUtil.forName(name);
    }

    protected static IdentifierGenerator createIdentifierGenerator(Class<?> clazz, PropertyType propertyType, Dbms dbms) {
        Constructor<?> constructor = ClassUtil.getConstructor(clazz, new Class<?>[] {PropertyType.class, Dbms.class});
        return (IdentifierGenerator) ConstructorUtil.newInstance(constructor, new Object[] { propertyType, dbms });
    }

    protected static void setProperty(IdentifierGenerator generator, String propertyName, String value) {
        BeanDesc beanDesc = BeanDescFactory.getBeanDesc(generator.getClass());
        PropertyDesc pd = beanDesc.getPropertyDesc(propertyName);
        pd.setValue(generator, value);
    }
}
