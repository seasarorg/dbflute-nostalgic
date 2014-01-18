package dbflute.ldb.allcommon.helper.token.line.impl;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;
import dbflute.ldb.allcommon.helper.token.line.LdLineMakingOption;
import dbflute.ldb.allcommon.helper.token.line.LdLineTokenizingOption;

/**
 * Test of LineTokenImpl
 * 
 * @author jflute
 */
public class LdLineTokenImplTest extends TestCase {

    public void test_tokenize_delimitateByComma_trimDoubleQuotation() throws Exception {
        final LdLineTokenizingOption tokenizingOption = new LdLineTokenizingOption();
        tokenizingOption.delimitateByComma().trimDoubleQuotation();

        final LdLineTokenImpl lineTokenImpl = new LdLineTokenImpl();
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,3,4,5", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", "3", "4", "5" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,3,4,5,", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,2,3,4,5,", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "2", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,2,3,4,\"5\",", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "2", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,'2',3,4,\"5\",", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "'2'", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
    }

    public void test_tokenize_delimitateByComma_nonTrim() throws Exception {
        final LdLineTokenizingOption tokenizingOption = new LdLineTokenizingOption();
        tokenizingOption.delimitateByComma();

        final LdLineTokenImpl lineTokenImpl = new LdLineTokenImpl();
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,3,4,5", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", "3", "4", "5" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,3,4,5,", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,2,3,4,5,", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "2", "3", "4", "5", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,2,3,4,\"5\",", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "2", "3", "4", "\"5\"", "" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize(",1,'2',3,4,\"5\",", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "", "1", "'2'", "3", "4", "\"5\"", "" });
            assertEquals(expectedList, actualList);
        }
    }

    public void test_tokenize_delimitateByComma_handleEmptyAsNull() throws Exception {
        final LdLineTokenizingOption tokenizingOption = new LdLineTokenizingOption();
        tokenizingOption.delimitateByComma().trimDoubleQuotation();

        final LdLineTokenImpl lineTokenImpl = new LdLineTokenImpl();
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,,4,5", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", "", "4", "5" });
            assertEquals(expectedList, actualList);
        }
        {
            tokenizingOption.handleEmtpyAsNull();// Point!
            final List<String> actualList = lineTokenImpl.tokenize("1,2,,4,5", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", null, "4", "5" });
            assertEquals(expectedList, actualList);
        }
        {
            final List<String> actualList = lineTokenImpl.tokenize("1,2,\"\",\"4\",5", tokenizingOption);
            final List<String> expectedList = Arrays.asList(new String[] { "1", "2", null, "4", "5" });
            assertEquals(expectedList, actualList);
        }
    }

    public void test_make_delimitateByComma_quoteDoubleQuotation() throws Exception {
        final LdLineMakingOption lineMakingOption = new LdLineMakingOption();
        lineMakingOption.delimitateByComma().quoteByDoubleQuotation();
        final LdLineTokenImpl lineTokenImpl = new LdLineTokenImpl();
        {
            final String[] values = new String[] { "1", "2", "3", "4", "5" };
            final List<String> valueList = Arrays.asList(values);
            final String lineString = lineTokenImpl.make(valueList, lineMakingOption);
            assertEquals("\"1\",\"2\",\"3\",\"4\",\"5\"", lineString);
        }
        {
            final String[] values = new String[] { "1", "2", "3", "4", "5", "" };
            final List<String> valueList = Arrays.asList(values);
            final String lineString = lineTokenImpl.make(valueList, lineMakingOption);
            assertEquals("\"1\",\"2\",\"3\",\"4\",\"5\",\"\"", lineString);
        }
        {
            final String[] values = new String[] { "1", "2", "\"3", "4\n4", "5", "" };
            final List<String> valueList = Arrays.asList(values);
            final String lineString = lineTokenImpl.make(valueList, lineMakingOption);
            assertEquals("\"1\",\"2\",\"\"3\",\"4\n4\",\"5\",\"\"", lineString);
        }
    }

    public void test_make_delimitateByComma_nonQuote() throws Exception {
        final LdLineMakingOption lineMakingOption = new LdLineMakingOption();
        lineMakingOption.delimitateByComma();
        final LdLineTokenImpl lineTokenImpl = new LdLineTokenImpl();
        {
            final String[] values = new String[] { "1", "2", "3", "4", "5" };
            final List<String> valueList = Arrays.asList(values);
            final String lineString = lineTokenImpl.make(valueList, lineMakingOption);
            assertEquals("1,2,3,4,5", lineString);
        }
        {
            final String[] values = new String[] { "1", "2", "3", "4", "5", "" };
            final List<String> valueList = Arrays.asList(values);
            final String lineString = lineTokenImpl.make(valueList, lineMakingOption);
            assertEquals("1,2,3,4,5,", lineString);
        }
    }
}
