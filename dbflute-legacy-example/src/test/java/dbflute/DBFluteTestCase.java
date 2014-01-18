package dbflute;

import java.util.ArrayList;
import java.util.List;

import org.seasar.dao.unit.S2DaoTestCase;
import org.seasar.extension.dataset.DataColumn;
import org.seasar.extension.dataset.DataRow;
import org.seasar.extension.dataset.DataSet;
import org.seasar.extension.dataset.DataTable;

public abstract class DBFluteTestCase extends S2DaoTestCase {

    public DBFluteTestCase() {
    }

    public DBFluteTestCase(String name) {
        super(name);
    }

    /**
     * Get message prefix using the method name.
     * 
     * @param methodName Method name.
     * @return Message prefix.
     */
    protected String getMsgPrefix(String methodName) {
        return methodName + " must return ";
    }

    /**
     * Override super.setUpAfterContainerInit().
     * <pre>
     * �oSeasar�����y�[�W�̐����𔲐�(2006/04/06)�p
     * S2TestCase �ɂ��S2Container�̏��������I���������ɌĂяo����܂��B
     * �e�X�g�����{����O�ɁA�R���e�i�ɑ΂���Ǝ��̏������������s�������ꍇ�́A
     * ���̃��\�b�h���I�[�o�[���C�h���܂��B
     * �Ȃ��A�{���\�b�h���I�[�o���C�h����ꍇ�A�K���X�[�p�[�N���X�̓����\�b�h��
     * �Ăяo���Ă�������(S2TestCase �� setUpAfterContainerInit ����DataSource��
     * �Z�b�g�A�b�v���s���Ă��邽�߁ADataSource ���g�p�ł��Ȃ��Ȃ�܂�)�B
     * </pre>
     * @throws Throwable 
     */
    protected void setUpAfterContainerInit() throws Throwable {
        super.setUpAfterContainerInit();

        include(getTestDiconPath());
    }

    abstract protected String getTestDiconPath();

    protected DataSet readXlsInEachTable(String tableName) {
        return readXls(getTestDataDirectoryPath() + "/" + tableName + ".xls");
    }

    protected void readXlsReplaceDbInEachTable(String tableName) {
        readXlsReplaceDb(getTestDataDirectoryPath() + "/" + tableName + ".xls");
    }

    abstract protected String getTestDataDirectoryPath();

    protected DataTable getDataTable(String tableName) {
        final DataSet dataSet = readXlsInEachTable(tableName);
        return dataSet.getTable(tableName);
    }

    protected DataColumn getDataColumn(String tableName, String columnName) {
        final DataTable dataTable = getDataTable(tableName);
        return dataTable.getColumn(columnName);
    }

    protected List getDataRowList(String tableName) {
        final DataTable dataTable = getDataTable(tableName);
        final List primaryDataRowList = new ArrayList();
        for (int i = 0; i < dataTable.getRowSize(); i++) {
            final DataRow dataRow = dataTable.getRow(i);
            primaryDataRowList.add(dataRow);
        }
        return primaryDataRowList;
    }

    protected void assertListEmtpy(List ls) {
        if (ls.isEmpty()) {
            fail("The list must be empty: ls=" + ls);
        }
    }

    protected void assertListNotEmtpy(List ls) {
        if (ls.isEmpty()) {
            fail("The list must not be empty: ls=" + ls);
        }
    }
}
