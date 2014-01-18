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
 * The DB meta of BURIDATAPATHHISTORY. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriDataPathHistoryDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriDataPathHistoryDbm _instance = new BuriDataPathHistoryDbm();
    private BuriDataPathHistoryDbm() {}
    public static BuriDataPathHistoryDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgHistoryId(), "historyId");
        setupEpg(_epgMap, new EpgPathId(), "pathId");
        setupEpg(_epgMap, new EpgPathName(), "pathName");
        setupEpg(_epgMap, new EpgDataId(), "dataId");
        setupEpg(_epgMap, new EpgAction(), "action");
        setupEpg(_epgMap, new EpgBuriUserId(), "buriUserId");
        setupEpg(_epgMap, new EpgBtid(), "btid");
        setupEpg(_epgMap, new EpgInsertDate(), "insertDate");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgHistoryId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getHistoryId(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setHistoryId(ctl(v)); }
    }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setPathId(ctl(v)); }
    }
    public static class EpgPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getPathName(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setPathName((String)v); }
    }
    public static class EpgDataId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getDataId(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setDataId(ctl(v)); }
    }
    public static class EpgAction implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getAction(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setAction((String)v); }
    }
    public static class EpgBuriUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getBuriUserId(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setBuriUserId(ctl(v)); }
    }
    public static class EpgBtid implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getBtid(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setBtid(ctl(v)); }
    }
    public static class EpgInsertDate implements PropertyGateway {
        public Object read(Entity e) { return ((BuriDataPathHistory)e).getInsertDate(); }
        public void write(Entity e, Object v) { ((BuriDataPathHistory)e).setInsertDate((java.sql.Timestamp)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIDATAPATHHISTORY";
    protected final String _tablePropertyName = "buriDataPathHistory";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIDATAPATHHISTORY", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnHistoryId = cci("HISTORYID", "HISTORYID", null, null, true, "historyId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, false, "pathId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathName = cci("PATHNAME", "PATHNAME", null, null, false, "pathName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDataId = cci("DATAID", "DATAID", null, null, false, "dataId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnAction = cci("ACTION", "ACTION", null, null, false, "action", String.class, false, false, "VARCHAR2", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBuriUserId = cci("BURIUSERID", "BURIUSERID", null, null, false, "buriUserId", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBtid = cci("BTID", "BTID", null, null, true, "btid", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnInsertDate = cci("INSERTDATE", "INSERTDATE", null, null, true, "insertDate", java.sql.Timestamp.class, false, false, "TIMESTAMP(6)", 11, 6, null, false, null, null, null, null, null);

    public ColumnInfo columnHistoryId() { return _columnHistoryId; }
    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnPathName() { return _columnPathName; }
    public ColumnInfo columnDataId() { return _columnDataId; }
    public ColumnInfo columnAction() { return _columnAction; }
    public ColumnInfo columnBuriUserId() { return _columnBuriUserId; }
    public ColumnInfo columnBtid() { return _columnBtid; }
    public ColumnInfo columnInsertDate() { return _columnInsertDate; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnHistoryId());
        ls.add(columnPathId());
        ls.add(columnPathName());
        ls.add(columnDataId());
        ls.add(columnAction());
        ls.add(columnBuriUserId());
        ls.add(columnBtid());
        ls.add(columnInsertDate());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnHistoryId()); }
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
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriDataPathHistory"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriDataPathHistoryCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriDataPathHistoryDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriDataPathHistoryBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriDataPathHistory> getEntityType() { return BuriDataPathHistory.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriDataPathHistory newMyEntity() { return new BuriDataPathHistory(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriDataPathHistory)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriDataPathHistory)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
