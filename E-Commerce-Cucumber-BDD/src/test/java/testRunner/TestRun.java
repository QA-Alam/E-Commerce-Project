package testRunner;



import org.junit.After;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;



        @RunWith(Cucumber.class)
        @CucumberOptions
		(
				
						features= {".//Features/"},
						glue="stepDefinitions",
						dryRun=false,
						monochrome=true,
						//plugin= {"pretty","html:test-output"},
						plugin= {"pretty","json:target/cucumber-reports/cucumber.json"},
						
						tags= {"@sanity, @regression"}
						)
        public class TestRun {
        	
        	WebDriver driver;
       @After
       public void tearDown(Scenario scenario) {
       if (scenario.isFailed()) {
      // Take a screenshot...
      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
      scenario.embed(screenshot, "image/png"); // ... and embed it in the report.
    }}}


