package com.example.dbflute.teeda.dbflute.exentity;

import java.sql.Timestamp;


/**
 * The entity of MEMBER.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class Member extends com.example.dbflute.teeda.dbflute.bsentity.BsMember {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                      SerialVersionUID
    //                                      ----------------    
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // -----------------------------------------------------
    //                                       DerivedReferrer
    //                                       ---------------    
    /**
     * 最終ログイン日時
     */
    private Timestamp latestLoginDatetime;
    /**
     * 商品購入数
     */
    private Integer countOfPurchase;
    
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    // SpecifyDerivedReferrer用のプロパティは、publicフィールドでなく、BsEntityと同様に
    // setter/getterである必要があります。
    /**
     * 最終ログイン日時を設定します。
     * @param latestLoginDatetime 最終ログイン日時(Nullable)
     */
    public void setLatestLoginDatetime(Timestamp latestLoginDatetime){
        this.latestLoginDatetime = latestLoginDatetime;
    }
    
    /**
     * 最終ログイン日時を取得します。
     * @return 最終ログイン日時(Nullable)
     */
    public Timestamp getLatestLoginDatetime(){
        return this.latestLoginDatetime;
    }
    
    /**
     * 購入数を設定します。
     * @param countOfPurchase 購入数(Nullable)
     */
    public void setCountOfPurchase(Integer countOfPurchase){
        this.countOfPurchase = countOfPurchase;
    }
    
    /**
     * 購入数を返却します。
     * @return 購入数(Nullable)
     */
    public Integer getCountOfPurchase(){
        return this.countOfPurchase;
    }
}
