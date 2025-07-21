package tutorialsPoint;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		driver.manage().window().maximize();
	}

//	@Test(priority = 1)
	public void clickOperation() {
		Actions act = new Actions(driver);
		WebElement clickBtn = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		act.click(clickBtn);
		String text = driver.findElement(By.xpath("//div[@id='welcomeDiv']")).getText();
		System.out.println(text);
	}

	@Test(priority = 2)
	public void contextClickOperation() {
		Actions act = new Actions(driver);
		WebElement rightClickBtn = driver.findElement(By.xpath("//button[normalize-space()='Right Click Me']"));
		act.contextClick(rightClickBtn);
		String text = driver.findElement(By.xpath("//div[@id='welcomeDiv']")).getText();
		System.out.println(text);
	}

//	@Test(priority = 3)
	public void DoubleclickOperation() {

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
