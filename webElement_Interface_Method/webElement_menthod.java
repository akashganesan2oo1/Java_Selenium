package webElement_Interface_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_menthod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.name("login"));
		
		System.out.println(element.getText());
		System.out.println(element.getTagName());
		System.out.println("-------------------");
		
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getAttribute("name"));
		System.out.println(element.getAttribute("class"));
		System.out.println(element.getAttribute("data-testid"));
		System.out.println(element.getAttribute("type"));
		System.out.println("---------------------");
		
//		getCssValue method
		
		System.out.println(element.getCssValue("background-color"));
		System.out.println(element.getCssValue("border"));
		System.out.println(element.getCssValue("font-size"));
		System.out.println(element.getCssValue("border-radius"));
		System.out.println(element.getCssValue("line-height"));
		System.out.println(element.getCssValue("width"));
		System.out.println(element.getCssValue("padding"));
		System.out.println("---------------------");
		
//		getSize Method
		
		Dimension size = element.getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println("---------------------");
		
//		getLocation Method
		
		Point location = element.getLocation();
		System.out.println(location);
		System.out.println(location.getX());
		System.out.println(location.getY());
		System.out.println("---------------------");
		
//		getRect Method
		
		Rectangle rect = element.getRect();
		System.out.println(rect);
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());
		System.out.println("---------------------");
		
		driver.quit();

	}

}
