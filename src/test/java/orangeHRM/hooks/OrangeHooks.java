package orangeHRM.hooks;

import java.time.Duration;

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
	public static WebDriver driver;

	//
	@BeforeAll
	public static void beforeAllScenario() {
		System.out.println("BeforeAllScenario - loading properties");
		CommonUtils.loadProperties();
	}

	@Before
	public void beforeEachScenario() {
		//
		System.out.println("BeforeScenario - creating driver");
//		if (WebDriverFactory.webDriver == null) {
			driver = WebDriverFactory.createWebDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		}
		CommonUtils.initPages();
	}

	@BeforeStep
	public void beforeEachStep() {
//		System.out.println("before-each-step");
	}

	@AfterStep
	public void afterEachStep() {
//		System.out.println("after-each-step");
	}

	@After
	public void afterEachScenario() {
		System.out.println("AfterScenario - quitting driver");
//		driver.close();
		driver.quit();
	}

	@AfterAll
	public static void afterAllScenario() {
		System.out.println("AfterAllScenario - nothing");
	}

}
