package automationBlogSpot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
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
		Actions act = new Actions(driver);
		WebElement pointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='Laptops']"));
		act.moveToElement(pointMe).moveToElement(laptop).click().perform();
		Assert.assertTrue(true);
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
