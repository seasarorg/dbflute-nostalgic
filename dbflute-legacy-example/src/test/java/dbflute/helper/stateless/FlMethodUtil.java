package dbflute.helper.stateless;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Method-Utility.
 * <p>
 * Support to invoke method by reflection.
 * 
 * @author kubo
 */
public class FlMethodUtil {

    // ========================================================================================
    //                                                                Getter Setter Name Method
    //                                                                =========================

    /**
     * �v���p�e�B������Getter-Method�����擾����B
     * (�P���Ƀv���p�e�B���̈ꕶ���ڂ�啶���ɂ��Đ擪��'get'��t�^���Ă��邾���B)
     *
     * @param str Property��
     * @return Getter-Method��
     */
    public static String getterName(String str) {
        return "get" + str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * �v���p�e�B������Setter-Method�����擾����B
     * (�P���Ƀv���p�e�B���̈ꕶ���ڂ�啶���ɂ��Đ擪��'set'��t�^���Ă��邾���B)
     *
     * @param str Property�� (NotNull)
     * @return Stter-Method�� (NotNull)
     */
    public static String setterName(String str) {
        return "set" + str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    // ========================================================================================
    //                                                                               Get Method
    //                                                                               ==========
    /**
     * Method���擾����B
     *
     * @param target ���sInstance
     * @param name Method��
     * @param type ������Type
     * @return �w���Instance
     */
    public static Method getMethod(Object target, String name, Class type) {
        try {
            Class[] argTypes = (type != null ? new Class[] { type } : null);
            return target.getClass().getMethod(name, argTypes);
        } catch (NoSuchMethodException e) {
            String msg = "name==[" + name + "] type==[" + type + "]";
            throw new RuntimeException(msg, e);
        }
    }

    /**
     * Method���擾����B
     *
     * @param target ���sInstance
     * @param name Method��
     * @param type ������Type
     * @return �w���Instance
     */
    public static Method getMethod(Object target, String name, Class[] type) {
        try {
            return target.getClass().getMethod(name, type);
        } catch (NoSuchMethodException e) {
            String msg = "name==[" + name + "] type==[" + getShortClassArrayStr(type) + "]";
            throw new RuntimeException(msg, e);
        }
    }

    // ========================================================================================
    //                                                                            Invoke Method
    //                                                                            =============

    /**
     * Object��Getter-Method�����s����B
     *
     * @param name Getter-Method�� (NotNull)
     * @param obj ���sInstance (NotNull)
     * @return ���s����Getter-Method�̖߂�l
     */
    public static Object invokeGet(String name, Object obj) {
        if (name == null) {
            throw new NullPointerException("Argument[name] must not be null.");
        }
        if (obj == null) {
            throw new NullPointerException("Argument[obj] must not be null.");
        }
        return invoke(name, (Class[]) null, obj, (Object[]) null);
    }

    /**
     * Method�����s����D
     *
     * @param name Method��
     * @param type �����̌^
     * @param target ���sInstance
     * @param args ����Object
     * @return ���s����Method�߂�l
     */
    public static Object invoke(String name, Class type, Object target, Object args) {
        return invoke(getMethod(target, name, type), target, args);
    }

    /**
     * Method�����s����D
     *
     * @param name Method��
     * @param type �����̌^
     * @param target ���sInstance
     * @param args ����Object
     * @return ���s����Method�߂�l
     */
    public static Object invoke(String name, Class[] type, Object target, Object[] args) {
        return invoke(getMethod(target, name, type), target, args);
    }

    /**
     * Method�����s����D
     *
     * @param methoz Method
     * @param target ���sInstance
     * @param arg �����̒l
     * @return ���s����Method�߂�l
     */
    public static Object invoke(Method methoz, Object target, Object arg) {
        try {
            Object[] args = (arg != null ? new Object[] { arg } : null);
            return methoz.invoke(target, args);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Method�����s����D
     *
     * @param methoz Method
     * @param target ���sInstance
     * @param args �����̒l
     * @return ���s����Method�߂�l
     */
    public static Object invoke(Method methoz, Object target, Object[] args) {
        try {
            return methoz.invoke(target, args);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getTargetException());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    // ========================================================================================
    //                                                                   Internal Helper Method
    //                                                                   ======================

    /**
     * �w�肳�ꂽClass��Package�̖���Class�����擾����B
     * 
     * @param clazz Class.
     * @return Class name without package.
     */
    protected static String getShortClassName(Class clazz) {
        if (clazz == null) {
            return "";
        }
        final String tmp = clazz.getName();
        return tmp.substring(tmp.lastIndexOf(".") + 1, tmp.length());
    }

    /**
     * �w�肳�ꂽClass-Class�z���Package�̖���Class����
     * Comma��؂�ɕҏW���܂��D<p>
     * 
     * @param clazzArray Class�z��
     * @return Package�̖���Class����Comma��؂蕶����
     */
    protected static String getShortClassArrayStr(Class[] clazzArray) {
        if (clazzArray == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < clazzArray.length; i++) {
            if (i == 0) {
                sb.append(getShortClassName(clazzArray[i]));
            } else {
                sb.append(", ").append(getShortClassName(clazzArray[i]));
            }
        }
        return sb.toString();
    }
}