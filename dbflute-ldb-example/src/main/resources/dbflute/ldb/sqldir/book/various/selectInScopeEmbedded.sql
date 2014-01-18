-- selectInScopeEmbedded.sql

select book.BOOK_ID
     , book.BOOK_NAME
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.bookIdList != null*/book.BOOK_ID in /*$pmb.bookIdList*/(1, 2)/*END*/
   /*IF pmb.genreCodeList != null*/and book.GENRE_CODE in /*$pmb.genreCodeList*/('a', 'b')/*END*/
 /*END*/
;