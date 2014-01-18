package dbflute.ldb.helper;

import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;

public class BbbService {

    protected LdBookBhv _bhv;
    public BbbService(LdBookBhv bhv) {
        this._bhv = bhv;
    }
    
    public void callSelfAndCallBehavior() {
        callBehavior();
    }
    
    public void callBehavior() {
        _bhv.selectCount(new LdBookCB());
    }
    
    public void callPageOfCallBehavior() {
        new AaaPage(_bhv).callBehavior();
    }
    
    public void callPageOfCallServiceOfCallSelf() {
        new AaaPage(_bhv).callSelfAndCallBehavior();
    }
}
