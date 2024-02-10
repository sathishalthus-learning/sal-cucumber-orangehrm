package orangeHRM.drivers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import orangeHRM.helpers.Constants;

public class WebDriverFactory {
	//
	public static WebDriver webDriver=null;
	private static final Logger LOGGER = LogManager.getLogger(WebDriverFactory.class);
	//
	public static WebDriver createWebDriver() {
		switch(Constants.BROWSERNAME) {
		case "chrome":
			webDriver = new ChromeDriver();
			LOGGER.info("chrome initialized");
			break;
		 default :
				webDriver = new EdgeDriver();
				LOGGER.info("edge initialized");
				break;
		}
		return webDriver;
	}
}
