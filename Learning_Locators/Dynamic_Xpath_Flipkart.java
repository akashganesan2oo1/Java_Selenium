package Learning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("Mobile");
		driver.findElement(By.xpath("//*[name()='svg' and @xmlns = 'http://www.w3.org/2000/svg']")).click();
		WebElement element = driver.findElement(By.xpath("//div[text() = 'Nothing Phone (3a) (Black, 128 GB)']/../..//div[@class = 'Nx9bqj _4b5DiR']"));
		System.out.println(element.getText());

	}

}
