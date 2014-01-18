package com.example.dbflute.slim3.dbflute.allcommon;

import javax.sql.DataSource;

import org.slim3.container.S3Container;
import org.slim3.container.S3ContainerFactory;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.bhv.BehaviorReadable;
import org.seasar.dbflute.bhv.core.BehaviorCommandInvoker;
import org.seasar.dbflute.bhv.core.CommonColumnAutoSetupper;
import org.seasar.dbflute.bhv.core.InvokerAssistant;
import org.seasar.dbflute.util.DfTypeUtil;
import com.example.dbflute.slim3.dbflute.exbhv.*;

/**
 * @author DBFlute(AutoGenerator)
 */
public class DBFluteModule {

    protected DataSource dataSource;

    public DBFluteModule(DataSource dataSource) {
        if (dataSource == null) {
            String msg = "The argument 'dataSource' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        this.dataSource = dataSource;
    }

    public void configure() {
        new com.example.dbflute.slim3.dbflute.allcommon.DBFluteInitializer(); // Initialize!
        
        // The components of DBFlute Runtime.
        ImplementedBehaviorSelector behaviorSelector = new ImplementedBehaviorSelector();
        behaviorSelector.setContainer(S3ContainerFactory.getInstance().getContainer());
        BehaviorCommandInvoker behaviorCommandInvoker = new BehaviorCommandInvoker();
        ImplementedInvokerAssistant invokerAssistant = createImplementedInvokerAssistant();
        behaviorCommandInvoker.setInvokerAssistant(invokerAssistant);
        ImplementedCommonColumnAutoSetupper commonColumnAutoSetupper = createImplementedCommonColumnAutoSetupper();
        
        bind(BehaviorSelector.class).toInstance(behaviorSelector);
        bind(BehaviorCommandInvoker.class).toInstance(behaviorCommandInvoker);
        bind(InvokerAssistant.class).toInstance(invokerAssistant);
        bind(CommonColumnAutoSetupper.class).toInstance(commonColumnAutoSetupper);
        
        // The components of Behavior.
        BehaviorCommandInvoker ker = behaviorCommandInvoker;
        BehaviorSelector tor = behaviorSelector;
        CommonColumnAutoSetupper per = commonColumnAutoSetupper;
        {
            MemberBhv bhv = new MemberBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberBhv.class).toInstance(bhv);
        }
        {
            MemberAddressBhv bhv = new MemberAddressBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberAddressBhv.class).toInstance(bhv);
        }
        {
            MemberLoginBhv bhv = new MemberLoginBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberLoginBhv.class).toInstance(bhv);
        }
        {
            MemberSecurityBhv bhv = new MemberSecurityBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberSecurityBhv.class).toInstance(bhv);
        }
        {
            MemberStatusBhv bhv = new MemberStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberStatusBhv.class).toInstance(bhv);
        }
        {
            MemberWithdrawalBhv bhv = new MemberWithdrawalBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(MemberWithdrawalBhv.class).toInstance(bhv);
        }
        {
            ProductBhv bhv = new ProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductBhv.class).toInstance(bhv);
        }
        {
            ProductStatusBhv bhv = new ProductStatusBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(ProductStatusBhv.class).toInstance(bhv);
        }
        {
            PurchaseBhv bhv = new PurchaseBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(PurchaseBhv.class).toInstance(bhv);
        }
        {
            VendorCheckBhv bhv = new VendorCheckBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(VendorCheckBhv.class).toInstance(bhv);
        }
        {
            WithdrawalReasonBhv bhv = new WithdrawalReasonBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(WithdrawalReasonBhv.class).toInstance(bhv);
        }
        {
            SummaryProductBhv bhv = new SummaryProductBhv();
            bhv.setBehaviorCommandInvoker(ker); bhv.setBehaviorSelector(tor); bhv.setCommonColumnAutoSetupper(per);
            bind(SummaryProductBhv.class).toInstance(bhv);
        }
    }

    protected ImplementedInvokerAssistant createImplementedInvokerAssistant() {
        ImplementedInvokerAssistant invokerAssistant = new com.example.dbflute.slim3.dbflute.allcommon.ImplementedInvokerAssistant();
        invokerAssistant.setDataSource(dataSource);
        return invokerAssistant;
    }

    protected ImplementedCommonColumnAutoSetupper createImplementedCommonColumnAutoSetupper() {
        return new com.example.dbflute.slim3.dbflute.allcommon.ImplementedCommonColumnAutoSetupper();
    }

    protected Setupper bind(Class<?> type) {
        final S3Container container = S3ContainerFactory.getInstance().getContainer();
        final String name;
        if (BehaviorReadable.class.isAssignableFrom(type)) {
            name = DfTypeUtil.toClassTitle(type);
        } else {
            name = type.getName();
        }
        return new Setupper() {
            public void toInstance(Object instance) {
                container.bind(name, instance);
            }
        };
    }

    protected static interface Setupper {
        void toInstance(Object instance);
    }
}
