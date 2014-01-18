
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The example project for Buri and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[Maven2]
This project needs maven2 so you should prepare 'M2Eclipse'.

[Apache Derby]


2008/11/25
But now the tests of outside-sql are invalid
because Dao Interface is unsupported since 0.8.7.
Their migration have not done yet.
However outside-sql is not related to table structure
so it is OK as long as example projects have enough tests about outside-sql.