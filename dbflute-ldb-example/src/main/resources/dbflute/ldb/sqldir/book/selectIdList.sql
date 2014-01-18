-- selectIdListSpecifiedOutsideSql.sql

select book.BOOK_ID
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.bookId != null*/book.BOOK_ID = /*pmb.bookId*/1/*END*/
   /*IF pmb.bookName != null*/and book.BOOK_NAME like /*pmb.bookName*/'S2Dao' || '%'/*END*/
 /*END*/
;
