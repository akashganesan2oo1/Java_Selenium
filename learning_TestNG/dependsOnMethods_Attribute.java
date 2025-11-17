package learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods_Attribute {
	
	@Test(dependsOnMethods =  "registerTest")
	public void loginTest(){
		
		Reporter.log("Executing Login Test Case.....", true);
	}
	
	@Test(dependsOnMethods = {"registerTest", "loginTest"})
	public void shoppingTest(){
		
		Reporter.log("Executing Shopping Test Case.....", true);
	}
	
	@Test(priority = -3)
	public void registerTest(){
		
		Reporter.log("Executing Register Test Case.....", true);
	}

}
