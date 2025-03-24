package guru99DemoSite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseActions {

	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void contextClick() {
		
	}
	
	@Test
	public void doubleClick() {
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	
	}
}
