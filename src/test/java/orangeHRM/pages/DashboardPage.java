package orangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import orangeHRM.helpers.CommonUtils;

public class DashboardPage {
	//
	public static DashboardPage DashboardPageInstance;

	//
	private DashboardPage() {
	}

	//
	public static DashboardPage getInstance() {
		if (DashboardPageInstance == null) {
			DashboardPageInstance = new DashboardPage();
		}
		return DashboardPageInstance;
	}

	//
	@FindBy(className = "oxd-text--h6")
	private WebElement HEADER;
	//
	@FindBy(linkText = "Directory")
	private WebElement DIRECTORY;
	//
	@FindBy(linkText = "PIM")
	private WebElement PIM;
	
	public String getHeaderText() {
		//
		return HEADER.getText();
	}
	
	public void selectDirectory() {
		CommonUtils.highlightElement(DIRECTORY);
		DIRECTORY.click();
	}
}
