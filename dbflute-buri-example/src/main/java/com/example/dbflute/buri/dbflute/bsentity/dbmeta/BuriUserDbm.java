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
 * The DB meta of BURIUSER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class BuriUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final BuriUserDbm _instance = new BuriUserDbm();
    private BuriUserDbm() {}
    public static BuriUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgBuriUserId(), "buriUserId");
        setupEpg(_epgMap, new EpgUserIdVal(), "userIdVal");
        setupEpg(_epgMap, new EpgUserIdNum(), "userIdNum");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgBuriUserId implements PropertyGateway {
        public Object read(Entity e) { return ((BuriUser)e).getBuriUserId(); }
        public void write(Entity e, Object v) { ((BuriUser)e).setBuriUserId(ctl(v)); }
    }
    public static class EpgUserIdVal implements PropertyGateway {
        public Object read(Entity e) { return ((BuriUser)e).getUserIdVal(); }
        public void write(Entity e, Object v) { ((BuriUser)e).setUserIdVal((String)v); }
    }
    public static class EpgUserIdNum implements PropertyGateway {
        public Object read(Entity e) { return ((BuriUser)e).getUserIdNum(); }
        public void write(Entity e, Object v) { ((BuriUser)e).setUserIdNum(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "BURIUSER";
    protected final String _tablePropertyName = "buriUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("BURIUSER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnBuriUserId = cci("BURIUSERID", "BURIUSERID", null, null, true, "buriUserId", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, null, "buriStateUserList", null);
    protected final ColumnInfo _columnUserIdVal = cci("USERIDVAL", "USERIDVAL", null, null, false, "userIdVal", String.class, false, false, "VARCHAR2", 100, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserIdNum = cci("USERIDNUM", "USERIDNUM", null, null, false, "userIdNum", Long.class, false, false, "NUMBER", 18, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnBuriUserId() { return _columnBuriUserId; }
    public ColumnInfo columnUserIdVal() { return _columnUserIdVal; }
    public ColumnInfo columnUserIdNum() { return _columnUserIdNum; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnBuriUserId()); }
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
    public ReferrerInfo referrerBuriStateUserList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnBuriUserId(), BuriStateUserDbm.getInstance().columnBuriUserId());
        return cri("FK_BURISTATEUSER_BURIUSER", "buriStateUserList", this, BuriStateUserDbm.getInstance(), map, false, "buriUser");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.BuriUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.BuriUserCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.BuriUserDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.BuriUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<BuriUser> getEntityType() { return BuriUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public BuriUser newMyEntity() { return new BuriUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((BuriUser)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((BuriUser)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
