package dbflute.ldb.allcommon.helper.character.impl;

import junit.framework.TestCase;

/**
 * Test of JapaneseCharacterImpl
 * 
 * @author jflute
 */
public class LdJapaneseCharacterImplTest extends TestCase {

    public void test_toDoubleByteKatakana() {
        // ## Arrange ##
        final LdJapaneseCharacterImpl character = new LdJapaneseCharacterImpl();
        final String doubleByteAllNumber = "０１２３４５６７８９";
        final String doubleByteAllUpperAlphabet = "ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ";
        final String doubleByteAllLowerAlphabet = "ａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚ";

        // ## Act & Assert ##
        assertEquals(null, character.toDoubleByteKatakana(null));
        assertEquals("", character.toDoubleByteKatakana(""));
        assertEquals(doubleByteAllNumber, character.toDoubleByteKatakana(doubleByteAllNumber));
        assertEquals(doubleByteAllUpperAlphabet, character.toDoubleByteKatakana(doubleByteAllUpperAlphabet));
        assertEquals(doubleByteAllLowerAlphabet, character.toDoubleByteKatakana(doubleByteAllLowerAlphabet));
        assertEquals("ア１カ２いウ３エ４Ａ・Ｂォあヲ￥ン９ッ", character.toDoubleByteKatakana("ｱ１カ２いｳ３ｴ４Ａ・Ｂｫあｦ￥ﾝ９ｯ"));
        assertEquals("アあプ１ピいウ３ペ・ポＢォあパ￥ン９ッ", character.toDoubleByteKatakana("ｱあﾌﾟ１ﾋﾟいｳ３ﾍﾟ・ﾎﾟＢｫあﾊﾟ￥ﾝ９ｯ"));
        assertEquals("ヴク", character.toDoubleByteKatakana("ｳﾞク"));
    }
}
