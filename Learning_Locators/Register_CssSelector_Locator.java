package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_CssSelector_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id = 'gender-male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id = 'FirstName']")).sendKeys("Akash");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id = 'LastName']")).sendKeys("G");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name= 'Email']")).sendKeys("akashganesan2001@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name= 'Password']")).sendKeys("Akash@2001");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name= 'ConfirmPassword']")).sendKeys("Akash@2001");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[value= 'Register']")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
