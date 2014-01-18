package com.example.dbflute.buri.fixedburi.engine;

import java.util.ArrayList;
import java.util.List;

import org.escafe.buri.engine.IdentityInfo;
import org.escafe.buri.engine.ParticipantContext;
import org.escafe.buri.engine.ParticipantProvider;
import org.seasar.dbflute.BehaviorSelector;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.SingletonS2Container;

import com.example.dbflute.buri.dbflute.cbean.MstUserRoleCB;
import com.example.dbflute.buri.dbflute.exbhv.MstUserRoleBhv;
import com.example.dbflute.buri.dbflute.exentity.MstUser;
import com.example.dbflute.buri.dbflute.exentity.MstUserRole;

/**
 * The participant provider for applitcation. <br />
 * The participants are managed on database.
 * @author jflute
 */
public class AppParticipantProvider implements ParticipantProvider {

    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
    // Reference Site : http://d.hatena.ne.jp/nobeans/20070422/1177259893
    // * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *

    // ===================================================================================
    //                                                                User Data Conversion
    //                                                                ====================
    // - - - - - - - - - - - - - - - - - - - - - - - -
    // IdentityInfo is user information for Buri.
    // AppUserDto is user information for Application.
    // - - - - - - - - - - - - - - - - - - - - - - - -
    /**
     * @param appUserId The user identity information of application. (Nullable)
     * @return The user data. (Nullable)
     */
    public AppUserDto getUserData(IdentityInfo appUserId) {
        if ((appUserId == null) || (appUserId.getIdNumber() == null)) {
            return null;
        }

        // Here you should get a component from the container directly
        // because a cyclic reference occurs if you use bindings.
        BehaviorSelector selector = SingletonS2Container.getComponent(BehaviorSelector.class);
        MstUserRoleBhv mstUserRoleBhv = selector.select(MstUserRoleBhv.class);

        // Get user role informations from database.
        MstUserRoleCB cb = new MstUserRoleCB();
        cb.setupSelect_MstRole();
        cb.setupSelect_MstUser();
        cb.query().setUserId_Equal(new Integer(appUserId.getIdNumber().toString()));
        ListResultBean<MstUserRole> userRoleList = mstUserRoleBhv.selectList(cb);
        if (userRoleList.isEmpty()) {
            return null; // Not found users!
        }

        // The user data as return object.
        AppUserDto appUserDto = new AppUserDto();

        // Set up user informations.
        MstUser mstUser = userRoleList.get(0).getMstUser();
        appUserDto.setUserId(mstUser.getUserId());
        appUserDto.setUserName(mstUser.getUserName());

        // Set up roles.
        for (MstUserRole mstUserRole : userRoleList) {
            appUserDto.addRoles(mstUserRole.getMstRole().getRoleName());
        }

        return appUserDto;
    }

    /**
     * @param userData The user data. (Nullable)
     * @return The user identity information of application. (Nullable)
     */
    public IdentityInfo getUserId(Object userData) {
        if (userData == null) {
            return null;
        }
        AppUserDto dto = (AppUserDto) userData;
        IdentityInfo appUserId = new IdentityInfo();
        appUserId.setIdNumber(new Long(dto.getUserId()));
        appUserId.setIdString(dto.getUserName());
        return appUserId;
    }

    // ===================================================================================
    //                                                                      Authentication
    //                                                                      ==============
    /**
     * Does the current user have an authority of execution about target data? <br />
     * This method is called when it executes action to target data.
     * @param context The context of participant that provides current informations. (NotNull)
     * @return Determination.
     */
    public boolean hasAuthority(ParticipantContext context) {
        AppUserDto currentUser = (AppUserDto) context.getUserData();
        String currentActionParticipant = context.getParticipantName();
        return currentUser.getRoles().contains(currentActionParticipant);
    }

    /**
     * Get the authorized user IDs for target data. <br />
     * This method is called when the status of target data changes.
     * @param context The context of participant that provides current informations. (NotNull)
     * @return The list of user identity Information. (NotNull)
     */
    public List<IdentityInfo> getAuthorizedUserIds(ParticipantContext context) {
        // TODO: @jflute Not check yet
        List<IdentityInfo> result = new ArrayList<IdentityInfo>();
        result.add(context.getUserId());
        return result;
    }
}
