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
 * The DB meta of BURISTATEUNDOLOG. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateUndoLogDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriStateUndoLogDbm _instance = new BuriStateUndoLogDbm();
    private BuriStateUndoLogDbm() {}
    public static BuriStateUndoLogDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgStateUndoLogId(), "stateUndoLogId");
        setupEpg(_epgMap, new EpgStateId(), "stateId");
        setupEpg(_epgMap, new EpgBranchId(), "branchId");
        setupEpg(_epgMap, new EpgPathId(), "pathId");
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgUserIdVal(), "userIdVal");
        setupEpg(_epgMap, new EpgAutoRunTime(), "autoRunTime");
        setupEpg(_epgMap, new EpgUserIdNum(), "userIdNum");
        setupEpg(_epgMap, new EpgInsertDate(), "insertDate");
        setupEpg(_epgMap, new EpgBtid(), "btid");
        setupEpg(_epgMap, new EpgProcessDate(), "processDate");
        setupEpg(_epgMap, new EpgAbortDate(), "abortDate");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
        setupEpg(_epgMap, new EpgCreateBtid(), "createBtid");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgStateUndoLogId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getStateUndoLogId(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setStateUndoLogId(ctl(v)); }
    }
    public static class EpgStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getStateId(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setStateId(ctl(v)); }
    }
    public static class EpgBranchId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getBranchId(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setBranchId(ctl(v)); }
    }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setPathId(ctl(v)); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setDataId(ctl(v)); }
    }
    public static class EpgUserIdVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getUserIdVal(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setUserIdVal((String)v); }
    }
    public static class EpgAutoRunTime implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getAutoRunTime(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setAutoRunTime((java.sql.Timestamp)v); }
    }
    public static class EpgUserIdNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getUserIdNum(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setUserIdNum(ctl(v)); }
    }
    public static class EpgInsertDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getInsertDate(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setInsertDate((java.sql.Timestamp)v); }
    }
    public static class EpgBtid implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getBtid(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setBtid(ctl(v)); }
    }
    public static class EpgProcessDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getProcessDate(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setProcessDate((java.sql.Timestamp)v); }
    }
    public static class EpgAbortDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getAbortDate(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setAbortDate((java.sql.Timestamp)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setVersionNo(ctb(v)); }
    }
    public static class EpgCreateBtid implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUndoLog)e).getCreateBtid(); }
        public void write(Entity e, Object v) { ((BuriStateUndoLog)e).setCreateBtid(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURISTATEUNDOLOG";
    protected final String _tablePropertyName = "buriStateUndoLog";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURISTATEUNDOLOG", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStateUndoLogId = cci("STATEUNDOLOGID", "STATEUNDOLOGID", null, null, true, "stateUndoLogId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStateId = cci("STATEID", "STATEID", null, null, true, "stateId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBranchId = cci("BRANCHID", "BRANCHID", null, null, false, "branchId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, false, "pathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, false, "dataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdVal = cci("USERIDVAL", "USERIDVAL", null, null, false, "userIdVal", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAutoRunTime = cci("AUTORUNTIME", "AUTORUNTIME", null, null, false, "autoRunTime", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdNum = cci("USERIDNUM", "USERIDNUM", null, null, false, "userIdNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInsertDate = cci("INSERTDATE", "INSERTDATE", null, null, true, "insertDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBtid = cci("BTID", "BTID", null, null, true, "btid", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProcessDate = cci("PROCESSDATE", "PROCESSDATE", null, null, false, "processDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAbortDate = cci("ABORTDATE", "ABORTDATE", null, null, true, "abortDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSIONNO", "VERSIONNO", null, null, true, "versionNo", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);
    protected final ColumnInfo _columnCreateBtid = cci("CREATEBTID", "CREATEBTID", null, null, true, "createBtid", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnStateUndoLogId() { return _columnStateUndoLogId; }
    public ColumnInfo columnStateId() { return _columnStateId; }
    public ColumnInfo columnBranchId() { return _columnBranchId; }
    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnUserIdVal() { return _columnUserIdVal; }
    public ColumnInfo columnAutoRunTime() { return _columnAutoRunTime; }
    public ColumnInfo columnUserIdNum() { return _columnUserIdNum; }
    public ColumnInfo columnInsertDate() { return _columnInsertDate; }
    public ColumnInfo columnBtid() { return _columnBtid; }
    public ColumnInfo columnProcessDate() { return _columnProcessDate; }
    public ColumnInfo columnAbortDate() { return _columnAbortDate; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }
    public ColumnInfo columnCreateBtid() { return _columnCreateBtid; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStateUndoLogId());
        ls.add(columnStateId());
        ls.add(columnBranchId());
        ls.add(columnPathId());
        ls.add(columnDataId());
        ls.add(columnUserIdVal());
        ls.add(columnAutoRunTime());
        ls.add(columnUserIdNum());
        ls.add(columnInsertDate());
        ls.add(columnBtid());
        ls.add(columnProcessDate());
        ls.add(columnAbortDate());
        ls.add(columnVersionNo());
        ls.add(columnCreateBtid());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnStateUndoLogId()); }
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
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriStateUndoLog"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriStateUndoLogCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriStateUndoLogDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriStateUndoLogBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriStateUndoLog> getEntityType() { return BuriStateUndoLog.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriStateUndoLog newMyEntity() { return new BuriStateUndoLog(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriStateUndoLog)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriStateUndoLog)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
