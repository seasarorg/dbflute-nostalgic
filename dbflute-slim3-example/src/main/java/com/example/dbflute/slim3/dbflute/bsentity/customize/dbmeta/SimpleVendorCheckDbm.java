package com.example.dbflute.slim3.dbflute.bsentity.customize.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.slim3.dbflute.allcommon.*;
import com.example.dbflute.slim3.dbflute.exentity.customize.*;

/**
 * The DB meta of SimpleVendorCheck. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class SimpleVendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final SimpleVendorCheckDbm _instance = new SimpleVendorCheckDbm();
    private SimpleVendorCheckDbm() {}
    public static SimpleVendorCheckDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgVendorCheckId(), "vendorCheckId");
        setupEpg(_epgMap, new EpgDecimalDigit(), "decimalDigit");
        setupEpg(_epgMap, new EpgIntegerNonDigit(), "integerNonDigit");
        setupEpg(_epgMap, new EpgTypeOfBoolean(), "typeOfBoolean");
        setupEpg(_epgMap, new EpgTypeOfText(), "typeOfText");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((SimpleVendorCheck)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((SimpleVendorCheck)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgDecimalDigit implements PropertyGateway {
        public Object read(Entity e) { return ((SimpleVendorCheck)e).getDecimalDigit(); }
        public void write(Entity e, Object v) { ((SimpleVendorCheck)e).setDecimalDigit(ctb(v)); }
    }
    public static class EpgIntegerNonDigit implements PropertyGateway {
        public Object read(Entity e) { return ((SimpleVendorCheck)e).getIntegerNonDigit(); }
        public void write(Entity e, Object v) { ((SimpleVendorCheck)e).setIntegerNonDigit(cti(v)); }
    }
    public static class EpgTypeOfBoolean implements PropertyGateway {
        public Object read(Entity e) { return ((SimpleVendorCheck)e).getTypeOfBoolean(); }
        public void write(Entity e, Object v) { ((SimpleVendorCheck)e).setTypeOfBoolean((Boolean)v); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity e) { return ((SimpleVendorCheck)e).getTypeOfText(); }
        public void write(Entity e, Object v) { ((SimpleVendorCheck)e).setTypeOfText((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "SimpleVendorCheck";
    protected final String _tablePropertyName = "simpleVendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("SimpleVendorCheck", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, false, "vendorCheckId", Long.class, false, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDecimalDigit = cci("DECIMAL_DIGIT", "DECIMAL_DIGIT", null, null, false, "decimalDigit", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIntegerNonDigit = cci("INTEGER_NON_DIGIT", "INTEGER_NON_DIGIT", null, null, false, "integerNonDigit", Integer.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBoolean = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, false, "typeOfBoolean", Boolean.class, false, false, "BOOLEAN", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, false, "typeOfText", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnDecimalDigit() { return _columnDecimalDigit; }
    public ColumnInfo columnIntegerNonDigit() { return _columnIntegerNonDigit; }
    public ColumnInfo columnTypeOfBoolean() { return _columnTypeOfBoolean; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnDecimalDigit());
        ls.add(columnIntegerNonDigit());
        ls.add(columnTypeOfBoolean());
        ls.add(columnTypeOfText());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() {
        throw new UnsupportedOperationException("The table does not have primary key: " + getTableDbName());
    }
    public boolean hasPrimaryKey() { return false; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.slim3.dbflute.exentity.customize.SimpleVendorCheck"; }
    public String getConditionBeanTypeName() { return null; }
    public String getDaoTypeName() { return null; }
    public String getBehaviorTypeName() { return null; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<SimpleVendorCheck> getEntityType() { return SimpleVendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public SimpleVendorCheck newMyEntity() { return new SimpleVendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((SimpleVendorCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((SimpleVendorCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
