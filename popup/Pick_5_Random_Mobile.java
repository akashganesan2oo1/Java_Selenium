package popup;

import java.io.File;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Pick_5_Random_Mobile {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[contains(@class,'2iLD')]")).click();
		Thread.sleep(3000);		
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
		
		int total = mobiles.size();
		
		String ParentID = driver.getWindowHandle(); 
		Random random = new Random();
		int num = 5;
		for (int i = 0; i < num; i++) {
	    	int rand = random.nextInt(total)+1;
	    	try {
	    		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])["+rand+"]")).click();
			} catch (ElementClickInterceptedException e) {
				// TODO: handle exception
				i--;
			}  
           
		}
		
		Set<String> allIDs = driver.getWindowHandles();
		
		allIDs.remove(ParentID);
		
		for (String id : allIDs) {
			
			driver.switchTo().window(id);
			Thread.sleep(5000);
			@Nullable
			String title = driver.getTitle();
			int sc = random.nextInt(100);
			if (title.contains("vivo")) {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				File destination = new File("./src/test/resources/screenshots/vivoMobile"+sc+".png");
				FileHandler.copy(source, destination);
				Thread.sleep(1000);
				driver.close();
			} else {
				driver.close();

			}
			
		}
		driver.switchTo().window(ParentID);
		Thread.sleep(2000);
		driver.quit();

	}

}
