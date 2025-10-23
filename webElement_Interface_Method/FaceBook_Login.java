package webElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("akashganesn2001@gmail.com", Keys.TAB,"akash", Keys.ENTER);
		//driver.findElement(By.name("pass")).sendKeys("akash", Keys.ENTER);

	}

}
