-- selectInScopeWithoutIf.sql

select book.BOOK_ID
     , book.BOOK_NAME
  from BOOK book
 where book.BOOK_ID in /*pmb.bookIdList*/(1, 2)
;