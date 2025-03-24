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
		Actions act = new Actions(driver);
		WebElement inputBox1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement inputBox2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copyButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		inputBox1.clear();
		inputBox1.sendKeys("Moneky D Luffy");

		act.doubleClick(copyButton).perform();
		String text = inputBox2.getAttribute("value"); // To get the text in the input filed.
		System.out.println(text);
		if (text == "Moneky D Luffy") {
			Assert.assertTrue(true);
		} else {
			System.out.println("Plese check the value attribute");
		}

	}

	@Test(priority = 3)
	public void dragAndDrop() {
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(source, destination).perform();
		System.out.println(driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText());
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
