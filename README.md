# Acceptance testing with FitNesse (Examples)
Testing examples described in beginner FitNesse tutorial [https://www.softwaretestingclass.com/introduction-to-fitnesse-testing-tool-tutorial-for-beginners/](https://www.softwaretestingclass.com/introduction-to-fitnesse-testing-tool-tutorial-for-beginners/) as part of project created using InteliJ IDE and Java
==========================================================

## What is FitNesse

Lightweight opensource software for acceptance testing. Acceptance testing is black-box functional testing that ensures that system under test meets stakeholders' requirements. The main goal of performing this type of tests is not to identify errors in the code but to verify that given a certain input the result matches what is expected.
It is also a tool for collaboration, as it is regularly used by QA experts, developers, clients, support teams, team managers and so on. FitNesse is a wiki webserver that requires no configuration and provides readable test results. Users basically create web pages where tables are used to provide input data and perform tests in order to compare actual results with expected.

- **provides early feedback**
- **tests can be run anytime by anyone as they are hosted on a server**
- **tests are deterministic (they either pass and are green or fail and are red), the more tests pass the closer the system is meeting stakeholders' requirements**
- **FitNesse increases business value of a product**

## Description of methods in BaseTestCase class

 - Variables for **driver**, **URL** to be tested, **wait driver** and **soft assert** object are created.
 - Variables for **username** and **password** are created and initialized.
 - Declared of **setup** method called before the fist test is executed.
 - **Setup** method initializes **driver**, **baseUrl** and **wait** variables.
 - Declared **open** test method that uses the driver to open specified web browser.
 - Declared **inputUsername** test method that sends input data to username text input element in login form.
 - Declared **inputPassword** test method that sends input data to password text input element in login form.
 - Declared **login** test method that submits entered data.
 - Declared **terminateBrowser** test method executed after all tests in the class are finished. This method uses the driver to close open browser.

## Running FitNesse server

- In order to run FitNesse server the jar file ([http://fitnesse.org/FitNesseDownload](http://fitnesse.org/FitNesseDownload)) can be downloaded to our system after which the following command can be used `java –jar fitnesse-standalone.jar –p 80`. We can then access the server at [http://localhost:80/](http://localhost:80/).
- FitNesse wiki frontend can also be used as a part of a project in InteliJ by adding corresponding maven dependencies and properties, create a profile with id value **fitnesse** and add **maven-antrun-plugin** in **pom.xml** file. To easily execute the configuration added with the plugin while using corresponding profile, maven run configuration is added to the project by using `-Pfitnesse test` command.   Process is explained in detail here [https://www.youtube.com/watch?v=u-zbm5xVTvM](https://www.youtube.com/watch?v=u-zbm5xVTvM).

