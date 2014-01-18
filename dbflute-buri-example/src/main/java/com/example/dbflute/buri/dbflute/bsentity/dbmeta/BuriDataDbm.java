package com.example.dbflute.buri.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.buri.dbflute.allcommon.*;
import com.example.dbflute.buri.dbflute.exentity.*;

/**
 * The DB meta of BURIDATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriDataDbm _instance = new BuriDataDbm();
    private BuriDataDbm() {}
    public static BuriDataDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgPkeyVal(), "pkeyVal");
        setupEpg(_epgMap, new EpgPkeyNum(), "pkeyNum");
        setupEpg(_epgMap, new EpgDataType(), "dataType");
        setupEpg(_epgMap, new EpgTableName(), "tableName");
        setupEpg(_epgMap, new EpgInsertUserId(), "insertUserId");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriData)e).setDataId(ctl(v)); }
    }
    public static class EpgPkeyVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getPkeyVal(); }
        public void write(Entity e, Object v) { ((BuriData)e).setPkeyVal((String)v); }
    }
    public static class EpgPkeyNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getPkeyNum(); }
        public void write(Entity e, Object v) { ((BuriData)e).setPkeyNum(ctl(v)); }
    }
    public static class EpgDataType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getDataType(); }
        public void write(Entity e, Object v) { ((BuriData)e).setDataType((String)v); }
    }
    public static class EpgTableName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getTableName(); }
        public void write(Entity e, Object v) { ((BuriData)e).setTableName((String)v); }
    }
    public static class EpgInsertUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriData)e).getInsertUserId(); }
        public void write(Entity e, Object v) { ((BuriData)e).setInsertUserId(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIDATA";
    protected final String _tablePropertyName = "buriData";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIDATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, true, "dataId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, "buriStateList,buriBranchList", null);
    protected final ColumnInfo _columnPkeyVal = cci("PKEYVAL", "PKEYVAL", null, null, false, "pkeyVal", String.class, false, false, "VARCHAR2", 250, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPkeyNum = cci("PKEYNUM", "PKEYNUM", null, null, false, "pkeyNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDataType = cci("DATATYPE", "DATATYPE", null, null, true, "dataType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTableName = cci("TABLENAME", "TABLENAME", null, null, false, "tableName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInsertUserId = cci("INSERTUSERID", "INSERTUSERID", null, null, false, "insertUserId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnPkeyVal() { return _columnPkeyVal; }
    public ColumnInfo columnPkeyNum() { return _columnPkeyNum; }
    public ColumnInfo columnDataType() { return _columnDataType; }
    public ColumnInfo columnTableName() { return _columnTableName; }
    public ColumnInfo columnInsertUserId() { return _columnInsertUserId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnDataId());
        ls.add(columnPkeyVal());
        ls.add(columnPkeyNum());
        ls.add(columnDataType());
        ls.add(columnTableName());
        ls.add(columnInsertUserId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnDataId()); }
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
    public ReferrerInfo referrerBuriStateList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnDataId(), BuriStateDbm.getInstance().columnDataId());
        return cri("FK_BURISTATE_BURIDATA", "buriStateList", this, BuriStateDbm.getInstance(), map, false, "buriData");
    }
    public ReferrerInfo referrerBuriBranchList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnDataId(), BuriBranchDbm.getInstance().columnDataId());
        return cri("FK_BURIBRANCH_BURIDATA", "buriBranchList", this, BuriBranchDbm.getInstance(), map, false, "buriData");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriData"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriDataCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriDataDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriData> getEntityType() { return BuriData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriData newMyEntity() { return new BuriData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriData)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriData)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
