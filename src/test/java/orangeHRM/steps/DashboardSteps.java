package orangeHRM.steps;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class DashboardSteps {
	//
	WebDriver driver = new ChromeDriver();

	@Given("logged into application")
	public void logged_into_application() {
		//
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}

	@When("select {string} from menu")
	public void select_from_menu(String menutab) {
		// 
		//driver.findElement(By.className("oxd-topbar-header-hamburger")).click();
		driver.findElement(By.linkText(menutab)).click();
	}

	@Then("verify {string} of app")
	public void verify_of_app(String heading) {
		// 
		String headerText = driver.findElement(By.className("oxd-text--h6")).getText();
		Assertions.assertEquals(headerText,heading);
		driver.quit();
	}

}
