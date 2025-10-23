package WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method3 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		Dimension size =  driver.manage().window().getSize();
		System.out.println(size);
		
		driver.manage().window().setSize(new Dimension(800, 500));
		Thread.sleep(2000);
		
		Point position =  driver.manage().window().getPosition();
		System.out.println(position);
		
		driver.manage().window().setPosition(new Point(200, 200));
		Thread.sleep(2000);

	} 

}
