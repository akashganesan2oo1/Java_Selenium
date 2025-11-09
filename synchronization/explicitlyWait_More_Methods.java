package synchronization;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlyWait_More_Methods {
	
	static boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		try {
			
			driver.get("https://demowebshop.tricentis.com/");
			wait.until(ExpectedConditions.titleIs("Demo Web Shop"));
			System.out.println("Test Case passed---> Welcome Page Displayed");
			
			driver.findElement(By.linkText("Register")).click();
			WebElement RegisterText = driver.findElement(By.xpath("//h1[text() =  'Register']"));
			wait.until(ExpectedConditions.textToBePresentInElement(RegisterText, "Register"));
			System.out.println("Test Case passed----> Register Page Displayed");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.id("gender-male"))).click();
			driver.findElement(By.id("FirstName")).sendKeys("Eren");
			driver.findElement(By.id("LastName")).sendKeys("Yegar");
			driver.findElement(By.id("Email")).sendKeys("eren.yegar@anime16aot.com");
			driver.findElement(By.id("Password")).sendKeys("Freedom");
			driver.findElement(By.id("ConfirmPassword")).sendKeys("Freedom");
			wait.until(ExpectedConditions.elementToBeClickable(By.id("register-button"))).click();
			
			try {
				wait.until(ExpectedConditions.urlContains("registerresult"));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'result']")));
				System.out.println("Test Case passed ----> Successfully Registered");
				
				WebElement account = driver.findElement(By.linkText("eren.yegar@anime16aot.com"));
				wait.until(ExpectedConditions.textToBePresentInElement(account, "eren.yegar@anime16aot.com"));
				System.out.println("Test Case passed ----> Successfully Logged in");
				driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
				
				driver.findElement(By.xpath("//input[@value = 'Search store']")).sendKeys("");
				driver.findElement(By.xpath("//input[@value = 'Search']")).click();
				
				try {
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					System.out.println("Alert Appeared");
					System.out.println(alert.getText());
					alert.accept();
					driver.findElement(By.xpath("//input[@value = 'Search store']")).clear();
					driver.findElement(By.xpath("//input[@value = 'Search store']")).sendKeys("Laptop");
					driver.findElement(By.xpath("//input[@value = 'Search']")).click();
				} catch (Throwable e) {
					System.out.println("No Alert Appeared, you can continue with the execution");

				}
				
				WebElement search = driver.findElement(By.xpath("//h1[text() = 'Search']"));
				wait.until(ExpectedConditions.visibilityOf(search));
				System.out.println("Test Case passed---> Search Page Displayed");
				
				WebElement cartButton = driver.findElement(By.xpath("//input[@value = 'Add to cart']"));
				Actions actions = new Actions(driver);
				actions.scrollToElement(cartButton).perform();
				actions.click(cartButton).perform();
				
				
				WebElement added = driver.findElement(By.xpath("//p[@class = 'content']"));
				wait.until(ExpectedConditions.visibilityOf(added));
				
				WebElement cartLink = driver.findElement(By.xpath("//span[text() = 'Shopping cart']"));
				actions.scrollToElement(cartLink).click(cartLink).perform();
				
				wait.until(ExpectedConditions.titleContains("Shopping Cart"));
				System.out.println("Test Case passed----> Cart Page Displayed");
				
				WebElement checkBox_Cart = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[1]"));
				wait.until(ExpectedConditions.elementToBeClickable(checkBox_Cart));
				checkBox_Cart.click();
				WebElement termsAndConditions_checkBox = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]"));
				wait.until(ExpectedConditions.elementToBeClickable(termsAndConditions_checkBox));
				termsAndConditions_checkBox.click();
				
				driver.findElement(By.id("checkout")).click();
				
				wait.until(ExpectedConditions.urlToBe("https://demowebshop.tricentis.com/onepagecheckout"));
				System.out.println("Test Case Passed--->Checkout Page Displayed");
				
				WebElement country = driver.findElement(By.xpath("(//select[@data-val = 'true'])[1]"));
				Select select = new Select(country);
				select.selectByValue("1");
				
				WebElement state = driver.findElement(By.xpath("(//select[@data-val = 'true'])[2]"));
				Select select2 = new Select(state);
				select2.selectByVisibleText("California");
				
				driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Los Angeles");
				driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Hollywood Blvd & Vine St Los Angeles");
				driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("90028");
				driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("9876543210");
				WebElement button = driver.findElement(By.xpath("(//input[@class = 'button-1 new-address-next-step-button'])[1]"));
				wait.until(ExpectedConditions.visibilityOf(button));
				wait.until(ExpectedConditions.elementToBeClickable(button));
				button.click();
				
				WebElement pickup = driver.findElement(By.id("PickUpInStore"));
				wait.until(ExpectedConditions.visibilityOf(pickup));
				System.out.println("Test Case Psssed---> Address Added");
				pickup.click();
				WebElement button2 = driver.findElement(By.xpath("(//input[@class = 'button-1 new-address-next-step-button'])[2]"));
				wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(button2),ExpectedConditions.elementToBeClickable(button2)));
				button2.click();
				
				driver.findElement(By.xpath("//input[@value = 'Payments.CashOnDelivery']")).click();
				WebElement button3 = driver.findElement(By.xpath("//input[@class = 'button-1 payment-method-next-step-button']"));
				wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(button3),ExpectedConditions.elementToBeClickable(button3)));
				button3.click();
				
				WebElement info = driver.findElement(By.xpath("//p[text() = 'You will pay by COD']"));
				if (info.isDisplayed()) {
					System.out.println("Test Case passed---> Payement info displayed");
				}
				driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
				WebElement prod = driver.findElement(By.linkText("14.1-inch Laptop"));
				wait.until(ExpectedConditions.visibilityOf(prod));
				System.out.println("Test Case Passed---> Confirm Order Displayed");
				
				WebElement confirm = driver.findElement(By.xpath("//input[@value= 'Confirm']"));
				wait.until(ExpectedConditions.elementToBeClickable(confirm));
				confirm.click();
				
				WebElement placed = driver.findElement(By.className("title"));
				String text = placed.getText();
				wait.until(ExpectedConditions.textToBePresentInElement(placed, text));
				flag = true;
				
			} catch (Throwable e) {
				WebElement error = driver.findElement(By.xpath("//div[@class = 'validation-summary-errors']"));
				String errorText = error.getText();
				System.out.println(errorText);
				
			}
				
			
		} catch (Throwable e) {
			System.out.println("Test Case failed...");
			System.out.println(e.getMessage());
			
		}finally {
			if (flag) {
				System.out.println("Thanks for using this Application...:)");
				driver.quit();
				
			} else {
				System.out.println("Thanks for using this Application. Sorry for the inconvnience. Please Try Again");
				driver.quit();

			}
			
		}

	}

}
