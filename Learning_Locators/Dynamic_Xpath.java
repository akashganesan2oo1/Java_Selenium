package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'Search Amazon.in']")).sendKeys("sony tv");
		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
		driver.findElement(By.xpath("//span[text()='Sony 108 cm (43 inches) BRAVIA 2M2 Series 4K Ultra HD Smart LED Google TV K-43S22BM2-2 Years Warranty for Limited Period']/../../../..//span[text()='Deal with GST Savings']"));
	}

}
