package mailTravelRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//features",
        glue = { "mailTravelStepDefinitions" },
        plugin = { "pretty", "html:test-output", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        monochrome = true
)

public class TestRunner {

}
