package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled_Attribute {
	
	@Test
	public void loginTest(){
		
		Reporter.log("Executing Login Test Case.....", true);
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void shoppingTest(){
		
		Reporter.log("Executing Shopping Test Case.....", true);
	}
	
	@Test(enabled = false)
	public void registerTest(){
		
		Reporter.log("Executing Register Test Case.....", true);
	}

}
