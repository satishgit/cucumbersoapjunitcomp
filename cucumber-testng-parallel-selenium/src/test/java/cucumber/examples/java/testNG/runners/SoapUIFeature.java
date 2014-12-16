package cucumber.examples.java.testNG.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "target/test-classes/features/soapui_feature",
        glue = {"cucumber.examples.java.testNG.stepDefinitions"},
        format = {"pretty",
                "html:target/cucumber-report/SoapUIFeature",
                "json:target/cucumber-report/SoapUIFeature/cucumber.json",
                "junit:target/cucumber-report/SoapUIFeature/cucumber.xml"})
public class SoapUIFeature extends AbstractTestNGCucumberTests {
}