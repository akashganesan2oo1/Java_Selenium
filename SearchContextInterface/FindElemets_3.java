package SearchContextInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemets_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[name()='svg'and @viewBox = '0 0 24 24']")).click();
		Thread.sleep(2000);
		List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class = 'KzDlHZ']"));
//		List<WebElement> prices = driver.findElements(By.xpath("//div[text() = 'Nothing Phone (3a) Pro (Grey, 128 GB)']/../..//div[@class = 'Nx9bqj _4b5DiR']"));

		for (WebElement mobile : mobiles) {

//			System.out.println(mobile.getText());
			String text = mobile.getText();
			String dynamicxpath = "//div[text() = '" + text + "']/../..//div[@class = 'Nx9bqj _4b5DiR'] ";
			WebElement element = driver.findElement(By.xpath(dynamicxpath));
			System.out.println(text +"---->"+ element.getText());

		}
		driver.quit();

	}

}
