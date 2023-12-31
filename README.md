# Проект по тестированию главной страницы сайта "Nexign. Nexign Career"
> <a target="_blank" href="https://job.nexign.com/">Ссылка на Nexign Career</a>

![This is an image](design/images/nexign-job.jpg)

#### Список проверок, реализованных в автотестах
- [x] Наличие требуемых заголовков в верхнем меню страницы
- [x] Наличие блока подписки на социальные сети в подвале сайта
- [x] Наличие имиджевого текста на первой странице
- [x] Выполнение поиска заданной вакансии. Проверка, что открылась соответствующая страница
#### Список проверок ручного тестирования
- [x] Визуальная характеристика главной страницы сайта, соответствие единому корпоративному стилю
- [x] Адаптивность вёрстки
- [x] Соответствие вёрстки сайта общепринятым стандартам

## Проект реализован с использованием
![This is an image](design/icons/Java.png)![This is an image](design/icons/Gradle.png)![This is an image](design/icons/Intelij_IDEA.png)![This is an image](design/icons/Selenide.png)![This is an image](design/icons/Selenoid.png)![This is an image](design/icons/JUnit5.png)![This is an image](design/icons/Jenkins.png)![This is an image](design/icons/Allure_Report.png)![This is an image](design/icons/AllureTestOps.png)![This is an image](design/icons/Telegram.png)

# Запуск автотестов выполняется на сервере Jenkins
> <a target="_blank" href="https://jenkins.autotests.cloud/job/TevikFX-nexign-job-test/">Ссылка на проект в Jenkins</a>

### Параметры сборки

* login (default user1)
* password (default 1234)
* test_group (default ui_tests). Параметр определяет группу тестов для запуска.

### Для запуска автотестов в Jenkins
#### 1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/TevikFX-nexign-job-test/">проект</a>

![This is an image](design/images/jenkins1.png)

#### 2. Выбрать пункт **Собрать с параметрами**
#### 3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
#### 4. Нажать **Собрать**
#### 5. Результат запуска сборки можно посмотреть в отчёте Allure

![This is an image](design/images/jenkins2.png)

## Локальный запуск автотестов
Пример командной строки:
```bash
gradle clean ui_tests -Dlogin=user1 -Dpassword=1234 -DtestUrl=selenoid.autotests.cloud/wd/hub/
```

Получение отчёта:
```bash
allure serve build/allure-results
```

# Полная статистика по прохождению тестпланов, отчёты и приложения к ним хранятся в Allure TestOps
> <a target="_blank" href="https://allure.autotests.cloud/project/3528">Сссылка на проект в AllureTestOps</a> (запрос доступа admin@qa.guru)

### Тест-планы проекта
![This is an image](design/images/testplans.png)
### Кейсы тест-плана выполнения ручного тестирования
![This is an image](design/images/manual.png)
### Кейсы тест-плана выполнения автотестирования
![This is an image](/design/images/auto.png)
### Общий список всех кейсов, имеющихся в системе (без разделения по тест-планам и виду выполнения тестирования)
![This is an image](design/images/testcases.png)
### Пример dashboard с общими результатами тестирования
![This is an image](design/images/dashboard_all.png)

### Пример отчёта выполнения одного из автотестов
![This is an image](design/images/onecasereport.png)

#### *После окончания выполнения автотестов по каждому из них в отчёте доступны скриншоты и исходный код страницы, лог консоли браузера и видеозапись выполнения теста.*

### Пример видеозаписи прохождения теста
![This is an image](design/images/Video.gif)


# Настроено автоматическое оповещение о результатах сборки Jenkins в Telegram-бот
![This is an image](design/images/bot.png)


















