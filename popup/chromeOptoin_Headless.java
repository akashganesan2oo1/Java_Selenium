package popup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class chromeOptoin_Headless {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("eren.yegar@aot.com");
		driver.findElement(By.id("Password")).sendKeys("Freedom");
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		
		//screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshots/dw.png");
		FileHandler.copy(src, dest);

	}

}
