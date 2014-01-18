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
 * The DB meta of BURISTATEUSER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriStateUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriStateUserDbm _instance = new BuriStateUserDbm();
    private BuriStateUserDbm() {}
    public static BuriStateUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgStateUserId(), "stateUserId");
        setupEpg(_epgMap, new EpgStateId(), "stateId");
        setupEpg(_epgMap, new EpgBuriUserId(), "buriUserId");
        setupEpg(_epgMap, new EpgInsertDate(), "insertDate");
        setupEpg(_epgMap, new EpgDeleteDate(), "deleteDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgStateUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUser)e).getStateUserId(); }
        public void write(Entity e, Object v) { ((BuriStateUser)e).setStateUserId(ctl(v)); }
    }
    public static class EpgStateId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUser)e).getStateId(); }
        public void write(Entity e, Object v) { ((BuriStateUser)e).setStateId(ctl(v)); }
    }
    public static class EpgBuriUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUser)e).getBuriUserId(); }
        public void write(Entity e, Object v) { ((BuriStateUser)e).setBuriUserId(ctl(v)); }
    }
    public static class EpgInsertDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUser)e).getInsertDate(); }
        public void write(Entity e, Object v) { ((BuriStateUser)e).setInsertDate((java.sql.Timestamp)v); }
    }
    public static class EpgDeleteDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriStateUser)e).getDeleteDate(); }
        public void write(Entity e, Object v) { ((BuriStateUser)e).setDeleteDate((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURISTATEUSER";
    protected final String _tablePropertyName = "buriStateUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURISTATEUSER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnStateUserId = cci("STATEUSERID", "STATEUSERID", null, null, true, "stateUserId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnStateId = cci("STATEID", "STATEID", null, null, false, "stateId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriState", null, null);
    protected final ColumnInfo _columnBuriUserId = cci("BURIUSERID", "BURIUSERID", null, null, false, "buriUserId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, "buriUser", null, null);
    protected final ColumnInfo _columnInsertDate = cci("INSERTDATE", "INSERTDATE", null, null, true, "insertDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDeleteDate = cci("DELETEDATE", "DELETEDATE", null, null, true, "deleteDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);

    public ColumnInfo columnStateUserId() { return _columnStateUserId; }
    public ColumnInfo columnStateId() { return _columnStateId; }
    public ColumnInfo columnBuriUserId() { return _columnBuriUserId; }
    public ColumnInfo columnInsertDate() { return _columnInsertDate; }
    public ColumnInfo columnDeleteDate() { return _columnDeleteDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnStateUserId());
        ls.add(columnStateId());
        ls.add(columnBuriUserId());
        ls.add(columnInsertDate());
        ls.add(columnDeleteDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnStateUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBuriState() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnStateId(), BuriStateDbm.getInstance().columnStateId());
        return cfi("FK_BURISTATEUSER_BURISTATE", "buriState", this, BuriStateDbm.getInstance(), map, 0, false, false, false, true, null, false, "buriStateUserList");
    }
    public ForeignInfo foreignBuriUser() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBuriUserId(), BuriUserDbm.getInstance().columnBuriUserId());
        return cfi("FK_BURISTATEUSER_BURIUSER", "buriUser", this, BuriUserDbm.getInstance(), map, 1, false, false, false, true, null, false, "buriStateUserList");
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
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriStateUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriStateUserCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriStateUserDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriStateUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriStateUser> getEntityType() { return BuriStateUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriStateUser newMyEntity() { return new BuriStateUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriStateUser)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriStateUser)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
