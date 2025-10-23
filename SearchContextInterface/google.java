package SearchContextInterface;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//Auto suggestion handling
public class google {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@name = 'q']")).sendKeys("Selen3ium");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//span[text()='selenium']"));
		
		int count = 1;
		for (WebElement option : options) {
			
			String text = option.getText();
			System.out.println(count+". "+text);
			count++;
			
		}
		System.out.print("Select the option: ");
		int select = sc.nextInt();
		
		if (select >= 1 && select <=options.size()) {
			WebElement index = options.get(select-1);
			index.click();
		} else {
			System.out.println("Enter the valid option");
		}
		
		sc.close();
		Thread.sleep(2000);
//		driver.quit();

	}

}
