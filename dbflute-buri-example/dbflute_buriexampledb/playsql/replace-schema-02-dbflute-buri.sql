
-- /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
-- The view of Buri All-Round State
-- This base point table is BuriState.
-- 
-- 
-- The selected columns of BuriState (base point)
--   o INTERNAL_STATE_ID : The internal ID of Buri state. (NotNull)
--   o STATUS_UPDATE_DATETIME : The date-time of status update. (NotNull)
--   o PARTICIPANT_NAME : The name of participant. (Nullable: when not set Participant)
--   o PARTICIPANT_TYPE : The type of participant. (Nullable: when not set Participant)
-- 
-- The selected columns of BuriPath (joined as inner)
--   o INTERNAL_PATH_ID : The internal ID of Buri path. (NotNull)
--   o STATUS_PATH_NAME : The name path 'Package.Process.Activity'. (NotNull, DBFlute uses)
-- 
-- The selected columns of BuriData (joined as inner)
--   o INTERNAL_DATA_ID : The internal ID of Buri data. (NotNull)
--   o INTERNAL_PK_VALUE : The ID of the target entity for internal use. (NotNull, DBFlute uses)
--   o INTERNAL_DATA_TYPE : The FQCN of the target entity for internal use. (NotNull, DBFlute uses)
-- 
-- The selected columns of BuriUser (joined as outer)
--   o INTERNAL_USER_ID : The internal ID of Buri user. (Nullable: when not use ParticipantProvider)
--   o STATUS_UPDATE_USER : The user of status update. (Nullable: when not use ParticipantProvider)
-- 
-- 
-- The important columns for your application might be STATUS_UPDATE_DATETIME and STATUS_UPDATE_USER.
-- If anything, other columns are for Buri and DBFlute.  
-- 
-- You can customize this view in spite of not changing basic structure.
-- For example, to add the other columns and to delete unused columns.
-- = = = = = = = = = =/
create or replace view BURI_ALL_ROUND_STATE as
select state.StateID as INTERNAL_STATE_ID
     , state.insertDate as STATUS_UPDATE_DATETIME
     , state.ParticipantName as PARTICIPANT_NAME
     , state.ParticipantType as PARTICIPANT_TYPE
     , path.PathID as INTERNAL_PATH_ID
     , path.PathName as STATUS_PATH_NAME
     , data.DataID as INTERNAL_DATA_ID
     , data.pkeyNum as INTERNAL_PK_VALUE
     , data.dataType as INTERNAL_DATA_TYPE
     , buriUser.BuriUserID as INTERNAL_USER_ID
     , buriUser.UserIDVal as STATUS_UPDATE_USER
  from BuriState state
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    inner join BuriPath path on state.PathID = path.PathID
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    inner join BuriData data on state.DataID = data.DataID
    -- = = = = = =
    -- one-to-one (with deleteDate condition)
    -- = = = = = =
    left outer join BuriStateUser stateUser
      on state.StateID = stateUser.StateID
     and stateUser.deleteDate > LOCALTIMESTAMP
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    left outer join BuriUser buriUser on stateUser.BuriUserID = buriUser.BuriUserID
 where state.processDate > LOCALTIMESTAMP
;


-- /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = 
-- The view of Buri All-Round State History
-- This base point table is BuriState.
-- The difference from Buri All-Round State is the condition of processDate.
-- The view for history does not need the condition.
-- 
-- 
-- The selected columns of BuriState (base point)
--   o INTERNAL_STATE_ID : The internal ID of Buri state. (NotNull)
--   o STATUS_UPDATE_DATETIME : The date-time of status update. (NotNull)
--   o PARTICIPANT_NAME : The name of participant. (Nullable: when not set Participant)
--   o PARTICIPANT_TYPE : The type of participant. (Nullable: when not set Participant)
-- 
-- The selected columns of BuriPath (joined as inner)
--   o INTERNAL_PATH_ID : The internal ID of Buri path. (NotNull)
--   o STATUS_PATH_NAME : The name path 'Package.Process.Activity'. (NotNull, DBFlute uses)
-- 
-- The selected columns of BuriData (joined as inner)
--   o INTERNAL_DATA_ID : The internal ID of Buri data. (NotNull)
--   o INTERNAL_PK_VALUE : The ID of the target entity for internal use. (NotNull, DBFlute uses)
--   o INTERNAL_DATA_TYPE : The FQCN of the target entity for internal use. (NotNull, DBFlute uses)
-- 
-- The selected columns of BuriUser (joined as outer)
--   o INTERNAL_USER_ID : The internal ID of Buri user. (Nullable: when not use ParticipantProvider)
--   o STATUS_UPDATE_USER : The user of status update. (Nullable: when not use ParticipantProvider)
-- 
-- 
-- The important columns for your application might be STATUS_UPDATE_DATETIME and STATUS_UPDATE_USER.
-- If anything, other columns are for Buri and DBFlute.
-- 
-- You can customize this view in spite of not changing basic structure.
-- For example, to add the other columns and to delete unused columns.
-- = = = = = = = = = =/
create or replace view BURI_ALL_ROUND_STATE_HISTORY as
select state.StateID as INTERNAL_STATE_ID
     , state.insertDate as STATUS_UPDATE_DATETIME
     , state.ParticipantName as PARTICIPANT_NAME
     , state.ParticipantType as PARTICIPANT_TYPE
     , path.PathID as INTERNAL_PATH_ID
     , path.PathName as STATUS_PATH_NAME
     , data.DataID as INTERNAL_DATA_ID
     , data.pkeyNum as INTERNAL_PK_VALUE
     , data.dataType as INTERNAL_DATA_TYPE
     , buriUser.BuriUserID as INTERNAL_USER_ID
     , buriUser.UserIDVal as STATUS_UPDATE_USER
  from BuriState state
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    inner join BuriPath path on state.PathID = path.PathID
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    inner join BuriData data on state.DataID = data.DataID
    -- = = = = = =
    -- one-to-one (with deleteDate condition)
    -- = = = = = =
    left outer join BuriStateUser stateUser
      on state.StateID = stateUser.StateID
     and stateUser.deleteDate > LOCALTIMESTAMP
    -- = = = = = =
    -- many-to-one
    -- = = = = = =
    left outer join BuriUser buriUser on stateUser.BuriUserID = buriUser.BuriUserID
;
