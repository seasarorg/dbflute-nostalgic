-- selectByBindCharacter.sql
-- #df:x#

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
 where book.BOOK_ID = ?
 order by COLLECTION_COUNT desc
;
