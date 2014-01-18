package dbflute.helper.stateless;

/**
 * Array to String Utility.
 * 
 * @author kubo
 * @version $Revision$ $Date$ 
 */
public class FlArrayToStringUtil {

    /**
     * �w�肳�ꂽClass-Class�z���Package�̖���Class����
     * Comma��؂�ɕҏW���܂��D<p>
     * 
     * @param clazzArray Class�z��
     * @return Package�̖���Class����Comma��؂蕶����
     */
    final public String getShortClassArrayStr(Class[] clazzArray) {
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

    /**
     * �w�肳�ꂽObject�z��̒l��Comma��؂�ɕҏW���܂��D<p>
     * 
     * @param objArray Object�z��
     * @return �l��Comma��؂��؂蕶����
     */
    final public String getObjArrayStr(Object[] objArray) {
        if (objArray == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < objArray.length; i++) {
            if (i == 0) {
                sb.append(objArray[i]);
            } else {
                sb.append(", ").append(objArray[i]);
            }
        }
        return sb.toString();
    }

    /**
     * �V�X�e�����s���擾����B
     * 
     * @return System line separator.
     */
    final protected static String newLine() {
        return System.getProperty("line.separator");
    }

    /**
     * �w�肳�ꂽClass��Package�̖���Class�����擾����B
     * 
     * @param clazz Class.
     * @return Class name without package.
     */
    final protected static String getShortClassName(Class clazz) {
        if (clazz == null) {
            return "";
        }
        final String tmp = clazz.getName();
        return tmp.substring(tmp.lastIndexOf(".") + 1, tmp.length());
    }
}