package takesScreenshot_interface;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class User_Want_Brower_ScreenShot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Browser : ");
		String browser = sc.next();
		System.out.println("Enter an application");
		String application = sc.next();
		Thread.sleep(1000);
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		
		} else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","./src/main/resources/msedgedriver.exe");
			driver = new EdgeDriver();
			
		} else {
			System.out.println("Enter a Valid Browser....");
		}
		
		driver.manage().window().maximize();
		String url = "https://www."+application+".com";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		Random random = new Random();
		int num = random.nextInt(1000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./src/test/resources/screenshots/"+application+num+".png");
		FileHandler.copy(source, destination);
	   
	    driver.quit();

	}

}
