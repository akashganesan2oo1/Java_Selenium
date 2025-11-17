package learning_TestNG;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_File_DDT {
	
	@Test
	public void loginTest() throws Exception {
		
		//Create a Java Representation Object for external File
		FileInputStream fis = new FileInputStream("./src/main/resources/commonData.properties");
		
		//Create an Object for Properties class
		Properties property = new Properties();
		
		//Load the file from FIS to properties object
		property.load(fis);
		
		//Fetch the file from properties file/object
		String URL = property.getProperty("url");
		String EMAIL = property.getProperty("email");
		String PASSWORD = property.getProperty("password");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("pass")).sendKeys(PASSWORD);
		driver.findElement(By.name("login")).click();
		driver.quit();
		
	}

}
