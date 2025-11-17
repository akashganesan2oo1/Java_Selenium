package popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// Fetch the parent window ID   
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);

		driver.findElement(By.xpath("//div[text()='Moto g67 power 5G (Pantone Curacao Blue, 128 GB)']")).click();	

		// Fetch the allIDs

		Set<String> allIDs  = driver.getWindowHandles();

		// Remove the parentID from allIDS
		allIDs.remove(parentID);

		for (String id : allIDs) {

			driver.switchTo().window(id);

			System.out.println(driver.getTitle());
			
			//Create an object for Actions class
			Actions action = new Actions(driver);

			WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
			action.moveToElement(cart).perform();
			cart.click();
			WebElement remove = driver.findElement(By.xpath("//div[text()='Remove']"));
		    
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView(true)", remove);
		
			remove.click();
			
			  // Taking Screenshot as proof 
		      TakesScreenshot ts = (TakesScreenshot) driver;
			  File SRC = ts.getScreenshotAs(OutputType.FILE); File DEST = new
			  File("./src/test/resources/Screenshots/remove.jpg"); FileHandler.copy(SRC,
			  DEST);
			  
			  driver.quit();
			 
			
		}

	}

}