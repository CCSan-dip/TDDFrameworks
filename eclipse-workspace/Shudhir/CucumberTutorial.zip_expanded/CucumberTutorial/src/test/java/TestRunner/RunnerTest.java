package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFiles/guru99.feature"},
		glue= {"Steps"},
		dryRun=false,  // it is used to check mapping between feature file step vs implemented steps inside the Step Definitions class
		monochrome=true, //it used to display the output console in proper readable format
		plugin= {
				"html:Reports/abc1.html",
				"json:Reports/abc2.json",
				"junit:Reports/abc3.xml",
				"pretty:Reports/abc4.txt"}
		)
public class RunnerTest {

}
