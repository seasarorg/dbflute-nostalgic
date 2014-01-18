/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.dbmeta.hierarchy;


import java.util.ArrayList;
import java.util.List;

import dbflute.ldb.allcommon.LdEntity;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;
import dbflute.ldb.allcommon.dbmeta.hierarchy.basic.LdHierarchySourceEntityColumn;
import dbflute.ldb.allcommon.dbmeta.hierarchy.basic.LdHierarchySourceEntityListIterator;
import dbflute.ldb.allcommon.dbmeta.info.LdColumnInfo;
import dbflute.ldb.allcommon.dbmeta.info.LdRelationInfo;

/**
 * The request of hierarchy.
 * @author DBFlute(AutoGenerator)
 * @param <LOCAL_ENTITY> The type of local entity.
 */
public class LdHierarchyRequest<LOCAL_ENTITY extends LdEntity> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The dbmeta of desination. */
    protected LdDBMeta destinationDBMeta;

    /** The iterator of hierarychy source. */
    protected LdHierarchySourceIterator sourceIterator;

    /** The list of request element. */
    protected List<LdHierarchyRequestElement> requestElementList = new ArrayList<LdHierarchyRequestElement>();

    /** The set of already registered source column info for check. */
    protected java.util.Set<LdColumnInfo> alreadyRegisteredSourceColumnInfoSet4Check = new java.util.HashSet<LdColumnInfo>();

    /** First source column info for check. */
    protected LdColumnInfo firstSourceColumnInfo4Check;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * 
     * @param localEntityType The type of local entity. (NotNull)
     */
    public LdHierarchyRequest(Class<LOCAL_ENTITY> localEntityType) {
        LOCAL_ENTITY localEntity;
        try {
            localEntity = localEntityType.newInstance();
        } catch (InstantiationException e) {
            String msg = "localEntityType.newInstance() threw the InstantiationException:";
            msg = msg + " localEntityType=" + localEntityType;
            throw new IllegalStateException(msg, e);
        } catch (IllegalAccessException e) {
            String msg = "localEntityType.newInstance() threw the IllegalAccessException:";
            msg = msg + " localEntityType=" + localEntityType;
            throw new IllegalStateException(msg, e);
        }
        destinationDBMeta = localEntity.getDBMeta();
    }

    // ===================================================================================
    //                                                                         Easy-to-Use
    //                                                                         ===========
    // -----------------------------------------------------
    //                                                public
    //                                                ------
    /**
     * Register the list of source. <br />
     * This method uses the default source iterator.
     * 
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source. (NotNull)
     */
    public <SOURCE> void registerSourceList(java.util.List<SOURCE> sourceList) {
        sourceIterator = createDefaultSourceIterator(sourceList);
    }

    /**
     * Set up mapping between the source column and the destination relation.
     * 
     * @param sourceColumn The column of source. (NotNull)
     * @param relationTrace The relation trace of destination. (NotNull)
     */
    public void mapping(LdHierarchySourceColumn sourceColumn, LdDBMeta.RelationTrace relationTrace) {
        setupElement(sourceColumn, relationTrace.getTraceColumn());
        addRelationToLastElement(relationTrace.getTraceRelation());
    }

    /**
     * Set up mapping between the source column and the destination relation.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @param relationTrace The relation trace of destination. (NotNull)
     */
    public void mapping(LdColumnInfo sourceColumnInfo, LdDBMeta.RelationTrace relationTrace) {
        setupElement(sourceColumnInfo, relationTrace.getTraceColumn());
        addRelationToLastElement(relationTrace.getTraceRelation());
    }

    // -----------------------------------------------------
    //                                               internal
    //                                               -------
    /**
     * Set up element.
     * 
     * @param sourceColumn The column of source. (NotNull)
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void setupElement(LdHierarchySourceColumn sourceColumn, LdColumnInfo destinationColumnInfo) {
        assertSameLocalDestinationDBMeta(destinationColumnInfo);
        final LdHierarchyRequestElement element = new LdHierarchyRequestElement();
        requestElementList.add(element);
        element.mapping(sourceColumn, destinationColumnInfo);
        element.setDestinationDBMeta(destinationColumnInfo.getDBMeta());
    }

    /**
     * Set up element. <br />
     * This method uses the default source column.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void setupElement(LdColumnInfo sourceColumnInfo, LdColumnInfo destinationColumnInfo) {
        if (alreadyRegisteredSourceColumnInfoSet4Check.contains(sourceColumnInfo)) {
            String msg = "The wrong sourceColumnInfo!" + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The source column has already been registered:" + getLineSeparator();
            msg = msg + "- - - - -" + getLineSeparator();
            msg = msg + " sourceColumnInfo=" + sourceColumnInfo + getLineSeparator();
            msg = msg + " registeredColumnInfo=" + alreadyRegisteredSourceColumnInfoSet4Check + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
        alreadyRegisteredSourceColumnInfoSet4Check.add(sourceColumnInfo);
        assertSameSourceDBMeta(sourceColumnInfo);
        assertSameLocalDestinationDBMeta(destinationColumnInfo);
        final LdHierarchyRequestElement element = new LdHierarchyRequestElement();
        requestElementList.add(element);
        final LdHierarchySourceColumn sourceColumn = createDefaultSourceColumn(sourceColumnInfo);
        element.mapping(sourceColumn, destinationColumnInfo);
        element.setDestinationDBMeta(destinationColumnInfo.getDBMeta());
    }

    /**
     * Make relatetion by the list of relation info.
     * 
     * @param relationInfoList The list of relation info. (NotNull)
     */
    protected void addRelationToLastElement(List<LdRelationInfo> relationInfoList) {
        if (requestElementList.isEmpty()) {
            String msg = "You shuold invoke mapping() before invoking relation()!";
            throw new IllegalStateException(msg);
        }
        for (LdRelationInfo relationInfo : relationInfoList) {
            final int lastIndex = requestElementList.size() - 1;
            final LdHierarchyRequestElement element = (LdHierarchyRequestElement) requestElementList.get(lastIndex);
            element.relation(relationInfo);
        }
    }

    /**
     * Assert same source dbmeta.
     * 
     * @param sourceColumnInfo The column info of source. (NotNull)
     */
    protected void assertSameSourceDBMeta(LdColumnInfo sourceColumnInfo) {
        if (firstSourceColumnInfo4Check == null) {
            firstSourceColumnInfo4Check = sourceColumnInfo;
            return;
        }
        final LdDBMeta expectedDBMeta = firstSourceColumnInfo4Check.getDBMeta();
        final LdDBMeta actualDBMeta = sourceColumnInfo.getDBMeta();
        if (!expectedDBMeta.equals(actualDBMeta)) {
            String msg = "The wrong sourceColumnInfo!" + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The dbmeta of sourceColumnInfo is difference from";
            msg = msg + " the one of Your First Source Column Info:" + getLineSeparator();
            msg = msg + "- - - - -" + getLineSeparator();
            msg = msg + "sourceColumnInfo=" + sourceColumnInfo + getLineSeparator();
            msg = msg + "firstSourceColumnInfo4Check=" + firstSourceColumnInfo4Check + getLineSeparator();
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
    }

    /**
     * Assert same source dbmeta.
     * @param destinationColumnInfo The column info of destination. (NotNull)
     */
    protected void assertSameLocalDestinationDBMeta(LdColumnInfo destinationColumnInfo) {
        if (!requestElementList.isEmpty()) {
            final LdHierarchyRequestElement currentElement = currentElement();
            final List<LdRelationInfo> relationInfoList = currentElement.getRelationInfoList();
            if (relationInfoList.isEmpty()) {
                final LdDBMeta actualDBMeta = currentElement().getDestinationDBMeta();
                final LdDBMeta expectedDBMeta = destinationDBMeta;
                if (!expectedDBMeta.equals(actualDBMeta)) {
                    String msg = "The wrong destinationColumnInfo!" + getLineSeparator();
                    msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
                    msg = msg + "The dbmeta of destinationColumnInfo is difference from";
                    msg = msg + " the one of Your Local Entity:" + getLineSeparator();
                    msg = msg + "- - - - -" + getLineSeparator();
                    msg = msg + "destinationColumnInfo=" + currentElement.getDestinationColumnInfo() + getLineSeparator();
                    msg = msg + "localEntity=" + destinationDBMeta.getEntityTypeName() + getLineSeparator();
                    msg = msg + "* * * * * * * * * */" + getLineSeparator();
                    throw new IllegalStateException(msg);
                }
            }
        }
    }

    /**
     * @param sourceList The list of source. (NotNull)
     * @param <SOURCE> The type of source. (NotNull)
     * @return Default source iterator. (NotNull)
     */
    protected <SOURCE> LdHierarchySourceIterator createDefaultSourceIterator(java.util.List<SOURCE> sourceList) {
        return new LdHierarchySourceEntityListIterator<SOURCE>(sourceList);
    }

    /**
     * @param sourceColumnInfo The column info of source. (NotNull)
     * @return Default source column. (NotNull)
     */
    protected LdHierarchySourceColumn createDefaultSourceColumn(LdColumnInfo sourceColumnInfo) {
        return new LdHierarchySourceEntityColumn(sourceColumnInfo);
    }

    /**
     * Get current element.
     * 
     * @return Current element. (NotNull)
     */
    protected LdHierarchyRequestElement currentElement() {
        final int lastIndex = requestElementList.size() - 1;
        return (LdHierarchyRequestElement) requestElementList.get(lastIndex);
    }

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /**
     * @param relationPropertyKey Relation Property key. (NotNull)
     * @return The list of request element. (NotNull)
     */
    public List<LdHierarchyRequestElement> findPrimaryKeyElement(String relationPropertyKey) {
        final List<LdHierarchyRequestElement> resultList = new ArrayList<LdHierarchyRequestElement>();
        for (LdHierarchyRequestElement element : requestElementList) {
            if (!relationPropertyKey.equals(element.getRelationPropertyKey())) {
                continue;
            }
            final LdColumnInfo destinationColumnInfo = element.getDestinationColumnInfo();
            if (!destinationColumnInfo.isPrimary()) {
                continue;
            }
            resultList.add(element);
        }
        if (resultList.isEmpty()) {
            String msg = "Not found primary key element by relationPropertyKey in requestElementList: ";
            msg = msg + " relationPropertyKey=" + relationPropertyKey + " requestElementList=" + requestElementList;
            throw new IllegalStateException(msg);
        }
        return resultList;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public LdDBMeta getDestinationDBMeta() {
        return destinationDBMeta;
    }

    public void setDestinationDBMeta(LdDBMeta destinationDBMeta) {
        this.destinationDBMeta = destinationDBMeta;
    }

    public List<LdHierarchyRequestElement> getRequestElementList() {
        return requestElementList;
    }

    public void addRequestElementList(LdHierarchyRequestElement element) {
        this.requestElementList.add(element);
    }

    public LdHierarchySourceIterator getSourceIterator() {
        return sourceIterator;
    }

    public void setSourceIterator(LdHierarchySourceIterator sourceIterator) {
        this.sourceIterator = sourceIterator;
    }

    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * Get the value of line separator.
     * 
     * @return The value of line separator. (NotNull)
     */
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}
