package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pubg.com");
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

	}

}
