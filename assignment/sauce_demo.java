	package assignment;
	
	import java.io.File;
	import java.io.IOException;
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.io.FileHandler;
	
	public class sauce_demo {
		
		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.TAB, "secret_sauce");
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//div[text() = 'Sauce Labs Bolt T-Shirt']/../../../..//button[text() = 'Add to cart']")).click();
			
			driver.findElement(By.xpath("//div[text() = 'Sauce Labs Fleece Jacket']/../../../..//button[text() = 'Add to cart']")).click();		
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']")).click();
			Thread.sleep(2000);
			
			WebElement shirt = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Bolt T-Shirt']"));
			WebElement jacket = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Fleece Jacket']"));
			
			if (shirt.getText().contains("Shirt") && jacket.getText().contains("Jacket")) {
				
				System.out.println("Test Case Passed");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//div[text() = 'Sauce Labs Fleece Jacket']/../..//button[text() = 'Remove']")).click();
				
				List<WebElement> remainingItems = driver.findElements(By.xpath("//div[@class = 'inventory_item_name']"));
				boolean jacketpresent = false;
				
				for (WebElement item : remainingItems) {
					
					if (item.getText().contains("Jacket")) {
						jacketpresent = true;
						break;
					}
				}
				
				if (!jacketpresent) {
					System.out.println("Test Case passed");
					
					TakesScreenshot ts = (TakesScreenshot) driver; 
					File src = ts.getScreenshotAs(OutputType.FILE);
					File dest = new File("./src/test/resources/screenshots/saucedemo.png");
					FileHandler.copy(src, dest);
					Thread.sleep(2000);
					
				} else {
					System.out.println("Test case Failed");
	
				}
				
			} else {
				
				System.out.println("Test case Failed");
			}
			
			driver.quit();
			
		}
	
	}
