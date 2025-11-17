package learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_Attribute {
	
	@DataProvider
	public String[][] loginDataProvider(){
		
		String[][] data = new String[3][2];
		//3-> No of times execution to be happen
		
		data[0][0] = "nikhil26@gmail.com";
		data[0][1] = "nikhil123";
		data[1][0] = "haranhari199162@gmail.com";
		data[1][1] = "hari@12345";
		data[2][0] = "eren.yegar@aot.com";
		data[2][1] = "Freedom";
		return data;
	}
	
	@Test(dataProvider = "loginDataProvider")
	public void loginTest(String email, String password) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(email)));
		driver.quit();
	}

}
