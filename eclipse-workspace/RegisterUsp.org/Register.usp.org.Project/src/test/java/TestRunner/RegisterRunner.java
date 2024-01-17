package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"StepDefination"},
		dryRun=true,
		monochrome=true,
		plugin= {
				"html:Reports/abc.html",
				"json:Reports/abd.html",
				"junit:Reports/abe.html",
				"pretty:Reports/abf.html"
		}
		
		
		
		
		
		
		)
public class RegisterRunner {

}
