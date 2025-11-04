package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class make_My_Trip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(5000);
		
		try {
			Thread.sleep(2000);
			WebElement popup = driver.findElement(By.xpath("//span[@data-cy = 'closeModal']"));
			popup.click();
			
		} catch (Exception e) {
			// TODO: handle exception
			
		}
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("fromCity"));
		action.moveToElement(from).click().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@role = 'option'][1]")).click();
		Thread.sleep(2000);
		
		WebElement to = driver.findElement(By.id("toCity"));
		action.moveToElement(to).click().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Mumbai");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text() = 'Mumbai']")).click();
		
		WebElement date = driver.findElement(By.xpath("//span[text() = 'Departure']"));
		action.click(date).perform();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("(//p[text() = '22'])[1]"));
		action.click(day).perform();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[@class = 'primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.findElement(By.xpath("//a[text() = 'Search']")).click();
		Thread.sleep(10000);
		
		for (int i = 1; i < 6; i++) {
			
			WebElement flight = driver.findElement(By.xpath("(//p[@class ='boldFont blackText airlineName'])["+i+"]"));
			String flightName = flight.getText();
			
			WebElement price = driver.findElement(By.xpath("(//span[@class =' fontSize18 blackFont'])["+i+"]"));
			String flightPrice = price.getText();
			
			System.out.println(flightName+" : "+ flightPrice);
		}
		
		driver.quit();

	}

}
