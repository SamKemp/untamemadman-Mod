@echo off
title Build script + Git commit
goto build
:build
call gradlew build
goto commit
:commit
call commit.bat
goto finished
:finished
cls
echo Mod has been built and commit to git!
pause