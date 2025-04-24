package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = "stepdefs",
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json",
                "junit:target/cucumber.xml"},
        monochrome = true)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
