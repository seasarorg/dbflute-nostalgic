package dbflute.ldb.allcommon.s2dao;

import javax.sql.DataSource;

import org.seasar.dao.AnnotationReaderFactory;
import org.seasar.dao.DaoMetaData;
import org.seasar.dao.impl.DaoMetaDataFactoryImpl;
import org.seasar.dao.impl.DaoMetaDataImpl;
import org.seasar.extension.jdbc.ResultSetFactory;
import org.seasar.extension.jdbc.StatementFactory;

/**
 * DaoMetaDataFactoryImpl for DaoGen.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdS2DaoMetaDataFactoryImpl extends DaoMetaDataFactoryImpl {

    /**
     * Constructor.
     * 
     * @param dataSource Data source.
     * @param statementFactory Statement factory.
     * @param resultSetFactory Result set factory.
     * @param readerFactory Annotation reader factory.
     */
    public LdS2DaoMetaDataFactoryImpl(DataSource dataSource,
            StatementFactory statementFactory,
            ResultSetFactory resultSetFactory,
            AnnotationReaderFactory readerFactory) {
        super(dataSource, statementFactory, resultSetFactory, readerFactory);
    }

    /**
     * Create data meta data.
     * 
     * @param daoClass Dao class
     * @return Data meta data.
     */
    protected DaoMetaData createDaoMetaData(Class daoClass) {
        DaoMetaDataImpl daoMetaData = new LdS2DaoMetaDataExtension();
        daoMetaData.setDaoClass(daoClass);
        daoMetaData.setDataSource(dataSource);
        daoMetaData.setStatementFactory(statementFactory);
        daoMetaData.setResultSetFactory(resultSetFactory);
        daoMetaData.setAnnotationReaderFactory(annotationReaderFactory);
        daoMetaData.setValueTypeFactory(valueTypeFactory);
        if (sqlFileEncoding != null) {
            daoMetaData.setSqlFileEncoding(sqlFileEncoding);
        }
        if (daoSuffixes != null) {
            daoMetaData.setDaoSuffixes(daoSuffixes);
        }
        if (insertPrefixes != null) {
            daoMetaData.setInsertPrefixes(insertPrefixes);
        }
        if (updatePrefixes != null) {
            daoMetaData.setUpdatePrefixes(updatePrefixes);
        }
        if (deletePrefixes != null) {
            daoMetaData.setDeletePrefixes(deletePrefixes);
        }
        daoMetaData.initialize();
        return daoMetaData;
    }
}