package com.example.dbflute.buri.dbflute.allcommon.plugin.buri;

import java.util.List;
import java.util.ArrayList;

import org.escafe.buri.engine.IdentityInfo;
import org.escafe.buri.engine.ParticipantContext;
import org.escafe.buri.engine.ParticipantProvider;

/**
 * @author DBFlute(AutoGenerator)
 */
public class BasicParticipantProvider implements ParticipantProvider {

    // ===================================================================================
    //                                                                User Data Conversion
    //                                                                ====================
    /**
     * @param appUserId The user identity information of application. (NullAllowed)
     * @return The user data. (NullAllowed)
     */
    public Object getUserData(IdentityInfo identityInfo) {
        return identityInfo;
    }

    /**
     * @param userData The user data. (NullAllowed)
     * @return The user identity information of application. (NullAllowed)
     */
    public IdentityInfo getUserId(Object userData) {
        return (IdentityInfo) userData;
    }

    // ===================================================================================
    //                                                                      Authentication
    //                                                                      ==============
    /**
     * Does the current user have an authority of execution about target data? <br />
     * This method is called when it executes action to target data.
     * @param context The context of participant that provides current informations. (NotNull)
     * @return The determination, true or false.
     */
    public boolean hasAuthority(ParticipantContext context) {
        return true;
    }

    /**
     * Get the authorized user IDs for target data. <br />
     * This method is called when the status of target data changes.
     * @param context The context of participant that provides current informations. (NotNull)
     * @return The list of user identity Information. (NotNull)
     */
    public List<IdentityInfo> getAuthorizedUserIds(ParticipantContext context) {
        List<IdentityInfo> result = new ArrayList<IdentityInfo>();
        result.add(context.getUserId());
        return result;
    }
}
