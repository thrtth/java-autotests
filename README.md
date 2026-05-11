# Java Autotests Project

Проект автоматизированного тестирования веб-интерфейса и API, написанный на **Java** с использованием фреймворков **Selenide** (UI-тесты) и **Rest Assured** (API-тесты).

## 📋 Содержание

- [Технологический стек](#технологический-стек)
- [Структура проекта](#структура-проекта)
- [Требования](#требования)
- [Установка и настройка](#установка-и-настройка)
- [Запуск тестов](#запуск-тестов)
- [Конфигурация](#конфигурация)
- [Отчетность](#отчетность)
- [CI/CD](#ci/cd)

## 🛠 Технологический стек

| Категория | Технология |
|-----------|------------|
| Язык программирования | Java 11+ |
| UI-тестирование | Selenide |
| API-тестирование | Rest Assured |
| Сборка проекта | Maven / Gradle |
| Тестовый фреймворк | JUnit 5 / TestNG |
| Отчеты | Allure Report |
| Логирование | SLF4J + Logback |
| CI/CD | GitHub Actions / Jenkins |

## 📁 Структура проекта

```
├── src
│   ├── main
│   │   └── java
│   │       └── com.example
│   │           ├── pages          # Page Object для UI тестов
│   │           ├── api            # Классы для API запросов
│   │           ├── models         # DTO и модели данных
│   │           └── config         # Конфигурационные классы
│   └── test
│       ├── java
│       │   └── com.example
│       │       ├── ui             # UI тесты
│       │       ├── api            # API тесты
│       │       └── base           # Базовые классы для тестов
│       └── resources
│           ├── application.properties
│           └── allure.properties
├── pom.xml / build.gradle
└── README.md
```

## ✅ Требования

- JDK 11 или выше
- Maven 3.8+ или Gradle 7+
- Браузер (Chrome, Firefox) или Docker для запуска в контейнере

## 🚀 Установка и настройка

1. Клонируйте репозиторий:
   ```bash
   git clone <repository-url>
   cd java-autotests
   ```

2. Установите зависимости:
   ```bash
   # Для Maven
   mvn clean install

   # Для Gradle
   gradle build
   ```

3. Настройте переменные окружения или отредактируйте файл `application.properties`.

## ▶️ Запуск тестов

### Все тесты
```bash
# Maven
mvn test

# Gradle
gradle test
```

### Только UI тесты
```bash
# Maven
mvn test -Dgroups=ui

# Gradle
gradle test -Dgroups=ui
```

### Только API тесты
```bash
# Maven
mvn test -Dgroups=api

# Gradle
gradle test -Dgroups=api
```

### Запуск с тегом
```bash
# Maven
mvn test -Dtest="*SmokeTest"

# Gradle
gradle test --tests "*SmokeTest"
```

## ⚙️ Конфигурация

Основные параметры настраиваются через `src/test/resources/application.properties`:

```properties
# URL приложения
base.url=https://example.com
api.base.url=https://api.example.com

# Браузер
browser=chrome
headless=true

# Таймауты
timeout=10000

# Данные для авторизации
user.login=test@example.com
user.password=password
```

Также можно передавать параметры через командную строку:
```bash
mvn test -Dbrowser=firefox -Dheadless=false
```

## 📊 Отчетность

Проект интегрирован с **Allure Report** для генерации детальных отчетов.

### Генерация отчета
```bash
# Maven
mvn allure:report

# Gradle
gradle allureReport
```

### Открыть отчет
```bash
# Maven
mvn allure:serve

# Gradle
gradle allureServe
```

## 🔄 CI/CD

Проект готов к интеграции с CI/CD системами. Примеры конфигураций находятся в папке `.github/workflows` или `jenkins/`.

### GitHub Actions
Для запуска тестов в GitHub Actions используйте workflow файл:
```yaml
name: Run Tests
on: [push, pull_request]
jobs:
  test:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v3
      - name: Set up JDK
        uses: actions/setup-java@v3
        with:
          java-version: '11'
          distribution: 'temurin'
      - name: Run tests
        run: mvn clean test
      - name: Allure Report
        uses: simple-elf/allure-report-action@master
```

## 📝 Лицензия

Этот проект распространяется под лицензией MIT.

## 👥 Авторы

- Ваше Имя — *initial work*

## 🤝 Вклад

Contributions are welcome! Пожалуйста, создавайте Pull Requests для любых улучшений.
