@echo off

cd %~p0
call _project.bat

rem /nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
rem Specify the file path to be used as build-properties.
rem nnnnnnnnnn/
set MY_PROPERTIES_PATH=build-%MY_PROJECT_NAME%.properties

rem /nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
rem Execute {Outsite-Sql-Test}.
rem nnnnnnnnnn/
call %DBFLUTE_HOME%\etc\cmd\_df-outside-sql-test.cmd %MY_PROPERTIES_PATH%

pause


