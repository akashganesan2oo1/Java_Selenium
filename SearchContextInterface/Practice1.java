package SearchContextInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beminimalist.co/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id = 'insider-search-input'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder= 'Search for Skin Care']")).sendKeys("Hair Conditioner");
		driver.findElement(By.xpath("//div[@class= 'ins-custom-wrapper-297']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class= 'ins-checkbox-input-container'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = '✗']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class = 'ins-checkbox-input-container'])[3]")).click();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id = 'wrap-search-result-1605095392']/descendant::div[text() = 'Add to cart']")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Check Out']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
