package Dropdown_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_dropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement Month = driver.findElement(By.name("Month"));
		Select select = new Select(Month);
		select.selectByIndex(1);
		select.selectByValue("Ap");
		select.selectByVisibleText("June");
		select.selectByContainsVisibleText("tob");
		Thread.sleep(2000);
		
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		
		  if (select.isMultiple()) {
		  
		  select.deselectByIndex(1); select.deselectByValue("Ap");
		  select.deselectByVisibleText("June");
		  select.deSelectByContainsVisibleText("tob");
		  
		 }
		 
//		select.deselectAll();
		  
		driver.quit();

	}

}
