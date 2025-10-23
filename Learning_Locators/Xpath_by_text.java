package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		WebElement element = driver.findElement(By.xpath("//h1[text()='Register']"));
		
		if (element.isDisplayed()) {
			System.out.println("PASS -> Register page displayed successfully");
			driver.findElement(By.xpath("//input[@name='Gender'])[2]")).click();
			driver.findElement(By.xpath("//input[@type='text'])[3]")).sendKeys("Monica");
			driver.findElement(By.xpath("//input[@type='text'])[4]")).sendKeys("shoubin");
			driver.findElement(By.xpath("//input[@type='text'])[5]")).sendKeys("monica@shoubin.coolie");
			driver.findElement(By.xpath("//input[@type='password'])[1]")).sendKeys("Monica123");
			driver.findElement(By.xpath("//input[@type='password'])[2]")).sendKeys("Monica123");
			
		} else {
			System.out.println("FAIL -> Register page not displayed");

		}
	}

}
