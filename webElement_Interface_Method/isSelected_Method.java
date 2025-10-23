package webElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Find the Radio Button
		WebElement element = driver.findElement(By.id("pollanswers-1"));
		System.out.println(element.isSelected());
		
		//Click on the Radio Button
		element.click();
		System.out.println(element.isSelected());
		
		driver.findElement(By.linkText("Log in")).click();
		
		//Find the check box
		WebElement element2 = driver.findElement(By.xpath("//input[@type = 'checkbox']"));
		System.out.println(element2.isSelected());
		
		//Click on the check box
		element2.click();
		System.out.println(element2.isSelected());
		
		//Find the button
		WebElement element3 = driver.findElement(By.xpath("(//input[@type = 'submit'])[1]"));
		System.out.println(element3.isSelected());
		
		driver.quit();

	}

}
