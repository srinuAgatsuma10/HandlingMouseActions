package internetHerokuApp;

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

public class ContextCLickOpeation {

	WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
	}

	@Test
	public void contextClick() {
		// Initialize Action Class
		Actions act = new Actions(driver);
		WebElement contextBox = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		act.contextClick(contextBox);

		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
