package orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import orangeHRM.helpers.CommonUtils;

public class LoginPage {
	//
	public static LoginPage LoginPageInstance;

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
	private WebElement USERNAME;

	@FindBy(name = "password")
	private WebElement PASSWORD;

	@FindBy(tagName = "button")
	private WebElement LOGIN;

	public void loginAsValidUser(String username, String password) {
		//
		USERNAME.sendKeys(username);
		PASSWORD.sendKeys(password);
		CommonUtils.highlightElement(LOGIN);
		LOGIN.click();
	}
}
