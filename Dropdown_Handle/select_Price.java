package Dropdown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("moblies",Keys.ENTER);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//select[@class= 'Gn+jFg'])[1]"));
		Select select = new Select(element);
		select.selectByIndex(2);
		Thread.sleep(2000);
		
		WebElement element2 = driver.findElement(By.xpath("(//select[@class= 'Gn+jFg'])[2]"));
		Select select1 = new Select(element2);
		select1.selectByIndex(1);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
