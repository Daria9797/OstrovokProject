# Проект по автоматизации тестовых сценариев для проекта [Ostrovok](https://ostrovok.ru/?sid=40b40bd9-971f-4c4c-9ef7-eede8c5bfe63)

* [Технологии и инструменты][https://github.com/Daria9797/OstrovokProject#-технологии-и-инструменты]

* [Примеры автоматизированных тест-кейсов][https://github.com/Daria9797/OstrovokProject#-примеры-автоматизированных-тест-кейсов]

* [Сборка в Jenkins][https://github.com/Daria9797/OstrovokProject#-сборка-в-jenkins]

* [Запуск из терминала][https://github.com/Daria9797/OstrovokProject#-запуск-из-терминала]

* [Allure отчет][https://github.com/Daria9797/OstrovokProject#-allure-отчёт]

* [Уведомление в Telegram при помощи бота][https://github.com/Daria9797/OstrovokProject#-уведомление-в-telegram-при-помощи-бота]

* [Примеры видео выполнения тестов на Selenoid][https://github.com/Daria9797/OstrovokProject#-примеры-видео-выполнения-тестов-на-selenoid]


## Технологии и инструменты
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/9e6efbe3-c826-4e98-b8f2-1ed47f1da821" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/32d8e471-d656-4027-8f98-67a7f2579888" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/4096b480-e2ab-4e97-9b28-04ed54c57ab4" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/e670675e-f23f-4cb5-a4c9-c36e738a66d9" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/257c193e-b4fd-43a4-9f9c-a7f8e6ed075d" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/5e60da17-5937-4d4b-a066-5e740af7df7d" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/a9470fe5-9020-46ab-a56a-1c3f99fce666" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/a36ade4e-6eae-455a-9fee-585a6df48023" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/74e08cf5-a7b6-4fd8-9f6f-8d9f47b01cf2" width="50" height="50">
  <img src="https://github.com/Daria9797/OstrovokProject/assets/144155239/e666815c-6f07-44e9-8a26-dd7d5bd31a24" width="50" height="50">


* В данном проекте автотесты написаны на языке Java с использованием фреймворка для тестирования Selenide.
* В качестве сборщика был использован - Gradle.
* Использованы фреймворки JUnit 5 и Selenide.
* При прогоне тестов браузер запускается в Selenoid.
* Для удаленного запуска реализована джоба в Jenkins с формированием Allure-отчета и отправкой результатов в Telegram при помощи бота.

## Примеры автоматизированных тест-кейсов

* Проверка,что текст в заголовке соответствует выбранному языку.
* Проверка,что результаты поиска соответствуют выбранному городу.
* Проверка,что понравившийся отель попадает в избранное.
* Проверка,что понравившийся отель удаляется из избранного.
* Проверка,что в форме авторизации отображаются основные поля.

## Сборка в [Jenkins](https://jenkins.autotests.cloud/job/022-unit17-KuteinikovaDF/)
![screenshot-jenkins autotests cloud-2023 12 04-21_56_23](https://github.com/Daria9797/OstrovokProject/assets/144155239/f884862d-6429-4c3a-8a88-618deaf157a0)

## Команды для запуска из терминала
#### Локальный запуск
``` gradle clean main_test -Dlaunch=local ```

#### Удалённый запуск
``` gradle clean main_test -Dlaunch=remote ```

#### Удалённый запуск через Jenkins
``` gradle clean main_task -Dremote=${REMOTE_BROWSER}l ```

## Allure [отчёт](https://jenkins.autotests.cloud/job/022-unit17-KuteinikovaDF/11/allure/)

#### Основная страница отчёта
![screenshot-jenkins autotests cloud-2023 12 04-22_02_27](https://github.com/Daria9797/OstrovokProject/assets/144155239/8507b369-2573-492f-b548-e9b939337a44)

#### Тест-кейсы
![screenshot-jenkins autotests cloud-2023 12 04-22_03_56](https://github.com/Daria9797/OstrovokProject/assets/144155239/3abceab4-dd58-4274-9ba5-2d4330746e89)

## Уведомление в Telegram при помощи бота

![БОТ](https://github.com/Daria9797/OstrovokProject/assets/144155239/f5e39b74-6892-4cbe-9658-1ff527af7f05)

## Примеры видео выполнения тестов на Selenoid


https://github.com/Daria9797/OstrovokProject/assets/144155239/0e6b809e-0918-444a-b822-7f44a1484187








