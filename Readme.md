

# Confluence automated tests
This is  automated test suite designed in order to test some features of Confluence (Atlassian).
The tests are developed in Selenium webdriver, cucumber and maven.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for  testing purposes. See deployment for notes pn how tp run the tests.

### Prerequisities
This project has to be configured in a JAva development environment in Windows or Mac.
1. Setup Java JDK 
2. Setup Apache Maven
3. Setup Git using Git Extentions
4. Setup a Java IDE, Netbeans or Eclipse
5. Install Maven plugin for your IDE
6.) Install Junit plugin if you still don't have it in your IDE
7.) Install Sourcetree and git

### Installing

1. Clone the project from Bitbucket into your local machine

2. Open your IDE and import your project as Maven project
  2.1) Click on File>Import>maven>Existing Magen project
  2.2)Browse the location where you cloned the project previously
  2.2) Selec the POM.xml file and finish

3.) Run Maven and install your dependancies
  3.1)Select the POM file and do right click
  3.2)On the menu, select run as "maven install"
  3.3) Wait until maven download all the dependancies to your local machine.
  
4.) Execute the runner class
 4.1) Select the class RunTestsCukes.java
 4.2)Right click>Run as Junit tests

## Running the tests

1.) Edit config.properties (Change confluence URL, adminuser and password) if needed 
1) Select the class RunTestsCukes.java
2)Right click>Run as Junit tests

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```
### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Built With

* [Selenium Webdriver v2.53]
* [Junit v4.12]
* [Maven v1.8]
* [JAVA v1.8]
* [Cucumber v1.2.5]

## Authors

* **Esteban Balvin** 
estebillan@gmail.com
