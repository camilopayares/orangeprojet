package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_steps {
	private WebDriver driver;
	@Before
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@After
	public void teardown(){
		driver.quit();
	}
	public WebDriver getDriver() {
		return driver;
	}
}
