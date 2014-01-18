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
 * The DB meta of BURIPATHHISTORYDATAUSER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriPathHistoryDataUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriPathHistoryDataUserDbm _instance = new BuriPathHistoryDataUserDbm();
    private BuriPathHistoryDataUserDbm() {}
    public static BuriPathHistoryDataUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, new EpgInsertDate(), "insertDate");
        setupEpg(_epgMap, new EpgProcessDate(), "processDate");
        setupEpg(_epgMap, new EpgAbortDate(), "abortDate");
        setupEpg(_epgMap, new EpgParticipantName(), "participantName");
        setupEpg(_epgMap, new EpgParticipantType(), "participantType");
        setupEpg(_epgMap, new EpgBuriUserId(), "buriUserId");
        setupEpg(_epgMap, new EpgUserIdVal(), "userIdVal");
        setupEpg(_epgMap, new EpgUserIdNum(), "userIdNum");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setPathId(ctl(v)); }
    }
    public static class EpgPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getPathName(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setPathName((String)v); }
    }
    public static class EpgRealPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getRealPathName(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setRealPathName((String)v); }
    }
    public static class EpgPathType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getPathType(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setPathType(ctb(v)); }
    }
    public static class EpgPkeyNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getPkeyNum(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setPkeyNum(ctl(v)); }
    }
    public static class EpgPkeyVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getPkeyVal(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setPkeyVal((String)v); }
    }
    public static class EpgDataType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getDataType(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setDataType((String)v); }
    }
    public static class EpgTableName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getTableName(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setTableName((String)v); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setDataId(ctl(v)); }
    }
    public static class EpgStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getStateId(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setStateId(ctl(v)); }
    }
    public static class EpgAutoRunTime implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getAutoRunTime(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setAutoRunTime((java.sql.Timestamp)v); }
    }
    public static class EpgInsertDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getInsertDate(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setInsertDate((java.sql.Timestamp)v); }
    }
    public static class EpgProcessDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getProcessDate(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setProcessDate((java.sql.Timestamp)v); }
    }
    public static class EpgAbortDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getAbortDate(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setAbortDate((java.sql.Timestamp)v); }
    }
    public static class EpgParticipantName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getParticipantName(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setParticipantName((String)v); }
    }
    public static class EpgParticipantType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getParticipantType(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setParticipantType((String)v); }
    }
    public static class EpgBuriUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getBuriUserId(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setBuriUserId(ctl(v)); }
    }
    public static class EpgUserIdVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getUserIdVal(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setUserIdVal((String)v); }
    }
    public static class EpgUserIdNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPathHistoryDataUser)e).getUserIdNum(); }
        public void write(Entity e, Object v) { ((BuriPathHistoryDataUser)e).setUserIdNum(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIPATHHISTORYDATAUSER";
    protected final String _tablePropertyName = "buriPathHistoryDataUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIPATHHISTORYDATAUSER", _tableDbName);
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
    protected final ColumnInfo _columnInsertDate = cci("INSERTDATE", "INSERTDATE", null, null, true, "insertDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnProcessDate = cci("PROCESSDATE", "PROCESSDATE", null, null, true, "processDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAbortDate = cci("ABORTDATE", "ABORTDATE", null, null, true, "abortDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantName = cci("PARTICIPANTNAME", "PARTICIPANTNAME", null, null, false, "participantName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantType = cci("PARTICIPANTTYPE", "PARTICIPANTTYPE", null, null, false, "participantType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBuriUserId = cci("BURIUSERID", "BURIUSERID", null, null, true, "buriUserId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdVal = cci("USERIDVAL", "USERIDVAL", null, null, false, "userIdVal", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdNum = cci("USERIDNUM", "USERIDNUM", null, null, false, "userIdNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);

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
    public ColumnInfo columnInsertDate() { return _columnInsertDate; }
    public ColumnInfo columnProcessDate() { return _columnProcessDate; }
    public ColumnInfo columnAbortDate() { return _columnAbortDate; }
    public ColumnInfo columnParticipantName() { return _columnParticipantName; }
    public ColumnInfo columnParticipantType() { return _columnParticipantType; }
    public ColumnInfo columnBuriUserId() { return _columnBuriUserId; }
    public ColumnInfo columnUserIdVal() { return _columnUserIdVal; }
    public ColumnInfo columnUserIdNum() { return _columnUserIdNum; }

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
        ls.add(columnInsertDate());
        ls.add(columnProcessDate());
        ls.add(columnAbortDate());
        ls.add(columnParticipantName());
        ls.add(columnParticipantType());
        ls.add(columnBuriUserId());
        ls.add(columnUserIdVal());
        ls.add(columnUserIdNum());
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
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriPathHistoryDataUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriPathHistoryDataUserCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriPathHistoryDataUserDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriPathHistoryDataUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriPathHistoryDataUser> getEntityType() { return BuriPathHistoryDataUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriPathHistoryDataUser newMyEntity() { return new BuriPathHistoryDataUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriPathHistoryDataUser)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriPathHistoryDataUser)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
