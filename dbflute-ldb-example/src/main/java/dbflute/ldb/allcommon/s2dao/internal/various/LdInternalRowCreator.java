/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.various;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.dao.impl.RowCreatorImpl;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdInternalMapContext;
import dbflute.ldb.allcommon.bhv.core.LdResourceContext;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.util.LdSimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdInternalRowCreator extends RowCreatorImpl {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(LdInternalRowCreator.class);

    /** The key of DBMeta cache. */
    protected static final String DBMETA_CACHE_KEY = "df:DBMetaCache";

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LdDBMeta _dbmeta;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    protected LdInternalRowCreator() {}

    /**
     * @param beanClass The class of target bean to find DB-meta. (Nullable)
     * @return The instance of internal row creator. (NotNull)
     */
    public static LdInternalRowCreator createInternalRowCreator(Class<?> beanClass) {
        final LdInternalRowCreator rowCreator = new LdInternalRowCreator();
        if (beanClass != null) {
            rowCreator.setDBMeta(findDBMetaByClass(beanClass));
        }
        return rowCreator;
    }

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    @SuppressWarnings("unchecked")
    @Override
    public Object createRow(ResultSet rs, Map propertyCache, Class beanClass) throws SQLException  {
        final Set columnNameSet = propertyCache.keySet();
        String columnName = null;
        PropertyType pt = null;
        String propertyName = null;
        final Object row;
        final LdDBMeta dbmeta;
        if (_dbmeta != null) {
            dbmeta = _dbmeta;
            row = dbmeta.newEntity();
        } else {
            row = newBean(beanClass);
            dbmeta = findDBMeta(row);
        }
        try {
            if (dbmeta != null) {
                for (final Iterator ite = columnNameSet.iterator(); ite.hasNext();) {
                    columnName = (String) ite.next();
                    pt = (PropertyType) propertyCache.get(columnName);
                    propertyName = pt.getPropertyName();
                    if (dbmeta.hasEntityPropertySetupper(propertyName)) {
                        final ValueType valueType = pt.getValueType();
                        final Object value = valueType.getValue(rs, columnName);
                        dbmeta.setupEntityProperty(propertyName, row, value);
                    } else {
                        registerValue(rs, row, pt, columnName);
                    }
                }
            } else {
                for (final Iterator ite = columnNameSet.iterator(); ite.hasNext();) {
                    columnName = (String) ite.next();
                    pt = (PropertyType) propertyCache.get(columnName);
                    propertyName = pt.getPropertyName();
                    registerValue(rs, row, pt, columnName);
                }
            }
            return row;
        } catch (ClassCastException e) {
            if (_log.isWarnEnabled()) {
                String msg = ClassCastException.class.getSimpleName() + " occurred while ResultSet Handling:";
                _log.warn(msg + " target=" + beanClass.getSimpleName() + "." + propertyName + " dbmeta");
            }
            throwNonsenseClassCastException(row, dbmeta, e);
            return null; // Unreachable!
        } catch (SQLException e) {
            if (_log.isWarnEnabled()) {
                String msg = SQLException.class.getSimpleName() + " occurred while ResultSet Handling:";
                _log.warn(msg + " target=" + beanClass.getSimpleName() + "." + propertyName);
            }
            throw e;
        }
    }
    
    protected void throwNonsenseClassCastException(Object entity, LdDBMeta dbmeta, ClassCastException e) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "Nonsense ClassCastException occured!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "This exception may be from ClassLoader Headache about HotDeploy." + getLineSeparator();
        msg = msg + "Please add the ignore-package setting to convention.dicon like as follows:" + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    <initMethod name=”addIgnorePackageName”>" + getLineSeparator();
        msg = msg + "        <arg>”com.example.xxx.dbflute”</arg>" + getLineSeparator();
        msg = msg + "    </initMethod>" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Exception Message]" + getLineSeparator() + e.getMessage() + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target Entity]" + getLineSeparator() + entity + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target Entity Class Loader]" + getLineSeparator() + entity.getClass().getClassLoader() + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target DBMeta]" + getLineSeparator() + dbmeta + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target DBMeta Class Loader]" + getLineSeparator() + dbmeta.getClass().getClassLoader() + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new NonsenseClassCastException(msg, e);
    }

    public static class NonsenseClassCastException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public NonsenseClassCastException(String msg, ClassCastException e) {
            super(msg, e);
        }
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    /**
     * @param row The instance of row. (NotNull)
     * @return The interface of DBMeta. (Nullable: If it's null, it means NotFound.)
     */
    public static LdDBMeta findDBMeta(Object row) {
        return DBMetaCacheHandler.findDBMeta(row);
    }

    /**
     * @param rowType The type of row. (NotNull)
     * @param tableName The name of table. (NotNull)
     * @return The interface of DBMeta. (Nullable: If it's null, it means NotFound.)
     */
    public static LdDBMeta findDBMeta(Class<?> rowType, String tableName) {
        return DBMetaCacheHandler.findDBMeta(rowType, tableName);
    }

    protected static class DBMetaCacheHandler {
        
        /** The key of DBMeta cache. */
        protected static final String DBMETA_CACHE_KEY = "df:DBMetaCache";

        public static LdDBMeta findDBMeta(Object row) {
            if (!(row instanceof LdEntity)) {
                return null;
            }
            final LdEntity entity = (LdEntity) row;
            LdDBMeta dbmeta = findCachedDBMeta(entity.getClass());
            if (dbmeta != null) {
                return dbmeta;
            }
            dbmeta = entity.getDBMeta();
            cacheDBMeta(entity, dbmeta);
            return dbmeta;
        }
        
        public static LdDBMeta findDBMeta(Class<?> rowType, String tableName) {
            LdDBMeta dbmeta = findCachedDBMeta(rowType);
            if (dbmeta != null) {
                return dbmeta;
            }
            // No check because the table name is not always for domain.
            dbmeta = LdResourceContext.provideDBMeta(tableName);
            cacheDBMeta(rowType, dbmeta);
            return dbmeta;
        }

        protected static LdDBMeta findCachedDBMeta(Class<?> rowType) {
            Map<Class<?>, LdDBMeta> dbmetaCache = findDBMetaCache();
            if (dbmetaCache == null) {
                dbmetaCache = new HashMap<Class<?>, LdDBMeta>();
                LdInternalMapContext.setObject(DBMETA_CACHE_KEY, dbmetaCache);
            }
            return dbmetaCache.get(rowType);
        }
        
        protected static void cacheDBMeta(LdEntity entity, LdDBMeta dbmeta) {
            cacheDBMeta(entity.getClass(), dbmeta);
        }
        
        protected static void cacheDBMeta(Class<?> type, LdDBMeta dbmeta) {
            final Map<Class<?>, LdDBMeta> dbmetaCache = findDBMetaCache();
            dbmetaCache.put(type, dbmeta);
        }
        
        @SuppressWarnings("unchecked")
        protected static Map<Class<?>, LdDBMeta> findDBMetaCache() {
            return (Map<Class<?>, LdDBMeta>)LdInternalMapContext.getObject(DBMETA_CACHE_KEY);
        }
    }

    protected static LdDBMeta findDBMetaByClass(Class<?> beanClass) {
        final Object instance = newInstance(beanClass);
        if (!(instance instanceof LdEntity)) {
            return null;
        }
        return ((LdEntity)instance).getDBMeta();
    }

    protected static Object newInstance(Class<?> clazz) {
        try {
            return clazz.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return LdSimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public void setDBMeta(LdDBMeta dbmeta) {
        this._dbmeta = dbmeta;
    }
}
