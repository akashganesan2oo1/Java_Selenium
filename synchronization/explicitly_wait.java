package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitly_wait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		try {
			wait.until(ExpectedConditions.titleIs("Demo Web Shop"));
			driver.findElement(By.linkText("Log in")).click();
			wait.until(ExpectedConditions.urlContains("login"));
			driver.findElement(By.id("Email")).sendKeys("akashganesan2001@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Akash@2001");
			WebElement login = driver.findElement(By.xpath("//input[@value= 'Log in']"));
			wait.until(ExpectedConditions.visibilityOf(login));
			login.click();
			WebElement account = driver.findElement(By.xpath("(//a[@class = 'account'])[1]"));
			wait.until(ExpectedConditions.textToBePresentInElement(account, "akashganesan2001@gmail.com"));
			System.out.println("Test Case passed-----> Logged in Successfully");
			driver.quit();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		} finally {
			driver.quit();
		}				
	}
}