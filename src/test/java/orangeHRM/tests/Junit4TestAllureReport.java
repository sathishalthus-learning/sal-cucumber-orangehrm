package orangeHRM.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features", 
		glue={"orangeHRM"},
		plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
//		,tags = "@login"
//		,publish=true
//		,monochrome=true
				)
public class Junit4TestAllureReport {

}
