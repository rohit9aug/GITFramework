import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
	}
	@Test
	public void doLogin() throws InterruptedException
	
	{
	
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.name("identifier")).sendKeys("ansh.sds@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Hello@");
		Thread.sleep(3000);
		
	}
	@AfterSuite
	public void tearDown() {
		driver.close();
		//			
	}

}
