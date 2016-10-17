

# Confluence - Automated tests
This is  automated test suite developed in order to test some features of Atlassian Confluence.
The tests are written in Selenium webdriver, cucumber and maven.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for  testing purposes.

### Prerequisities
This project has to be configured in a JAVA development environment in Windows or Mac.

1. Install Java JDK 1.8 and setup the environment
2. Install Apache Maven
3. Instal Git using Git Extentions
4. Install a Java IDE - Eclipse
5. Install Maven plugin for your IDE
6. Install Junit plugin if you still don't have it
7. Install Sourcetree and git
8. Install Firefox ESR


### Installing

1. Clone the project from Bitbucket into your local machine

2. Open your IDE and import your project as Maven project
  1. Click on File>Import>git>project from git>Existing local repository
  2. Click on Add
  3. Brose the local git repository where you cloned the project previously.
  4. Select the git project file and finish the wizard.
  5. Eclipe will import the project into your workspace

3. Run Maven and install your dependancies
  1. Select the POM.xml, then do right click
  2. On the menu, select run as "maven install"
  3. Wait until maven download all the dependancies to your local machine.
  4. Check if there is any error with the  dependancies downloaded you shouldn´t get any. 
  
4. Execute the runner class
  1. Open the project in Eclipse
  2. Go to src/test/java/com/atlassian/confluence/RunTestsCukes.java
  3. Select the class RunTestsCukes.java
  4. Right click>Run as Junit tests

### Running the tests

1. Edit config.properties (Change confluence URL, adminuser and password) if needed.
2. Select the class RunTestsCukes.java
3. Right click>Run as Junit tests
4. Wait while the browser opens up and start running the tests
5. Once the test finishes, Junit will display the results.
6. Cucumber generates all the scenarios executed in a web page
  * Go to this path: target/cucumber/index.html
  * Open the file index.html to see the results
  

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
