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
 * The DB meta of MST_USER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MstUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MstUserDbm _instance = new MstUserDbm();
    private MstUserDbm() {}
    public static MstUserDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgUserId(), "userId");
        setupEpg(_epgMap, new EpgUserCode(), "userCode");
        setupEpg(_epgMap, new EpgUserName(), "userName");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgUserId implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getUserId(); }
        public void write(Entity e, Object v) { ((MstUser)e).setUserId(cti(v)); }
    }
    public static class EpgUserCode implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getUserCode(); }
        public void write(Entity e, Object v) { ((MstUser)e).setUserCode((String)v); }
    }
    public static class EpgUserName implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getUserName(); }
        public void write(Entity e, Object v) { ((MstUser)e).setUserName((String)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((MstUser)e).setRegisterUser((String)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((MstUser)e).setRegisterDatetime((java.util.Date)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((MstUser)e).setUpdateUser((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((MstUser)e).setUpdateDatetime((java.util.Date)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((MstUser)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((MstUser)e).setVersionNo(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MST_USER";
    protected final String _tablePropertyName = "mstUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("MST_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("USER_ID", "USER_ID", null, null, true, "userId", Integer.class, true, false, "NUMBER", 9, 0, null, false, null, null, null, "mstUserRoleList", null);
    protected final ColumnInfo _columnUserCode = cci("USER_CODE", "USER_CODE", null, null, true, "userCode", String.class, false, false, "VARCHAR2", 20, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnUserName = cci("USER_NAME", "USER_NAME", null, null, true, "userName", String.class, false, false, "VARCHAR2", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR2", 20, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR2", 20, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.util.Date.class, false, false, "DATE", 7, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Integer.class, false, false, "NUMBER", 8, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnUserId() { return _columnUserId; }
    public ColumnInfo columnUserCode() { return _columnUserCode; }
    public ColumnInfo columnUserName() { return _columnUserName; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserId());
        ls.add(columnUserCode());
        ls.add(columnUserName());
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnUserId()); }
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
    public ReferrerInfo referrerMstUserRoleList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnUserId(), MstUserRoleDbm.getInstance().columnUserId());
        return cri("FK_USER_ROLE_MST_USER", "mstUserRoleList", this, MstUserRoleDbm.getInstance(), map, false, "mstUser");
    }

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
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.MstUser"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.MstUserCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.MstUserDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.MstUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MstUser> getEntityType() { return MstUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MstUser newMyEntity() { return new MstUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((MstUser)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((MstUser)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
