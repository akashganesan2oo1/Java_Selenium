package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement element1 = driver.findElement(By.xpath("//strong[text() = 'Newsletter']"));
		Actions action = new Actions(driver);
		action.doubleClick(element1).perform(); 
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("//span[contains(text(), 'Sign up')]"));
		action.doubleClick(element2).click().perform();

	}

}
