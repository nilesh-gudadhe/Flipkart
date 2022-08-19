package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "src/test/resources/BusinessLogic",
		tags="@SmokeTest",
		monochrome=true,
		plugin="pretty",
		dryRun=false,
		glue="cucumbermap"
		
		
		)
public class RunTest {

}
