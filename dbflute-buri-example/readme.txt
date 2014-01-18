
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for Buri and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This example uses Maven2 so prepare your maven2 environment. (For example, M2Eclipse)

[Oracle]
/= = = = = = = = = = = = = = = = = = = = = = = = = =
This example requires two schemas 'buriexampledb'.
= = = = = = = = = =/
-- * * * * * * * *
-- Buri Example DB
-- * * * * * * * *
-- By system user
-- The reason for using the role of 'dba' is that this is an example.
create user buriexampledb identified by buriexampledb;
grant connect to buriexampledb;
grant resource to buriexampledb;
grant create view to buriexampledb;
grant create synonym to buriexampledb;

[Plugin for Buri]
DBFluteがBuri拡張のクラスを自動生成します。
src/main/javaのcom.example.dbflute.buri.dbflute.allcommon.plugin.buri配下のクラスがそれに当たります。

BasicBuriUserDataProvider : BuriUserDataProviderの基本実装(AccessContext利用) {buri-user.dicon定義対象}
BasicParticipantProvider : BuriUserDataProviderの基本実装(AccessContext利用) {buri-user.dicon定義対象}
BehaviorToDataAccessRule : BuriとDBFluteのアダプタ {buri-share.dicon定義対象(Buri-1.0.1よりburi-user.diconでOK)}
BuriDef : Processの定義(buriDefinitionMap.dfpropで定義したプロセスのENUMの集まり)
FixedBuriDataAccessScriptFactoryImpl : Long型以外のPKを利用可能にする {buri-extension.dicon定義対象}
FixedScriptDataAccessUtilKeyImpl : Long型以外のPKを利用可能にする {FixedBuriDataAccessScriptFactoryImplでnewされる}

BehaviorToDataAccessRuleとFixedBuriDataAccessScriptFactoryImplの定義は必須です。
適切なdiconに手動で定義して下さい。{DBFluteは(Buri関連の)diconは生成しません}

BasicBuriUserDataProviderとBasicParticipantProviderの定義は任意です。
アプリにおける権限周りの実装がこれらの実装を適用できるのであれば利用します。
そうでない場合は、これらの基本実装を参考にアプリで独自のクラスを作成します。
そのとき、これらの基本実装を継承して作成しても構いません。

BuriUserDataProviderはDBFluteが提供するインターフェースで、実装クラスを
buri-user.diconに定義しておくと、BehaviorのtoNextStatus()実行時に
UserDataをこのProvider経由で取得します。

[View for Buri]
DBFluteがBuriと連携するためのVIEWが必要となります。
「BURI_ALL_ROUND_STATE」という名前のVIEWをCreateして自動生成対象にする必要があります。
VIEWの中身に関しては、「replace-schema-dbflute-buri.sql」を参照して下さい。


# ========================================================================================
#                                                                              Information
#                                                                              ===========
# ----------------------------------------------------------
#                                             SVN Repository
#                                             --------------
https://www.escafe.org/svn/escafeflow/trunk/Buri2.3/

# ========================================================================================
#                                                                                    Other
#                                                                                    =====
# ----------------------------------------------------------
#                                                     Status
#                                                     ------
prototype

