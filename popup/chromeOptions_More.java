package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions_More {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		
//		It will open the chrome in incognito mode
		option.addArguments("--incognito");
		
//		It will open browser with disabed notification
		option.addArguments("--disable-notification");
		
//		It will open browser in maximized mode
		option.addArguments("--start-maximize");
		
//		It will open browser in fullscreen mode
		option.addArguments("--start-fullscreen");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();

	}

}
