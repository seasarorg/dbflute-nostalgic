package com.example.dbflute.buri.dbflute.allcommon.plugin.buri;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.AccessContext;
import org.escafe.buri.engine.IdentityInfo;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BasicBuriUserDataProvider implements BuriDef.BuriUserDataProvider {

    public Object provide(BuriDef.BuriProcess process, Entity entity, BuriDef.BuriAction action) {
        IdentityInfo identityInfo = new IdentityInfo();
        identityInfo.setIdString(getAccessUserOnThread());
        return identityInfo;
    }
    
    protected String getAccessUserOnThread() {
        return AccessContext.getAccessContextOnThread().getAccessUser();
    }
}
