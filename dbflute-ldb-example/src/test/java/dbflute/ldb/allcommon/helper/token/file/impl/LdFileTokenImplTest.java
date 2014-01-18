package dbflute.ldb.allcommon.helper.token.file.impl;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.seasar.framework.util.ResourceUtil;

import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingCallback;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingHeaderInfo;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingOption;
import dbflute.ldb.allcommon.helper.token.file.LdFileTokenizingRowResource;

/**
 * Test of GeneralCharacterImpl
 * 
 * @author jflute
 */
public class LdFileTokenImplTest extends TestCase {

    public void test_tokenize_tokenizeByComma() throws Exception {

        final String filename = getFilename();
        System.out.println("filename: " + filename);

        final Map<String, Integer> countMap = new HashMap<String, Integer>();
        countMap.put("count", new Integer(0));
        final LdFileTokenizingCallback fileTokenizingCallback = new LdFileTokenizingCallback() {
            public void handleRowResource(LdFileTokenizingRowResource tokenizingResource) {
                final LdFileTokenizingHeaderInfo fileTokenizingHeaderInfo = tokenizingResource
                        .getFileTokenizingHeaderInfo();

                // columnNameList
                final List<String> columnNameList = fileTokenizingHeaderInfo.getColumnNameList();
                assertNotNull(columnNameList);
                assertFalse(columnNameList.isEmpty());
                assertTrue(columnNameList.size() == 8);
                final String columnNameRowString = fileTokenizingHeaderInfo.getColumnNameRowString();
                assertNotNull(columnNameRowString);
                assertEquals("AAA,BBB,CCC,DDD,EEE,FFF,GGG,HHH", columnNameRowString);

                // valueList
                final List<String> valueList = tokenizingResource.getValueList();
                System.out.println("valueList: " + valueList);

                final String rowString = tokenizingResource.getRowString();
                assertNotNull(rowString);

                final Integer count = countMap.get("count");
                countMap.put("count", count + 1);

                final int lineNumber = tokenizingResource.getLineNumber();
                assertTrue(lineNumber > 0);

                final int rowNumber = tokenizingResource.getRowNumber();
                assertEquals(rowNumber, count.intValue() + 1);
            }
        };

        final LdFileTokenImpl fileTokenImpl = new LdFileTokenImpl();
        {
            final LdFileTokenizingOption fileTokenizingOption = new LdFileTokenizingOption();
            fileTokenizingOption.delimitateByComma().encodeAsUTF8();
            fileTokenImpl.tokenize(filename, fileTokenizingCallback, fileTokenizingOption);
            final Integer count = countMap.get("count");
            assertTrue(count == 4);
        }
    }

    protected String getFilename() throws IOException {
        final File buildDir = ResourceUtil.getBuildDir(this.getClass());
        final String canonicalPath = buildDir.getCanonicalPath();
        final String packageName = this.getClass().getPackage().getName();
        final String packagePath = packageName.replaceAll("\\.", "/");
        return canonicalPath + "/" + packagePath + "/" + "TokenTestFile.txt";
    }
}
