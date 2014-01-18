package dbflute.ldb.allcommon.cbean.coption;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * The test of LikeSearchOption.
 * 
 * @author jflute
 */
public class LdLikeSearchOptionTest extends TestCase {

    /** Log instance. */
    public static final Log _log = LogFactory.getLog(LdLikeSearchOptionTest.class);

    public void test_split() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.splitBySpace();
            final List<String> actual = Arrays.asList(option.generateSplitValueArray("a b  c   d"));
            final List<String> expected = Arrays.asList(new String[] { "a", "b", "c", "d" });
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.splitBySpace();
            final List<String> actual = Arrays.asList(option.generateSplitValueArray("a b  c\u3000d   e"));
            final List<String> expected = Arrays.asList(new String[] { "a", "b", "c\u3000d", "e" });
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.splitBySpace(5);
            final List<String> actual = Arrays.asList(option.generateSplitValueArray("a b  c\u3000d   e f g h"));
            final List<String> expected = Arrays.asList(new String[] { "a", "b", "c\u3000d", "e", "f" });
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.splitBySpaceContainsDoubleByte();
            final List<String> actual = Arrays.asList(option.generateSplitValueArray("a b  c\u3000d   e"));
            final List<String> expected = Arrays.asList(new String[] { "a", "b", "c", "d", "e" });
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.splitBySpaceContainsDoubleByte(5);
            final List<String> actual = Arrays.asList(option.generateSplitValueArray("a b  c\u3000d   e f g h"));
            final List<String> expected = Arrays.asList(new String[] { "a", "b", "c", "d", "e" });
            assertEquals(expected, actual);
        }
    }

    public void test_asOrSplit() {
        final LdLikeSearchOption option = new LdLikeSearchOption();
        assertFalse(option.isAsOrSplit());
        LdLikeSearchOption selfOption = option.asOrSplit();
        assertTrue(option.isAsOrSplit());
        assertEquals(option, selfOption);
    }

    public void test_toUpperCase() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toUpperCase();
            final String actual = option.generateRealValue("AbCdEＡｂＣｄＥ");
            final String expected = "ABCDEＡＢＣＤＥ";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toUpperCase();
            final String actual = option.generateRealValue("AbCdEあ２ＡｂＣｄＥ");
            final String expected = "ABCDEあ２ＡＢＣＤＥ";
            assertEquals(expected, actual);
        }
    }

    public void test_toLowerCase() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toLowerCase();
            final String actual = option.generateRealValue("AbCdEＡｂＣｄＥ");
            final String expected = "abcdeａｂｃｄｅ";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toLowerCase();
            final String actual = option.generateRealValue("AbCdEあ２ＡｂＣｄＥ");
            final String expected = "abcdeあ２ａｂｃｄｅ";
            assertEquals(expected, actual);
        }
    }

    public void test_toSingleByteSpace() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteSpace();
            final String actual = option.generateRealValue("A\u3000abc d\u3000e");
            final String expected = "A abc d e";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteSpace();
            final String actual = option.generateRealValue(" A\u3000abc d\u3000e\u3000");
            final String expected = " A abc d e ";
            assertEquals(expected, actual);
        }
    }

    public void test_toSingleByteAlphabetNumber() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteAlphabetNumber();
            final String actual = option.generateRealValue("０0１1２2３3４4５5６6７7８8９9");
            final String expected = "00112233445566778899";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteAlphabetNumber();
            final String actual = option.generateRealValue("Ａ｜０0１1２2３3４4５5６6７7８8９9￥Ｂ");
            final String expected = "A｜00112233445566778899￥B";
            assertEquals(expected, actual);
        }
    }

    public void test_toSingleByteAlphabetNumberMark() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteAlphabetNumberMark();
            final String actual = option.generateRealValue("０0１1２2３3４4５5６6７7８8９9");
            final String expected = "00112233445566778899";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteAlphabetNumberMark();
            final String actual = option.generateRealValue("Ａ｜\uff5e０0１1２2３3４4５5６6７7８8９9￥Ｂ");
            final String expected = "A|~00112233445566778899\\B";
            assertEquals(expected, actual);
        }
        {
            final String doubleByteMarks = "！＂＃＄％＆＇（）＊＊＋，－．／：；＜＝＞？＠［＼］＾＿｛｜｝～";
            final String singleByteMarks = "!\"#$%&'()**+,-./:;<=>?@[\\]^_{|}~";
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.toSingleByteAlphabetNumberMark();
            final String actual = option.generateRealValue(doubleByteMarks);
            final String expected = singleByteMarks;
            assertEquals(expected, actual);
        }
    }

    public void test_localJapanese_toDoubleByteKatakana() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.localJapanese().toDoubleByteKatakana();
            final String actual = option.generateRealValue("ｱｶｻﾀﾅ");
            final String expected = "アカサタナ";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.localJapanese().toDoubleByteKatakana();
            final String actual = option.generateRealValue("Ａ｜あいうえおﾊﾏﾔﾗﾜ￥Ｂ０１２b012");
            final String expected = "Ａ｜あいうえおハマヤラワ￥Ｂ０１２b012";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.localJapanese().toDoubleByteKatakana();
            final String actual = option.generateRealValue("､｢｣｡･");
            final String expected = "、「」。・";
            assertEquals(expected, actual);
        }
    }

    public void test_localJapanese_removeLastLongVowel() {
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.localJapanese().removeLastLongVowel();
            final String actual = option.generateRealValue("オーダー");
            final String expected = "オーダ";
            assertEquals(expected, actual);
        }
        {
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.localJapanese().toDoubleByteKatakana();
            final String actual = option.generateRealValue("オーダーＡ");
            final String expected = "オーダーＡ";
            assertEquals(expected, actual);
        }
    }

    // ===================================================================================
    //                                                                          Real Value
    //                                                                          ==========
    public void test_generateRealValue() throws Exception {
        final String inputValue = "abc%def_ghi";
        {
            // ## Arrange ##
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.escapeByPipeLine();

            // ## Act ##
            final String realValue = option.generateRealValue(inputValue);

            // ## Assert ##
            _log.debug("realValue=" + realValue);
            assertEquals("abc|%def|_ghi", realValue);
        }
        {
            // ## Arrange ##
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.likePrefix().escapeBySlash();

            // ## Act ##
            final String realValue = option.generateRealValue(inputValue);

            // ## Assert ##
            _log.debug("realValue=" + realValue);
            assertEquals("abc/%def/_ghi%", realValue);
        }
        {
            // ## Arrange ##
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.likeContain().escapeByAtMark();

            // ## Act ##
            final String realValue = option.generateRealValue(inputValue);

            // ## Assert ##
            _log.debug("realValue=" + realValue);
            assertEquals("%abc@%def@_ghi%", realValue);
        }
        {
            // ## Arrange ##
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.likeSuffix().escapeByBackSlash();

            // ## Act ##
            final String realValue = option.generateRealValue(inputValue);

            // ## Assert ##
            _log.debug("realValue=" + realValue);
            assertEquals("%abc\\%def\\_ghi", realValue);
        }
        {
            // ## Arrange ##
            final LdLikeSearchOption option = new LdLikeSearchOption();
            option.escapeByPipeLine();

            // ## Act ##
            final String realValue = option.generateRealValue(inputValue + "jk|l");

            // ## Assert ##
            _log.debug("realValue=" + realValue);
            assertEquals("abc|%def|_ghijk||l", realValue);
        }
    }
}
