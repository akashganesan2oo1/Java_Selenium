package SearchContextInterface;


import java.io.File;
import java.util.List;
//import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FindElements_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		List<WebElement> textfields = driver.findElements(By.xpath("//input[@type = 'text' or @type = 'password']"));
		
		String[] values = {"abcd", "efgh" ,"Akash", "Ganesan","akashganesan2001@gmail.com", "Admin@123", "Admin@123"};
		int index = 0;
		
		for (WebElement element : textfields) {
			if (index<values.length) {
				element.sendKeys(values[index]);
			}
				index++;
				
//			Random random = new Random();
//			webElement.sendKeys("abcd"+random.nextInt(1000));
		}
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./src/test/resources/screenshots/locator.jpg");
		FileHandler.copy(source, destination);
		
		driver.quit();

	}

}
