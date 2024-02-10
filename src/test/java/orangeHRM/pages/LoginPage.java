package orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//
	@FindBy(name="username")
	public static WebElement USERNAME;
	
	@FindBy(name="password")
	public static WebElement PASSWORD;
	
	@FindBy(tagName ="button")
	public static WebElement LOGIN;


}
