package dbflute.ldb.allcommon;


import java.util.Map;

import dbflute.ldb.allcommon.helper.LdMapListString;
import dbflute.ldb.allcommon.helper.LdMapListStringImpl;

/**
 * The sigleton class that has generate-meta-data(GenMetaData).
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdGenMetaData {

    /** Singleton instance. */
    private static final LdGenMetaData _instance = new LdGenMetaData();

    /** The helper of map-list-string. */
    protected LdMapListString _mapListString = new LdMapListStringImpl();

    /**
     * Constructor.
     */
    private LdGenMetaData() {
        _mapListString = new LdMapListStringImpl();
        _mapListString.setDelimiter(";");
    }

    /**
     * Get instance.
     *
     * @return Singleton instance.
     */
    public static LdGenMetaData getInstance() {
        return _instance;
    }

    // =========================================================================================
    //                                                                     Generated method name
    //                                                                     =====================
    /**
     * Get the method name of 'getCountAll'.
     *
     * @return The method name of 'getCountAll'. (NotNull)
     */
    public String getMethodNameOfGetCountAll() {
        return "getCountAll";
    }

    /**
     * Get the method name of 'getListAll'.
     *
     * @return The method name of 'getListAll'. (NotNull)
     */
    public String getMethodNameOfGetListAll() {
        return "getListAll";
    }

    /**
     * Get the method name of 'getEntity'.
     *
     * @return The method name of 'getEntity'. (NotNull)
     */
    public String getMethodNameOfGetEntity() {
        return "getEntity";
    }

    /**
     * Get the method name of 'selectCountIgnoreFetchNarrowing'.
     *
     * @return The method name of 'selectCountIgnoreFetchNarrowing'. (NotNull)
     */
    public String getMethodNameOfSelectCountIgnoreFetchScope() {
        return "selectCountIgnoreFetchScope";
    }

    /**
     * Get the method name of 'selectEntity'.
     *
     * @return The method name of 'selectEntity'. (NotNull)
     */
    public String getMethodNameOfSelectEntity() {
        return "selectEntity";
    }

    /**
     * Get the method name of 'selectList'.
     *
     * @return The method name of 'selectList'. (NotNull)
     */
    public String getMethodNameOfSelectList() {
        return "selectList";
    }

    // =========================================================================================
    //                                             Only when having generated, the effective one
    //                                             =============================================
    /**
     * Get the property-value of targetLanguage.
     *
     * @return The property-value.
     */
    public String getTargetLanguage() {
        return "java";
    }

    /**
     * Get the property-value of templateFileExtension.
     *
     * @return The property-value.
     */
    public String getTemplateFileExtension() {
        return "vm";
    }

    /**
     * Get the property-value of classFileExtension.
     *
     * @return The property-value.
     */
    public String getClassFileExtension() {
        return "java";
    }

    /**
     * Get the property-value of templateFileEncoding.
     *
     * @return The property-value.
     */
    public String getTemplateEncoding() {
        return "Windows-31J";
    }

    /**
     * Get the property-value of classAuthor.
     *
     * @return The property-value.
     */
    public String getClassAuthor() {
        return "DBFlute(AutoGenerator)";
    }

    /**
     * Is available entity lazy load?
     *
     * @return The property-value.
     */
    public boolean isAvailableEntityLazyLoad() {
        return false;
    }

    /**
     * Is java name of table same as db name? Answer is false!
     *
     * @return The property-value.
     */
    public boolean isJavaNameOfTableSameAsDbName() {
        return false;
    }

    /**
     * Is java name of column same as db name? Answer is false!
     *
     * @return The property-value.
     */
    public boolean isJavaNameOfColumnSameAsDbName() {
        return false;
    }

    /**
     * is available common-column-setup interceptor to behavior?
     *
     * @return The property-value.
     */
    public boolean isAvailableCommonColumnSetupInterceptorToBehavior() {
        return true;
    }

    /**
     * Is available generics? Answer is true!
     *
     * @return The property-value.
     */
    public boolean isAvailableGenerics() {
        return true;
    }

    /**
     * Get the property-value of projectPrefix.
     *
     * @return The property-value.
     */
    public String getProjectPrefix() {
        return "Ld";
    }

    /**
     * Get the property-value of basePrefix.
     *
     * @return The property-value.
     */
    public String getBasePrefix() {
        return "Bs";
    }

    /**
     * Get the property-value of baseSuffixForEntity.
     *
     * @return The property-value.
     */
    public String getBaseSuffixForEntity() {
        return "";
    }

    // -------------------------------------------------------------------------------
    //                                                            DaoDicon Information
    //                                                            --------------------
    /**
     * Get the property-value of daoDiconNamespace.
     *
     * @return The property-value.
     */
    public String getDaoDiconNamespace() {
        return "dao";
    }

    /**
     * Get the property-value of daoDiconPackageName.
     *
     * @return The property-value.
     */
    public String getDaoDiconPackageName() {
        return "../resources";
    }

    /**
     * Get the property-value of daoDiconFileName.
     *
     * @return The property-value.
     */
    public String getDaoDiconFileName() {
        return "dao-ldb.dicon";
    }

    /**
     * Get the property-value of j2eeDiconResourceName.
     *
     * @return The property-value.
     */
    public String getJ2eeDiconResourceName() {
        return "j2ee-ldb.dicon";
    }

    /**
     * Get the property-value of requiredTxComponentName.
     *
     * @return The property-value.
     */
    public String getRequiredTxComponentName() {
        return "requiredTx";
    }

    // -------------------------------------------------------------------------------
    //                                                               EntityDao Package
    //                                                               -----------------
    /**
     * Get the property-value of baseCommonPackage.
     *
     * @return The property-value.
     */
    public String getBaseCommonPackage() {
        return "dbflute.ldb.allcommon";
    }

    /**
     * Get the property-value of baseBehaviorPackage.
     *
     * @return The property-value.
     */
    public String getBaseBehaviorPackage() {
        return "dbflute.ldb.bsbhv";
    }

    /**
     * Get the property-value of baseDaoPackage.
     *
     * @return The property-value.
     */
    public String getBaseDaoPackage() {
        return "dbflute.ldb.bsdao";
    }

    /**
     * Get the property-value of baseEntityPackage.
     *
     * @return The property-value.
     */
    public String getBaseEntityPackage() {
        return "dbflute.ldb.bsentity";
    }

    /**
     * Get the property-value of conditionBeanPackage.
     *
     * @return The property-value.
     */
    public String getConditionBeanPackage() {
        return "dbflute.ldb.cbean";
    }

    /**
     * Get the property-value of extendedDaoPackage.
     *
     * @return The property-value.
     */
    public String getExtendedDaoPackage() {
        return "dbflute.ldb.exdao";
    }

    /**
     * Get the property-value of extendedBehaviorPackage.
     *
     * @return The property-value.
     */
    public String getExtendedBehaviorPackage() {
        return "dbflute.ldb.exbhv";
    }

    /**
     * Get the property-value of extendedEntityPackage.
     *
     * @return The property-value.
     */
    public String getExtendedEntityPackage() {
        return "dbflute.ldb.exentity";
    }

    /**
     * Get the property-map of sequenceDefinitionMap.
     *
     * @return The property-map.
     */
    public Map<String, Object> getSequenceDefinitionMapAsString() {
        final String property = "map:{	AUTHOR	= AUTHOR_AUTHOR_ID_INC	; BOOK	= BOOK_BOOK_ID_INC		}";
        return _mapListString.generateMap(property);
    }

    /**
     * Get the property-map of IdentityDefinitionMap.
     *
     * @return The property-map.
     */
    public Map<String, Object> getIdentityDefinitionMapAsString() {
        final String property = "map:{	AUTHOR	=	AUTHOR_ID	; BOOK	=	BOOK_ID	; COLLECTION	=	COLLECTION_ID	}";
        return _mapListString.generateMap(property);
    }

    /**
     * Get the property-value of updateDateFieldName.
     *
     * @return The property-value.
     */
    public String getUpdateDateFieldName() {
        return "U_TIME";
    }

    /**
     * Get the property-value of versionNoFieldName.
     *
     * @return The property-value.
     */
    public String getVersionNoFieldName() {
        return "";
    }

    /**
     * Get the property-map of commonColumnMapAsStringRemovedLineSeparator.
     *
     * @return The property-map.
     */
    public Map<String, Object> getCommonColumnMap() {
        final String property = "map:{R_TIME=TIMESTAMP;U_TIME=TIMESTAMP;R_STAFF=VARCHAR;U_STAFF=VARCHAR}";
        return _mapListString.generateMap(property);
    }

    /**
     * Get the property-value of fetchPageDefaultFetchSize.
     *
     * @return The property-value.
     */
    public int getSqlClauseDefaultFetchSize() {
        return 20;
    }

    /**
     * is available use absolute when result set fetch-narrowing?
     *
     * @return The property-value.
     */
    public boolean isAvailableUseAbsoluteWhenResultSetFetchNarrowing() {
        return true;
    }

    /**
     * Get the property-value of selectQueryTimeout.
     *
     * @return The property-value.
     */
    public int getSelectQueryTimeout() {
        return -1;
    }

    /**
     * Get the value of 'extractAcceptStartBrace'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptStartBrace() {
        return "@{";
    }

    /**
     * Get the value of 'extractAcceptEndBrace'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptEndBrace() {
        return "@}";
    }

    /**
     * Get the value of 'extractAcceptDelimiter'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptDelimiter() {
        return "@;";
    }

    /**
     * Get the value of 'extractAcceptEqual'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptEqual() {
        return "@=";
    }

    /**
     * Get the property-map of jdbcToJavaNativeMap.
     *
     * @return The property-map.
     */
    public Map<String, Object> getJdbcToJavaNativeMap() {
        final String property = "map:{}";
        return _mapListString.generateMap(property);
    }

    /**
     * Get the property-value of wildCard.
     *
     * @return The property-value.
     */
    public String getWildCard() {
        return "%";
    }
}
