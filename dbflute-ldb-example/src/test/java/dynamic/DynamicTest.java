package dynamic;

import junit.framework.TestCase;

import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;

import dbflute.ldb.cbean.cq.LdBookCQ;
import dbflute.ldb.exentity.LdBook;

public class DynamicTest extends TestCase{

    public void test_dynamic() throws Exception {
        final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(LdBook.class);
        System.out.println(beanDesc.hasPropertyDesc("uTimestamp"));
        System.out.println(beanDesc.hasPropertyDesc("UTimestamp"));
    }
    

    public void test_xxx() throws Exception {
        final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(LdBookCQ.class);
        final boolean hasPropertyDesc = beanDesc.hasPropertyDesc("bookId_ExistsSubQuery_CollectionList");
        System.out.println(hasPropertyDesc);
        System.out.println(beanDesc.hasMethod("getBookId_ExistsSubQuery_CollectionList"));
    }

}
