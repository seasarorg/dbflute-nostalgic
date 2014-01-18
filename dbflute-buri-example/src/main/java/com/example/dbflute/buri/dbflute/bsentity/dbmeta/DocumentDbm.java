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
 * The DB meta of DOCUMENT. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DocumentDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DocumentDbm _instance = new DocumentDbm();
    private DocumentDbm() {}
    public static DocumentDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    {
        setupEpg(_epgMap, new EpgId(), "id");
        setupEpg(_epgMap, new EpgTitle(), "title");
        setupEpg(_epgMap, new EpgContent(), "content");
    }
    public PropertyGateway findPropertyGateway(String propertyName)
    { return doFindEpg(_epgMap, propertyName); }
    public static class EpgId implements PropertyGateway {
        public Object read(Entity e) { return ((Document)e).getId(); }
        public void write(Entity e, Object v) { ((Document)e).setId(ctl(v)); }
    }
    public static class EpgTitle implements PropertyGateway {
        public Object read(Entity e) { return ((Document)e).getTitle(); }
        public void write(Entity e, Object v) { ((Document)e).setTitle((String)v); }
    }
    public static class EpgContent implements PropertyGateway {
        public Object read(Entity e) { return ((Document)e).getContent(); }
        public void write(Entity e, Object v) { ((Document)e).setContent((String)v); }
    }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "DOCUMENT";
    protected final String _tablePropertyName = "document";
    protected final TableSqlName _tableSqlName = new TableSqlName("DOCUMENT", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnId = cci("ID", "ID", null, null, true, "id", Long.class, true, false, "NUMBER", 18, 0, null, false, null, null, "buriAllRoundState_文書管理_文書公開", "buriAllRoundStateList", null);
    protected final ColumnInfo _columnTitle = cci("TITLE", "TITLE", null, null, true, "title", String.class, false, false, "VARCHAR2", 64, 0, null, false, null, null, null, null, null);
    protected final ColumnInfo _columnContent = cci("CONTENT", "CONTENT", null, null, true, "content", String.class, false, false, "VARCHAR2", 1024, 0, null, false, null, null, null, null, null);

    public ColumnInfo columnId() { return _columnId; }
    public ColumnInfo columnTitle() { return _columnTitle; }
    public ColumnInfo columnContent() { return _columnContent; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnId());
        ls.add(columnTitle());
        ls.add(columnContent());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    public UniqueInfo getPrimaryUniqueInfo() { return cpui(columnId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    public ForeignInfo foreignBuriAllRoundState_文書管理_文書公開() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnId(), BuriAllRoundStateDbm.getInstance().columnInternalPkValue());
        return cfi("FK_DOCUMENT_BURI_ALL_ROUND_STATE_1", "buriAllRoundState_文書管理_文書公開", this, BuriAllRoundStateDbm.getInstance(), map, 0, true, true, false, true, "$$foreignAlias$$.STATUS_PATH_NAME like '文書管理.文書公開.%' and $$foreignAlias$$.INTERNAL_DATA_TYPE = 'com.example.dbflute.buri.dbflute.exentity.Document'", false, null);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    public ReferrerInfo referrerBuriAllRoundStateList() {
        Map<ColumnInfo, ColumnInfo> map = newLinkedHashMap(columnId(), BuriAllRoundStateDbm.getInstance().columnInternalPkValue());
        return cri("FK_BURI_ALL_ROUND_STATE_DOCUMENT_IMPLICIT", "buriAllRoundStateList", this, BuriAllRoundStateDbm.getInstance(), map, false, "document");
    }

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasSequence() { return true; }
    public String getSequenceName() { return "SEQ_DOCUMENT_ID"; }
    public Integer getSequenceIncrementSize() { return 1; }
    public Integer getSequenceCacheSize() { return null; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.example.dbflute.buri.dbflute.exentity.Document"; }
    public String getConditionBeanTypeName() { return "com.example.dbflute.buri.dbflute.cbean.DocumentCB"; }
    public String getDaoTypeName() { return "${glPackageExtendedDao}.DocumentDao"; }
    public String getBehaviorTypeName() { return "com.example.dbflute.buri.dbflute.exbhv.DocumentBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<Document> getEntityType() { return Document.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public Entity newEntity() { return newMyEntity(); }
    public Document newMyEntity() { return new Document(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptPrimaryKeyMap((Document)e, m); }
    public void acceptAllColumnMap(Entity e, Map<String, ? extends Object> m)
    { doAcceptAllColumnMap((Document)e, m); }
    public Map<String, Object> extractPrimaryKeyMap(Entity e) { return doExtractPrimaryKeyMap(e); }
    public Map<String, Object> extractAllColumnMap(Entity e) { return doExtractAllColumnMap(e); }
}
