package orangeHRM.steps;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import orangeHRM.helpers.Constants;
import orangeHRM.pages.DashboardPage;
import orangeHRM.pages.LoginPage;

public class DashboardSteps {
	//
	WebDriver driver = new ChromeDriver();

	@Given("logged into application")
	public void logged_into_application() {
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Constants.APPURL);
		LoginPage.USERNAME.sendKeys("Admin");
		LoginPage.PASSWORD.sendKeys("admin123");
		LoginPage.LOGIN.click();
	}

	@When("select {string} from menu")
	public void select_from_menu(String menutab) {
		// 
		DashboardPage.menuTab.click();
	}

	@Then("verify {string} of app")
	public void verify_of_app(String heading) {
		// 
		String headerText = driver.findElement(By.className("oxd-text--h6")).getText();
		Assertions.assertEquals(headerText,heading);
		driver.quit();
	}

}
