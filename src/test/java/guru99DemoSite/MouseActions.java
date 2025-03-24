package guru99DemoSite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void contextClick() {
		Actions act = new Actions(driver); // Actions Class
		WebElement contextClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		WebElement cut = driver.findElement(By.xpath("//span[normalize-space()='Cut']"));
		act.contextClick(contextClick).perform();
		cut.click();
		Alert cutAlert = driver.switchTo().alert();
		String message = cutAlert.getText();
		cutAlert.accept();
		System.out.println(message);

	}

	@Test(priority = 2)
	public void doubleClick() {
		Actions act = new Actions(driver);
		WebElement doubleClick = driver
				.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClick).perform();
		Alert dcAlert = driver.switchTo().alert();
		System.out.println(dcAlert.getText());
		dcAlert.accept();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
