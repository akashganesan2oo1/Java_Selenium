package takesScreenshot_interface;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_of_webpage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
//		Type cast the driver into TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		
//		call the method by using ts variable and take the screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);
		
//		create a file in main memory to save the screenshot
		File destination = new File("./src/test/resources/screenshots/instagram.png");
		
//		copy the screenshot from RAM to Main Memory
		FileHandler.copy(source, destination);
		
		driver.quit();

	}

}
