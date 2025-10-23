package SearchContextInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Amazon {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//input[@value = 'Go']")).click();
		
		Thread.sleep(2000);
		List<WebElement> moblies = driver.findElements(By.xpath("//h2[ @class = 'a-size-medium a-spacing-none a-color-base a-text-normal']"));
		
		for (WebElement moblie : moblies) {
			
			String name = moblie.getText();
			String forPrice = "//span[text() = '"+name+"'] /ancestor::div[@class = 'puisg-col-inner']/descendant::span[@class = 'a-price-whole']";
			WebElement price = driver.findElement(By.xpath(forPrice));
			System.out.println(name);
			System.out.println("Price is : "+price.getText());
			String delivery = "//span[text() = '"+name+"'] /ancestor::div[@class = 'puisg-col-inner']/descendant::span[@class = 'a-color-base a-text-bold']";
			WebElement deliveryDate = driver.findElement(By.xpath(delivery));
			System.out.println("Free Delivery Date: "+deliveryDate.getText());
			
		}
		
		driver.quit();

	}

}
