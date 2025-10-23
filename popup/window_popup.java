package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[contains(@class,'2iLD')]")).click();

		driver.findElement(By.xpath("(//div[@class = 'KzDlHZ'])[1]")).click();

//		Fetch the parent window id

		String parentId = driver.getWindowHandle();

//		Fetch the all ids

		Set<String> allIDs = driver.getWindowHandles();

//		Remove the parent window id

		allIDs.remove(parentId);
		
		String price1 = null;

		for (String id : allIDs) {

//			Switch the driver control from parent to child window

			driver.switchTo().window(id);

//			Fetch the current window title

			System.out.println(driver.getTitle());
			driver.manage().window().fullscreen();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text() = 'Add to cart']")).click();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement child_price = driver.findElement(By.xpath("//div[@class = 'WH+Ng1']/descendant::div[@class = '_1Y9Lgu']"));
			price1 = child_price.getText();
			System.out.println(price1);
			driver.close();

		}

//		switch back to parent window
		driver.switchTo().window(parentId);
		driver.findElement(By.linkText("Cart")).click();
		Thread.sleep(2000);
		WebElement parent_price = driver.findElement(By.xpath("//div[@class = 'WH+Ng1']/descendant::div[@class = '_1Y9Lgu']"));
		String price2 = parent_price.getText();
		System.out.println(price2);
		 
		if (price1.equals(price2)) {
			System.out.println("Test Case Pass----> Both price is same");
		} else {
			System.out.println("Test Case Fail----> Both the price are not same");

		}
//		driver.quit();

	}

}
