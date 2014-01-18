package dbflute.ldb.allcommon.helper.token.file;

import junit.framework.TestCase;

public class LdFileTokenizingOptionTest extends TestCase {

    public void test_tokenizeByComma() throws Exception {
        // ## Arrange ##
        final LdFileTokenizingOption tokenizingOption = new LdFileTokenizingOption();

        // ## Act ##
        tokenizingOption.delimitateByComma();

        // ## Assert ##
        assertEquals(",", tokenizingOption.getDelimiter());
    }

    public void test_tokenizeByTab() throws Exception {
        // ## Arrange ##
        final LdFileTokenizingOption tokenizingOption = new LdFileTokenizingOption();

        // ## Act ##
        tokenizingOption.delimitateByTab();

        // ## Assert ##
        assertEquals("\t", tokenizingOption.getDelimiter());
    }
}
