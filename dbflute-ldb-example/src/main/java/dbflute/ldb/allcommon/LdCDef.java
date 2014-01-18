/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon;

import java.util.HashMap;
import java.util.Map;

/**
 * The definition class that has classification.
 * @author DBFlute(AutoGenerator)
 */
public class LdCDef {

    /**
     * はいいいえを示す
     */
    public enum YesNo {
        /** はい */
        Yes("y", "はい")
        ,
        /** いいえ */
        No("n", "いいえ")
        ;
        private static final Map<String, YesNo> _codeValueMap = new HashMap<String, YesNo>();
        static { for (YesNo value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code; private String _alias;
        private YesNo(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public static YesNo codeOf(Object code) {
            if (code == null) { return null; } return _codeValueMap.get(code.toString().toLowerCase());
        }
    }

    /**
     * 蔵書の状態を示す
     */
    public enum CollectionStatus {
        /** NOR: 通常状態を示す */
        NOR("NOR", "NOR")
        ,
        /** WAT: 待ち状態を示す */
        WAT("WAT", "WAT")
        ,
        /** OUT: 貸し出し中を示す */
        OUT("OUT", "OUT")
        ;
        private static final Map<String, CollectionStatus> _codeValueMap = new HashMap<String, CollectionStatus>();
        static { for (CollectionStatus value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code; private String _alias;
        private CollectionStatus(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public static CollectionStatus codeOf(Object code) {
            if (code == null) { return null; } return _codeValueMap.get(code.toString().toLowerCase());
        }
    }

}
