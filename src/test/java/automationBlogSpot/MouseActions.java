package automationBlogSpot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void mouseHover() {

	}

	@Test(priority = 2)
	public void doubleClick() {

	}

	@Test
	public void dragAndDrop() {

	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
