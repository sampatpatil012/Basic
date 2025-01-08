package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"src/test/java/FeatureFiles"},
		glue = {"step_Definition","hooks"},
		monochrome = true,
		dryRun=false

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
