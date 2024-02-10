package orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	//
	private static LoginPage LoginPageInstance;

	//
	private LoginPage() {
	}

	//
	public static LoginPage getInstance() {
		if (LoginPageInstance == null) {
			LoginPageInstance = new LoginPage();
		}
		return LoginPageInstance;
	}

	//
	@FindBy(name = "username")
	public static WebElement USERNAME;

	@FindBy(name = "password")
	public static WebElement PASSWORD;

	@FindBy(tagName = "button")
	public static WebElement LOGIN;

}
