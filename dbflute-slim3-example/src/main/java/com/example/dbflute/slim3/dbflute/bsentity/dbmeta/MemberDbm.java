package com.example.dbflute.slim3.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.seasar.dbflute.DBDef;
import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.AbstractDBMeta;
import org.seasar.dbflute.dbmeta.PropertyGateway;
import org.seasar.dbflute.dbmeta.info.*;
import org.seasar.dbflute.dbmeta.name.*;
import com.example.dbflute.slim3.dbflute.allcommon.*;
import com.example.dbflute.slim3.dbflute.exentity.*;

/**
 * The DB meta of MEMBER. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberDbm _instance = new MemberDbm();
    private MemberDbm() {}
    public static MemberDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberId(), "memberId");
        setupEpg(_epgMap, new EpgMemberName(), "memberName");
        setupEpg(_epgMap, new EpgMemberAccount(), "memberAccount");
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgFormalizedDatetime(), "formalizedDatetime");
        setupEpg(_epgMap, new EpgBirthdate(), "birthdate");
        setupEpg(_epgMap, new EpgRegisterDatetime(), "registerDatetime");
        setupEpg(_epgMap, new EpgRegisterUser(), "registerUser");
        setupEpg(_epgMap, new EpgRegisterProcess(), "registerProcess");
        setupEpg(_epgMap, new EpgUpdateDatetime(), "updateDatetime");
        setupEpg(_epgMap, new EpgUpdateUser(), "updateUser");
        setupEpg(_epgMap, new EpgUpdateProcess(), "updateProcess");
        setupEpg(_epgMap, new EpgVersionNo(), "versionNo");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberId implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberId(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberId(cti(v)); }
    }
    public static class EpgMemberName implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberName(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberName((String)v); }
    }
    public static class EpgMemberAccount implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberAccount(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberAccount((String)v); }
    }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((Member)e).setMemberStatusCode((String)v); }
    }
    public static class EpgFormalizedDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getFormalizedDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setFormalizedDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgBirthdate implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getBirthdate(); }
        public void write(Entity e, Object v) { ((Member)e).setBirthdate((java.util.Date)v); }
    }
    public static class EpgRegisterDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getRegisterDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setRegisterDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgRegisterUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getRegisterUser(); }
        public void write(Entity e, Object v) { ((Member)e).setRegisterUser((String)v); }
    }
    public static class EpgRegisterProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getRegisterProcess(); }
        public void write(Entity e, Object v) { ((Member)e).setRegisterProcess((String)v); }
    }
    public static class EpgUpdateDatetime implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getUpdateDatetime(); }
        public void write(Entity e, Object v) { ((Member)e).setUpdateDatetime((java.sql.Timestamp)v); }
    }
    public static class EpgUpdateUser implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getUpdateUser(); }
        public void write(Entity e, Object v) { ((Member)e).setUpdateUser((String)v); }
    }
    public static class EpgUpdateProcess implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getUpdateProcess(); }
        public void write(Entity e, Object v) { ((Member)e).setUpdateProcess((String)v); }
    }
    public static class EpgVersionNo implements PropertyGateway {
        public Object read(Entity e) { return ((Member)e).getVersionNo(); }
        public void write(Entity e, Object v) { ((Member)e).setVersionNo(ctl(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER";
    protected final String _tablePropertyName = "member";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberId = cci("MEMBER_ID", "MEMBER_ID", null, null, true, "memberId", Integer.class, true, true, "INTEGER", 10, 0, "NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_99B2648A_A028_4831_9F1C_36D8557D3925", false, null, null, "memberAddressAsValid,memberSecurityAsOne,memberWithdrawalAsOne", "memberAddressList,memberLoginList,purchaseList", null);
    protected final ColumnInfo _columnMemberName = cci("MEMBER_NAME", "MEMBER_NAME", null, null, true, "memberName", String.class, false, false, "VARCHAR", 200, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberAccount = cci("MEMBER_ACCOUNT", "MEMBER_ACCOUNT", null, null, true, "memberAccount", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, true, "memberStatusCode", String.class, false, false, "CHAR", 3, 0, null, false, null, null, "memberStatus", null, CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnFormalizedDatetime = cci("FORMALIZED_DATETIME", "FORMALIZED_DATETIME", null, null, false, "formalizedDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnBirthdate = cci("BIRTHDATE", "BIRTHDATE", null, null, false, "birthdate", java.util.Date.class, false, false, "DATE", 8, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterDatetime = cci("REGISTER_DATETIME", "REGISTER_DATETIME", null, null, true, "registerDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterUser = cci("REGISTER_USER", "REGISTER_USER", null, null, true, "registerUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnRegisterProcess = cci("REGISTER_PROCESS", "REGISTER_PROCESS", null, null, true, "registerProcess", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateDatetime = cci("UPDATE_DATETIME", "UPDATE_DATETIME", null, null, true, "updateDatetime", java.sql.Timestamp.class, false, false, "TIMESTAMP", 23, 10, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateUser = cci("UPDATE_USER", "UPDATE_USER", null, null, true, "updateUser", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnUpdateProcess = cci("UPDATE_PROCESS", "UPDATE_PROCESS", null, null, true, "updateProcess", String.class, false, false, "VARCHAR", 200, 0, null, true, null, null, null, null, null);
    protected final ColumnInfo _columnVersionNo = cci("VERSION_NO", "VERSION_NO", null, null, true, "versionNo", Long.class, false, false, "BIGINT", 19, 0, null, false, OptimisticLockType.VERSION_NO, null, null, null, null);

    public ColumnInfo columnMemberId() { return _columnMemberId; }
    public ColumnInfo columnMemberName() { return _columnMemberName; }
    public ColumnInfo columnMemberAccount() { return _columnMemberAccount; }
    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnFormalizedDatetime() { return _columnFormalizedDatetime; }
    public ColumnInfo columnBirthdate() { return _columnBirthdate; }
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    public ColumnInfo columnRegisterUser() { return _columnRegisterUser; }
    public ColumnInfo columnRegisterProcess() { return _columnRegisterProcess; }
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    public ColumnInfo columnUpdateUser() { return _columnUpdateUser; }
    public ColumnInfo columnUpdateProcess() { return _columnUpdateProcess; }
    public ColumnInfo columnVersionNo() { return _columnVersionNo; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberId());
        ls.add(columnMemberName());
        ls.add(columnMemberAccount());
        ls.add(columnMemberStatusCode());
        ls.add(columnFormalizedDatetime());
        ls.add(columnBirthdate());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterUser());
        ls.add(columnRegisterProcess());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateUser());
        ls.add(columnUpdateProcess());
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
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnMemberId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignMemberStatus() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberStatusCode(), MemberStatusDbm.getInstance().columnMemberStatusCode());
        return cfi("FK_MEMBER_MEMBER_STATUS", "memberStatus", this, MemberStatusDbm.getInstance(), map, 0, false, false, false, false, null, false, "memberList");
    }
    public ForeignInfo foreignMemberAddressAsValid() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_MEMBER_ADDRESS_VALID", "memberAddressAsValid", this, MemberAddressDbm.getInstance(), map, 1, true, true, false, true, "$$foreignAlias$$.VALID_BEGIN_DATE <= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null\n and $$foreignAlias$$.VALID_END_DATE >= /*$$locationBase$$.parameterMapMemberAddressAsValid.targetDate*/null", false, null);
    }
    public ForeignInfo foreignMemberSecurityAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberSecurityDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_SECURITY_MEMBER", "memberSecurityAsOne", this, MemberSecurityDbm.getInstance(), map, 2, true, false, true, false, null, false, "member");
    }
    public ForeignInfo foreignMemberWithdrawalAsOne() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberWithdrawalDbm.getInstance().columnMemberId());
        return cfi("FK_MEMBER_WITHDRAWAL_MEMBER", "memberWithdrawalAsOne", this, MemberWithdrawalDbm.getInstance(), map, 3, true, false, true, false, null, false, "member");
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerMemberAddressList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberAddressDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_ADDRESS_MEMBER", "memberAddressList", this, MemberAddressDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), MemberLoginDbm.getInstance().columnMemberId());
        return cri("FK_MEMBER_LOGIN_MEMBER", "memberLoginList", this, MemberLoginDbm.getInstance(), map, false, "member");
    }
    public ReferrerInfo referrerPurchaseList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberId(), PurchaseDbm.getInstance().columnMemberId());
        return cri("FK_PURCHASE_MEMBER", "purchaseList", this, PurchaseDbm.getInstance(), map, false, "member");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasVersionNo() { return true; }
    public ColumnInfo getVersionNoColumnInfo() { return _columnVersionNo; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterUser(), columnRegisterProcess(), columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateUser(), columnUpdateProcess()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.slim3.dbflute.exentity.Member"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.slim3.dbflute.cbean.MemberCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.MemberDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.slim3.dbflute.exbhv.MemberBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Member> getEntityType() { return Member.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Member newMyEntity() { return new Member(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Member)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Member)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
