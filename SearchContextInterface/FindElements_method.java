package SearchContextInterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//fetch the number of similar elements present in the web page
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		System.out.println("The no of link present in the webpage is: "+lists.size());  
		int count = 0;
		for (int i = 0; i < lists.size(); i++) {
			
			WebElement list = lists.get(i);
			if (list.getText().isEmpty()) {
				continue;
			} else {
				System.out.println(list.getText());
				count++;

			}
			
		}
		System.out.println("No of text linik is: "+count);
		driver.quit();

	}

}
