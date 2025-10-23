package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com");
		
		if (driver.getTitle().equals("Instagram")) {
			System.out.println("Testcase pass...");
		} else {
			System.out.println("Testcase Fail...");
		}
		
		if (driver.getCurrentUrl().contains("instagram")) {
			System.out.println("Testcase pass...");
		} else {
			System.out.println("Testcase Fail...");
		}

	}

}
