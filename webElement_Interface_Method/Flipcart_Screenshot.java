package webElement_Interface_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipcart_Screenshot {
	
	static String name = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		name = "search_Bar";
		WebElement SearchBar = driver.findElement(By.className("_3ZqtNW"));
		ScreenShot(SearchBar);
		
		name = "suggestion";
		WebElement suggestion_bar = driver.findElement(By.xpath("//div[@class = '_3sdu8W emupdz']"));
		ScreenShot(suggestion_bar);
		
		name = "mobile";
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		WebElement mobile = driver.findElement(By.xpath("(//div[@class = 'tUxRFH'])[1]"));
		ScreenShot(mobile);
		
		driver.quit();

	}
	
	public static void ScreenShot(WebElement element) throws IOException, InterruptedException {
		
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshots/"+name+".png");
		FileHandler.copy(src, dest);
		Thread.sleep(2000);
	}

}
