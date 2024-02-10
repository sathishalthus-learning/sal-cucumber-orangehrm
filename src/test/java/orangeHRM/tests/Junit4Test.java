package orangeHRM.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features/Login.feature", 
		glue={"orangeHRM"},
		plugin = {"pretty"})
public class Junit4Test {

}
