package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= { "AllFeatureFiles/Register.feature" },
		glue= { "StepDefination" },
		dryRun= true,
		monochrome=true,
		plugin= {
				"html:Reports/Cds.html",
				"json:Reports/Cds.json",
				"junit:Reports/Cds.xml",
				"pretty:Reports/Cds.txt"
			}	
		)
public class RegisterRunner extends AbstractTestNGCucumberTests {

}
