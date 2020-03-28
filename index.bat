@echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac -encoding utf8 -cp com/krzem/color_terminal/modules/jna-5.5.0.jar;com/krzem/color_terminal/modules/jna-platform-5.5.0.jar; com/krzem/color_terminal/Main.java&&java -Dfile.encoding=UTF8 -cp com/krzem/color_terminal/modules/jna-5.5.0.jar;com/krzem/color_terminal/modules/jna-platform-5.5.0.jar; com/krzem/color_terminal/Main
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"