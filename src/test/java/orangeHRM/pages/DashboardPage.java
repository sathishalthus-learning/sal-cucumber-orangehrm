package orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage {
	//
	@FindBy(className = "oxd-text--h6")
	public static WebElement HEADER;
	//
	@FindBy(linkText = "Directory")
	public static WebElement DIRECTORY;
	//
	@FindBy(linkText = "PIM")
	public static WebElement PIM;
}
