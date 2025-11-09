package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_Confirmation_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("nikhil26@gmail.com", Keys.TAB, "nikhil123");
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		driver.findElement(By.linkText("nikhil26@gmail.com")).click();
		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.xpath("(//input[@value = 'Delete'])[1]")).click();
		
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
		driver.quit();
		

	}

}
