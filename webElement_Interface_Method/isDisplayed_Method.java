package webElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Finding Gender(optional) TF
		WebElement gender = driver.findElement(By.id("custom_gender"));
		
		//Checking, is it visible
		System.out.println(gender.isDisplayed());
		
		//Clicking on custom radio button
		driver.findElement(By.xpath("//input[@value = '-1']")).click();
		
		//Checking, is it visible
		System.out.println(gender.isDisplayed());
		
		driver.quit();
		
	}

}
