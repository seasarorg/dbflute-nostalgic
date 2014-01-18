package com.example.dbflute.lucy.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.lucy.dbflute.allcommon.*;
import com.example.dbflute.lucy.dbflute.exentity.*;

/**
 * The DB meta of VENDOR_CHECK. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class VendorCheckDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final VendorCheckDbm _instance = new VendorCheckDbm();
    private VendorCheckDbm() {}
    public static VendorCheckDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgUYText(), "UYText");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgVendorCheckId implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getVendorCheckId(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setVendorCheckId(ctl(v)); }
    }
    public static class EpgDecimalDigit implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getDecimalDigit(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setDecimalDigit(ctb(v)); }
    }
    public static class EpgIntegerNonDigit implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getIntegerNonDigit(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setIntegerNonDigit(cti(v)); }
    }
    public static class EpgTypeOfBoolean implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfBoolean(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfBoolean((Boolean)v); }
    }
    public static class EpgTypeOfText implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getTypeOfText(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setTypeOfText((String)v); }
    }
    public static class EpgUYText implements PropertyGateway {
        public Object read(Entity e) { return ((VendorCheck)e).getUYText(); }
        public void write(Entity e, Object v) { ((VendorCheck)e).setUYText((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "VENDOR_CHECK";
    protected final String _tablePropertyName = "vendorCheck";
    protected final TableSqlName _tableSqlName = new TableSqlName("VENDOR_CHECK", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnVendorCheckId = cci("VENDOR_CHECK_ID", "VENDOR_CHECK_ID", null, null, true, "vendorCheckId", Long.class, true, false, "DECIMAL", 16, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDecimalDigit = cci("DECIMAL_DIGIT", "DECIMAL_DIGIT", null, null, true, "decimalDigit", java.math.BigDecimal.class, false, false, "DECIMAL", 5, 3, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnIntegerNonDigit = cci("INTEGER_NON_DIGIT", "INTEGER_NON_DIGIT", null, null, true, "integerNonDigit", Integer.class, false, false, "DECIMAL", 5, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfBoolean = cci("TYPE_OF_BOOLEAN", "TYPE_OF_BOOLEAN", null, null, true, "typeOfBoolean", Boolean.class, false, false, "BOOLEAN", 1, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTypeOfText = cci("TYPE_OF_TEXT", "TYPE_OF_TEXT", null, null, false, "typeOfText", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUYText = cci("U_Y_TEXT", "U_Y_TEXT", null, null, false, "UYText", String.class, false, false, "CLOB", 2147483647, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnVendorCheckId() { return _columnVendorCheckId; }
    public ColumnInfo columnDecimalDigit() { return _columnDecimalDigit; }
    public ColumnInfo columnIntegerNonDigit() { return _columnIntegerNonDigit; }
    public ColumnInfo columnTypeOfBoolean() { return _columnTypeOfBoolean; }
    public ColumnInfo columnTypeOfText() { return _columnTypeOfText; }
    public ColumnInfo columnUYText() { return _columnUYText; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnVendorCheckId());
        ls.add(columnDecimalDigit());
        ls.add(columnIntegerNonDigit());
        ls.add(columnTypeOfBoolean());
        ls.add(columnTypeOfText());
        ls.add(columnUYText());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnVendorCheckId()); }
    public boolean hasPrimaryKey() { return true; }
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
    public String getEntityTypeName() { return "com.example.dbflute.lucy.dbflute.exentity.VendorCheck"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.lucy.dbflute.cbean.VendorCheckCB"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.lucy.dbflute.exbhv.VendorCheckBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<VendorCheck> getEntityType() { return VendorCheck.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public VendorCheck newMyEntity() { return new VendorCheck(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((VendorCheck)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((VendorCheck)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
