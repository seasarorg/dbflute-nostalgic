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
 * The DB meta of MEMBER_STATUS. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class MemberStatusDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final MemberStatusDbm _instance = new MemberStatusDbm();
    private MemberStatusDbm() {}
    public static MemberStatusDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgMemberStatusCode(), "memberStatusCode");
        setupEpg(_epgMap, new EpgMemberStatusName(), "memberStatusName");
        setupEpg(_epgMap, new EpgDisplayOrder(), "displayOrder");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgMemberStatusCode implements PropertyGateway {
        public Object read(Entity e) { return ((MemberStatus)e).getMemberStatusCode(); }
        public void write(Entity e, Object v) { ((MemberStatus)e).setMemberStatusCode((String)v); }
    }
    public static class EpgMemberStatusName implements PropertyGateway {
        public Object read(Entity e) { return ((MemberStatus)e).getMemberStatusName(); }
        public void write(Entity e, Object v) { ((MemberStatus)e).setMemberStatusName((String)v); }
    }
    public static class EpgDisplayOrder implements PropertyGateway {
        public Object read(Entity e) { return ((MemberStatus)e).getDisplayOrder(); }
        public void write(Entity e, Object v) { ((MemberStatus)e).setDisplayOrder(cti(v)); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "MEMBER_STATUS";
    protected final String _tablePropertyName = "memberStatus";
    protected final TableSqlName _tableSqlName = new TableSqlName("MEMBER_STATUS", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnMemberStatusCode = cci("MEMBER_STATUS_CODE", "MEMBER_STATUS_CODE", null, null, true, "memberStatusCode", String.class, true, false, "CHAR", 3, 0, null, false, null, null, null, "memberList,memberLoginList", CDef.DefMeta.MemberStatus);
    protected final ColumnInfo _columnMemberStatusName = cci("MEMBER_STATUS_NAME", "MEMBER_STATUS_NAME", null, null, true, "memberStatusName", String.class, false, false, "VARCHAR", 50, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnDisplayOrder = cci("DISPLAY_ORDER", "DISPLAY_ORDER", null, null, true, "displayOrder", Integer.class, false, false, "INTEGER", 10, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnMemberStatusCode() { return _columnMemberStatusCode; }
    public ColumnInfo columnMemberStatusName() { return _columnMemberStatusName; }
    public ColumnInfo columnDisplayOrder() { return _columnDisplayOrder; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnMemberStatusCode());
        ls.add(columnMemberStatusName());
        ls.add(columnDisplayOrder());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnMemberStatusCode()); }
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
    public ReferrerInfo referrerMemberList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberStatusCode(), MemberDbm.getInstance().columnMemberStatusCode());
        return cri("FK_MEMBER_MEMBER_STATUS", "memberList", this, MemberDbm.getInstance(), map, false, "memberStatus");
    }
    public ReferrerInfo referrerMemberLoginList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnMemberStatusCode(), MemberLoginDbm.getInstance().columnLoginMemberStatusCode());
        return cri("FK_MEMBER_LOGIN_MEMBER_STATUS", "memberLoginList", this, MemberLoginDbm.getInstance(), map, false, "memberStatus");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.slim3.dbflute.exentity.MemberStatus"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.slim3.dbflute.cbean.MemberStatusCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.MemberStatusDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.slim3.dbflute.exbhv.MemberStatusBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<MemberStatus> getEntityType() { return MemberStatus.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public MemberStatus newMyEntity() { return new MemberStatus(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((MemberStatus)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((MemberStatus)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
