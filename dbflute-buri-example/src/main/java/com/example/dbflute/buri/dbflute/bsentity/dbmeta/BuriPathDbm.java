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
 * The DB meta of BURIPATH. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriPathDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriPathDbm _instance = new BuriPathDbm();
    private BuriPathDbm() {}
    public static BuriPathDbm getInstance() { return _instance; }

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
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgPathId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPath)e).getPathId(); }
        public void write(Entity e, Object v) { ((BuriPath)e).setPathId(ctl(v)); }
    }
    public static class EpgPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPath)e).getPathName(); }
        public void write(Entity e, Object v) { ((BuriPath)e).setPathName((String)v); }
    }
    public static class EpgRealPathName implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPath)e).getRealPathName(); }
        public void write(Entity e, Object v) { ((BuriPath)e).setRealPathName((String)v); }
    }
    public static class EpgPathType implements PropertyGateway {
        public Object read(Entity e) { return ((BuriPath)e).getPathType(); }
        public void write(Entity e, Object v) { ((BuriPath)e).setPathType(ctb(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIPATH";
    protected final String _tablePropertyName = "buriPath";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIPATH", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnPathId = cci("PATHID", "PATHID", null, null, true, "pathId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, "buriStateList,buriBranchList", null);
    protected final ColumnInfo _columnPathName = cci("PATHNAME", "PATHNAME", null, null, true, "pathName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRealPathName = cci("REALPATHNAME", "REALPATHNAME", null, null, true, "realPathName", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnPathType = cci("PATHTYPE", "PATHTYPE", null, null, false, "pathType", java.math.BigDecimal.class, false, false, "NUMBER", 22, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnPathId() { return _columnPathId; }
    public ColumnInfo columnPathName() { return _columnPathName; }
    public ColumnInfo columnRealPathName() { return _columnRealPathName; }
    public ColumnInfo columnPathType() { return _columnPathType; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnPathId());
        ls.add(columnPathName());
        ls.add(columnRealPathName());
        ls.add(columnPathType());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnPathId()); }
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
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnPathId(), BuriStateDbm.getInstance().columnPathId());
        return cri("FK_BURISTATE_BURIPATH", "buriStateList", this, BuriStateDbm.getInstance(), map, false, "buriPath");
    }
    public ReferrerInfo referrerBuriBranchList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnPathId(), BuriBranchDbm.getInstance().columnPathId());
        return cri("FK_BURIBRANCH_BURIPATH", "buriBranchList", this, BuriBranchDbm.getInstance(), map, false, "buriPath");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriPath"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriPathCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriPathDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriPathBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriPath> getEntityType() { return BuriPath.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriPath newMyEntity() { return new BuriPath(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriPath)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriPath)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
