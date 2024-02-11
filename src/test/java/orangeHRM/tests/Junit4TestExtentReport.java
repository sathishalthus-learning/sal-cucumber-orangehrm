package orangeHRM.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features", 
		glue={"orangeHRM"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
//		,tags = "@login"
//		,publish=true
//		,monochrome=true
				)
public class Junit4TestExtentReport {

}
