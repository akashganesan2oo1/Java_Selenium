package javascriptExecuter_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled_Element_Handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text() = 'Disabled']")).click();
		
		//typecast the driver into javascriptExecuter
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//find web Element
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("password"));
		
//		call the method
		js.executeScript("arguments[0].value = 'Akash'", name);
		js.executeScript("arguments[0].value = 'akashganesan@gmail.com'", email);
		js.executeScript("arguments[0].value = 'Admin@123'", password);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		driver.quit();

	}

}
