-- selectContainsBindCharacterOnLineComment.sql
-- Is it All Right?

select book.BOOK_ID
     , book.BOOK_NAME || '　' as BOOK_NAME_WITH_SPACE
     , (select count(*) from COLLECTION where BOOK_ID = book.BOOK_ID) as COLLECTION_COUNT
     , book.R_USER-- This is comment for test 1
     , book.R_MODULE
     , book.R_TIMESTAMP -- And All Right?
     , book.U_USER -- And All Right? Oh, Good! But??? ...
     , book.U_MODULE
     , book.U_TIMESTAMP
     -- This is comment for test 2
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.bookId != null*/book.BOOK_ID = /*pmb.bookId*/1/*END*/
   /*IF pmb.bookName != null*/and book.BOOK_NAME like /*pmb.bookName*/'S2Dao' || '%'/*END*/
 /*END*/
 order by COLLECTION_COUNT desc
;
