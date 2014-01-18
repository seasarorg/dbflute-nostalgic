/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.s2dao.internal.sqlcommand;

import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.dao.Node;
import org.seasar.extension.jdbc.StatementFactory;

import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalCommandContextCreator;
import dbflute.ldb.allcommon.s2dao.internal.sqlparser.LdInternalSqlParser;

/**
 * @author DBFlute(AutoGenerator)
 */
public abstract class LdInternalAbstractDynamicCommand extends LdInternalAbstractSqlCommand {

	// ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected Node rootNode;
    protected String[] argNames = new String[0];
    protected Class<?>[] argTypes = new Class[0];

	// ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public LdInternalAbstractDynamicCommand(DataSource dataSource, StatementFactory statementFactory) {
        super(dataSource, statementFactory);
    }

	// ===================================================================================
    //                                                                        Sql Handling
    //                                                                        ============
    public void setSql(String sql) {
        super.setSql(sql);
        this.rootNode = createInternalSqlParser(sql).parse();
    }
	
	protected LdInternalSqlParser createInternalSqlParser(String sql) {
	    return new LdInternalSqlParser(sql, isBlockNullParameter());
	}

    protected boolean isBlockNullParameter() { // Extension Point!
        return false;
    }

    public CommandContext apply(Object[] args) { // It is necessary to be public!
        final CommandContext ctx = createCommandContext(args);
        rootNode.accept(ctx);
        return ctx;
    }

    protected CommandContext createCommandContext(Object[] args) {
	    return createCommandContextCreator().createCommandContext(args);
    }

	protected LdInternalCommandContextCreator createCommandContextCreator() {
	    return new LdInternalCommandContextCreator(argNames, argTypes);
	}
	
	// ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String[] getArgNames() {
        return argNames;
    }

    public void setArgNames(String[] argNames) {
        this.argNames = argNames;
    }

    public Class<?>[] getArgTypes() {
        return argTypes;
    }

    public void setArgTypes(Class<?>[] argTypes) {
        this.argTypes = argTypes;
    }
}
