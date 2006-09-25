@echo off
REM
REM Start an RSE Windows Server
REM Usage: server.bat [/user <id>] [<port>] [<timeout>]
REM

setlocal

IF NOT "%1" == "/user" GOTO noUserRestriction
set USER_RESTRICTION=-Dclient.username=%2
shift 2
:noUserRestriction
set PORT=%1
set TIMEOUT=%2
set TICKET=%3
if "%1" == "" set PORT=4033
if "%2" == "" set TIMEOUT=120000

if "%1" == "?" goto usage
if "%1" == "/?" goto usage
if "%1" == "/h" goto usage
if "%1" == "help" goto usage
if "%1" == "/help" goto usage

IF NOT "%A_PLUGIN_PATH%"=="" GOTO doneSetup
IF EXIST setup.bat GOTO HaveSetup
ECHO.
ECHO Please run setup.bat before running server.bat
PAUSE
GOTO done
:HaveSetup
CALL setup.bat

:doneSetup
if "%3" == "" goto runNoTicket
REM The ticket parameter may be used internally by the daemon for starting a server
@echo on
java %USER_RESTRICTION% -DA_PLUGIN_PATH=%A_PLUGIN_PATH% -DDSTORE_SPIRIT_ON=true org.eclipse.dstore.core.server.Server %PORT% %TIMEOUT% %TICKET%
goto done

:runNoTicket
@echo on
java %USER_RESTRICTION% -DA_PLUGIN_PATH=%A_PLUGIN_PATH% -DDSTORE_SPIRIT_ON=true org.eclipse.dstore.core.server.Server %PORT% %TIMEOUT%
goto done

:usage
@echo Usage: server.bat [/user ^<id^>] [^<port^>] [^<timeout^>]
pause

:done
endlocal