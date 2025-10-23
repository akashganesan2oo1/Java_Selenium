package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.instagram.com";
		driver.get(url);

	}

}
