package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserChooseBrowser1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Browser: ");
		String browser = sc.next();
		
		System.out.println("Enter an application: ");
		String application = sc.next();
		
		Thread.sleep(1000);
		switch (browser) {
		
		case "chrome":
			System.out.println("Luanching chrome browser");
			System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "edge":
			System.out.println("Luanching edge browser");
			System.setProperty("webdriver.edge.driver", "./src/main/resources/msedgedriver.exe");
			driver = new EdgeDriver();
			break;
			
		case "firefox":
			System.out.println("Luanching firefox browser");
			System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Enter the correct browser");
			break;
		}
		
		String url = "https://www."+application+".com";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		

	}

}
