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
 * The DB meta of BURI_ALL_ROUND_STATE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriAllRoundStateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriAllRoundStateDbm _instance = new BuriAllRoundStateDbm();
    private BuriAllRoundStateDbm() {}
    public static BuriAllRoundStateDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgInternalStateId(), "internalStateId");
        setupEpg(_epgMap, new EpgStatusUpdateDatetime(), "statusUpdateDatetime");
        setupEpg(_epgMap, new EpgParticipantName(), "participantName");
        setupEpg(_epgMap, new EpgParticipantType(), "participantType");
        setupEpg(_epgMap, new EpgInternalPathId(), "internalPathId");
        setupEpg(_epgMap, new EpgStatusPathName(), "statusPathName");
        setupEpg(_epgMap, new EpgInternalDataId(), "internalDataId");
        setupEpg(_epgMap, new EpgInternalPkValue(), "internalPkValue");
        setupEpg(_epgMap, new EpgInternalDataType(), "internalDataType");
        setupEpg(_epgMap, new EpgInternalUserId(), "internalUserId");
        setupEpg(_epgMap, new EpgStatusUpdateUser(), "statusUpdateUser");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgInternalStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalStateId(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalStateId(ctl(v)); }
    }
    public static class EpgStatusUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getStatusUpdateDatetime(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setStatusUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgParticipantName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getParticipantName(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setParticipantName((String)v); }
    }
    public static class EpgParticipantType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getParticipantType(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setParticipantType((String)v); }
    }
    public static class EpgInternalPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalPathId(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalPathId(ctl(v)); }
    }
    public static class EpgStatusPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getStatusPathName(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setStatusPathName((String)v); }
    }
    public static class EpgInternalDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalDataId(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalDataId(ctl(v)); }
    }
    public static class EpgInternalPkValue implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalPkValue(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalPkValue(ctl(v)); }
    }
    public static class EpgInternalDataType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalDataType(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalDataType((String)v); }
    }
    public static class EpgInternalUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getInternalUserId(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setInternalUserId(ctl(v)); }
    }
    public static class EpgStatusUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((BuriAllRoundState)e).getStatusUpdateUser(); }
        public void write(Entity e, Object v) { ((BuriAllRoundState)e).setStatusUpdateUser((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURI_ALL_ROUND_STATE";
    protected final String _tablePropertyName = "buriAllRoundState";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURI_ALL_ROUND_STATE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnInternalStateId = cci("INTERNAL_STATE_ID", "INTERNAL_STATE_ID", null, null, true, "internalStateId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusUpdateDatetime = cci("STATUS_UPDATE_DATETIME", "STATUS_UPDATE_DATETIME", null, null, true, "statusUpdateDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantName = cci("PARTICIPANT_NAME", "PARTICIPANT_NAME", null, null, false, "participantName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnParticipantType = cci("PARTICIPANT_TYPE", "PARTICIPANT_TYPE", null, null, false, "participantType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInternalPathId = cci("INTERNAL_PATH_ID", "INTERNAL_PATH_ID", null, null, true, "internalPathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusPathName = cci("STATUS_PATH_NAME", "STATUS_PATH_NAME", null, null, true, "statusPathName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInternalDataId = cci("INTERNAL_DATA_ID", "INTERNAL_DATA_ID", null, null, true, "internalDataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInternalPkValue = cci("INTERNAL_PK_VALUE", "INTERNAL_PK_VALUE", null, null, false, "internalPkValue", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "document", null, null);
    protected final ColumnInfo _columnInternalDataType = cci("INTERNAL_DATA_TYPE", "INTERNAL_DATA_TYPE", null, null, true, "internalDataType", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInternalUserId = cci("INTERNAL_USER_ID", "INTERNAL_USER_ID", null, null, false, "internalUserId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStatusUpdateUser = cci("STATUS_UPDATE_USER", "STATUS_UPDATE_USER", null, null, false, "statusUpdateUser", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnInternalStateId() { return _columnInternalStateId; }
    public ColumnInfo columnStatusUpdateDatetime() { return _columnStatusUpdateDatetime; }
    public ColumnInfo columnParticipantName() { return _columnParticipantName; }
    public ColumnInfo columnParticipantType() { return _columnParticipantType; }
    public ColumnInfo columnInternalPathId() { return _columnInternalPathId; }
    public ColumnInfo columnStatusPathName() { return _columnStatusPathName; }
    public ColumnInfo columnInternalDataId() { return _columnInternalDataId; }
    public ColumnInfo columnInternalPkValue() { return _columnInternalPkValue; }
    public ColumnInfo columnInternalDataType() { return _columnInternalDataType; }
    public ColumnInfo columnInternalUserId() { return _columnInternalUserId; }
    public ColumnInfo columnStatusUpdateUser() { return _columnStatusUpdateUser; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnInternalStateId());
        ls.add(columnStatusUpdateDatetime());
        ls.add(columnParticipantName());
        ls.add(columnParticipantType());
        ls.add(columnInternalPathId());
        ls.add(columnStatusPathName());
        ls.add(columnInternalDataId());
        ls.add(columnInternalPkValue());
        ls.add(columnInternalDataType());
        ls.add(columnInternalUserId());
        ls.add(columnStatusUpdateUser());
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
    public ForeignInfo foreignDocument() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnInternalPkValue(), DocumentDbm.getInstance().columnId());
        return cfi("FK_BURI_ALL_ROUND_STATE_DOCUMENT_IMPLICIT", "document", this, DocumentDbm.getInstance(), map, 0, false, false, false, true, null, false, "buriAllRoundStateList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriAllRoundState"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriAllRoundStateCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriAllRoundStateDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriAllRoundStateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriAllRoundState> getEntityType() { return BuriAllRoundState.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriAllRoundState newMyEntity() { return new BuriAllRoundState(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriAllRoundState)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriAllRoundState)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
