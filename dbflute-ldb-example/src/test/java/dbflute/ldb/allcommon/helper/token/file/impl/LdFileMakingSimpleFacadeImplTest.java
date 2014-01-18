package dbflute.ldb.allcommon.helper.token.file.impl;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ContainerTestCase;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingOption;

/**
 * Test of FileMakingSimpleFacadeImpl
 * 
 * @author jflute
 * @since 1.0 (2007/06/08)
 */
public class LdFileMakingSimpleFacadeImplTest extends TestCase {

    /** Log instance. */
    protected static final Log _log = LogFactory.getLog(ContainerTestCase.class);

    public void test_makeFromRowList_ArgumentBytes() throws Exception {
        // ## Arrange ##
        final LdFileMakingSimpleFacadeImpl facadeImpl = new LdFileMakingSimpleFacadeImpl();
        final LdFileMakingOption fileMakingOption = new LdFileMakingOption();
        fileMakingOption.encodeAsUTF8().delimitateByComma().separateLf();
        final List<List<String>> rowList = new ArrayList<List<String>>();
        final List<String> elementList = new ArrayList<String>();
        elementList.add("あ～");
        elementList.add("い－");
        elementList.add("う￥\t");
        elementList.add("え＆\n");
        elementList.add("\nお＃");
        rowList.add(elementList);

        // ## Act ##
        final byte[] resultBytes = facadeImpl.makeFromRowList(rowList, fileMakingOption);
        final String actual = new String(resultBytes, "UTF-8");
        final String q = "\"";
        final String c = ",";
        final String qcq = q + c + q;
        final String expected = q + "あ～" + qcq + "い－" + qcq + "う￥\t" + qcq + "え＆\n" + qcq + "\nお＃" + q + "\n";

        // ## Assert ##
        _log.debug(expected);
        _log.debug(actual);
        assertEquals(expected, actual);
    }
}
