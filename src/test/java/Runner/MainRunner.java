package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * 
 * @author Vishal Lad
 * @Description In this class we can run the feature file using testng & junit
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/Featurefile/"},
		glue={"StepDefinition"},
		plugin={"html:Cucumber-Reports/cucumber-html-report"}
		)

//To run file with TestNG extends AbstractTestNGCucumberTests
public class MainRunner {




}

