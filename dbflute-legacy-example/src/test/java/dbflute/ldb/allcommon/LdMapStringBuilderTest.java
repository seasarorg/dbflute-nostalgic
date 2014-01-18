package dbflute.ldb.allcommon;

import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dbflute.ldb.LdLdbTestCase;
import dbflute.ldb.allcommon.helper.LdMapStringBuilder;
import dbflute.ldb.allcommon.helper.LdMapStringBuilderImpl;
import dbflute.ldb.allcommon.helper.LdMapStringBuilder.DifferentDelimiterCountException;

/**
 * Test of MapStringBuilder
 * 
 * @author jflute
 */
public class LdMapStringBuilderTest extends LdLdbTestCase {

    /** Log instance. */
    public static final Log _log = LogFactory.getLog(LdMapStringBuilderTest.class);

    public void test_buildByDelimiter() {
        {
            final LdMapStringBuilder builder = new LdMapStringBuilderImpl();
            final String tabString = "\t";
            final String[] columnNames = new String[] { "aaa", "bbb", "ccc" };
            builder.setColumnNames(columnNames);
            builder.setMsMapMark("map:");
            builder.setMsDelimiter("@;");
            builder.setMsEqual("@=");
            builder.setMsStartBrace("@{");
            builder.setMsEndBrace("@}");
            final String delimiterValueString = "AAA" + tabString + "BBB" + tabString + "CCC";
            final String actual = builder.buildByDelimiter(delimiterValueString, tabString);
            assertEquals("map:@{aaa@=AAA@;bbb@=BBB@;ccc@=CCC@}", actual);
        }
        {
            final LdMapStringBuilder builder = new LdMapStringBuilderImpl();
            final String tabString = "\t";
            final String[] columnNames = new String[] { "aaa", "bbb", "ccc" };
            builder.setColumnNames(columnNames);
            builder.setMsMapMark("ma-p:");
            builder.setMsDelimiter("@-;");
            builder.setMsEqual("@-=");
            builder.setMsStartBrace("@-{");
            builder.setMsEndBrace("@-}");
            final String delimiterValueString = "AAA" + tabString + tabString + "CCC";
            final String actual = builder.buildByDelimiter(delimiterValueString, tabString);
            assertEquals("ma-p:@-{aaa@-=AAA@-;bbb@-=@-;ccc@-=CCC@-}", actual);
        }
        
        {
            final LdMapStringBuilder builder = new LdMapStringBuilderImpl();
            final String tabString = "\t";
            final String[] columnNames = new String[] { "aaa", "bbb", "ccc" };
            builder.setColumnNames(columnNames);
            builder.setMsMapMark("ma-p:");
            builder.setMsDelimiter("@-;");
            builder.setMsEqual("@-=");
            builder.setMsStartBrace("@-{");
            builder.setMsEndBrace("@-}");
            final String delimiterValueString = "AAA" + tabString + "CCC";
            try {
                builder.buildByDelimiter(delimiterValueString, tabString);
                fail("This should throw DifferentDelimiterCountException: delimiterValueString" + delimiterValueString);
            } catch (DifferentDelimiterCountException e) {
                // OK
                assertEquals(Arrays.asList(columnNames), Arrays.asList(e.getColumnNames()));
                assertEquals(Arrays.asList(new String[] {"AAA", "CCC"}), Arrays.asList(e.getValues()));
            }
        }
    }
}
