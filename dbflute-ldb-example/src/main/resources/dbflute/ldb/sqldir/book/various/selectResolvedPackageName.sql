-- selectResolvedPackageName.sql

-- 
-- Confirm resolved package name.
-- 

-- !ResolvedPackageNamePmb!
-- !!String string1!!
-- !!Integer integer1!!
-- !!BigDecimal bigDecimal1!!
-- !!java.math.BigDecimal bigDecimal2!!
-- !!Date date1!!
-- !!java.util.Date date2!!
-- !!java.sql.Date date3!!
-- !!Time time1!!
-- !!java.sql.Time time2!!
-- !!Timestamp timestamp1!!
-- !!java.sql.Timestamp timestamp2!!
-- !!List<String> list1!!
-- !!java.util.List<String> list2!!
-- !!Map<String, String> map1!!
-- !!java.util.Map<String, String> map2!!

select book.BOOK_ID
     , book.BOOK_NAME as BOOK_NAME
     , book.R_USER-- This is comment for test 1
     , book.R_MODULE
     , book.R_TIMESTAMP -- And All Right?
     , book.U_USER -- And All Right? Oh, Good! But??? ...
     , book.U_MODULE
     , book.U_TIMESTAMP
     -- This is comment for test 2
  from BOOK book
 /*BEGIN*/where
   /*IF pmb.date1 != null*/book.R_TIMESTAMP <= /*pmb.date1*/'2007-12-12'/*END*/
   /*IF pmb.date3 != null*/and book.U_TIMESTAMP <= /*pmb.date3*/'2007-12-12'/*END*/
 /*END*/
;
