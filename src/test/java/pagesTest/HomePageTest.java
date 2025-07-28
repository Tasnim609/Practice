package pagesTest;

import org.testng.annotations.Test;

import baseUtill.BaseClass;

public class HomePageTest extends BaseClass {

	@Test
	public void TestinputUserIdAndPasswordAndClickLogin() throws InterruptedException {
		homePage.inputUserIdAndPasswordAndClickLogin(); 
	}
}
