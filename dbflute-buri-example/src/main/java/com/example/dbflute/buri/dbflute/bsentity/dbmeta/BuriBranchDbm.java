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
 * The DB meta of BURIBRANCH. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriBranchDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriBranchDbm _instance = new BuriBranchDbm();
    private BuriBranchDbm() {}
    public static BuriBranchDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBranchId(), "branchId");
        setupEpg(_epgMap, new EpgParentBranchId(), "parentBranchId");
        setupEpg(_epgMap, new EpgPathId(), "pathId");
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgProcessDate(), "processDate");
        setupEpg(_epgMap, new EpgBtid(), "btid");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBranchId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getBranchId(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setBranchId(ctl(v)); }
    }
    public static class EpgParentBranchId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getParentBranchId(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setParentBranchId(ctl(v)); }
    }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setPathId(ctl(v)); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setDataId(ctl(v)); }
    }
    public static class EpgProcessDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getProcessDate(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setProcessDate((java.sql.Timestamp)v); }
    }
    public static class EpgBtid implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getBtid(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setBtid(ctb(v)); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((BuriBranch)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((BuriBranch)e).setVersionNo(ctb(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIBRANCH";
    protected final String _tablePropertyName = "buriBranch";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIBRANCH", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBranchId = cci("BRANCHID", "BRANCHID", null, null, true, "branchId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, "buriStateList", null);
    protected final ColumnInfo _columnParentBranchId = cci("PARENTBRANCHID", "PARENTBRANCHID", null, null, false, "parentBranchId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, false, "pathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriPath", null, null);
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, false, "dataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriData", null, null);
    protected final ColumnInfo _columnProcessDate = cci("PROCESSDATE", "PROCESSDATE", null, null, false, "processDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBtid = cci("BTID", "BTID", null, null, true, "btid", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSIONNO", "VERSIONNO", null, null, true, "versionNo", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnBranchId() { return _columnBranchId; }
    public ColumnInfo columnParentBranchId() { return _columnParentBranchId; }
    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnProcessDate() { return _columnProcessDate; }
    public ColumnInfo columnBtid() { return _columnBtid; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnBranchId());
        ls.add(columnParentBranchId());
        ls.add(columnPathId());
        ls.add(columnDataId());
        ls.add(columnProcessDate());
        ls.add(columnBtid());
        ls.add(columnVersionNo());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnBranchId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBuriData() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnDataId(), BuriDataDbm.getInstance().columnDataId());
        return cfi("FK_BURIBRANCH_BURIDATA", "buriData", this, BuriDataDbm.getInstance(), map, 0, false, false, false, true, null, false, "buriBranchList");
    }
    public ForeignInfo foreignBuriPath() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnPathId(), BuriPathDbm.getInstance().columnPathId());
        return cfi("FK_BURIBRANCH_BURIPATH", "buriPath", this, BuriPathDbm.getInstance(), map, 1, false, false, false, true, null, false, "buriBranchList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerBuriStateList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBranchId(), BuriStateDbm.getInstance().columnBranchId());
        return cri("FK_BURISTATE_BURIBRANCH", "buriStateList", this, BuriStateDbm.getInstance(), map, false, "buriBranch");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriBranch"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriBranchCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriBranchDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriBranchBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriBranch> getEntityType() { return BuriBranch.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriBranch newMyEntity() { return new BuriBranch(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriBranch)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriBranch)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
