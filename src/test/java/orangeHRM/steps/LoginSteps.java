package orangeHRM.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import orangeHRM.drivers.WebDriverFactory;
import orangeHRM.helpers.Constants;
import orangeHRM.pages.DashboardPage;
import orangeHRM.pages.LoginPage;

public class LoginSteps {

	WebDriver driver = WebDriverFactory.webDriver;

	@Given("navigated to login page")
	public void navigated_to_login_page() {
		//
		driver.get(Constants.APPURL);
	}

	@When("provides valid credentials {string} and {string}")
	public void provides_valid_credentials_and(String username, String password) {
		//
		LoginPage.getInstance().loginAsValidUser(username, password);
	}

	@Then("verify {string} is displayed")
	public void verify_is_displayed(String heading) {
		//
//		String headerText = driver.findElement(By.tagName("h6")).getText();
		String headerText = DashboardPage.getInstance().getHeaderText();
		System.out.println(headerText);
	}
}
