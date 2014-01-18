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
 * The DB meta of BURISTATE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriStateDbm _instance = new BuriStateDbm();
    private BuriStateDbm() {}
    public static BuriStateDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgStateId(), "stateId");
        setupEpg(_epgMap, new EpgPathId(), "pathId");
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgBranchId(), "branchId");
        setupEpg(_epgMap, new EpgUserIdVal(), "userIdVal");
        setupEpg(_epgMap, new EpgUserIdNum(), "userIdNum");
        setupEpg(_epgMap, new EpgParticipantName(), "participantName");
        setupEpg(_epgMap, new EpgParticipantType(), "participantType");
        setupEpg(_epgMap, new EpgBtid(), "btid");
        setupEpg(_epgMap, new EpgInsertDate(), "insertDate");
        setupEpg(_epgMap, new EpgAutoRunTime(), "autoRunTime");
        setupEpg(_epgMap, new EpgProcessDate(), "processDate");
        setupEpg(_epgMap, new EpgAbortDate(), "abortDate");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getStateId(); }
        public void write(Entity e, Object v) { ((BuriState)e).setStateId(ctl(v)); }
    }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriState)e).setPathId(ctl(v)); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriState)e).setDataId(ctl(v)); }
    }
    public static class EpgBranchId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getBranchId(); }
        public void write(Entity e, Object v) { ((BuriState)e).setBranchId(ctl(v)); }
    }
    public static class EpgUserIdVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getUserIdVal(); }
        public void write(Entity e, Object v) { ((BuriState)e).setUserIdVal((String)v); }
    }
    public static class EpgUserIdNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getUserIdNum(); }
        public void write(Entity e, Object v) { ((BuriState)e).setUserIdNum(ctl(v)); }
    }
    public static class EpgParticipantName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getParticipantName(); }
        public void write(Entity e, Object v) { ((BuriState)e).setParticipantName((String)v); }
    }
    public static class EpgParticipantType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getParticipantType(); }
        public void write(Entity e, Object v) { ((BuriState)e).setParticipantType((String)v); }
    }
    public static class EpgBtid implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getBtid(); }
        public void write(Entity e, Object v) { ((BuriState)e).setBtid(ctl(v)); }
    }
    public static class EpgInsertDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getInsertDate(); }
        public void write(Entity e, Object v) { ((BuriState)e).setInsertDate((java.sql.Timestamp)v); }
    }
    public static class EpgAutoRunTime implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getAutoRunTime(); }
        public void write(Entity e, Object v) { ((BuriState)e).setAutoRunTime((java.sql.Timestamp)v); }
    }
    public static class EpgProcessDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getProcessDate(); }
        public void write(Entity e, Object v) { ((BuriState)e).setProcessDate((java.sql.Timestamp)v); }
    }
    public static class EpgAbortDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getAbortDate(); }
        public void write(Entity e, Object v) { ((BuriState)e).setAbortDate((java.sql.Timestamp)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((BuriState)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((BuriState)e).setVersionNo(ctb(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURISTATE";
    protected final String _tablePropertyName = "buriState";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURISTATE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStateId = cci("STATEID", "STATEID", null, null, true, "stateId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, "buriStateUserList", null);
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, false, "pathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriPath", null, null);
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, false, "dataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriData", null, null);
    protected final ColumnInfo _columnBranchId = cci("BRANCHID", "BRANCHID", null, null, false, "branchId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriBranch", null, null);
    protected final ColumnInfo _columnUserIdVal = cci("USERIDVAL", "USERIDVAL", null, null, false, "userIdVal", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdNum = cci("USERIDNUM", "USERIDNUM", null, null, false, "userIdNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantName = cci("PARTICIPANTNAME", "PARTICIPANTNAME", null, null, false, "participantName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantType = cci("PARTICIPANTTYPE", "PARTICIPANTTYPE", null, null, false, "participantType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBtid = cci("BTID", "BTID", null, null, true, "btid", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInsertDate = cci("INSERTDATE", "INSERTDATE", null, null, true, "insertDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAutoRunTime = cci("AUTORUNTIME", "AUTORUNTIME", null, null, true, "autoRunTime", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProcessDate = cci("PROCESSDATE", "PROCESSDATE", null, null, true, "processDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAbortDate = cci("ABORTDATE", "ABORTDATE", null, null, true, "abortDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSIONNO", "VERSIONNO", null, null, true, "versionNo", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnStateId() { return _columnStateId; }
    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnBranchId() { return _columnBranchId; }
    public ColumnInfo columnUserIdVal() { return _columnUserIdVal; }
    public ColumnInfo columnUserIdNum() { return _columnUserIdNum; }
    public ColumnInfo columnParticipantName() { return _columnParticipantName; }
    public ColumnInfo columnParticipantType() { return _columnParticipantType; }
    public ColumnInfo columnBtid() { return _columnBtid; }
    public ColumnInfo columnInsertDate() { return _columnInsertDate; }
    public ColumnInfo columnAutoRunTime() { return _columnAutoRunTime; }
    public ColumnInfo columnProcessDate() { return _columnProcessDate; }
    public ColumnInfo columnAbortDate() { return _columnAbortDate; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStateId());
        ls.add(columnPathId());
        ls.add(columnDataId());
        ls.add(columnBranchId());
        ls.add(columnUserIdVal());
        ls.add(columnUserIdNum());
        ls.add(columnParticipantName());
        ls.add(columnParticipantType());
        ls.add(columnBtid());
        ls.add(columnInsertDate());
        ls.add(columnAutoRunTime());
        ls.add(columnProcessDate());
        ls.add(columnAbortDate());
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnStateId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBuriPath() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnPathId(), BuriPathDbm.getInstance().columnPathId());
        return cfi("FK_BURISTATE_BURIPATH", "buriPath", this, BuriPathDbm.getInstance(), map, 0, false, false, false, true, null, false, "buriStateList");
    }
    public ForeignInfo foreignBuriData() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnDataId(), BuriDataDbm.getInstance().columnDataId());
        return cfi("FK_BURISTATE_BURIDATA", "buriData", this, BuriDataDbm.getInstance(), map, 1, false, false, false, true, null, false, "buriStateList");
    }
    public ForeignInfo foreignBuriBranch() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBranchId(), BuriBranchDbm.getInstance().columnBranchId());
        return cfi("FK_BURISTATE_BURIBRANCH", "buriBranch", this, BuriBranchDbm.getInstance(), map, 2, false, false, false, true, null, false, "buriStateList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerBuriStateUserList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStateId(), BuriStateUserDbm.getInstance().columnStateId());
        return cri("FK_BURISTATEUSER_BURISTATE", "buriStateUserList", this, BuriStateUserDbm.getInstance(), map, false, "buriState");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriState"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriStateCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriStateDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriStateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriState> getEntityType() { return BuriState.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriState newMyEntity() { return new BuriState(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriState)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriState)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
