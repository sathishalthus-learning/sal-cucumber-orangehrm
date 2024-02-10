package orangeHRM.helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import orangeHRM.drivers.WebDriverFactory;
import orangeHRM.pages.DashboardPage;
import orangeHRM.pages.LoginPage;

public class CommonUtils {
	//
	private static final Logger LOGGER = LogManager.getLogger(CommonUtils.class);
	//
	public static void loadProperties() {
		//
		FileReader reader = null;
		LOGGER.info("File Reader Started");
		try {
			reader = new FileReader("src/test/resources/properties/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties properties = new Properties();
		
		try {
			properties.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Constants.APPURL = properties.getProperty("url");
		Constants.BROWSERNAME = properties.getProperty("browser");
	}
	
	public static void initPages() {
		PageFactory.initElements(WebDriverFactory.webDriver, LoginPage.getInstance());
		PageFactory.initElements(WebDriverFactory.webDriver, DashboardPage.getInstance());
	}

	public static void highlightElement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)WebDriverFactory.webDriver;
		executor.executeScript("arguments[0].setAttribute('style','border:2px solid blue');", element);
	}
}
