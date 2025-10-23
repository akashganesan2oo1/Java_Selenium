package webElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		//Find the login button
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		//check button is enabled or disabled
		System.out.println(login.isEnabled());
		
		//Enter email and password
		driver.findElement(By.name("username")).sendKeys("akashganesan2001");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		//check button is enabled or disabled
		System.out.println(login.isEnabled());
		
		driver.quit();


	}

}
