/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.character;

/**
 * The interface of general character.
 *
 * @author DBFlute(AutoGenerator)
 */
public interface LdGeneralCharacter {

    public String toSingleByteAlphabet(String s);

    public String toSingleByteNumber(String s);

    public String toSingleByteAlphabetNumber(String target);

    public String toSingleByteAlphabetNumberMark(String target);
}
