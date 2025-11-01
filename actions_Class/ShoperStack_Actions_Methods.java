package actions_Class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ShoperStack_Actions_Methods {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//button[text() = 'Login']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("Email")).sendKeys("akashganesan2001@gmail.com", Keys.TAB, "Akash@2001");
	    driver.findElement(By.xpath("//span[text() = 'Login']")).click();
	    Thread.sleep(2000);
	    
	    Actions action = new Actions(driver);
	    
	    WebElement Men = driver.findElement(By.linkText("MEN"));
	    action.moveToElement(Men).perform();
	    
	    WebElement Shirt = driver.findElement(By.linkText("SHIRTS"));
	    action.click(Shirt).perform();
	    Thread.sleep(2000);
	    
	    WebElement option = driver.findElement(By.xpath("//img[@alt= 'men ribbed regular fit shirt']"));
	    action.moveToElement(option).perform();
	    
	    driver.findElement(By.xpath("(//*[name() = 'svg' and @focusable = 'false'])[7]")).click();
	    Thread.sleep(2000);
	    
	    WebElement profile = driver.findElement(By.xpath("//div[text() = 'A']"));
	    action.click(profile).perform();
	    Thread.sleep(2000);
	    
	    WebElement wishList = driver.findElement(By.xpath("(//li[@role = 'menuitem'])[3]"));
	    action.click(wishList).perform();
	    Thread.sleep(2000);
	    
	    WebElement img = driver.findElement(By.xpath("//img[@alt= 'men ribbed regular fit shirt']"));
	    WebElement cart = driver.findElement(By.xpath("(//*[name() = 'svg' and @aria-hidden = 'true'])[2]"));
	    action.dragAndDrop(img, cart).perform();
	    Thread.sleep(2000);
	    
	    WebElement cartBtn = driver.findElement(By.xpath("(//*[name() = 'svg' and @focusable = 'false'])[2]"));
	    action.click(cartBtn).perform();
	    Thread.sleep(2000);
	    
	    WebElement prdt = driver.findElement(By.xpath("//div[@class = 'cart_checkoutProductContainer__jtOKS']"));
	    
	    File src = prdt.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./src/test/resources/screenshots/product.png");
	    FileHandler.copy(src, dest);
	    
	    driver.quit();
	}

}
