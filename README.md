# Test Automation

Test automation using Selenium with Java programming language + Cucumber.

## Getting Started

To install this project on your locally, you need to clone repository following this script :

```shell
#git clone https://gitlab.com/telecats/manual-transcription-tool.git
#cd manual-transcription-tool/mtt-automation
```

## Requirement

You will need this tools :

* [Java 15](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)
* [IntelliJ](https://www.jetbrains.com/idea/download/)
* IntelliJ IDEA Plugin :  [Cucumber for Java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java)
* IntelliJ IDEA Plugin : [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin)
* [Chromedriver](https://chromedriver.chromium.org/downloads)
  or [Geckodriver](https://github.com/mozilla/geckodriver/releases)
* [Maven](https://github.com/mozilla/geckodriver/releases)

## Running Automation through Maven
* Open terminal
* Type this script on your terminal

```shell
mvn clean verify
```
* For showing allure report, type this on your terminal
```shell
allure serve allure-results
```

## Running Automation through TestRunner

* Open file TestRunner.java
* And Select run Test Runner
