package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id= 'email']")).sendKeys("coderkrishna@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder= 'Password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
