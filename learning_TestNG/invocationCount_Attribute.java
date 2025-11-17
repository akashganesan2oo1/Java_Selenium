package learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationCount_Attribute {
	
	@Test(invocationCount = 4)
	public void loginTest() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("eren.yegar@aot.com");
		driver.findElement(By.id("Password")).sendKeys("Freedom");
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
