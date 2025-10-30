package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_Down_Action_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement element = driver.findElement(By.xpath("(//input[@value = 'Add to cart'])[1]"));
		Actions action = new Actions(driver);
		action.scrollToElement(element).perform();
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.linkText("Register"));
		action.scrollToElement(element2).perform();
		Thread.sleep(2000);
		
		driver.quit();

	}

}
