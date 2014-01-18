/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdForeignInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdReferrerInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;

/**
 * The arranger of hierarchy.
 * <pre>
 * ex) LIBRARY Hierarchy
 * 
 * LIBRARY
 *  |1
 *  |--* NEXT_LIBRARY (Referrer)
 *  |       |*
 *  |       |--1 LIBRARY (Foreign)
 *  |
 *  |--* COLLECTION (Referrer)
 *  |       |1 
 *  |       |--1 COLLECTION_STATUS (Referrer)
 *  |       |       |*
 *  |       |       |--1 COLLECTION_STATUS_LOOKUP (Foreign)
 *  |       |
 *  |       |--1 BOOK (Foreign)
 *  |       |     |*
 *  |       |     |--1 AUTHOR (Foreign)
 *  |       |     |--1 PUBLISER (Foreign)
 *  |       |     |--1 GENRE (Foreign)
 *  |       |           |*
 *  |       |           |--1 GENRE (Foreign)
 *  |       |
 *  |       |--* LENDING_COLLECTION (Referrer)
 *  |       |
 *  |
 *  |--* LIBRARY_USER (Referrer)
 *         |*  |1
 *         |   |--* LENDING (Referrer)
 *         |         |1
 *         |         |--* LENDING_COLLECTION (Referrer)
 *         |
 *         |--1 LB_USER (Foreign)
 *                 |1
 *                 |--* BLACK_LIST (Referrer)
 *                         |1
 *                         |--* BLACK_ACTION (Referrer)
 *                                 |*
 *                                 |--1 BLACK_ACTION_LOOKUP (Foreign)
 *          
 *          
 * ex) The SQL of LIBRARY Hierarchy as FLAT
 * 
 * select library.LIBRARY_ID as LIBRARY_ID
 *      , library.LIBRARY_NAME as LIBRARY_NAME
 *      , library.R_USER as R_USER
 *      , library.R_TIMESTAMP as R_TIMESTAMP
 *      , nextBase.LIBRARY_ID as BASE_LIBRARY_ID
 *      , nextBase.NEXT_LIBRARY_ID as NEXT_LIBRARY_ID
 *      , nextBaseNextLibrary.LIBRARY_ID as NEXT_LIBRARY_NEXT_LIBRARY_ID
 *      , nextBaseNextLibrary.LIBRARY_NAME as NEXT_LIBRARY_NEXT_LIBRARY_NAME
 *      , collection.COLLECTION_ID as COLLECTION_ID
 *      , collection.ARRIVAL_DATE as COLLECTION_ARRIVAL_DATE
 *      , collectionStatus.COLLECTION_ID as COLLECTION_STATUS_ID
 *      , collectionStatus.COLLECTION_STATUS_CODE as COLLECTION_STATUS_CODE
 *      , collectionStatusLookup.COLLECTION_STATUS_CODE as COLLECTION_STATUS_CODE
 *      , collectionStatusLookup.COLLECTION_STATUS_NAME as COLLECTION_STATUS_NAME
 *      , book.BOOK_ID as COLLECTION_BOOK_ID
 *      , book.BOOK_NAME as COLLECTION_BOOK_NAME
 *      , author.AUTHOR_ID as COLLECTION_BOOK_AUTHOR_ID
 *      , author.AUTHOR_NAME as COLLECTION_BOOK_AUTHOR_NAME
 *      , libraryUser.LIBRARY_ID as LIBRARY_USER_LIBRARY_ID 
 *      , libraryUser.LB_USER_ID as LIBRARY_USER_LB_USER_ID
 *      , lending.LIBRARY_ID as LENDING_LIBRARY_ID
 *      , lending.LB_USER_ID as LENDING_LB_USER_ID
 *      , lending.LENDING_DATE as LENDING_DATE
 *      , lending.U_USER as LENDING_U_USER
 *      , lending.U_MODULE as LENDING_U_MODULE
 *      , lbUser.LB_USER_ID as LB_USER_ID
 *      , lbUser.LB_USER_NAME as LB_USER_NAME
 *   from LIBRARY library
 *     left outer join NEXT_LIBRARY nextBase on library.LIBRARY_ID = nextBase.LIBRARY_ID
 *       left outer join LIBRARY nextBaseNextLibrary on nextBase.NEXT_LIBRARY_ID = nextBaseNextLibrary.LIBRARY_ID
 *     left outer join COLLECTION collection on library.LIBRARY_ID = collection.LIBRARY_ID
 *       left outer join COLLECTION_STATUS collectionStatus on collection.COLLECTION_ID = collectionStatus.COLLECTION_ID
 *         left outer join COLLECTION_STATUS_LOOKUP collectionStatusLookup on collectionStatus.COLLECTION_STATUS_CODE = collectionStatusLookup.COLLECTION_STATUS_CODE
 *       left outer join BOOK book on collection.BOOK_ID = book.BOOK_ID
 *         left outer join AUTHOR author on book.AUTHOR_ID = author.AUTHOR_ID
 *     left outer join LIBRARY_USER libraryUser on library.LIBRARY_ID = libraryUser.LIBRARY_ID
 *       left outer join LENDING lending on libraryUser.LIBRARY_ID = lending.LIBRARY_ID and libraryUser.LB_USER_ID = lending.LB_USER_ID
 *       left outer join LB_USER lbUser on libraryUser.LB_USER_ID = lbUser.LB_USER_ID
 * 
 * 
 * ex) Invoking Hierarchy Arranger
 * 
 * private List&lt;Library&gt; makeLibraryList() {
 *     final HierarchyRequest&lt;Library&gt; request = createHierarchyRequest(createFlatLibraryList());
 *     return new HierarchyArranger&lt;Library&gt;().arrangeHierarchy(request);
 * }
 * 
 * 
 * ex) Creating Hierarchy Request
 * 
 * private HierarchyRequest&lt;Library&gt; createHierarchsyRequest(java.util.List&gt;HierarchyFlatLibrary&gt; flatLibraryList) {
 * 
 *     // Define dbmeta.
 *     final HierarchyFlatLibraryDbm sourceDbm = HierarchyFlatLibraryDbm.getInstance();
 *
 *     // Define hierarychy request as library.
 *     final HierarchyRequest&lt;Library&gt; request = new HierarchyRequest&lt;Library&gt;(Library.class);
 * 
 *     // Register the list of source iterator. (by calling creator for flat library list)
 *     request.registerSourceList(flatLibraryList);
 *
 *     // Create relation trace.
 *     final LibraryRelationTrace trace = LibraryDbm.getInstance().createRelationTrace(null);
 *     
 *     // Register column [libraryId]
 *     request.mapping(sourceDbm.columnLibraryId(), trace.columnLibraryId());
 *
 *     // Register column [libraryName]
 *     request.mapping(sourceDbm.columnLibraryName(), trace.columnLibraryName());
 *
 *     // Register column [RUser]
 *     request.mapping(sourceDbm.columnRUser(), trace.columnRUser());
 *
 *     // Register column [RTimestamp]
 *     request.mapping(sourceDbm.columnRTimestamp(), trace.columnRTimestamp());
 *
 *     // Register column [baseLibraryId]
 *     request.mapping(sourceDbm.columnBaseLibraryId(), trace.referrerNextLibraryByBaseIdList().columnLibraryId());
 *
 *     // Register column [nextLibraryId]
 *     request.mapping(sourceDbm.columnNextLibraryId(), trace.referrerNextLibraryByBaseIdList().columnNextLibraryId());
 *
 *     // Register column [nextLibraryNextLibraryId]
 *     request.mapping(sourceDbm.columnNextLibraryNextLibraryId(), trace.referrerNextLibraryByBaseIdList().foreignLibraryByNextId().columnLibraryId());
 *
 *     // Register column [nextLibraryNextLibraryName]
 *     request.mapping(sourceDbm.columnNextLibraryNextLibraryName(), trace.referrerNextLibraryByBaseIdList().foreignLibraryByNextId().columnLibraryName());
 *
 *     // Register column [collectionId]
 *     request.mapping(sourceDbm.columnCollectionId(), trace.referrerCollectionList().columnCollectionId());
 *
 *     // Register column [arrivalDate]
 *     request.mapping(sourceDbm.columnCollectionArrivalDate(), trace.referrerCollectionList().columnArrivalDate());
 *
 *     // Register column [collectionStatusId]
 *     request.mapping(sourceDbm.columnCollectionStatusId(), trace.referrerCollectionList().foreignCollectionStatusAsOne().columnCollectionId());
 *
 *     // Register column [collectionStatusCode]
 *     request.mapping(sourceDbm.columnCollectionStatusCode(), trace.referrerCollectionList().foreignCollectionStatusAsOne().foreignCollectionStatusLookup().columnCollectionStatusCode());
 *
 *     // Register column [collectionStatusName]
 *     request.mapping(sourceDbm.columnCollectionStatusName(), trace.referrerCollectionList().foreignCollectionStatusAsOne().foreignCollectionStatusLookup().columnCollectionStatusName());
 *
 *     // Register column [collectionBookId]
 *     request.mapping(sourceDbm.columnCollectionBookId(), trace.referrerCollectionList().foreignBook().columnBookId());
 *
 *     // Register column [collectionBookName]
 *     request.mapping(sourceDbm.columnCollectionBookName(), trace.referrerCollectionList().foreignBook().columnBookName());
 *
 *     // Register column [collectionBookAuthorId]
 *     request.mapping(sourceDbm.columnCollectionBookAuthorId(), trace.referrerCollectionList().foreignBook().foreignAuthor().columnAuthorId());
 *
 *     // Register column [collectionBookAuthorName]
 *     request.mapping(sourceDbm.columnCollectionBookAuthorName(), trace.referrerCollectionList().foreignBook().foreignAuthor().columnAuthorName());
 *
 *     // Register column [libraryUserLibraryId]
 *     request.mapping(sourceDbm.columnLibraryUserLibraryId(), trace.referrerLibraryUserList().columnLibraryId());
 *
 *     // Register column [libraryUserLbUserId]
 *     request.mapping(sourceDbm.columnLibraryUserLbUserId(), trace.referrerLibraryUserList().columnLbUserId());
 *
 *     // Register column [lendingLibraryId]
 *     request.mapping(sourceDbm.columnLendingLibraryId(), trace.referrerLibraryUserList().referrerLendingList().columnLibraryId());
 *
 *     // Register column [lendingLbUserId]
 *     request.mapping(sourceDbm.columnLendingLbUserId(), trace.referrerLibraryUserList().referrerLendingList().columnLbUserId());
 *
 *     // Register column [lendingDate]
 *     request.mapping(sourceDbm.columnLendingDate(), trace.referrerLibraryUserList().referrerLendingList().columnLendingDate());
 *
 *     // Register column [lendingUUser]
 *     request.mapping(sourceDbm.columnLendingUUser(), trace.referrerLibraryUserList().referrerLendingList().columnUUser());
 *
 *     // Register column [lendingUModule]
 *     request.mapping(sourceDbm.columnLendingUModule(), trace.referrerLibraryUserList().referrerLendingList().columnUModule());
 *
 *     // Register column [lbUserId]
 *     request.mapping(sourceDbm.columnLbUserId(), trace.referrerLibraryUserList().foreignLbUser().columnLbUserId());
 *
 *     // Register column [lbUserName]
 *     request.mapping(sourceDbm.columnLbUserName(), trace.referrerLibraryUserList().foreignLbUser().columnLbUserName());
 *
 *     return request;
 * }
 * 
 * private java.util.List&gt;HierarchyFlatLibrary&gt; createFlatLibraryList() {
 *     (...select and get list)
 *     return flatLibraryList;
 * }
 * 
 * 
 * === Relation Trace Tips ===
 * 
 *   RelationTrace.f + [Code Assist] -- go to Foreign
 *   RelationTrace.r + [Code Assist] -- go to Referrer
 *   RelationTrace.c + [Code Assist] -- end relation by Column
 *
 * 
 * <pre>
 * @author DBFlute(AutoGenerator)
 * @param <LOCAL_ENTITY> The type of local entity extends Entity
 */
public class LdHierarchyArranger<LOCAL_ENTITY extends LdEntity> {

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * Arrange hierarchy.
     * 
     * @param request Hierarchy request. (NotNull)
     * @return The list of local entity. (NotNull)
     */
    public List<LOCAL_ENTITY> arrangeHierarchy(LdHierarchyRequest<LOCAL_ENTITY> request) {
        final List<LOCAL_ENTITY> localTableList = new ArrayList<LOCAL_ENTITY>();
        final Map<String, LdEntity> alreadyRegisteredEntityMap = new HashMap<String, LdEntity>();

        // ============
        // Record Loop!
        // ============
        final LdHierarchySourceIterator sourceIterator = request.getSourceIterator();
        while (sourceIterator.hasNext()) {
            final LdHierarchySourceRow sourceRow = sourceIterator.next();
            final TopInfo<LOCAL_ENTITY> topInfo = new TopInfo<LOCAL_ENTITY>();
            topInfo.setHierarchyRequest(request);
            topInfo.setSourceRow(sourceRow);
            topInfo.setAlreadyRegisteredEntityMap(alreadyRegisteredEntityMap);

            final Map<String, Object> primaryKeyMap = extractTopPrimaryKeyMapFromSource(topInfo);
            final String alreadyRegisteredKey = buildTopAlreadyRegisteredKey(primaryKeyMap);
            if (alreadyRegisteredEntityMap.containsKey(alreadyRegisteredKey)) {
                final LdEntity localEntity = alreadyRegisteredEntityMap.get(alreadyRegisteredKey);
                topInfo.setLocalEntity(localEntity);
            } else {
                // Make local entity and register it to the result list.
                final LOCAL_ENTITY localEntity = newLocalEntity(request.getDestinationDBMeta());
                topInfo.setLocalEntity(localEntity);
                localTableList.add(localEntity);
                alreadyRegisteredEntityMap.put(alreadyRegisteredKey, localEntity);
            }

            // ============
            // Column Loop!
            // ============
            doColumnLoop(topInfo);
        }

        // Clear modified properties.
        final java.util.Set<String> alreadyRegisteredEntityKeySet = alreadyRegisteredEntityMap.keySet();
        for (String key : alreadyRegisteredEntityKeySet) {
            final LdEntity currentRegisteredEntity = alreadyRegisteredEntityMap.get(key);
            currentRegisteredEntity.clearModifiedPropertyNames();
        }

        return localTableList;
    }

    /**
     * Build top already-registered key.
     * 
     * @param primaryKeyMap The map of primary key. (NotNull)
     * @return Top already-registered key. (NotNull)
     */
    protected String buildTopAlreadyRegisteredKey(Map<String, Object> primaryKeyMap) {
        return LdHierarchyRequestElement.TOP_KEY + ":" + primaryKeyMap;
    }

    /**
     * Do column loop.
     * 
     * @param topInfo The information object of top that has generics of the type of local entity. (NotNull)
     */
    protected void doColumnLoop(TopInfo<LOCAL_ENTITY> topInfo) {
        final LdHierarchyRequest<LOCAL_ENTITY> request = topInfo.getHierarchyRequest();
        final LdEntity localEntity = topInfo.getLocalEntity();
        final List<LdHierarchyRequestElement> requestElementList = request.getRequestElementList();

        // ============
        // Column Loop!
        // ============
        for (LdHierarchyRequestElement requestElement : requestElementList) {
            final List<String> relationPropertyNameList = requestElement.getRelationPropertyNameList();

            // If the column belongs to local entity, inject the value to entity and continue loop.
            if (relationPropertyNameList == null || relationPropertyNameList.isEmpty()) {
                final LdHierarchySourceColumn sourceColumn = requestElement.getSourceColumnInfo();
                final LdHierarchySourceRow sourceRow = topInfo.getSourceRow();
                final Object sourceColumnValue = extractColumnValueFromSource(sourceRow, sourceColumn);
                final LdColumnInfo destinationColumnInfo = requestElement.getDestinationColumnInfo();
                injectColumnValueToDestinationIfNotNull(localEntity, destinationColumnInfo, sourceColumnValue);
                continue;
            }

            // ==============
            // Relation Loop!
            // ==============
            doRelationLoop(topInfo, requestElement, relationPropertyNameList);
        }
    }

    /**
     * Do relation loop.
     * 
     * @param topInfo The information object of top that has generics of local entity. (NotNull)
     * @param requestElement The element of request. This is relation loop resource. (NotNull)
     * @param relationPropNameList The list of relation property name that has generics of string. (NotNull)
     */
    protected void doRelationLoop(TopInfo<LOCAL_ENTITY> topInfo, LdHierarchyRequestElement requestElement, java.util.List<String> relationPropNameList) {
        final LdHierarchyRequest<LOCAL_ENTITY> request = topInfo.getHierarchyRequest();
        final Map<String, LdEntity> alreadyRegisteredEntityMap = topInfo.getAlreadyRegisteredEntityMap();

        // Temporary variables for local
        LdEntity localEntity = topInfo.getLocalEntity();// as Default
        LdDBMeta localDBMeta = request.getDestinationDBMeta();// as Default
        String localRelationPath = LdHierarchyRequestElement.TOP_KEY;// as Default

        // ==============
        // Relation Loop!
        // ==============
        final StringBuilder relationPropKeyStringBuilder = new StringBuilder();
        int relationLoopCount = 0;
        for (String relationPropName : relationPropNameList) {
            if (relationPropKeyStringBuilder.length() > 0) {
                relationPropKeyStringBuilder.append("_");
            }
            relationPropKeyStringBuilder.append(relationPropName);
            final String targetRelationPath = relationPropKeyStringBuilder.toString();
            final LdRelationInfo relationInfo = localDBMeta.findRelationInfo(relationPropName);

            final Map<String, Object> targetPrimaryKeyMap;
            final String alreadyRegisteredEntityKey;
            if (!relationInfo.isReferrer()) {
                // =======
                // Foreign
                // =======
                final LdForeignInfo foreignInfo = localDBMeta.findForeignInfo(relationPropName);
                final String foreignPropName = foreignInfo.getForeignPropertyName();

                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                // If the value of primary key does not exist, break this relation path!
                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                if (isNotExistPrimaryKey(topInfo, targetRelationPath)) {
                    break;
                }

                targetPrimaryKeyMap = extractPrimaryKeyMapFromSource(topInfo, targetRelationPath);
                alreadyRegisteredEntityKey = targetRelationPath + ":" + targetPrimaryKeyMap.toString();
                if (!alreadyRegisteredEntityMap.containsKey(alreadyRegisteredEntityKey)) {
                    // - - - - - - - - - - - - - - - - - - - - - - -
                    // Initialize the foreign entity and inject it.
                    // - - - - - - - - - - - - - - - - - - - - - - -
                    final LdEntity foreignEntity = foreignInfo.getForeignDBMeta().newEntity();
                    injectForeignEntity(localEntity, foreignPropName, foreignEntity);

                    // - - - - - - - - - - - - - - - - - -
                    // Initialize primary key of foreign.
                    // - - - - - - - - - - - - - - - - - -
                    injectForeignPrimaryKey(foreignEntity, targetPrimaryKeyMap);

                    // - - - - - - - - - - - - - - - - - -
                    // Initialize foreign key of local.
                    // - - - - - - - - - - - - - - - - - -
                    injectLocalForeignKey(topInfo, localEntity, foreignInfo, targetRelationPath);

                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    // Put foreign entity to the map of already-registered-entity.
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    alreadyRegisteredEntityMap.put(alreadyRegisteredEntityKey.toString(), foreignEntity);
                } else {
                    // - - - - - - - - - - - - - -
                    // Inject the foreign entity.
                    // - - - - - - - - - - - - - -
                    final LdEntity foreignEntity = alreadyRegisteredEntityMap.get(alreadyRegisteredEntityKey);
                    injectForeignEntity(localEntity, foreignPropName, foreignEntity);
                }
            } else {
                // =======
                // Referrer
                // =======
                final LdReferrerInfo referrerInfo = localDBMeta.findReferrerInfo(relationPropName);

                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                // Extract referrer list from current local entity and initialize it if needs.
                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                List<LdEntity> referrerList = extractReferrerList(localEntity, referrerInfo);
                if (referrerList == null) {
                    // Initialize the list of referrer and inject it.
                    referrerList = new ArrayList<LdEntity>();
                    injectReferrerList(localEntity, referrerInfo, referrerList);
                }

                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                // If the value of primary key does not exist, break this relation path!
                // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                if (isNotExistPrimaryKey(topInfo, targetRelationPath)) {
                    break;
                }

                targetPrimaryKeyMap = extractPrimaryKeyMapFromSource(topInfo, targetRelationPath);
                alreadyRegisteredEntityKey = targetRelationPath + ":" + targetPrimaryKeyMap.toString();
                if (!alreadyRegisteredEntityMap.containsKey(alreadyRegisteredEntityKey)) {
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    // Initialize referrer entity and register it to the list of referrer with primary key value.
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    final LdEntity referrerEntity = relationInfo.getTargetDBMeta().newEntity();
                    referrerList.add(referrerEntity);

                    // - - - - - - - - - - - - - - - - - -
                    // Initialize primary key of referrer.
                    // - - - - - - - - - - - - - - - - - -
                    injectReferrerPrimaryKey(referrerEntity, targetPrimaryKeyMap);

                    // - - - - - - - - - - - - - - - - - -
                    // Initialize foreign key of referrer.
                    // - - - - - - - - - - - - - - - - - -
                    injectReferrerForeignKey(topInfo, referrerEntity, referrerInfo, localRelationPath);

                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    // Put referrer entity to the map of already-registered-entity.
                    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    alreadyRegisteredEntityMap.put(alreadyRegisteredEntityKey.toString(), referrerEntity);
                }
            }

            // - - - - - - - - - - - - - - - - - -
            // Set next value to current element.
            // - - - - - - - - - - - - - - - - - -
            localEntity = alreadyRegisteredEntityMap.get(alreadyRegisteredEntityKey);
            localDBMeta = localEntity.getDBMeta();
            localRelationPath = targetRelationPath;

            if (relationLoopCount == (relationPropNameList.size() - 1)) {// The last loop!
                // - - - - - - - - - - - -  
                // Here is the last loop!
                // - - - - - - - - - - - - 
                doLastLoopInjection(topInfo, requestElement, localEntity, targetPrimaryKeyMap);
            }
            ++relationLoopCount;
        }
    }

    /**
     * Is not existing primary key at the relation path?.
     * 
     * @param topInfo The information object of top that has generics of local entity. (NotNull)
     * @param relationPath The path of relation. (NotNull)
     * @return Determination.
     */
    protected boolean isNotExistPrimaryKey(TopInfo<LOCAL_ENTITY> topInfo, String relationPath) {
        final Map<String, Object> primaryKeyMap = extractPrimaryKeyMapFromSource(topInfo, relationPath);
        final Set<String> keySet = primaryKeyMap.keySet();
        for (String key : keySet) {
            final Object value = primaryKeyMap.get(key);
            if (value == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * Do last loop injection.
     * 
     * @param topInfo The information object of top that has generics of local entity. (NotNull)
     * @param requestElement The element of request. This is relation loop resource. (NotNull)
     * @param localEntity The interface of local entity. (NotNull)
     * @param primaryKeyMap The map of primary key. (NotNull)
     */
    protected void doLastLoopInjection(TopInfo<LOCAL_ENTITY> topInfo, LdHierarchyRequestElement requestElement,
                                       LdEntity localEntity, Map<String, Object> primaryKeyMap) {
        final LdColumnInfo destinationColumnInfo = requestElement.getDestinationColumnInfo();
        if (!primaryKeyMap.containsKey(destinationColumnInfo.getColumnDbName())) {// The column is primary key!
            final LdHierarchySourceRow sourceRow = topInfo.getSourceRow();
            final LdHierarchySourceColumn sourceColumnInfo = requestElement.getSourceColumnInfo();
            final Object sourceColumnValue = extractColumnValueFromSource(sourceRow, sourceColumnInfo);
            if (sourceColumnValue != null) {
                injectColumnValueToDestinationIfNotNull(localEntity, destinationColumnInfo, sourceColumnValue);
            }
        }
    }

    // ===================================================================================
    //                                                                       Extract Logic
    //                                                                       =============
    protected Map<String, Object> extractTopPrimaryKeyMapFromSource(TopInfo<LOCAL_ENTITY> topInfo) {
        return extractPrimaryKeyMapFromSource(topInfo, LdHierarchyRequestElement.TOP_KEY);
    }

    protected Map<String, Object> extractPrimaryKeyMapFromSource(TopInfo<LOCAL_ENTITY> topInfo, String relationPath) {
        final LdHierarchyRequest<LOCAL_ENTITY> request = topInfo.getHierarchyRequest();
        final LdHierarchySourceRow sourceRow = topInfo.getSourceRow();
        final java.util.List<LdHierarchyRequestElement> primaryKeyElement = request.findPrimaryKeyElement(relationPath);
        final java.util.Map<String, Object> primaryKeyMap = new java.util.LinkedHashMap<String, Object>();
        for (LdHierarchyRequestElement element : primaryKeyElement) {
            final LdHierarchySourceColumn sourcePrimaryKey = element.getSourceColumnInfo();
            final Object sourcePrimaryKeyValue = extractColumnValueFromSource(sourceRow, sourcePrimaryKey);
            primaryKeyMap.put(element.getDestinationColumnInfo().getColumnDbName(), sourcePrimaryKeyValue);
        }
        return primaryKeyMap;
    }

    protected Object extractColumnValueFromSource(LdHierarchySourceRow sourceRow,
            LdHierarchySourceColumn sourceColumn) {
        return sourceRow.extractColumnValue(sourceColumn);
    }

    @SuppressWarnings("unchecked")
    protected java.util.List<LdEntity> extractReferrerList(LdEntity entity, LdReferrerInfo referrerInfo) {
        return (java.util.List<LdEntity>) invoke(referrerInfo.findGetter(), entity, new Object[] {});
    }

    // ===================================================================================
    //                                                                        Inject Logic
    //                                                                        ============
    /**
     * @param entity Entity. (NotNull)
     * @param columnInfo Column info. (NotNull)
     * @param columnValue Column value. (NotNull)
     */
    protected void injectColumnValueToDestinationIfNotNull(LdEntity entity, LdColumnInfo columnInfo, final Object columnValue) {
        if (columnValue != null) {
            injectColumnValueToDestination(entity, columnInfo.getColumnDbName(), columnValue);
        }
    }

    protected void injectColumnValueToDestination(LdEntity entity, String columnDbName, final Object columnValue) {
        if (columnValue == null) {
            String msg = "The argument[columnValue] should not be null: ";
            msg = msg + " table=" + entity.getTableDbName() + " column=" + columnDbName;
            throw new IllegalStateException(msg);
        }
        invoke(entity.getDBMeta().findColumnInfo(columnDbName).findSetter(), entity, new Object[] { columnValue });
    }

    protected void injectColumnValueMapToDestination(LdEntity entity, final Map<String, Object> columnValueMap) {
        final Set<String> columnNameSet = columnValueMap.keySet();
        for (String columnName : columnNameSet) {
            final Object columnValue = columnValueMap.get(columnName);
            injectColumnValueToDestination(entity, columnName, columnValue);
        }
    }

    protected void injectForeignEntity(LdEntity entity, String foreignPropName, LdEntity foreignEntity) {
        final String capPropReferrerName = initCap(foreignPropName);
        final Method method = findMethod(entity.getClass(), "set" + capPropReferrerName, new Class[] { foreignEntity.getDBMeta().getEntityType() });
        invoke(method, entity, new Object[] { foreignEntity });
    }

    protected void injectReferrerList(LdEntity entity, LdReferrerInfo referrerInfo, java.util.List<LdEntity> referrerList) {
        invoke(referrerInfo.findSetter(), entity, new Object[] { referrerList });
    }

    protected void injectForeignPrimaryKey(LdEntity foreignEntity, Map<String, Object> foreigPrimaryKeyMap) {
        injectColumnValueMapToDestination(foreignEntity, foreigPrimaryKeyMap);
    }

    protected void injectReferrerPrimaryKey(LdEntity referrerEntity, Map<String, Object> referrerPrimaryKeyMap) {
        injectColumnValueMapToDestination(referrerEntity, referrerPrimaryKeyMap);
    }

    protected void injectLocalForeignKey(TopInfo<LOCAL_ENTITY> topInfo, LdEntity localEntity, LdForeignInfo foreignInfo, String foreignRelationPath) {
        final LdHierarchyRequest<LOCAL_ENTITY> request = topInfo.getHierarchyRequest();
        final Map<String, Object> foreignPrimaryKeyMap = extractPrimaryKeyMapFromSource(topInfo, foreignRelationPath);
        final List<LdHierarchyRequestElement> primaryKeyElementList = request.findPrimaryKeyElement(foreignRelationPath);
        final Map<String, Object> localForeignKeyMap = new HashMap<String, Object>();
        for (LdHierarchyRequestElement foreignElement : primaryKeyElementList) {
            final String foreignPrimaryKeyColumnName = foreignElement.getDestinationColumnInfo().getColumnDbName();
            final LdColumnInfo localForeignKeyInfo = foreignInfo.findLocalByForeign(foreignPrimaryKeyColumnName);
            final Object localForeignKeyValue = foreignPrimaryKeyMap.get(foreignPrimaryKeyColumnName);
            localForeignKeyMap.put(localForeignKeyInfo.getColumnDbName(), localForeignKeyValue);
        }
        injectColumnValueMapToDestination(localEntity, localForeignKeyMap);
    }

    protected void injectReferrerForeignKey(TopInfo<LOCAL_ENTITY> topInfo, LdEntity referrerEntity,
            LdReferrerInfo referrerInfo, String localRelationPath) {
        final LdHierarchyRequest<LOCAL_ENTITY> request = topInfo.getHierarchyRequest();
        final Map<String, Object> localPrimaryKeyMap = extractPrimaryKeyMapFromSource(topInfo, localRelationPath);
        final List<LdHierarchyRequestElement> primaryKeyElementList = request.findPrimaryKeyElement(localRelationPath);
        final Map<String, Object> referrerForeignKeyMap = new HashMap<String, Object>();
        for (LdHierarchyRequestElement localElement : primaryKeyElementList) {
            final String localPrimaryKeyName = localElement.getDestinationColumnInfo().getColumnDbName();
            final LdColumnInfo referrerForeignKeyInfo = referrerInfo.findReferrerByLocal(localPrimaryKeyName);
            final Object referrerForeignKeyValue = localPrimaryKeyMap.get(localPrimaryKeyName);
            referrerForeignKeyMap.put(referrerForeignKeyInfo.getColumnDbName(), referrerForeignKeyValue);
        }
        injectColumnValueMapToDestination(referrerEntity, referrerForeignKeyMap);
    }

    // ===================================================================================
    //                                                                         Other Logic
    //                                                                         ===========
    @SuppressWarnings("unchecked")
    protected LOCAL_ENTITY newLocalEntity(final LdDBMeta destinationDBMeta) {
        final LOCAL_ENTITY localEntity;
        try {
            localEntity = (LOCAL_ENTITY) destinationDBMeta.getEntityType().newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return localEntity;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    protected String initCap(final String name) {
        final String capPropReferrerName = name.substring(0, 1).toUpperCase() + name.substring(1);
        return capPropReferrerName;
    }

    private java.lang.reflect.Method findMethod(Class<?> clazz, String methodName, Class<?>[] argTypes) {
        try {
            return clazz.getMethod(methodName, argTypes);
        } catch (NoSuchMethodException ex) {
            String msg = "class=" + clazz + " method=" + methodName + "-" + java.util.Arrays.asList(argTypes);
            throw new RuntimeException(msg, ex);
        }
    }

    private Object invoke(java.lang.reflect.Method method, Object target, Object[] args) {
        try {
            return method.invoke(target, args);
        } catch (RuntimeException e) {
            final String lineSeparator = System.getProperty("line.separator");
            final Class<?>[] parameterTypes = method.getParameterTypes();
            String msg = "Invoking method threw the exception:" + lineSeparator;
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * *" + lineSeparator;
            msg = msg + "[" + method.getDeclaringClass().getSimpleName() + "." + method.getName() + "()]" + lineSeparator;
            msg = msg + " methodArgTypes     = {" + createTypeViewFromTypeArray(parameterTypes) + "}" + lineSeparator;
            msg = msg + " specifiedArgValues = {" + createValueViewFromValueArray(args) + "}" + lineSeparator;
            msg = msg + " specifiedArgTypes  = {" + createTypeViewFromValueArray(args) + "}" + lineSeparator;
            if (parameterTypes.length > 0 && args.length > 0 && args[0] != null && !parameterTypes[0].equals(args[0].getClass())) {
                msg = msg + " " + lineSeparator;
                final String compareString = "{" + parameterTypes[0] + " -- " + args[0].getClass() + "}";
                msg = msg + " *Warning! The argType is ummatched: " + compareString + lineSeparator;    
            }
            msg = msg + "* * * * * * * * * */" + lineSeparator;
            throw new RuntimeException(msg, e);
        } catch (java.lang.reflect.InvocationTargetException ex) {
            Throwable t = ex.getCause();
            if (t instanceof RuntimeException) {
                throw (RuntimeException) t;
            }
            if (t instanceof Error) {
                throw (Error) t;
            }
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        } catch (IllegalAccessException ex) {
            String msg = "target=" + target + " method=" + method + "-" + java.util.Arrays.asList(args);
            throw new RuntimeException(msg, ex);
        }
    }

    private String createValueViewFromValueArray(Object[] array) {
        final StringBuffer sb = new StringBuffer();
        for (int i=0; i < array.length; i++) {
            final Object value = array[i];
            if (sb.length() == 0) {
                sb.append(value);
            } else {
                sb.append(", ").append(value);
            }
        }
        return sb.toString();
    }
    
    private String createTypeViewFromValueArray(Object[] array) {
        final StringBuffer sb = new StringBuffer();
        for (int i=0; i < array.length; i++) {
            final Object value = array[i];
            final String typeName = value != null ? value.getClass().getSimpleName() : "null";
            if (sb.length() == 0) {
                sb.append(typeName);
            } else {
                sb.append(", ").append(typeName);
            }
        }
        return sb.toString();
    }
    
    private String createTypeViewFromTypeArray(Class<?>[] array) {
        final StringBuffer sb = new StringBuffer();
        for (int i=0; i < array.length; i++) {
            final Class<?> type = array[i];
            if (sb.length() == 0) {
                sb.append(type.getSimpleName());
            } else {
                sb.append(", ").append(type.getSimpleName());
            }
        }
        return sb.toString();
    }

    // ===================================================================================
    //                                                                          Info Class
    //                                                                          ==========
    protected static class TopInfo<LOCAL_ENTITY extends LdEntity> {
        private LdHierarchyRequest<LOCAL_ENTITY> hierarchyRequest;

        private LdHierarchySourceRow sourceRow;

        private LdEntity localEntity;

        private Map<String, LdEntity> alreadyRegisteredEntityMap;

        public LdHierarchySourceRow getSourceRow() {
            return sourceRow;
        }

        public void setSourceRow(LdHierarchySourceRow sourceRow) {
            this.sourceRow = sourceRow;
        }

        public LdEntity getLocalEntity() {
            return localEntity;
        }

        public void setLocalEntity(LdEntity localEntity) {
            this.localEntity = localEntity;
        }

        public Map<String, LdEntity> getAlreadyRegisteredEntityMap() {
            return alreadyRegisteredEntityMap;
        }

        public void setAlreadyRegisteredEntityMap(Map<String, LdEntity> alreadyRegisteredEntityMap) {
            this.alreadyRegisteredEntityMap = alreadyRegisteredEntityMap;
        }

        public LdHierarchyRequest<LOCAL_ENTITY> getHierarchyRequest() {
            return hierarchyRequest;
        }

        public void setHierarchyRequest(LdHierarchyRequest<LOCAL_ENTITY> hierarchyRequest) {
            this.hierarchyRequest = hierarchyRequest;
        }
    }
}
