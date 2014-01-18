package dbflute.ldb.allcommon.helper.character.impl;

import junit.framework.TestCase;

/**
 * Test of GeneralCharacterImpl
 * 
 * @author jflute
 */
public class LdGeneralCharacterImplTest extends TestCase {

    public void test_toSingleByteNumber() {
        // ## Arrange ##
        final LdGeneralCharacterImpl character = new LdGeneralCharacterImpl();
        final String doubleByteAllNumber = "０１２３４５６７８９";

        // ## Act & Assert ##
        assertEquals(null, character.toSingleByteNumber(null));
        assertEquals("", character.toSingleByteNumber(""));
        assertEquals("0123456789", character.toSingleByteNumber(doubleByteAllNumber));
        assertEquals("あ12う3え4Ａ5・6Ｂ78￥9", character.toSingleByteNumber("あ１２う３え４Ａ５・６Ｂ７８￥９"));
    }

    public void test_toSingleByteAlphabetNumber() {
        // ## Arrange ##
        final LdGeneralCharacterImpl character = new LdGeneralCharacterImpl();
        final String doubleByteAllNumber = "０１２３４５６７８９";
        final String doubleByteAllUpperAlphabet = "ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ";
        final String doubleByteAllLowerAlphabet = "ａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚ";

        // ## Act & Assert ##
        assertEquals(null, character.toSingleByteAlphabetNumber(null));
        assertEquals("", character.toSingleByteAlphabetNumber(""));
        assertEquals("0123456789", character.toSingleByteAlphabetNumber(doubleByteAllNumber));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", character.toSingleByteAlphabetNumber(doubleByteAllUpperAlphabet));
        assertEquals("abcdefghijklmnopqrstuvwxyz", character.toSingleByteAlphabetNumber(doubleByteAllLowerAlphabet));
        assertEquals("あ12う3え4A5・6B7p8￥9", character.toSingleByteAlphabetNumber("あ１２う３え４Ａ５・６Ｂ７ｐ８￥９"));
    }

    public void test_toSingleByteAlphabetNumberMark() {
        // ## Arrange ##
        final LdGeneralCharacterImpl character = new LdGeneralCharacterImpl();
        final String doubleByteAllNumber = "０１２３４５６７８９";
        final String doubleByteAllUpperAlphabet = "ＡＢＣＤＥＦＧＨＩＪＫＬＭＮＯＰＱＲＳＴＵＶＷＸＹＺ";
        final String doubleByteAllLowerAlphabet = "ａｂｃｄｅｆｇｈｉｊｋｌｍｎｏｐｑｒｓｔｕｖｗｘｙｚ";

        // ## Act & Assert ##
        assertEquals(null, character.toSingleByteAlphabetNumberMark(null));
        assertEquals("", character.toSingleByteAlphabetNumberMark(""));
        assertEquals("0123456789", character.toSingleByteAlphabetNumberMark(doubleByteAllNumber));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", character.toSingleByteAlphabetNumberMark(doubleByteAllUpperAlphabet));
        assertEquals("abcdefghijklmnopqrstuvwxyz", character.toSingleByteAlphabetNumberMark(doubleByteAllLowerAlphabet));
        assertEquals("あ12\"う3~え4A5・6B7p8\\9", character.toSingleByteAlphabetNumberMark("あ１２“う３～え４Ａ５・６Ｂ７ｐ８￥９"));
    }
}
