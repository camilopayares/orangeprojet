package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common_steps {
	private WebDriver driver;
	@Before
	public void setup() {
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void teardown(){
		driver.quit();
	}
	public WebDriver getDriver() {
		return driver;
	}
}
