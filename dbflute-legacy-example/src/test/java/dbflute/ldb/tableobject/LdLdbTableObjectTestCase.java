package dbflute.ldb.tableobject;

import java.util.List;

import org.seasar.extension.dataset.DataColumn;
import org.seasar.extension.dataset.DataRow;
import org.seasar.extension.dataset.DataSet;
import org.seasar.extension.dataset.DataTable;

import dbflute.ldb.LdLdbTestCase;
import dbflute.ldb.allcommon.LdDaoReadable;
import dbflute.ldb.allcommon.LdDaoWritable;
import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.LdGenMetaData;
import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;
import dbflute.ldb.allcommon.cbean.LdConditionBean;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.bsentity.dbmeta.LdAuthorDbm;
import dbflute.ldb.bsentity.dbmeta.LdBookDbm;
import dbflute.ldb.bsentity.dbmeta.LdPublisherDbm;


public abstract class LdLdbTableObjectTestCase extends LdLdbTestCase {

    /**
     * Constructor.
     */
    public LdLdbTableObjectTestCase() {
    }

    /**
     * Constructor
     * 
     * @param name Test case name.
     */
    public LdLdbTableObjectTestCase(String name) {
        super(name);
    }

    // ==========================================================================================
    //                                                                Get My Information & Object
    //                                                                ===========================

    // -------------------------------------------------------
    //                                             Get package
    //                                             -----------
    protected String getMyDaoPackage() {
        return LdGenMetaData.getInstance().getExtendedDaoPackage();
    }

    protected String getMyEntityPackage() {
        return LdGenMetaData.getInstance().getExtendedEntityPackage();
    }

    protected String getMyCBPackage() {
        return LdGenMetaData.getInstance().getConditionBeanPackage();
    }

    protected String getMyBhvPackage() {
        return LdGenMetaData.getInstance().getExtendedBehaviorPackage();
    }

    // -------------------------------------------------------
    //                                              Get dbmeta
    //                                              ----------
    abstract protected LdDBMeta getDBMeta();
    
    // -------------------------------------------------------
    //                                            Get instance
    //                                            ------------
    protected LdBehaviorReadable getMyRBhv() {
        return getDaoSelector().getRBhv(getDBMeta().newEntity());
    }

    protected LdBehaviorWritable getMyWBhv() {
        return getDaoSelector().getWBhv(getDBMeta().newEntity());
    }

    protected LdDaoReadable getMyRDao() {
        return (LdDaoReadable) getRDao(getDBMeta().getDaoType());
    }

    protected LdDaoWritable getMyWDao() {
        return (LdDaoWritable) getWDao(getDBMeta().getDaoType());
    }

    // -------------------------------------------------------
    //                               Get data set & data table
    //                               -------------------------
    protected DataSet getMyDataSet() {
        return readXlsInEachTable(getDBMeta().getTableDbName());
    }

    protected DataTable getMyDataTable() {
        return getMyDataSet().getTable(getDBMeta().getTableDbName());
    }

    // ==========================================================================================
    //                                                                  Do something for my table
    //                                                                  =========================
    /**
     * Read excel data of my table and replace db data with it. 
     */
    protected void readMyTableXlsReplaceDb() {
        readXlsReplaceDbInEachTable(getDBMeta().getTableDbName());
    }

    /**
     * Select my entity by the entity's primary key.
     * 
     * @param entity Entity that has primary key for condition.
     * @return My entity.
     */
    protected LdEntity selectMyEntityByEntityzPK(LdEntity entity) {
        final LdConditionBean cb = getDBMeta().newConditionBean();
        cb.acceptPrimaryKeyMapString(entity.extractPrimaryKeyMapString());
        return getMyRBhv().delegateReadEntityTx(cb);
    }

    // ==========================================================================================
    //                                                                Get data table and so on...
    //                                                                ===========================
    // -------------------------------------------------------
    //                                                  Author
    //                                                  ------
    protected DataTable getDataTable_Author() {
        return getDataTable(LdAuthorDbm.TABLE_DB_NAME);
    }

    protected DataColumn getDataColumn_Author(String columnName) {
        return getDataColumn(LdAuthorDbm.TABLE_DB_NAME, columnName);
    }

    protected List getDataRowList_Author() {
        return getDataRowList(LdAuthorDbm.TABLE_DB_NAME);
    }

    protected Object getValue_FirstRow_Author(String columnName) {
        final DataRow dataRow = (DataRow) getDataRowList_Author().get(0);
        return dataRow.getValue(columnName);
    }

    // -------------------------------------------------------
    //                                               Publisher
    //                                               ---------
    protected DataTable getDataTable_Publisher() {
        return getDataTable(LdPublisherDbm.TABLE_DB_NAME);
    }

    protected DataColumn getDataColumn_Publisher(String columnName) {
        return getDataColumn(LdPublisherDbm.TABLE_DB_NAME, columnName);
    }

    protected List getDataRowList_Publisher() {
        return getDataRowList(LdPublisherDbm.TABLE_DB_NAME);
    }

    protected Object getValue_FirstRow_Publisher(String columnName) {
        final DataRow dataRow = (DataRow) getDataRowList_Publisher().get(0);
        return dataRow.getValue(columnName);
    }

    // -------------------------------------------------------
    //                                                    Book
    //                                                    ----
    protected DataTable getDataTable_Book() {
        return getDataTable(LdBookDbm.TABLE_DB_NAME);
    }

    protected DataColumn getDataColumn_Book(String columnName) {
        return getDataColumn(LdBookDbm.TABLE_DB_NAME, columnName);
    }

    protected List getDataRowList_Book() {
        return getDataRowList(LdBookDbm.TABLE_DB_NAME);
    }

    protected Object getValue_FirstRow_Book(String columnName) {
        final DataRow dataRow = (DataRow) getDataRowList_Book().get(0);
        return dataRow.getValue(columnName);
    }

    /**
     * Select the list that has all records.
     * 
     * @return The list that has all records.
     */
    protected List selectListAll() {
        return getMyRBhv().delegateReadListTx(getDBMeta().newConditionBean());
    }

    /**
     * Select the count of all records.
     * 
     * @return The count of all records.
     */
    protected int selectCountAll() {
        return getMyRBhv().delegateReadListTx(getDBMeta().newConditionBean()).size();
        //        return getMyRBhv().delegateReadCountIgnoreFetchNarrowingTx(getMyCB());
    }
}
