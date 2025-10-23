package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("ram@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ram@123");
		driver.findElement(By.className("_aswr")).click();
	}

}
