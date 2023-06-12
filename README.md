# mailTravel-Divya

# selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.

Documentation
-------------
* [Installation](doc/installation.md)

Writing a test
--------------

The cucumber features goes in the `features` library and should have the ".feature" extension.

You can start out by looking at `features/mailTravelBooking.feature`. You can extend this feature or make your own features  that comes with selenium-cucumber.

Predefined steps
-----------------
By using predefined steps you can automate your test cases more quickly, more efficiently and without much coding.

The predefined steps are located [here](doc/canned_steps.md)

Using canned tests in your project
----------------------------------

In your TestRunner class add a glue option:

```
package stepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = {"html:target/cucumberHtmlReport"},
	features = "classpath:features",
	glue = {"info.seleniumcucumber.stepdefinitions"}
)

public class TestRunner {
}
```

# Tools and technologies used:
Language: Java 8
Testing framework: Testng
BDD framework: Cucumber jvm
Automation tool: Selenium webdriver
Build tool: maven
Reporting: cucumber reporting

# Features of the framework
BDD framework using Cucumber-jvm. Feature files can be written easily using Given,When, Then etc.
Screenshot would be taken if any scenario failed and saved under /outputFiles folder.
Html report gets generated after each test run and can be found /test-output/HtmlReport/htmlReport.html

**CommonMethods.java** : It is a common repository for all the webdriver methods which are used in every class present under logic package to perform actions like click, findElement etc. Every new method which is being used in logic classes should be added in this class as well. It is to reduce the duplicate code. Each page class extends this class.

**package: pages :** It has web elements corresponding to the specific page which is used by corressponding logic classes.




