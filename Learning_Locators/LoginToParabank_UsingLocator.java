package Learning_Locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LoginToParabank_UsingLocator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=42C357638BF7F46A06FFBF5BC6A1BCEE");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		WebElement element = driver.findElement(By.xpath("//h1[text()= 'Signing up is easy!']"));
		if (element.isDisplayed()) {
			System.out.println("Test Case PASS--> Register page displayed");
			driver.findElement(By.xpath("//input[@name='customer.firstName']")).sendKeys("Dhanushree");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='customer.lastName']")).sendKeys("G");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Qspider vadapalani");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("Chennai");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Tamil Nadu");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@id ,'customer.address.zipCode')]")).sendKeys("600019");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[contains(@name,'customer.phoneNumber')]")).sendKeys("7708151912");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[contains(@class,'input')])[10]")).sendKeys("123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("akashganesan1906@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("akash@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("akash@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./src/test/resources/screenshots/parabnk.img");
			FileHandler.copy(source, destination);
		} else {
			System.out.println("Test Case Failed");
		}
	}

}
