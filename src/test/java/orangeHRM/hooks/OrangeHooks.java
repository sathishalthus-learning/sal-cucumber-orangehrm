package orangeHRM.hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import orangeHRM.drivers.WebDriverFactory;
import orangeHRM.helpers.CommonUtils;

public class OrangeHooks {
	//
	WebDriver driver;

	//
	@BeforeAll
	public static void beforeAllScenario() {
		System.out.println("before-all-scenario");
		CommonUtils.loadProperties();
	}

	@Before
	public void beforeEachScenario() {
		System.out.println("before-each-scenario");
		if (WebDriverFactory.webDriver == null) {
			driver = WebDriverFactory.createWebDriver();
		}
		CommonUtils.initPages();
	}

	@BeforeStep
	public void beforeEachStep() {
		System.out.println("before-each-step");
	}

	@AfterStep
	public void afterEachStep() {
		System.out.println("after-each-scenario");
	}

	@After
	public void afterEachScenario() {
		System.out.println("after-each-scenario");
		driver.quit();
	}

	@AfterAll
	public static void afterAllScenario() {
		System.out.println("after-all-scenario");
	}

}
