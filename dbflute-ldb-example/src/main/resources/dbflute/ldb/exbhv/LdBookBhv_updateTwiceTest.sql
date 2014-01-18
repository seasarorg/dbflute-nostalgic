-- updateTwiceTest.sql

update BOOK set BOOK_NAME = 'updateTwiceTest'
 /*BEGIN*/where
   /*IF pmb.bookId != null*/BOOK_ID = /*pmb.bookId*/1/*END*/
   /*IF pmb.bookName != null*/and BOOK_NAME like /*pmb.bookName*/'S2Dao' || '%'/*END*/
 /*END*/
;
