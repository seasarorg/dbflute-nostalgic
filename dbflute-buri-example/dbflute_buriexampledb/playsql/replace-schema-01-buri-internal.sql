CREATE TABLE BuriStateUser (
       StateUserID          NUMBER(18,0) NOT NULL,
       StateID              NUMBER(18,0)  ,
       BuriUserID           NUMBER(18,0)  ,
       insertDate           TIMESTAMP NOT NULL,
       deleteDate           TIMESTAMP NOT NULL,
       PRIMARY KEY (StateUserID)
);

CREATE INDEX XIF1BuriStateUser ON BuriStateUser(StateID);
CREATE INDEX XIF2BuriStateUser ON BuriStateUser(BuriUserID);

CREATE SEQUENCE BuriStateUserID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriState (
       StateID              NUMBER(18,0) NOT NULL,
       PathID               NUMBER(18,0)  ,
       DataID               NUMBER(18,0)  ,
       BranchID             NUMBER(18,0)  ,
       UserIDVal            VARCHAR(20),
       UserIDNum            NUMBER(18,0),
       ParticipantName      VARCHAR(200),
       ParticipantType      VARCHAR(200),
       Btid                 NUMBER(18,0) NOT NULL,
       insertDate           TIMESTAMP NOT NULL,
       autoRunTime          TIMESTAMP NOT NULL,
       processDate          TIMESTAMP NOT NULL,
       abortDate            TIMESTAMP NOT NULL,
       versionNo            INTEGER NOT NULL,
       PRIMARY KEY (StateID)
);

CREATE INDEX XIF1BuriState ON BuriState(PathID);
CREATE INDEX XIF2BuriState ON BuriState(DataID);
CREATE INDEX XIF4BuriState ON BuriState(BranchID);
CREATE INDEX XIF5BuriState ON BuriState(processDate);
CREATE INDEX XIF6BuriState ON BuriState(autoRunTime);

CREATE SEQUENCE BuriStateID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriStateUndoLog (
       StateUndoLogID       NUMBER(18,0) NOT NULL,
	   StateID				NUMBER(18,0) NOT NULL,
       BranchID             NUMBER(18,0)  ,
       PathID               NUMBER(18,0)  ,
       DataID               NUMBER(18,0)  ,
       UserIDVal            VARCHAR(20),
       autoRunTime          TIMESTAMP,
       UserIDNum            NUMBER(18,0),
       insertDate           TIMESTAMP NOT NULL,
       Btid                 NUMBER(18,0) NOT NULL,
       processDate          TIMESTAMP,
       abortDate            TIMESTAMP NOT NULL,
       versionNo            INTEGER NOT NULL,
       createBtid           NUMBER(18,0) NOT NULL,
       PRIMARY KEY (StateUndoLogID)
);

CREATE INDEX XIF1BuriStateUndoLog ON BuriStateUndoLog(StateID);

CREATE SEQUENCE BuriStateUndoLogID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriTransaction (
       Btid                 NUMBER(18,0) NOT NULL,
       insertDate           TIMESTAMP NOT NULL,
       versionNo            INTEGER NOT NULL,
       PRIMARY KEY (Btid)
);

CREATE SEQUENCE BuriTransactionID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriBranch (
       BranchID             NUMBER(18,0) NOT NULL,
       parentBranchID       NUMBER(18,0)  ,
       PathID               NUMBER(18,0)  ,
       DataID               NUMBER(18,0)  ,
       processDate          TIMESTAMP,
       Btid                 INTEGER NOT NULL,
       versionNo            INTEGER NOT NULL,
       PRIMARY KEY (BranchID)
);

CREATE INDEX XIF1BuriBranch ON BuriBranch(PathID);
CREATE INDEX XIF2BuriBranch ON BuriBranch(parentBranchID);
CREATE INDEX XIF3BuriBranch ON BuriBranch(DataID);

CREATE SEQUENCE BuriBranchID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriDataPathHistory (
       historyID            NUMBER(18,0) NOT NULL,
       PathID               NUMBER(18,0)  ,
       PathName             VARCHAR(200),
       DataID               NUMBER(18,0)  ,
       action               VARCHAR(50),
       BuriUserID           NUMBER(18,0),
       Btid                 NUMBER(18,0) NOT NULL,
       insertDate           TIMESTAMP NOT NULL,
       PRIMARY KEY (historyID)
);

CREATE INDEX XIF3BuriDataPathHi ON BuriDataPathHistory(PathID);
CREATE INDEX XIF4BuriDataPathHi ON BuriDataPathHistory(DataID);

CREATE SEQUENCE BuriDataPathHistoryID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriData (
       DataID               NUMBER(18,0) NOT NULL,
       pkeyVal              VARCHAR(250),
       pkeyNum              NUMBER(18,0),
       dataType             VARCHAR(200) NOT NULL,
       tableName			VARCHAR(200) ,
       InsertUserID         NUMBER(18,0)  ,
       PRIMARY KEY (DataID)
);

CREATE INDEX XIF1BuriData ON BuriData(InsertUserID);
CREATE INDEX XIE1BuriData ON BuriData(pkeyVal,dataType);
CREATE INDEX XIE2BuriData ON BuriData(pkeyNum,dataType);

CREATE SEQUENCE BuriDataID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriPath (
       PathID               NUMBER(18,0) NOT NULL,
       PathName             VARCHAR(100) NOT NULL,
       RealPathName         VARCHAR(100) NOT NULL,
       pathType             INTEGER,
       PRIMARY KEY (PathID)
);

CREATE INDEX XIE1BuriPath ON BuriPath(PathName);
CREATE INDEX XIE2BuriPath ON BuriPath(RealPathName);
CREATE INDEX XIE3BuriPath ON BuriPath(pathType);

CREATE SEQUENCE BuriPathID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE TABLE BuriUser (
       BuriUserID           NUMBER(18,0) NOT NULL,
       UserIDVal            VARCHAR(100),
       UserIDNum            NUMBER(18,0),
       PRIMARY KEY (BuriUserID)
);

CREATE INDEX XIE2BuriUser ON BuriUser(UserIDVal,UserIDNum);

CREATE SEQUENCE BuriUserID
 START WITH 1
 INCREMENT BY 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
;


CREATE OR REPLACE VIEW BuriPathData AS
SELECT
	BuriPath.pathID AS pathID
	,BuriPath.PathName AS PathName
	,BuriPath.RealPathName AS RealPathName
	,BuriPath.pathType AS pathType
	,BuriData.pkeyNum AS pkeyNum
	,BuriData.pkeyVal AS pkeyVal
	,BuriData.dataType AS dataType
	,BuriData.tableName AS tableName
	,BuriData.dataID AS dataID
	,BuriState.StateID AS StateID
	,BuriState.autoRunTime AS autoRunTime
	,BuriState.ParticipantName AS ParticipantName
	,BuriState.ParticipantType AS ParticipantType
FROM
	BuriPath
	,BuriState
	,BuriData
WHERE
	BuriPath.pathID = BuriState.pathID
	AND BuriData.dataID = BuriState.dataID
	AND BuriState.processDate > CURRENT_TIMESTAMP
;


CREATE OR REPLACE VIEW BuriPathDataUser AS
SELECT
	BuriPathData.pathID AS pathID
	,BuriPathData.PathName AS PathName
	,BuriPathData.RealPathName AS RealPathName
	,BuriPathData.pathType AS pathType
	,BuriPathData.pkeyNum AS pkeyNum
	,BuriPathData.pkeyVal AS pkeyVal
	,BuriPathData.dataType AS dataType
	,BuriPathData.tableName AS tableName
	,BuriPathData.dataID AS dataID
	,BuriPathData.StateID AS StateID
	,BuriPathData.autoRunTime AS autoRunTime
	,BuriPathData.ParticipantName AS ParticipantName
	,BuriPathData.ParticipantType AS ParticipantType
	,BuriUser.BuriUserID AS BuriUserID
	,BuriUser.UserIDVal AS UserIDVal
	,BuriUser.UserIDNum AS UserIDNum
FROM
	BuriPathData
	,BuriStateUser
	,BuriUser
WHERE
	BuriPathData.StateID = BuriStateUser.StateID
	AND BuriUser.BuriUserID = BuriStateUser.BuriUserID
	AND BuriStateUser.deleteDate > CURRENT_TIMESTAMP
;


CREATE OR REPLACE VIEW BuriPathHistoryData AS
SELECT
	BuriPath.pathID AS pathID
	,BuriPath.PathName AS PathName
	,BuriPath.RealPathName AS RealPathName
	,BuriPath.pathType AS pathType
	,BuriData.pkeyNum AS pkeyNum
	,BuriData.pkeyVal AS pkeyVal
	,BuriData.dataType AS dataType
	,BuriData.tableName AS tableName
	,BuriData.dataID AS dataID
	,BuriState.StateID AS StateID
	,BuriState.autoRunTime AS autoRunTime
    ,BuriState.insertDate AS insertDate
    ,BuriState.processDate AS processDate
    ,BuriState.abortDate AS abortDate
	,BuriState.ParticipantName AS ParticipantName
	,BuriState.ParticipantType AS ParticipantType
FROM
	BuriPath
	,BuriState
	,BuriData
WHERE
	BuriPath.pathID = BuriState.pathID
	AND BuriData.dataID = BuriState.dataID
;


CREATE OR REPLACE VIEW BuriPathHistoryDataUser AS
SELECT
	BuriPathData.pathID AS pathID
	,BuriPathData.PathName AS PathName
	,BuriPathData.RealPathName AS RealPathName
	,BuriPathData.pathType AS pathType
	,BuriPathData.pkeyNum AS pkeyNum
	,BuriPathData.pkeyVal AS pkeyVal
	,BuriPathData.dataType AS dataType
	,BuriPathData.tableName AS tableName
	,BuriPathData.dataID AS dataID
	,BuriPathData.StateID AS StateID
	,BuriPathData.autoRunTime AS autoRunTime
    ,BuriPathData.insertDate AS insertDate
    ,BuriPathData.processDate AS processDate
    ,BuriPathData.abortDate AS abortDate
	,BuriPathData.ParticipantName AS ParticipantName
	,BuriPathData.ParticipantType AS ParticipantType
	,BuriUser.BuriUserID AS BuriUserID
	,BuriUser.UserIDVal AS UserIDVal
	,BuriUser.UserIDNum AS UserIDNum
FROM
	BuriPathHistoryData BuriPathData
	,BuriStateUser
	,BuriUser
WHERE
	BuriPathData.StateID = BuriStateUser.StateID
	AND BuriUser.BuriUserID = BuriStateUser.BuriUserID
	AND BuriStateUser.deleteDate > CURRENT_TIMESTAMP
;
