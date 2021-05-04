package Actions;

import org.openqa.selenium.WebDriver;

import Steps.Common_steps;

public class Common_actions {
	private WebDriver driver;
	Common_steps cs;
	public Common_actions(Common_steps cs) {
		this.driver = cs.getDriver();
	}
	public void gotoUrl(String url) {
		driver.get(url);
	}
	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public String getCurrentPageTitle() {
		return driver.getTitle();
	}
	public void quitWebDriver() {
		driver.quit();
	}
}

