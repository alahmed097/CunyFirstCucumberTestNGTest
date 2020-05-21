package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//feature is the path of the feature files
		features = "/Users/AliAhmed/eclipse-workspace/CunyFirstCucumberTestNGTest/src/main/java/features/login.feature"
		,glue= {"stepDefinations"}, //the path of the step defination file
		//format is to generate different type of reporting 
		format = {"pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, // 
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false // to check the mapping is proper between feature file and step definition file
		)

public class TestRunner {

	
	
	
}
