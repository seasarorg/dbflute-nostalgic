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
 * The DB meta of MST_USER_ROLE. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MstUserRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MstUserRoleDbm _instance = new MstUserRoleDbm();
    private MstUserRoleDbm() {}
    public static MstUserRoleDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUserRoleId(), "userRoleId");
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgRoleId(), "roleId");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUserRoleId implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getUserRoleId(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setUserRoleId(cti(v)); }
    }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getUserId(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setUserId(cti(v)); }
    }
    public static class EpgRoleId implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getRoleId(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setRoleId(cti(v)); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setRegisterUser((String)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setRegisterDatetime((java.util.Date)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setUpdateUser((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setUpdateDatetime((java.util.Date)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((MstUserRole)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((MstUserRole)e).setVersionNo(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MST_USER_ROLE";
    protected final String _tablePropertyName = "mstUserRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("MST_USER_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserRoleId = cci("USER_ROLE_ID", "USER_ROLE_ID", null, null, true, "userRoleId", Integer.class, true, false, "NUMBER", 9, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, true, "userId", Integer.class, false, false, "NUMBER", 9, 0, null, false, null, null, "mstUser", null, null);
    protected final ColumnInfo _columnRoleId = cci("ROLE_ID", "ROLE_ID", null, null, true, "roleId", Integer.class, false, false, "NUMBER", 9, 0, null, false, null, null, "mstRole", null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR2", 20, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR2", 20, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Integer.class, false, false, "NUMBER", 8, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnUserRoleId() { return _columnUserRoleId; }
    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnRoleId() { return _columnRoleId; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserRoleId());
        ls.add(columnUserId());
        ls.add(columnRoleId());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateDatetime());
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnUserRoleId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMstRole() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnRoleId(), MstRoleDbm.getInstance().columnRoleId());
        return cfi("FK_USER_ROLE_MST_ROLE", "mstRole", this, MstRoleDbm.getInstance(), map, 0, false, false, false, false, null, false, "mstUserRoleList");
    }
    public ForeignInfo foreignMstUser() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), MstUserDbm.getInstance().columnUserId());
        return cfi("FK_USER_ROLE_MST_USER", "mstUser", this, MstUserDbm.getInstance(), map, 1, false, false, false, false, null, false, "mstUserRoleList");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnUpdateDatetime(), columnUpdateUser()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.MstUserRole"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.MstUserRoleCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.MstUserRoleDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.MstUserRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MstUserRole> getEntityType() { return MstUserRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MstUserRole newMyEntity() { return new MstUserRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((MstUserRole)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((MstUserRole)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
