# Проект автоматизации тестирования для <a target="_blank" href="https://mineralmarket.ru/">МинералМаркет</a> <img src="img/logo/VV.svg" width="50" height="50"  alt="IDEA"/>

## :open_book: Содержание:
- [Технологии и инструменты](#gear-в-проекте-используются-следующие-технологии-и-инструменты)
- [Что проверяем](#heavy_check_mark-что-проверяем)
- [Запуск тестов из Jenkins](#-запуск-тестов-из-jenkins)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Отчеты](#bar_chart-отчеты-о-прохождении-тестов-доступны-в-allure)
- - [Allure](#-allure)
- - [Telegram](#-telegram)
- [Видео с прогоном тестов](#movie_camera-видео-с-прогоном-тестов)
- [Allure TestOps](#-проект-интегрирован-с-allure-testOps)

## :gear: В проекте используются следующие технологии и инструменты:

<p align="center">
<img src="img/logo/Idea.svg" width="50" height="50"  alt="IDEA"/>
<img src="img/logo/Java.svg" width="50" height="50"  alt="Java"/>
<img src="img/logo/GitHub.svg" width="50" height="50"  alt="Github"/>
<img src="img/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="img/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="img/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="img/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
<img src="img/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="img/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
<img src="img/logo/Allure_TO.svg" width="50" height="50"  alt="Allure_TO"/>
<img src="img/logo/Jira.svg" width="50" height="50"  alt="Jira"/>
</p>

## :heavy_check_mark: Описание
В проекте автоматизирована проверка главной страницы сайта МинералМаркет, а также отображение попапа адреса доставки при добавлении товара в корзину и поиск. Использован паттерн проектирования автотестов PageObject.

## :heavy_check_mark: Что проверяем

> - Переход с главной в каталог;
> - Переход с главной на страницу акций;
> - Переход с главной на страницу магазинов;
> - Поиск товара;
> - Отображение поапа адреса при добавлении товара в корзину.

## <img width="4%" title="Jenkins" src="img/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/VarlamovaNadezhda_qa_guru_10_diplom_ui/)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать с параметрами".
<img src="img/screen/Screenshot_7.jpg" alt="Jenkins"/>
2. Выбрать параметры.
<img src="img/screen/Screenshot_8.jpg" alt="Jenkins"/>
3. Нажать кнопку "Собрать".

### :heavy_plus_sign: Параметры сборки

> - BROWSER (браузер)
> - VERSION (версия браузера)
> - RESOLUTION (размер окна браузера)
> - BASEURL (адрес сайта)

## :computer: Запуск тестов из терминала

Для локального запуска необходимо выполнить команду:
```
gradle clean test
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="img/logo/Allure.svg"> Allure

#### Главная страница

<img src="img/screen/AllureMain.jpg" alt="Allure"/>

#### Графики

<img src="img/screen/AllureGraph.jpg" alt="Allure"/>

#### Тесты

<img src="img/screen/AllureTests.jpg" alt="Allure"/>

### <img width="3%" title="Telegram" src="img/logo/Telegram.svg"> Telegram

Настроена отправка оточета ботом в Telegram

<img src="img/screen/Bot.jpg" alt="Telegram"/>

## :movie_camera: Видео с прогоном тестов

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста

<p align="center">
  <img title="Video" src="img/gif/test.gif">
</p>

## Проект интегрирован с Allure TestOps
<img width="3%" title="Allure" src="img/logo/Allure_TO.svg"> 

#### Представлены тест-кейсы

<img src="img/screen/TOTest.jpg" alt="TO"/>

#### Представлены дашборды аналитики

<img src="img/screen/TODash.jpg" alt="TO"/>

#### Представлены запуски

<img src="img/screen/TOLaunch.jpg" alt="TO"/>
