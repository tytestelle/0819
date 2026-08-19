@echo off
setlocal
cd /d "%~dp0"
if not exist gradlew.bat (
  echo [ERROR] 当前工程没有 gradlew.bat / Gradle Wrapper。
  echo 请先补齐与本工程 Android Gradle Plugin 8.10.1 兼容的 Gradle Wrapper。
  exit /b 2
)
call gradlew.bat :app:assembleDebug --stacktrace > build-error.log 2>&1
set ERR=%ERRORLEVEL%
echo Build exit code: %ERR%
echo Log: %~dp0build-error.log
exit /b %ERR%
