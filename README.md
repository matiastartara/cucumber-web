**Prerequisites**

Java 11 installed

Intellij Idea + TestNG plugin + Cucumber for java plugin

Google Chrome and Firefox browsers


**Installation**

1-Clone repository

2-Open project and import maven dependencies. Webdrivermanager helps to
download executables automatically.


**Test Execution**

To run the tests select allTests.xml file under suite folder, right
click and then click on run. To run using maven run mvn verify

**Report**

Report is saved as html format under
target/cucumber-report-html/cucumber-html-reports/All.html folder if you
run the tests using "maven verify" comand

To see report using allTest.xml file check src/cucumberReport.html