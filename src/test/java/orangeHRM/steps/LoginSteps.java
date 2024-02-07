package orangeHRM.steps;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import 

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class LoginSteps {
	
	WebDriver driver= new ChromeDriver();
	
	@Given("navigated to login page")
	public void navigated_to_login_page() {
	    // 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("provides valid credentials {string} and {string}")
	public void provides_valid_credentials_and(String username, String password) {
	    // 
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.tagName("button")).click();
	}

	@Then("verify {string} is displayed")
	public void verify_is_displayed(String heading) {
	    // 
		String headerText = driver.findElement(By.tagName("h6")).getText();
		Assert.assertEquals(headerText, heading);
		driver.quit();
	}
}
