package Dropdown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class select_Price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("moblies",Keys.ENTER);
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//select[@class= 'Gn+jFg'])[1]"));
		Select select = new Select(element);
		
		System.out.println(select.isMultiple());
		System.out.println("----------------");
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("Min");
		Thread.sleep(2000);
		select.selectByVisibleText("₹30000");
		Thread.sleep(2000);
		select.selectByContainsVisibleText("₹10");
		Thread.sleep(2000);
		
		List<WebElement> options = select.getOptions(); //This Method is used to fetch all the options in the dropdown
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		System.out.println("------------");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions(); //This method is used to fetch all the selected options
		for (WebElement allSelectedOption : allSelectedOptions) {
			System.out.println(allSelectedOption.getText());
		}
		
		/*
		 * WebElement element2 =
		 * driver.findElement(By.xpath("(//select[@class= 'Gn+jFg'])[2]")); Select
		 * select1 = new Select(element2); // select1.selectByIndex(1);
		 * select1.selectByValue("30000");
		 */
		
//		Thread.sleep(2000);
		driver.quit();

	}

}
