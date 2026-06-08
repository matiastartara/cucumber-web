# Cucumber Web Automation Framework

A comprehensive test automation framework built with Cucumber and Selenium for testing web applications. This project uses BDD (Behavior-Driven Development) approach to write and execute automated tests.

## 📋 Table of Contents

- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Test Execution](#test-execution)
- [Viewing Test Reports](#viewing-test-reports)
- [Technologies Used](#technologies-used)

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Java 17** or higher
- **Maven 3.6+** for dependency management
- **Google Chrome** and/or **Firefox** browsers
- **IntelliJ IDEA** (or similar IDE) with the following plugins:
  - TestNG plugin
  - Cucumber for Java plugin

## Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd cucumber-web
   ```

2. **Open the project in IntelliJ IDEA**
   - Open IntelliJ IDEA and select "Open"
   - Navigate to the project directory and click "OK"

3. **Import Maven dependencies**
   - Right-click on `pom.xml` → Maven → Reload project
   - WebDriverManager automatically downloads and manages browser driver executables

## Project Structure

```
cucumber-web/
├── src/
│   ├── main/java/
│   │   ├── pages/              # Page Object Model classes
│   │   │   ├── BasePage.java
│   │   │   ├── HomePage.java
│   │   │   ├── FlightPage.java
│   │   │   ├── SignPage.java
│   │   │   └── NavigationBarPage.java
│   │   └── utils/              # Utilities and drivers
│   │       └── Driver.java
│   └── test/java/
│       ├── steps/              # Step definitions
│       │   ├── BaseStep.java
│       │   ├── LoginStep.java
│       │   └── SearchFlightStep.java
│       ├── test/
│       │   └── TestRunner.java
│       └── resources/
│           └── features/       # Feature files
│               ├── Login.feature
│               └── SearchFlight.feature
└── pom.xml                     # Maven configuration
```

## Test Execution

### Using IntelliJ IDEA
1. Navigate to `src/test/java/suite/` folder
2. Right-click on the desired test suite file (`allTests.xml`, `loginTest.xml`, or `searchFlightTest.xml`)
3. Select **Run** to execute the tests

### Using Maven
```bash
# Run all tests
mvn verify

# Run specific test suite (if configured)
mvn test -Dsuite=allTests
```

## Viewing Test Reports

### HTML Report via Maven
After running tests with `mvn verify`, the detailed HTML report can be found at:
```
target/cucumber-report-html/cucumber-html-reports/All.html
```

### Using IntelliJ IDEA
If you run tests directly from IntelliJ using `allTests.xml`, the report is generated at:
```
src/cucumberReport.html
```

## Technologies Used

- **Java 17** - Programming language
- **Selenium WebDriver** - Web automation tool
- **Cucumber** - BDD framework
- **TestNG** - Testing framework
- **Maven** - Build and dependency management
- **WebDriverManager** - Automated driver management

## Notes

- Ensure all browsers (Chrome and Firefox) are installed on your system
- WebDriverManager handles driver executable downloads automatically
- Feature files use Gherkin syntax for readable test scenarios
