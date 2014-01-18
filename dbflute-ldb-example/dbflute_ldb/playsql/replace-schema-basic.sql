
CREATE TABLE AUTHOR ( 
	AUTHOR_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	AUTHOR_NAME varchar(80) NOT NULL,
	AUTHOR_AGE smallint,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE BLACK_ACTION ( 
	BLACK_ACTION_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	BLACK_LIST_ID integer NOT NULL,
	BLACK_ACTION_CODE char(3) NOT NULL,
	BLACK_LEVEL smallint NOT NULL,
	ACTION_DATE timestamp,
	EVIDENCE_PHOTOGRAPH blob,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE BLACK_ACTION_LOOKUP ( 
	BLACK_ACTION_CODE char(3) NOT NULL,
	BLACK_ACTION_NAME varchar(80) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE BLACK_LIST ( 
	BLACK_LIST_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	LB_USER_ID integer NOT NULL,
	BLACK_RANK char(3) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE BOOK ( 
	BOOK_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	ISBN varchar(20) NOT NULL,
	BOOK_NAME varchar(80) NOT NULL,
	AUTHOR_ID integer NOT NULL,
	PUBLISHER_ID integer NOT NULL,
	GENRE_CODE varchar(24),
	OPENING_PART clob,
	MAX_LENDING_DATE_COUNT smallint NOT NULL,
	OUT_OF_USER_SELECT_YN char(1) NOT NULL,
	OUT_OF_USER_SELECT_REASON varchar(200),
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE COLLECTION ( 
	COLLECTION_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	LIBRARY_ID smallint NOT NULL,
	BOOK_ID integer NOT NULL,
	ARRIVAL_DATE timestamp NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE COLLECTION_STATUS ( 
	COLLECTION_ID integer NOT NULL,
	COLLECTION_STATUS_CODE char(3) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE COLLECTION_STATUS_LOOKUP ( 
	COLLECTION_STATUS_CODE char(3) NOT NULL,
	COLLECTION_STATUS_NAME varchar(80) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE GARBAGE ( 
	GARBAGE_MEMO varchar(50),
	GARBAGE_TIME timestamp,
	GARBAGE_COUNT integer,
	R_USER varchar(100),
	R_TIMESTAMP timestamp,
	U_USER varchar(100),
	U_TIMESTAMP timestamp
)
;

CREATE TABLE GARBAGE_PLUS ( 
	GARBAGE_MEMO varchar(50),
	GARBAGE_TIME timestamp,
	GARBAGE_COUNT integer,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE GENRE ( 
	GENRE_CODE varchar(24) NOT NULL,
	GENRE_NAME varchar(80) NOT NULL,
	HIERARCHY_LEVEL numeric(9, 0) NOT NULL,
	HIERARCHY_ORDER numeric(10, 0) NOT NULL,
	PARENT_GENRE_CODE varchar(24),
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LB_USER ( 
	LB_USER_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	LB_USER_NAME varchar(80) NOT NULL,
	USER_PASSWORD varchar(50) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LENDING ( 
	LIBRARY_ID smallint NOT NULL,
	LB_USER_ID integer NOT NULL,
	LENDING_DATE timestamp NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LENDING_COLLECTION ( 
	LIBRARY_ID smallint NOT NULL,
	LB_USER_ID integer NOT NULL,
	LENDING_DATE timestamp NOT NULL,
	COLLECTION_ID integer NOT NULL,
	RETURN_LIMIT_DATE timestamp NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LIBRARY ( 
	LIBRARY_ID smallint NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	LIBRARY_NAME varchar(80) NOT NULL,
	LIBRARY_TYPE_CODE char(3) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LIBRARY_TYPE_LOOKUP ( 
	LIBRARY_TYPE_CODE char(3) NOT NULL,
	LIBRARY_TYPE_NAME varchar(80) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE LIBRARY_USER ( 
	LIBRARY_ID smallint NOT NULL,
	LB_USER_ID integer NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE NEXT_LIBRARY ( 
	LIBRARY_ID smallint NOT NULL,
	NEXT_LIBRARY_ID smallint NOT NULL,
	DISTANCE_KM numeric(4, 2) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;

CREATE TABLE PUBLISHER ( 
	PUBLISHER_ID integer NOT NULL GENERATED BY DEFAULT AS IDENTITY (START WITH 1, INCREMENT BY 1),
	PUBLISHER_NAME varchar(80) NOT NULL,
	R_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	R_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	R_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
	U_USER varchar(100) DEFAULT 'default-user' NOT NULL,
	U_MODULE varchar(100) DEFAULT 'default-module' NOT NULL,
	U_TIMESTAMP timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL
)
;



ALTER TABLE AUTHOR ADD CONSTRAINT PK_AUTHOR 
	PRIMARY KEY (AUTHOR_ID) ;

ALTER TABLE BLACK_ACTION ADD CONSTRAINT PK_BLACK_ACTION 
	PRIMARY KEY (BLACK_ACTION_ID) ;

ALTER TABLE BLACK_ACTION_LOOKUP ADD CONSTRAINT PK_BLACK_ACTION_LOOKUP 
	PRIMARY KEY (BLACK_ACTION_CODE) ;

ALTER TABLE BLACK_LIST ADD CONSTRAINT PK_BLACK_LIST 
	PRIMARY KEY (BLACK_LIST_ID) ;

ALTER TABLE BOOK ADD CONSTRAINT PK_BOOK 
	PRIMARY KEY (BOOK_ID) ;

ALTER TABLE COLLECTION ADD CONSTRAINT PK_COLLECTION 
	PRIMARY KEY (COLLECTION_ID) ;

ALTER TABLE COLLECTION_STATUS ADD CONSTRAINT PK_COLLECTION_STATUS 
	PRIMARY KEY (COLLECTION_ID) ;

ALTER TABLE COLLECTION_STATUS_LOOKUP ADD CONSTRAINT PK_COLLECTION_STATUS_LOOKUP 
	PRIMARY KEY (COLLECTION_STATUS_CODE) ;

ALTER TABLE GENRE ADD CONSTRAINT PK_GENRE 
	PRIMARY KEY (GENRE_CODE) ;

ALTER TABLE LB_USER ADD CONSTRAINT PK_LB_USER 
	PRIMARY KEY (LB_USER_ID) ;

ALTER TABLE LENDING ADD CONSTRAINT PK_LENDING 
	PRIMARY KEY (LIBRARY_ID, LB_USER_ID, LENDING_DATE) ;

ALTER TABLE LENDING_COLLECTION ADD CONSTRAINT PK_LENDING_COLLECTION 
	PRIMARY KEY (LIBRARY_ID, LB_USER_ID, LENDING_DATE, COLLECTION_ID) ;

ALTER TABLE LIBRARY ADD CONSTRAINT PK_LIBRARY 
	PRIMARY KEY (LIBRARY_ID) ;

ALTER TABLE LIBRARY_TYPE_LOOKUP ADD CONSTRAINT PK_LIBRARY_TYPE_LOOKUP
	PRIMARY KEY (LIBRARY_TYPE_CODE) ;

ALTER TABLE LIBRARY_USER ADD CONSTRAINT PK_LIBRARY_USER 
	PRIMARY KEY (LIBRARY_ID, LB_USER_ID) ;

ALTER TABLE NEXT_LIBRARY ADD CONSTRAINT PK_NEXT_LIBRARY 
	PRIMARY KEY (LIBRARY_ID, NEXT_LIBRARY_ID) ;

ALTER TABLE PUBLISHER ADD CONSTRAINT PK_PUBLISHER 
	PRIMARY KEY (PUBLISHER_ID) ;


ALTER TABLE BLACK_LIST
	ADD CONSTRAINT UQ_BLACK_LIST_LB_USER_ID UNIQUE (LB_USER_ID) ;

ALTER TABLE BOOK
	ADD CONSTRAINT UQ_BOOK_ISBN UNIQUE (ISBN) ;

ALTER TABLE COLLECTION
	ADD CONSTRAINT UQ_COLLECTION_Primary UNIQUE (LIBRARY_ID, BOOK_ID) ;

ALTER TABLE LIBRARY
	ADD CONSTRAINT UQ_LIBRARY_LIBRARY_NAME UNIQUE (LIBRARY_NAME) ;


ALTER TABLE BLACK_ACTION ADD CONSTRAINT FK_BLACK_ACTION_BLACK_LIST 
	FOREIGN KEY (BLACK_LIST_ID) REFERENCES BLACK_LIST (BLACK_LIST_ID) ;

ALTER TABLE BLACK_ACTION ADD CONSTRAINT FK_BLACK_ACTION_LOOKUP 
	FOREIGN KEY (BLACK_ACTION_CODE) REFERENCES BLACK_ACTION_LOOKUP (BLACK_ACTION_CODE) ;

ALTER TABLE BLACK_LIST ADD CONSTRAINT FK_BLACK_LIST_LB_USER 
	FOREIGN KEY (LB_USER_ID) REFERENCES LB_USER (LB_USER_ID) ;

ALTER TABLE BOOK ADD CONSTRAINT FK_BOOK_AUTHOR 
	FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR (AUTHOR_ID) ;

ALTER TABLE BOOK ADD CONSTRAINT FK_BOOK_PUBLISHER 
	FOREIGN KEY (PUBLISHER_ID) REFERENCES PUBLISHER (PUBLISHER_ID) ;

ALTER TABLE BOOK ADD CONSTRAINT FK_BOOK_GENRE 
	FOREIGN KEY (GENRE_CODE) REFERENCES GENRE (GENRE_CODE) ;

ALTER TABLE COLLECTION ADD CONSTRAINT FK_COLLECTION_BOOK 
	FOREIGN KEY (BOOK_ID) REFERENCES BOOK (BOOK_ID) ;

ALTER TABLE COLLECTION ADD CONSTRAINT FK_COLLECTION_LIBRARY 
	FOREIGN KEY (LIBRARY_ID) REFERENCES LIBRARY (LIBRARY_ID) ;

ALTER TABLE COLLECTION_STATUS ADD CONSTRAINT FK_COLLECTION_STATUS_COLLECTION 
	FOREIGN KEY (COLLECTION_ID) REFERENCES COLLECTION (COLLECTION_ID) ;

ALTER TABLE COLLECTION_STATUS ADD CONSTRAINT FK_COLLECTION_STATUS_LOOKUP 
	FOREIGN KEY (COLLECTION_STATUS_CODE) REFERENCES COLLECTION_STATUS_LOOKUP (COLLECTION_STATUS_CODE) ;

ALTER TABLE GENRE ADD CONSTRAINT FK_GENRE_GENRE 
	FOREIGN KEY (PARENT_GENRE_CODE) REFERENCES GENRE (GENRE_CODE) ;

ALTER TABLE LENDING ADD CONSTRAINT FK_LENDING_LIBRARY_USER 
	FOREIGN KEY (LIBRARY_ID, LB_USER_ID) REFERENCES LIBRARY_USER (LIBRARY_ID, LB_USER_ID) ;

ALTER TABLE LENDING_COLLECTION ADD CONSTRAINT FK_LENDING_COLLECTION_LENDING 
	FOREIGN KEY (LIBRARY_ID, LB_USER_ID, LENDING_DATE) REFERENCES LENDING (LIBRARY_ID, LB_USER_ID, LENDING_DATE) ;

ALTER TABLE LENDING_COLLECTION ADD CONSTRAINT FK_LENDING_COLLECTION_COL 
	FOREIGN KEY (COLLECTION_ID) REFERENCES COLLECTION (COLLECTION_ID) ;

ALTER TABLE LIBRARY ADD CONSTRAINT FK_LIBRARY_LIBRARY_TYPE_LOOKUP
	FOREIGN KEY (LIBRARY_TYPE_CODE) REFERENCES LIBRARY_TYPE_LOOKUP (LIBRARY_TYPE_CODE) ;

ALTER TABLE LIBRARY_USER ADD CONSTRAINT FK_LIBRARY_USER_LB_USER 
	FOREIGN KEY (LB_USER_ID) REFERENCES LB_USER (LB_USER_ID) ;

ALTER TABLE LIBRARY_USER ADD CONSTRAINT FK_LIBRARY_USER_LIBRARY 
	FOREIGN KEY (LIBRARY_ID) REFERENCES LIBRARY (LIBRARY_ID) ;

ALTER TABLE NEXT_LIBRARY ADD CONSTRAINT FK_NEXT_LIBRARY_LIBRARY_ID 
	FOREIGN KEY (LIBRARY_ID) REFERENCES LIBRARY (LIBRARY_ID) ;

ALTER TABLE NEXT_LIBRARY ADD CONSTRAINT FK_NEXT_LIBRARY_NEXT_LIBRARY_ID 
	FOREIGN KEY (NEXT_LIBRARY_ID) REFERENCES LIBRARY (LIBRARY_ID) ;