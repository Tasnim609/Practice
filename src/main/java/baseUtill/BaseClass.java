package baseUtill;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver; 
	public  HomePage homePage; 	

	@BeforeMethod
	public void setUp()  {
		//how can you handle browser password compromise popup ?
		// with ChromeOptions Class .Ans
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		//option.addArguments("--disable-save-password-bubble");
		option.setExperimentalOption("prefs",new HashMap<String, Object> (){{
		 put("profile.password_manager_leak_detection",false);
		}} );//How to disable chrome password compromise popup using selenium WebDriver
		driver = new ChromeDriver(option); 
        driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver) ; 
	} 
		
		@AfterMethod
	public void tearUp() {
		driver.quit();
			//
	}

}
