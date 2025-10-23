package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    
	    driver.findElement(By.cssSelector("[id = 'email']")).sendKeys("ram@gmail.com");
	    driver.findElement(By.cssSelector("[class = 'inputtext _55r1 _6luy _9npi']")).sendKeys("ram@123");
	    driver.findElement(By.cssSelector("[name = 'login']" )).click();

	}

}
