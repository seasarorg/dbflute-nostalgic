-- selectIfCommentVariousExpression.sql

select book.BOOK_ID
     , book.BOOK_NAME || '　' as BOOK_NAME_WITH_SPACE
     , (select count(*) from COLLECTION where BOOK_ID = book.BOOK_ID) as COLLECTION_COUNT
     , book.R_USER-- This is comment for test 1
     , book.R_MODULE
     /*IF pmb.bookId == null || pmb.bookName != null*/
     , book.R_TIMESTAMP -- And All Right?
     /*END*/
     /*IF pmb.isPaging()*/
     , book.U_USER -- And All Right? Oh, Good! But??? ...
     /*END*/
     /*IF pmb.bookId == null && pmb.bookName != null*/
     , book.U_MODULE
     /*END*/
     /*IF pmb.bookId == null && pmb.bookName == null*/
     , book.U_TIMESTAMP
     /*END*/
     -- This is comment for test 2
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.bookId != null*/book.BOOK_ID = /*pmb.bookId*/1/*END*/
   /*IF pmb.bookName != null*/and book.BOOK_NAME like /*pmb.bookName*/'S2Dao' || '%'/*END*/
 /*END*/
 order by COLLECTION_COUNT desc
;
