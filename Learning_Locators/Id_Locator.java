package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Find the location of email Text Field
		By id = By.id("email");
		
		//Find the web element based on the location
		WebElement emailTF = driver.findElement(id);
		
		//Enter data into the email text field
		emailTF.sendKeys("akashganesan2001@gmail.com");
		
		By id2 = By.id("pass");
		WebElement passwordTF = driver.findElement(id2);
		passwordTF.sendKeys("Akash@2001");
		
		driver.quit();


	}

}
