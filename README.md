# 🧪 Cucumber Web Automation Framework

[![Java CI with Maven & Cucumber](https://github.com/<your-username>/<your-repo-name>/actions/workflows/maven.yml/badge.svg)](https://github.com/<your-username>/<your-repo-name>/actions/workflows/maven.yml)

A modern, robust, and comprehensive test automation framework built with **Java**, **Cucumber (BDD)**, and **Selenium WebDriver** for end-to-end testing of web applications. 

This repository is designed using the **Page Object Model (POM)** pattern to demonstrate clean, maintainable, and scalable automation code.

---

## 🎯 Target Application under Test

The automated test suite is configured to test the following web application:
*   **Target Website:** 🌐 [Guru99 NewTours Demo](https://demo.guru99.com/test/newtours/index.php)
*   **Scope of Testing:**
    *   🔐 **Authentication Flow:** End-to-end user sign-in validation.
    *   ✈️ **Flight Booking Flow:** Dynamic searching and booking configuration for flights.

---

## 📋 Table of Contents

*   [🚀 Features](#-features)
*   [🛠️ Technologies Used](#-technologies-used)
*   [💻 Prerequisites](#-prerequisites)
*   [⚙️ Installation & Setup](#-installation--setup)
*   [📂 Project Structure](#-project-structure)
*   [🏃 Running the Tests](#-running-the-tests)
*   [📊 Viewing Test Reports](#-viewing-test-reports)
*   [🔒 Best Practices & Security](#-best-practices--security)

---

## 🚀 Features

*   **Behavior-Driven Development (BDD):** Scenarios written in plain-text Gherkin syntax for business-readable specifications.
*   **Page Object Model (POM):** Enhances test maintenance and reduces code duplication.
*   **Automated Driver Management:** Leverages Selenium 4's built-in **Selenium Manager** to dynamically handle binaries for Chrome and Firefox (no external configuration or driver files needed).
*   **Parameterization & Parallel Readiness:** Configured with TestNG for structured execution and customizable XML suites.
*   **Comprehensive Reporting:** Automatically generates detailed, interactive HTML reports.

---

## 🛠️ Technologies Used

*   **Language:** Java 17 ☕
*   **Automation Library:** Selenium WebDriver (v4+) 🌐
*   **BDD Framework:** Cucumber JVM 🥒
*   **Test Runner:** TestNG 🧪
*   **Build Tool:** Maven 📦
*   **Driver Management:** Selenium Manager (Built-in) ⚡

---

## 💻 Prerequisites

Before running the project, make sure you have the following installed:

*   **Java JDK 17** or higher
*   **Apache Maven 3.6+**
*   **Google Chrome** and/or **Firefox** browsers installed locally
*   An IDE (e.g., **IntelliJ IDEA**) with the following plugins:
    *   *Cucumber for Java*
    *   *Gherkin*
    *   *TestNG*

---

## ⚙️ Installation & Setup

1.  **Clone the Repository**
    ```bash
    git clone <repository-url>
    cd cucumber-web
    ```

2.  **Import to your IDE**
    *   Open your IDE and select **Open/Import**.
    *   Select the `cucumber-web` directory.
    *   Allow Maven to automatically import all dependencies declared in [pom.xml](file:///Users/matiastartara/Documents/IdeaProjects/web/cucumber-web/pom.xml).

---

## 📂 Project Structure

```
cucumber-web/
├── src/
│   ├── main/java/
│   │   ├── pages/              # Page Object Model (POM) classes
│   │   │   ├── BasePage.java
│   │   │   ├── HomePage.java
│   │   │   ├── FlightPage.java
│   │   │   ├── SignPage.java
│   │   │   └── NavigationBarPage.java
│   │   └── utils/              # Driver initialization & configurations
│   │       └── Driver.java
│   └── test/java/
│       ├── steps/              # Step definitions (Glue code)
│       │   ├── BaseStep.java
│       │   ├── LoginStep.java
│       │   └── SearchFlightStep.java
│       ├── test/
│       │   └── TestRunner.java  # Cucumber Test Runner
│       └── resources/
│           └── features/       # BDD Gherkin Feature Files
│               ├── Login.feature
│               └── SearchFlight.feature
├── pom.xml                     # Maven dependencies & configurations
└── README.md                   # Project documentation
```

---

## 🏃 Running the Tests

### 💡 Option A: Running from Terminal (Recommended)

You can run the entire test suite using Maven:

```bash
# Run all tests and generate reports
mvn verify

# Run specific test suites (using TestNG configuration files)
mvn test -Dsuite=allTests
```

### 💡 Option B: Running from IntelliJ IDEA

1. Expand `src/test/java/suite/` in the Project explorer.
2. Right-click on any of the XML suite configuration files:
   *   `allTests.xml`
   *   `loginTest.xml`
   *   `searchFlightTest.xml`
3. Click **Run '<suite-name>.xml'**.

---

## 📊 Viewing Test Reports

### 📑 Cucumber HTML Plugin Report
After running the tests via terminal (`mvn verify`), an interactive HTML report is generated. You can find it at:
```
target/cucumber-report-html/cucumber-html-reports/All.html
```

### 📑 Local Single-Page Report
If executing tests directly via TestNG in your IDE, the output report is generated in the root directory:
*   [cucumberReport.html](file:///Users/matiastartara/Documents/IdeaProjects/web/cucumber-web/cucumberReport.html)

---

## 🔒 Best Practices & Security

*   **No Hardcoded Secret Credentials:** All scenarios use dummy/sandbox accounts provided by the Guru99 training environment. For actual production environments, secrets should be injected via environment variables or a `.env` file (not checked into Git).

