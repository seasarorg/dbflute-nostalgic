package com.example.dbflute.buri.dbflute.allcommon.plugin.buri;

import java.util.Map;
import java.util.HashMap;

import org.seasar.dbflute.Entity;

/**
 * The definition of Buri.
 * @author DBFlute(AutoGenerator)
 */
public class BuriDef {

    public static enum BuriProcess {
        文書管理_文書公開("文書管理.文書公開")
        ;
        private String _path;
        private BuriProcess(String path) {
            _path = path;
        }
        public String path() {
            return _path;
        }
        @Override
        public String toString() {
            return path();
        }
    }

    public static interface BuriStatus {
        String code();
        String path();
        BuriProcess process();
    }

    public static interface BuriAction {
        String code();
        BuriProcess process();
    }

    public enum 文書管理_文書公開_Status implements BuriStatus {
        レビュー待ち("レビュー待ち")
        ,
        差し戻し("差し戻し")
        ,
        公開待ち("公開待ち")
        ,
        公開中("公開中")
        ;
        private static final Map<String, 文書管理_文書公開_Status> _codeValueMap = new HashMap<String, 文書管理_文書公開_Status>();
        static { for (文書管理_文書公開_Status value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code;
        private 文書管理_文書公開_Status(String code) {
            _code = code;
        }
        public String code() {
            return _code;
        }
        public String path() {
            return process().path() + "." + _code;
        }
        public BuriProcess process() {
            return BuriProcess.文書管理_文書公開;
        }
        public static 文書管理_文書公開_Status codeOf(Object code) {
            if (code == null) { return null; }
            final String codeStr = code.toString();
            if (codeStr.contains(".")) {
                final int beginIndex = codeStr.lastIndexOf(".") + ".".length();
                return _codeValueMap.get(codeStr.substring(beginIndex));
            } else {
                return _codeValueMap.get(codeStr);
            }
        }
        @Override
        public String toString() {
            return path();
        }
    }

    public enum 文書管理_文書公開_Action implements BuriAction {
        Next("next")
        ,
        Update("update")
        ,
        Delete("delete")
        ,
        問題なし("問題なし")
        ,
        手直し必要("手直し必要")
        ;
        private static final Map<String, 文書管理_文書公開_Action> _codeValueMap = new HashMap<String, 文書管理_文書公開_Action>();
        static { for (文書管理_文書公開_Action value : values()) { _codeValueMap.put(value.code().toLowerCase(), value); } }
        private String _code;
        private 文書管理_文書公開_Action(String code) {
            _code = code;
        }
        public String code() {
            return _code;
        }
        public BuriProcess process() {
            return BuriProcess.文書管理_文書公開;
        }
        public static 文書管理_文書公開_Action codeOf(Object code) {
            if (code == null) { return null; }
            final String codeStr = code.toString();
            if (codeStr.contains(".")) {
                final int beginIndex = codeStr.lastIndexOf(".") + ".".length();
                return _codeValueMap.get(codeStr.substring(beginIndex));
            } else {
                return _codeValueMap.get(codeStr);
            }
        }
        @Override
        public String toString() {
            return process().path() + ":" + code();
        }
    }

    public static interface BuriUserDataProvider {
        Object provide(BuriProcess process, Entity entity, BuriAction action);
    }
}
