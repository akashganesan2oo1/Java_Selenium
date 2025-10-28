package Dropdown_Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_Dropdown_Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.name("country"));
		Select select = new Select(country);
		
		List<WebElement> options = select.getOptions();
		int size = options.size();
		for (int i = 0; i < size; i++)
		if (i%2==0) {
			
			select.selectByIndex(i);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());
		}
		System.out.println("-----------------------------------------------");
		for (int i = 0; i < size; i++)
			if (!(i%2==0)) {
				
				select.selectByIndex(i);
				WebElement firstSelectedOption = select.getFirstSelectedOption();
				System.out.println(firstSelectedOption.getText());
			}
	}

}
