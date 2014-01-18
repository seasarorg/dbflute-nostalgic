package dbflute.ldb.allcommon.helper.token.line;

import junit.framework.TestCase;

public class LdLineTokenizingOptionTest extends TestCase {

    public void test_delimitateByComma() throws Exception {
        // ## Arrange ##
        final LdLineTokenizingOption tokenizingOption = new LdLineTokenizingOption();

        // ## Act ##
        tokenizingOption.delimitateByComma();

        // ## Assert ##
        assertEquals(",", tokenizingOption.getDelimiter());
    }

    public void test_delimitateByTab() throws Exception {
        // ## Arrange ##
        final LdLineTokenizingOption tokenizingOption = new LdLineTokenizingOption();

        // ## Act ##
        tokenizingOption.delimitateByTab();

        // ## Assert ##
        assertEquals("\t", tokenizingOption.getDelimiter());
    }
}
