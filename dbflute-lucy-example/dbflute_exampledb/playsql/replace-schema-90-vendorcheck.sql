
CREATE TABLE VENDOR_CHECK
(
	VENDOR_CHECK_ID NUMERIC(16) NOT NULL PRIMARY KEY,
	DECIMAL_DIGIT NUMERIC(5, 3) NOT NULL,
	INTEGER_NON_DIGIT NUMERIC(5, 0) NOT NULL,
	TYPE_OF_BOOLEAN BOOLEAN NOT NULL,
	TYPE_OF_TEXT TEXT,
	U_Y_TEXT TEXT
)  ;