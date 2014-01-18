package dbflute.ldb.allcommon.helper.token.line;

import junit.framework.TestCase;

public class LdLineMakingOptionTest extends TestCase {

    public void test_delimitateByComma() throws Exception {
        // ## Arrange ##
        final LdLineMakingOption makingOption = new LdLineMakingOption();

        // ## Act ##
        makingOption.delimitateByComma();

        // ## Assert ##
        assertEquals(",", makingOption.getDelimiter());
    }

    public void test_delimitateByTab() throws Exception {
        // ## Arrange ##
        final LdLineMakingOption makingOption = new LdLineMakingOption();

        // ## Act ##
        makingOption.delimitateByTab();

        // ## Assert ##
        assertEquals("\t", makingOption.getDelimiter());
    }
}
