package dbflute.ldb.allcommon;

import dbflute.ldb.allcommon.bhv.LdBehaviorReadable;
import dbflute.ldb.allcommon.bhv.LdBehaviorWritable;

import dbflute.ldb.allcommon.dbmeta.LdDBMetaInstanceHandler;
import dbflute.ldb.allcommon.dbmeta.LdDBMeta;


/**
 * The implementation of dao-selector.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdCacheDaoSelector implements LdDaoSelector {

    /**
     * Get dao-readable by dao type.
     * 
     * @param daoType Dao type. (NotNull)
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getRDao(Class daoType) {
        assertObjectNotNull("daoType", daoType);
        setupDaoCacheMap();
        final LdDaoReadable dao = (LdDaoReadable)_daoCacheMap.get(daoType);
        if (dao == null) {
            String msg = "The daoCacheMap does not have the dao-type: daoType=" + daoType + " daoCacheMap=" + _daoCacheMap;
            throw new IllegalStateException(msg);
        }
        return dao;
    }

    /**
     * Get dao-readable by entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getRDao(LdEntity entity) {
        assertObjectNotNull("entity", entity);
        return getRDao(entity.getDBMeta().getDaoType());
    }

    /**
     * Get dao-readable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Dao-readable. (NotNull)
     */
    public LdDaoReadable getRDao(String tableMultiName) {
        assertStringNotNullAndNotTrimmedEmpty("tableMultiName", tableMultiName);
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableMultiName(tableMultiName);
        return getRDao(dbmeta.getDaoType());
    }

    /**
     * Get dao-writable by dao type.
     * 
     * @param daoType Dao type. (NotNull)
     * @return Dao-writable. (NotNull)
     */
    public LdDaoWritable getWDao(Class daoType) {
        assertObjectNotNull("daoType", daoType);
        return (LdDaoWritable)getRDao(daoType);
    }

    /**
     * Get dao-writable by entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Dao-writable. (NotNull)
     */
    public LdDaoWritable getWDao(LdEntity entity) {
        assertObjectNotNull("entity", entity);
        return (LdDaoWritable)getRDao(entity);
    }

    /**
     * Get dao-writable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Dao-writable. (NotNull)
     */
    public LdDaoReadable getWDao(String tableMultiName) {
        assertStringNotNullAndNotTrimmedEmpty("tableMultiName", tableMultiName);
        return (LdDaoWritable)getRDao(tableMultiName);
    }

    /**
     * Get bhv-readable by bhv type.
     * 
     * @param bhvType Bhv type. (NotNull)
     * @return Bhv-readable. (NotNull)
     */
    public LdBehaviorReadable getRBhv(Class bhvType) {
        assertObjectNotNull("bhvType", bhvType);
        setupBhvCacheMap();
        final LdBehaviorReadable bhv = (LdBehaviorReadable)_bhvCacheMap.get(bhvType);
        if (bhv == null) {
            String msg = "The bhvCacheMap does not have the bhv-type: bhvType=" + bhvType + " bhvCacheMap=" + _bhvCacheMap;
            throw new IllegalStateException(msg);
        }
        return bhv;
    }

    /**
     * Get bhv-readable by entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Bhv-readable. (NotNull)
     */
    public LdBehaviorReadable getRBhv(LdEntity entity) {
        assertObjectNotNull("entity", entity);
        return getRBhv(getBhvType(entity.getDBMeta()));
    }

    /**
     * Get bhv-readable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Bhv-readable. (NotNull)
     */
    public LdBehaviorReadable getRBhv(String tableMultiName) {
        assertStringNotNullAndNotTrimmedEmpty("tableMultiName", tableMultiName);
        final LdDBMeta dbmeta = LdDBMetaInstanceHandler.getInstanceByTableMultiName(tableMultiName);
        return getRBhv(getBhvType(dbmeta));
    }

    /**
     * Get bhv-writable by bhv type.
     * 
     * @param bhvType Bhv type. (NotNull)
     * @return Bhv-writable. (NotNull)
     */
    public LdBehaviorWritable getWBhv(Class bhvType) {
        assertObjectNotNull("bhvType", bhvType);
        return (LdBehaviorWritable)getRBhv(bhvType);
    }

    /**
     * Get bhv-writable by entity.
     * 
     * @param entity Entity. (NotNull)
     * @return Bhv-writable. (NotNull)
     */
    public LdBehaviorWritable getWBhv(LdEntity entity) {
        assertObjectNotNull("entity", entity);
        return (LdBehaviorWritable)getRBhv(entity);
    }

    /**
     * Get bhv-writable by table multi-name.
     * 
     * @param tableMultiName Table multi-name. (NotNull)
     * @return Bhv-writable. (NotNull)
     */
    public LdBehaviorWritable getWBhv(String tableMultiName) {
        assertStringNotNullAndNotTrimmedEmpty("tableMultiName", tableMultiName);
        return (LdBehaviorWritable)getRBhv(tableMultiName);
    }

    /**
     * Get bhv-type by dbmeta.
     * 
     * @param dbmeta Dbmeta. (NotNull)
     * @return Bhv-type. (NotNull)
     */
    protected Class getBhvType(LdDBMeta dbmeta) {
        assertObjectNotNull("dbmeta", dbmeta);
        setupDaoBhvMap();
        if (_daoBhvMap == null) {
            String msg = "The daoBhvMap has not been initialized yet!";
            throw new IllegalStateException(msg);
        }
        final Class daoType = dbmeta.getDaoType();
        if (daoType == null) {
            String msg = "The dbmeta.getDaoType() should not return null: dbmeta=" + dbmeta;
            throw new IllegalStateException(msg);
        }
        return (Class)_daoBhvMap.get(dbmeta.getDaoType());
    }

    protected java.util.Map<Class, LdDaoReadable> _daoCacheMap;
    protected void setupDaoCacheMap() {
        if (_daoCacheMap == null) {
            _daoCacheMap = new java.util.HashMap<Class, LdDaoReadable>();

            _daoCacheMap.put(dbflute.ldb.exdao.LdAuthorDao.class, getAuthorDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdBlackActionDao.class, getBlackActionDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdBlackActionLookupDao.class, getBlackActionLookupDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdBlackListDao.class, getBlackListDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdBookDao.class, getBookDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdCollectionDao.class, getCollectionDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdCollectionStatusDao.class, getCollectionStatusDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdCollectionStatusLookupDao.class, getCollectionStatusLookupDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdGarbageDao.class, getGarbageDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdGenreDao.class, getGenreDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdLbUserDao.class, getLbUserDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdLendingDao.class, getLendingDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdLendingCollectionDao.class, getLendingCollectionDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdLibraryDao.class, getLibraryDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdNextLibraryDao.class, getNextLibraryDao());

            _daoCacheMap.put(dbflute.ldb.exdao.LdPublisherDao.class, getPublisherDao());

            _daoCacheMap.put(dbflute.ldb.exdao.customize.LdBookAuthorDao.class, getBookAuthorDao());

            _daoCacheMap.put(dbflute.ldb.exdao.customize.LdBookPublisherDao.class, getBookPublisherDao());

        }
    }

    protected dbflute.ldb.exdao.LdAuthorDao _authorDao;
    public void setAuthorDao(dbflute.ldb.exdao.LdAuthorDao dao) {
        _authorDao = dao;
    }
    public dbflute.ldb.exdao.LdAuthorDao getAuthorDao() {
        return _authorDao;
    }

    protected dbflute.ldb.exdao.LdBlackActionDao _blackActionDao;
    public void setBlackActionDao(dbflute.ldb.exdao.LdBlackActionDao dao) {
        _blackActionDao = dao;
    }
    public dbflute.ldb.exdao.LdBlackActionDao getBlackActionDao() {
        return _blackActionDao;
    }

    protected dbflute.ldb.exdao.LdBlackActionLookupDao _blackActionLookupDao;
    public void setBlackActionLookupDao(dbflute.ldb.exdao.LdBlackActionLookupDao dao) {
        _blackActionLookupDao = dao;
    }
    public dbflute.ldb.exdao.LdBlackActionLookupDao getBlackActionLookupDao() {
        return _blackActionLookupDao;
    }

    protected dbflute.ldb.exdao.LdBlackListDao _blackListDao;
    public void setBlackListDao(dbflute.ldb.exdao.LdBlackListDao dao) {
        _blackListDao = dao;
    }
    public dbflute.ldb.exdao.LdBlackListDao getBlackListDao() {
        return _blackListDao;
    }

    protected dbflute.ldb.exdao.LdBookDao _bookDao;
    public void setBookDao(dbflute.ldb.exdao.LdBookDao dao) {
        _bookDao = dao;
    }
    public dbflute.ldb.exdao.LdBookDao getBookDao() {
        return _bookDao;
    }

    protected dbflute.ldb.exdao.LdCollectionDao _collectionDao;
    public void setCollectionDao(dbflute.ldb.exdao.LdCollectionDao dao) {
        _collectionDao = dao;
    }
    public dbflute.ldb.exdao.LdCollectionDao getCollectionDao() {
        return _collectionDao;
    }

    protected dbflute.ldb.exdao.LdCollectionStatusDao _collectionStatusDao;
    public void setCollectionStatusDao(dbflute.ldb.exdao.LdCollectionStatusDao dao) {
        _collectionStatusDao = dao;
    }
    public dbflute.ldb.exdao.LdCollectionStatusDao getCollectionStatusDao() {
        return _collectionStatusDao;
    }

    protected dbflute.ldb.exdao.LdCollectionStatusLookupDao _collectionStatusLookupDao;
    public void setCollectionStatusLookupDao(dbflute.ldb.exdao.LdCollectionStatusLookupDao dao) {
        _collectionStatusLookupDao = dao;
    }
    public dbflute.ldb.exdao.LdCollectionStatusLookupDao getCollectionStatusLookupDao() {
        return _collectionStatusLookupDao;
    }

    protected dbflute.ldb.exdao.LdGarbageDao _garbageDao;
    public void setGarbageDao(dbflute.ldb.exdao.LdGarbageDao dao) {
        _garbageDao = dao;
    }
    public dbflute.ldb.exdao.LdGarbageDao getGarbageDao() {
        return _garbageDao;
    }

    protected dbflute.ldb.exdao.LdGenreDao _genreDao;
    public void setGenreDao(dbflute.ldb.exdao.LdGenreDao dao) {
        _genreDao = dao;
    }
    public dbflute.ldb.exdao.LdGenreDao getGenreDao() {
        return _genreDao;
    }

    protected dbflute.ldb.exdao.LdLbUserDao _lbUserDao;
    public void setLbUserDao(dbflute.ldb.exdao.LdLbUserDao dao) {
        _lbUserDao = dao;
    }
    public dbflute.ldb.exdao.LdLbUserDao getLbUserDao() {
        return _lbUserDao;
    }

    protected dbflute.ldb.exdao.LdLendingDao _lendingDao;
    public void setLendingDao(dbflute.ldb.exdao.LdLendingDao dao) {
        _lendingDao = dao;
    }
    public dbflute.ldb.exdao.LdLendingDao getLendingDao() {
        return _lendingDao;
    }

    protected dbflute.ldb.exdao.LdLendingCollectionDao _lendingCollectionDao;
    public void setLendingCollectionDao(dbflute.ldb.exdao.LdLendingCollectionDao dao) {
        _lendingCollectionDao = dao;
    }
    public dbflute.ldb.exdao.LdLendingCollectionDao getLendingCollectionDao() {
        return _lendingCollectionDao;
    }

    protected dbflute.ldb.exdao.LdLibraryDao _libraryDao;
    public void setLibraryDao(dbflute.ldb.exdao.LdLibraryDao dao) {
        _libraryDao = dao;
    }
    public dbflute.ldb.exdao.LdLibraryDao getLibraryDao() {
        return _libraryDao;
    }

    protected dbflute.ldb.exdao.LdNextLibraryDao _nextLibraryDao;
    public void setNextLibraryDao(dbflute.ldb.exdao.LdNextLibraryDao dao) {
        _nextLibraryDao = dao;
    }
    public dbflute.ldb.exdao.LdNextLibraryDao getNextLibraryDao() {
        return _nextLibraryDao;
    }

    protected dbflute.ldb.exdao.LdPublisherDao _publisherDao;
    public void setPublisherDao(dbflute.ldb.exdao.LdPublisherDao dao) {
        _publisherDao = dao;
    }
    public dbflute.ldb.exdao.LdPublisherDao getPublisherDao() {
        return _publisherDao;
    }

    protected dbflute.ldb.exdao.customize.LdBookAuthorDao _bookAuthorDao;
    public void setBookAuthorDao(dbflute.ldb.exdao.customize.LdBookAuthorDao dao) {
        _bookAuthorDao = dao;
    }
    public dbflute.ldb.exdao.customize.LdBookAuthorDao getBookAuthorDao() {
        return _bookAuthorDao;
    }

    protected dbflute.ldb.exdao.customize.LdBookPublisherDao _bookPublisherDao;
    public void setBookPublisherDao(dbflute.ldb.exdao.customize.LdBookPublisherDao dao) {
        _bookPublisherDao = dao;
    }
    public dbflute.ldb.exdao.customize.LdBookPublisherDao getBookPublisherDao() {
        return _bookPublisherDao;
    }

    protected java.util.Map<Class, LdBehaviorReadable> _bhvCacheMap;
    protected void setupBhvCacheMap() {
        if (_bhvCacheMap == null) {
            _bhvCacheMap = new java.util.HashMap<Class, LdBehaviorReadable>();
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdAuthorBhv.class, getAuthorBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdBlackActionBhv.class, getBlackActionBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdBlackActionLookupBhv.class, getBlackActionLookupBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdBlackListBhv.class, getBlackListBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdBookBhv.class, getBookBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdCollectionBhv.class, getCollectionBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdCollectionStatusBhv.class, getCollectionStatusBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdCollectionStatusLookupBhv.class, getCollectionStatusLookupBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdGarbageBhv.class, getGarbageBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdGenreBhv.class, getGenreBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdLbUserBhv.class, getLbUserBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdLendingBhv.class, getLendingBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdLendingCollectionBhv.class, getLendingCollectionBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdLibraryBhv.class, getLibraryBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdNextLibraryBhv.class, getNextLibraryBhv());
  
            _bhvCacheMap.put(dbflute.ldb.exbhv.LdPublisherBhv.class, getPublisherBhv());
  
        }
    }
  
    protected java.util.Map<Class, Class> _daoBhvMap;
    protected void setupDaoBhvMap() {
        if (_daoBhvMap == null) {
            _daoBhvMap = new java.util.HashMap<Class, Class>();
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdAuthorDao.class, dbflute.ldb.exbhv.LdAuthorBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdBlackActionDao.class, dbflute.ldb.exbhv.LdBlackActionBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdBlackActionLookupDao.class, dbflute.ldb.exbhv.LdBlackActionLookupBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdBlackListDao.class, dbflute.ldb.exbhv.LdBlackListBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdBookDao.class, dbflute.ldb.exbhv.LdBookBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdCollectionDao.class, dbflute.ldb.exbhv.LdCollectionBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdCollectionStatusDao.class, dbflute.ldb.exbhv.LdCollectionStatusBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdCollectionStatusLookupDao.class, dbflute.ldb.exbhv.LdCollectionStatusLookupBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdGarbageDao.class, dbflute.ldb.exbhv.LdGarbageBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdGenreDao.class, dbflute.ldb.exbhv.LdGenreBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdLbUserDao.class, dbflute.ldb.exbhv.LdLbUserBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdLendingDao.class, dbflute.ldb.exbhv.LdLendingBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdLendingCollectionDao.class, dbflute.ldb.exbhv.LdLendingCollectionBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdLibraryDao.class, dbflute.ldb.exbhv.LdLibraryBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdNextLibraryDao.class, dbflute.ldb.exbhv.LdNextLibraryBhv.class);
  
            _daoBhvMap.put(dbflute.ldb.exdao.LdPublisherDao.class, dbflute.ldb.exbhv.LdPublisherBhv.class);
  
        }
    }
  
    protected dbflute.ldb.exbhv.LdAuthorBhv _authorBhv;
    public void setAuthorBhv(dbflute.ldb.exbhv.LdAuthorBhv bhv) {
        _authorBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdAuthorBhv getAuthorBhv() {
        return _authorBhv;
    }
  
    protected dbflute.ldb.exbhv.LdBlackActionBhv _blackActionBhv;
    public void setBlackActionBhv(dbflute.ldb.exbhv.LdBlackActionBhv bhv) {
        _blackActionBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdBlackActionBhv getBlackActionBhv() {
        return _blackActionBhv;
    }
  
    protected dbflute.ldb.exbhv.LdBlackActionLookupBhv _blackActionLookupBhv;
    public void setBlackActionLookupBhv(dbflute.ldb.exbhv.LdBlackActionLookupBhv bhv) {
        _blackActionLookupBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdBlackActionLookupBhv getBlackActionLookupBhv() {
        return _blackActionLookupBhv;
    }
  
    protected dbflute.ldb.exbhv.LdBlackListBhv _blackListBhv;
    public void setBlackListBhv(dbflute.ldb.exbhv.LdBlackListBhv bhv) {
        _blackListBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdBlackListBhv getBlackListBhv() {
        return _blackListBhv;
    }
  
    protected dbflute.ldb.exbhv.LdBookBhv _bookBhv;
    public void setBookBhv(dbflute.ldb.exbhv.LdBookBhv bhv) {
        _bookBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdBookBhv getBookBhv() {
        return _bookBhv;
    }
  
    protected dbflute.ldb.exbhv.LdCollectionBhv _collectionBhv;
    public void setCollectionBhv(dbflute.ldb.exbhv.LdCollectionBhv bhv) {
        _collectionBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdCollectionBhv getCollectionBhv() {
        return _collectionBhv;
    }
  
    protected dbflute.ldb.exbhv.LdCollectionStatusBhv _collectionStatusBhv;
    public void setCollectionStatusBhv(dbflute.ldb.exbhv.LdCollectionStatusBhv bhv) {
        _collectionStatusBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdCollectionStatusBhv getCollectionStatusBhv() {
        return _collectionStatusBhv;
    }
  
    protected dbflute.ldb.exbhv.LdCollectionStatusLookupBhv _collectionStatusLookupBhv;
    public void setCollectionStatusLookupBhv(dbflute.ldb.exbhv.LdCollectionStatusLookupBhv bhv) {
        _collectionStatusLookupBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdCollectionStatusLookupBhv getCollectionStatusLookupBhv() {
        return _collectionStatusLookupBhv;
    }
  
    protected dbflute.ldb.exbhv.LdGarbageBhv _garbageBhv;
    public void setGarbageBhv(dbflute.ldb.exbhv.LdGarbageBhv bhv) {
        _garbageBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdGarbageBhv getGarbageBhv() {
        return _garbageBhv;
    }
  
    protected dbflute.ldb.exbhv.LdGenreBhv _genreBhv;
    public void setGenreBhv(dbflute.ldb.exbhv.LdGenreBhv bhv) {
        _genreBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdGenreBhv getGenreBhv() {
        return _genreBhv;
    }
  
    protected dbflute.ldb.exbhv.LdLbUserBhv _lbUserBhv;
    public void setLbUserBhv(dbflute.ldb.exbhv.LdLbUserBhv bhv) {
        _lbUserBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdLbUserBhv getLbUserBhv() {
        return _lbUserBhv;
    }
  
    protected dbflute.ldb.exbhv.LdLendingBhv _lendingBhv;
    public void setLendingBhv(dbflute.ldb.exbhv.LdLendingBhv bhv) {
        _lendingBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdLendingBhv getLendingBhv() {
        return _lendingBhv;
    }
  
    protected dbflute.ldb.exbhv.LdLendingCollectionBhv _lendingCollectionBhv;
    public void setLendingCollectionBhv(dbflute.ldb.exbhv.LdLendingCollectionBhv bhv) {
        _lendingCollectionBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdLendingCollectionBhv getLendingCollectionBhv() {
        return _lendingCollectionBhv;
    }
  
    protected dbflute.ldb.exbhv.LdLibraryBhv _libraryBhv;
    public void setLibraryBhv(dbflute.ldb.exbhv.LdLibraryBhv bhv) {
        _libraryBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdLibraryBhv getLibraryBhv() {
        return _libraryBhv;
    }
  
    protected dbflute.ldb.exbhv.LdNextLibraryBhv _nextLibraryBhv;
    public void setNextLibraryBhv(dbflute.ldb.exbhv.LdNextLibraryBhv bhv) {
        _nextLibraryBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdNextLibraryBhv getNextLibraryBhv() {
        return _nextLibraryBhv;
    }
  
    protected dbflute.ldb.exbhv.LdPublisherBhv _publisherBhv;
    public void setPublisherBhv(dbflute.ldb.exbhv.LdPublisherBhv bhv) {
        _publisherBhv = bhv;
    }
    public dbflute.ldb.exbhv.LdPublisherBhv getPublisherBhv() {
        return _publisherBhv;
    }
  
    // ----------------------------------------------------------------
    //                                                    Assert Object
    //                                                    -------------
    /**
     * Assert that the object is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }
}
