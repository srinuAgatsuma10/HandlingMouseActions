package tutorialsPoint;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandlingMouseActions {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void clickOperation() {

	}

	@Test(priority = 2)
	public void contextClickOperation() {

	}

	@Test(priority = 3)
	public void DoubleclickOperation() {

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
