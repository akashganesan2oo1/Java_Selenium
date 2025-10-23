package webElement_Interface_Method;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_of_WebElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Find the webElement of which we have to take screenshot
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		//By using the ref variable call the get screenshot as() method
		File src = LoginButton.getScreenshotAs(OutputType.FILE);
		
		//create a file in the main memory to store the screenshot
		File dest = new File("./src/test/resources/screenshots/loginbutton.png");
		
		//copy the screenshot from RAM to main Memory
		FileHandler.copy(src, dest);
		
		driver.quit();

	}

}
