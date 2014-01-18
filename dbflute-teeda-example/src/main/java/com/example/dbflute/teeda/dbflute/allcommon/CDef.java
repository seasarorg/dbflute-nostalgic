package com.example.dbflute.teeda.dbflute.allcommon;

import java.util.HashMap;
import java.util.Map;

/**
 * The definition class that has classification.
 * @author DBFlute(AutoGenerator)
 */
public class CDef {

    /**
     * フラグを示す
     */
    public enum Flg {
        /** True: 有効を示す */
        True("1", "True")
        ,
        /** False: 無効を示す */
        False("0", "False")
        ;
        private static final Map<String, Flg> _codeValueMap = new HashMap<String, Flg>();
        static { for (Flg value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code; private String _alias;
        private Flg(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public static Flg codeOf(Object code) {
            if (code == null) { return null; } return _codeValueMap.get(code.toString().toLowerCase());
        }
    }

    /**
     * 会員の状態を示す
     */
    public enum MemberStatus {
        /** Provisional: 仮会員を示す */
        Provisional("PRV", "Provisional")
        ,
        /** Formalized: 正式会員を示す */
        Formalized("FML", "Formalized")
        ,
        /** Withdrawal: 退会会員を示す */
        Withdrawal("WDL", "Withdrawal")
        ;
        private static final Map<String, MemberStatus> _codeValueMap = new HashMap<String, MemberStatus>();
        static { for (MemberStatus value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code; private String _alias;
        private MemberStatus(String code, String alias) { _code = code; _alias = alias; }
        public String code() { return _code; } public String alias() { return _alias; }
        public static MemberStatus codeOf(Object code) {
            if (code == null) { return null; } return _codeValueMap.get(code.toString().toLowerCase());
        }
    }

}
