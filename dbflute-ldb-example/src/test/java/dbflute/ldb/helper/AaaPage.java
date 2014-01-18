package dbflute.ldb.helper;

import dbflute.ldb.cbean.LdBookCB;
import dbflute.ldb.exbhv.LdBookBhv;

public class AaaPage {

    protected LdBookBhv _bhv;

    public AaaPage(LdBookBhv bhv) {
        this._bhv = bhv;
    }

    public void callSelfAndCallBehavior() {
        callBehavior();
    }

    public void callBehavior() {
        _bhv.selectCount(new LdBookCB());
    }

    public void callService() {
        final BbbService bbbService = new BbbService(_bhv);
        bbbService.callBehavior();
    }
    
    public void callServiceOfCallSelf() {
        final BbbService bbbService = new BbbService(_bhv);
        bbbService.callSelfAndCallBehavior();
    }
}
