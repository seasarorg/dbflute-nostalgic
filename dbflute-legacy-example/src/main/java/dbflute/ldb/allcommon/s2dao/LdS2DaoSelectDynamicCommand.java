package dbflute.ldb.allcommon.s2dao;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.dao.impl.SelectDynamicCommand;
import org.seasar.extension.jdbc.ResultSetFactory;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.impl.BasicSelectHandler;

/**
 * My-SelectDynamicCommand.
 * Overrides original class 'SelectDynamicCommand'.
 * 
 * @author DBFlute(AutoGenerator)
 */
public class LdS2DaoSelectDynamicCommand extends SelectDynamicCommand {

    /** Select clause. */
    private String _selectClause;

    /** Select clause PK only. */
    private String _selectClausePKOnly;

    /** Result-set handler. */
    private ResultSetHandler resultSetHandler;

    /** Result-set factory. */
    private ResultSetFactory resultSetFactory;

    /**
     * Constructor.
     * 
     * @param dataSource Data source.
     * @param statementFactory Statement factory.
     * @param resultSetHandler Result-set handler.
     * @param resultSetFactory Result-set factory.
     */
    public LdS2DaoSelectDynamicCommand(DataSource dataSource,
            StatementFactory statementFactory,
            ResultSetHandler resultSetHandler, ResultSetFactory resultSetFactory) {

        super(dataSource, statementFactory, resultSetHandler, resultSetFactory);

        this.resultSetHandler = resultSetHandler;
        this.resultSetFactory = resultSetFactory;
    }

    /**
     * Get select clause.
     * 
     * @return Select clause. (Nullable)
     */
    public String getSelectClause() {
        return _selectClause;
    }

    /**
     * Set select clause.
     * 
     * @param value Select clause. (Nullable)
     * @return this. (NotNull)
     */
    public LdS2DaoSelectDynamicCommand setSelectClause(String value) {
        _selectClause = value;
        return this;
    }

    /**
     * Get select clause PK only.
     * 
     * @return Select clause PK only. (Nullable)
     */
    public String getSelectClausePKOnly() {
        return _selectClausePKOnly;
    }

    /**
     * Set select clause PK only.
     * 
     * @param value Select clause PK only. (Nullable)
     * @return this. (NotNull)
     */
    public LdS2DaoSelectDynamicCommand setSelectClausePKOnly(String value) {
        _selectClausePKOnly = value;
        return this;
    }

    public Object execute(Object[] args) {
        CommandContext ctx = apply(args);

        BasicSelectHandler selectHandler = new BasicSelectHandler(
                getDataSource(), ctx.getSql(), resultSetHandler,
                getStatementFactory(), resultSetFactory);

        selectHandler.setFetchSize(-1);
        return selectHandler.execute(ctx.getBindVariables(), ctx
                .getBindVariableTypes());
    }
}