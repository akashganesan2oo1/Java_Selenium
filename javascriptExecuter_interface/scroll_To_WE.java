package javascriptExecuter_interface;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_To_WE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(2000);
		
		//typecast the driver into javascriptExecuter interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//find the web element
		WebElement chennai = driver.findElement(By.xpath("//h5[text() = 'Chennai Restaurants']"));
		
		//scroll to element (true)----> Top of web page
		js.executeScript("arguments[0].scrollIntoView(true)", chennai);
		Thread.sleep(2000);
		
		//scroll to element (false)-----> Bottom of web page
		js.executeScript("arguments[0].scrollIntoView(false)", chennai);
		
		driver.quit();

	}

}
