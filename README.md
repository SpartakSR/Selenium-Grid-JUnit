# Selenium Grid. Кросс-браузерное тестирование.

1. Скачаем Selenium Server.

2. Создадим на диске C папку seleniumgrid и скопируем в нее скачанный файл selenium_server_x.xx.x.jar.

3. Создадим новый Maven-проект для автоматизации тестирования в Eclipse.

4. Создадим тестовый класс в JUnit.

5. Рапределим браузеры по узлам, в start3.bat запишем:
 
cmd /C start java -jar selenium-server-4.8.1.jar hub  
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5555 --driver-implementation "chrome"  
cmd /C start java -jar selenium-server-4.8.1.jar node --max-sessions 4 --port 5556 --driver-implementation "firefox"

6. Запустим start2.bat и откроем http://localhost:4444/grid/console.
![Selenium Grid_page_1](https://user-images.githubusercontent.com/127390983/228631571-82216925-f4f8-4d96-8205-577c6900ee7e.jpg)

7. Запустим тесты в Eclipse.
![image](https://user-images.githubusercontent.com/127390983/231852094-9b26d22c-188e-4391-9e7f-372c52ce3860.png)
