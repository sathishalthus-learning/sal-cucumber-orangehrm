package orangeHRM.steps;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import orangeHRM.drivers.WebDriverFactory;
import orangeHRM.helpers.Constants;
import orangeHRM.pages.DashboardPage;
import orangeHRM.pages.LoginPage;

public class DashboardSteps {
	//
	WebDriver driver = WebDriverFactory.webDriver;

	@Given("logged into application {string} and {string}")
	public void logged_into_application_and(String username, String password) {
		//
		driver.get(Constants.APPURL);
		LoginPage.getInstance().loginAsValidUser(username, password);
	}

	@When("select {string} from menu")
	public void select_from_menu(String menutab) {
		//
		DashboardPage.getInstance().selectDirectory();
	}

	@Then("verify {string} of app")
	public void verify_of_app(String heading) {
		//
		String headerText = DashboardPage.getInstance().getHeaderText();
		Assertions.assertEquals(headerText, heading);
	}

}
