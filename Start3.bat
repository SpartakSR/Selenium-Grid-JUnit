cmd /C start java -jar selenium-server-4.8.1.jar hub
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5555 --driver-implementation "chrome"
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5556 --driver-implementation "firefox"