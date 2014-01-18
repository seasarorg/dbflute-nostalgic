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
 * The DB meta of BURIPATHDATA. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriPathDataDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriPathDataDbm _instance = new BuriPathDataDbm();
    private BuriPathDataDbm() {}
    public static BuriPathDataDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgPathId(), "pathId");
        setupEpg(_epgMap, new EpgPathName(), "pathName");
        setupEpg(_epgMap, new EpgRealPathName(), "realPathName");
        setupEpg(_epgMap, new EpgPathType(), "pathType");
        setupEpg(_epgMap, new EpgPkeyNum(), "pkeyNum");
        setupEpg(_epgMap, new EpgPkeyVal(), "pkeyVal");
        setupEpg(_epgMap, new EpgDataType(), "dataType");
        setupEpg(_epgMap, new EpgTableName(), "tableName");
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgStateId(), "stateId");
        setupEpg(_epgMap, new EpgAutoRunTime(), "autoRunTime");
        setupEpg(_epgMap, new EpgParticipantName(), "participantName");
        setupEpg(_epgMap, new EpgParticipantType(), "participantType");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setPathId(ctl(v)); }
    }
    public static class EpgPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getPathName(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setPathName((String)v); }
    }
    public static class EpgRealPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getRealPathName(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setRealPathName((String)v); }
    }
    public static class EpgPathType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getPathType(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setPathType(ctb(v)); }
    }
    public static class EpgPkeyNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getPkeyNum(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setPkeyNum(ctl(v)); }
    }
    public static class EpgPkeyVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getPkeyVal(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setPkeyVal((String)v); }
    }
    public static class EpgDataType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getDataType(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setDataType((String)v); }
    }
    public static class EpgTableName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getTableName(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setTableName((String)v); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setDataId(ctl(v)); }
    }
    public static class EpgStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getStateId(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setStateId(ctl(v)); }
    }
    public static class EpgAutoRunTime implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getAutoRunTime(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setAutoRunTime((java.sql.Timestamp)v); }
    }
    public static class EpgParticipantName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getParticipantName(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setParticipantName((String)v); }
    }
    public static class EpgParticipantType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathData)e).getParticipantType(); }
        public void write(Entity e, Object v) { ((BuriPathData)e).setParticipantType((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIPATHDATA";
    protected final String _tablePropertyName = "buriPathData";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIPATHDATA", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, true, "pathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathName = cci("PATHNAME", "PATHNAME", null, null, true, "pathName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRealPathName = cci("REALPATHNAME", "REALPATHNAME", null, null, true, "realPathName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathType = cci("PATHTYPE", "PATHTYPE", null, null, false, "pathType", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPkeyNum = cci("PKEYNUM", "PKEYNUM", null, null, false, "pkeyNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPkeyVal = cci("PKEYVAL", "PKEYVAL", null, null, false, "pkeyVal", String.class, false, false, "VARCHAR2", 250, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDataType = cci("DATATYPE", "DATATYPE", null, null, true, "dataType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnTableName = cci("TABLENAME", "TABLENAME", null, null, false, "tableName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, true, "dataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStateId = cci("STATEID", "STATEID", null, null, true, "stateId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAutoRunTime = cci("AUTORUNTIME", "AUTORUNTIME", null, null, true, "autoRunTime", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantName = cci("PARTICIPANTNAME", "PARTICIPANTNAME", null, null, false, "participantName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantType = cci("PARTICIPANTTYPE", "PARTICIPANTTYPE", null, null, false, "participantType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnPathName() { return _columnPathName; }
    public ColumnInfo columnRealPathName() { return _columnRealPathName; }
    public ColumnInfo columnPathType() { return _columnPathType; }
    public ColumnInfo columnPkeyNum() { return _columnPkeyNum; }
    public ColumnInfo columnPkeyVal() { return _columnPkeyVal; }
    public ColumnInfo columnDataType() { return _columnDataType; }
    public ColumnInfo columnTableName() { return _columnTableName; }
    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnStateId() { return _columnStateId; }
    public ColumnInfo columnAutoRunTime() { return _columnAutoRunTime; }
    public ColumnInfo columnParticipantName() { return _columnParticipantName; }
    public ColumnInfo columnParticipantType() { return _columnParticipantType; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPathId());
        ls.add(columnPathName());
        ls.add(columnRealPathName());
        ls.add(columnPathType());
        ls.add(columnPkeyNum());
        ls.add(columnPkeyVal());
        ls.add(columnDataType());
        ls.add(columnTableName());
        ls.add(columnDataId());
        ls.add(columnStateId());
        ls.add(columnAutoRunTime());
        ls.add(columnParticipantName());
        ls.add(columnParticipantType());
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
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriPathData"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriPathDataCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriPathDataDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriPathDataBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriPathData> getEntityType() { return BuriPathData.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriPathData newMyEntity() { return new BuriPathData(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriPathData)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriPathData)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
