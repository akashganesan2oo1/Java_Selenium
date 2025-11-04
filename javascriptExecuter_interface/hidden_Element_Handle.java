package javascriptExecuter_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_Element_Handle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//typecast the driver into javascriptExecuter
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//find the webElement
		WebElement element = driver.findElement(By.id("custom_gender"));
		
		//call the method
		js.executeScript("arguments[0].value ='Lesbian'", element);
		
		driver.quit();

	}

}
