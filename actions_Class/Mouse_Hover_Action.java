package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_Action {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement fashion = driver.findElement(By.xpath("//span[text() = 'Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(fashion).perform();
		Thread.sleep(2000);
		
		WebElement watches = driver.findElement(By.linkText("Watches and Accessories"));
		action.moveToElement(watches).perform();
		Thread.sleep(2000);
		
		WebElement wallets = driver.findElement(By.xpath("(//a[text()='Wallets'])[2]"));
		action.moveToElement(wallets).perform();
		Thread.sleep(2000);
		
		action.click().perform();
		

	}

}
