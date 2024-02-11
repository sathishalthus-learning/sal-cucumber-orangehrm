package orangeHRM.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="@target/failed_scenarios.txt" 
		,glue={"orangeHRM"}
//		,tags = "@login"
//		,publish=true
		,monochrome=true
				)
public class Junit4TestReRun {

} 
