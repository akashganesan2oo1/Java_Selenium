package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_SendKeys_Method {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement searchTF = driver.findElement(By.name("q"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@value = 'Search']"));
		
//		Create an Object for Actions Class
		Actions action = new Actions(driver);
		
//		call the method and perform action
		action.sendKeys(searchTF, "laptop").perform();
		
		action.click(searchButton).build().perform(); //click on search button
		
		Thread.sleep(2000);
		driver.quit();    

	}

}
