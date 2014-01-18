-- update.sql

update AUTHOR set AUTHOR_NAME = 'update'
 /*BEGIN*/where
   /*IF pmb.authorId != null*/AUTHOR_ID = /*pmb.authorId*/1/*END*/
   /*IF pmb.authorName != null*/and AUTHOR_NAME like /*pmb.authorName*/'S2Dao' || '%'/*END*/
 /*END*/
;
