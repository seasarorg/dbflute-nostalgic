-- selectPageSpecifiedOutsideSql.sql

/*IF pmb.isPaging()*/
select book.BOOK_ID
     , book.BOOK_NAME
     , (select count(*) from COLLECTION where BOOK_ID = book.BOOK_ID) as COLLECTION_COUNT
     , book.R_USER
     , book.R_MODULE
     , book.R_TIMESTAMP
     , book.U_USER
     , book.U_MODULE
     , book.U_TIMESTAMP
  -- ELSE select count(*)
/*END*/
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.bookId != null && pmb.bookId != null*/book.BOOK_ID = /*pmb.bookId*/1/*END*/
   /*IF pmb.bookName != null*/and book.BOOK_NAME like /*pmb.bookName*/'S2Dao' || '%'/*END*/
 /*END*/
/*IF pmb.isPaging()*/
 order by COLLECTION_COUNT desc
/*END*/
;
