package dbflute.ldb.allcommon;


/**
 * The definition class that has classification.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdClassificationDefinition {

    // =====================================================================================
    //                                                        Classification-Code-Definition
    //                                                        ==============================
  
    /** The classification code of ArrivalWait. */
    public static final String CODE_CollectionStatus_ArrivalWait = "C10";
  
    /** The classification code of LendingOk. */
    public static final String CODE_CollectionStatus_LendingOk = "C20";
    
    /** The classification code of Destoroy. */
    public static final String CODE_BlackAction_Destoroy = "DRY";
  
    /** The classification code of Losting. */
    public static final String CODE_BlackAction_Losting = "LST";
    
    /** The classification code of Administrator. */
    public static final String CODE_Staff_Administrator = "ADM";
  
    /** The classification code of User. */
    public static final String CODE_Staff_User = "USR";
  
    /** The classification code of UtterStranger. */
    public static final String CODE_Staff_UtterStranger = "UTS";
  
    // =====================================================================================
    //                                                 Classification-CodeNameMap-Definition
    //                                                 =====================================

    /** The classification code-name map of CollectionStatus. */
    public static final java.util.Map<String, String> CODE_NAME_MAP_CollectionStatus;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_CollectionStatus_ArrivalWait, "ArrivalWait");
  
        map.put(CODE_CollectionStatus_LendingOk, "LendingOk");
  
        CODE_NAME_MAP_CollectionStatus = java.util.Collections.unmodifiableMap(map);
    }

    /** The classification code-name map of BlackAction. */
    public static final java.util.Map<String, String> CODE_NAME_MAP_BlackAction;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_BlackAction_Destoroy, "Destoroy");
  
        map.put(CODE_BlackAction_Losting, "Losting");
  
        CODE_NAME_MAP_BlackAction = java.util.Collections.unmodifiableMap(map);
    }

    /** The classification code-name map of Staff. */
    public static final java.util.Map<String, String> CODE_NAME_MAP_Staff;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_Staff_Administrator, "Administrator");
  
        map.put(CODE_Staff_User, "User");
  
        map.put(CODE_Staff_UtterStranger, "UtterStranger");
  
        CODE_NAME_MAP_Staff = java.util.Collections.unmodifiableMap(map);
    }


    /** The classification code-alias map of CollectionStatus. */
    public static final java.util.Map<String, String> CODE_ALIAS_MAP_CollectionStatus;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_CollectionStatus_ArrivalWait, "入荷待ち");
  
        map.put(CODE_CollectionStatus_LendingOk, "貸し出しOK");
  
        CODE_ALIAS_MAP_CollectionStatus = java.util.Collections.unmodifiableMap(map);
    }

    /** The classification code-alias map of BlackAction. */
    public static final java.util.Map<String, String> CODE_ALIAS_MAP_BlackAction;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_BlackAction_Destoroy, "破壊");
  
        map.put(CODE_BlackAction_Losting, "紛失");
  
        CODE_ALIAS_MAP_BlackAction = java.util.Collections.unmodifiableMap(map);
    }

    /** The classification code-alias map of Staff. */
    public static final java.util.Map<String, String> CODE_ALIAS_MAP_Staff;
    static {
        final java.util.Map<String, String> map = new java.util.LinkedHashMap<String, String>();
  
        map.put(CODE_Staff_Administrator, "管理者");
  
        map.put(CODE_Staff_User, "ユーザ");
  
        map.put(CODE_Staff_UtterStranger, "赤の他人");
  
        CODE_ALIAS_MAP_Staff = java.util.Collections.unmodifiableMap(map);
    }

}
