package com.example.dbflute.slim3.dbflute.allcommon.dbmeta;

import java.lang.reflect.Method;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import org.seasar.dbflute.dbmeta.info.ColumnInfo;
import org.seasar.dbflute.util.DfReflectionUtil;

import com.example.dbflute.slim3.dbflute.allcommon.DBMetaInstanceHandler;
import com.example.dbflute.slim3.dbflute.bsentity.dbmeta.MemberDbm;
import com.example.dbflute.slim3.dbflute.bsentity.dbmeta.MemberStatusDbm;
import com.example.dbflute.slim3.dbflute.exentity.Member;
import com.example.dbflute.slim3.unit.PlainTestCase;

/**
 * The test of dbmetaInstanceHandler for Basic Example.
 * 
 * @author jflute
 * @since 0.5.8 (2007/11/28 Wednesday)
 */
public class DBMetaInstanceHandlerTest extends PlainTestCase {

    // ===================================================================================
    //                                                                          findDBMeta
    //                                                                          ==========
    /**
     * DB上のテーブル名からDBMetaを取得して、プロパティ名を取得。<br />
     * 
     * @throws Exception
     */
    public void test_findDBMeta_byTableDbName_getTablePropertyName() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER_STATUS";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final String tablePropertyName = dbmeta.getTablePropertyName();

        // ## Assert ##
        assertNotNull(tablePropertyName);
        log("/********************************");
        log("tablePropertyName=" + tablePropertyName);
        log("**********/");
        assertNotNull(MemberStatusDbm.getInstance().getTablePropertyName(), tablePropertyName);
        assertNotSame(MemberStatusDbm.getInstance().getTableDbName(), tablePropertyName);
    }

    /**
     * プロパティ名からDBMetaを取得して、DB上のテーブル名を取得。<br />
     * 
     * @throws Exception
     */
    public void test_findDBMeta_byTablePropertyName_getTableDbName() throws Exception {
        // ## Arrange ##
        final String tablePropertyName = "memberStatus";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tablePropertyName);
        final String tableDbName = dbmeta.getTableDbName();

        // ## Assert ##
        assertNotNull(tableDbName);
        log("/********************************");
        log("tableDbName=" + tableDbName);
        log("**********/");
        assertNotNull(MemberStatusDbm.getInstance().getTableDbName(), tableDbName);
        assertEquals(MemberStatusDbm.getInstance().getTablePropertyName(), tablePropertyName);
    }

    public void test_findDBMeta_byTableDbName_newEntity() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final Entity member = dbmeta.newEntity();

        // ## Assert ##
        assertEquals(Member.class, member.getClass());
    }

    public void test_findDBMeta_byTableDbName_findColumnInfo_byPropertyname_getColumnDbName() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";
        final String memberAccountPropertyName = "memberAccount";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final ColumnInfo memberAccontColumnInfo = dbmeta.findColumnInfo(memberAccountPropertyName);
        final String columnDbName = memberAccontColumnInfo.getColumnDbName();

        // ## Assert ##
        assertNotNull(columnDbName);
        log("/********************************");
        log("columnDbName=" + columnDbName);
        log("**********/");
        assertEquals(MemberDbm.getInstance().columnMemberAccount().getColumnDbName(), columnDbName);
    }

    public void test_findDBMeta_byTableDbName_findColumnInfo_byPropertyname_EntityGetSet() throws Exception {
        // ## Arrange ##
        final String tableDbName = "MEMBER";
        final String memberAccountPropertyName = "memberAccount";
        final String expectedMemberAccountValue = "test";

        // ## Act ##
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
        final ColumnInfo memberAccontColumnInfo = dbmeta.findColumnInfo(memberAccountPropertyName);
        final Method setter = memberAccontColumnInfo.findSetter();
        final Entity entity = dbmeta.newEntity();
        DfReflectionUtil.invoke(setter, entity, new Object[] { expectedMemberAccountValue });
        final Method getter = memberAccontColumnInfo.findGetter();
        final Object resultValue = DfReflectionUtil.invoke(getter, entity, null);

        // ## Assert ##
        assertNotNull(resultValue);
        log("/********************************");
        log("resultValue=" + resultValue);
        log("**********/");
        assertEquals(expectedMemberAccountValue, resultValue);
    }
}
