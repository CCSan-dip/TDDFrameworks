package TestRunner;

import BaseLayer.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"AllFeatureFiles/Register.feature"},
		glue= {"StepDefination"},
		dryRun=true,
		monochrome=true
		
		)
public class RegisterRunner extends AbstractTestNGCucumberTests {
	
	
	
}
