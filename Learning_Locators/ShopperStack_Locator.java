package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStack_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(20000);
		driver.findElement(By.name("loginBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[id= 'Create Account']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[name = 'First Name']")).sendKeys(	"Krishna");
		Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[id= 'Last Name']")).sendKeys("Kumar");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("input[id= 'Male']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("Phone Number")).sendKeys("9360399962");
	    Thread.sleep(1000);
	    driver.findElement(By.name("Email Address")).sendKeys("coderkrishna@gmail.com");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("[minlenght= '8']")).sendKeys("Admin@123");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("[id= 'Confirm Password']")).sendKeys("Admin@123");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("[type= 'checkbox']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.className("signup_bn5__l1dQe")).click();
	    Thread.sleep(1000);
	    
	    driver.quit();
		
	}

}
