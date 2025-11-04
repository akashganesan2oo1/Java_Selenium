package javascriptExecuter_interface;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//Typecast the driver into javascript executer interface
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//call the method
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-100)");

	}

}
