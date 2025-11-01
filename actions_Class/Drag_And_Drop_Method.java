package actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		
		WebElement selenium = driver.findElement(By.id("node"));
		WebElement dropArea = driver.findElement(By.id("droparea"));
		
		Actions action = new Actions(driver);
		
		action.scrollToElement(selenium).perform();
		Thread.sleep(2000);
		action.dragAndDrop(selenium, dropArea).perform();
		
		WebElement sLogo = driver.findElement(By.id("angular"));
		action.dragAndDrop(sLogo, dropArea).perform();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
