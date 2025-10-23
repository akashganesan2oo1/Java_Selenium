package launchBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");
		new FirefoxDriver();
	}

}
