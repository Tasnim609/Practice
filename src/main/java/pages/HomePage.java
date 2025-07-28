package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	// parameterized constructor initialized when class in instantiated [object created]
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//input[@id='user-name']")
WebElement userId;

@FindBy(xpath = "//input[@id='password']")
WebElement passWord;

@FindBy(name = "login-button")
WebElement logIn;

@FindBy(xpath = "//div[contains(text(),'Sauce Labs Ba')]")
WebElement sauce;

@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
WebElement addToCart ;

@FindBy(xpath = "//a[@class='shopping_cart_link']")
WebElement shoppingCartLink;

public void inputUserId() {
	userId.sendKeys("standard_user");
}
public void inputPassWord() {
	passWord.sendKeys("secret_sauce");
}

public void ClicklogIn() {
	logIn.click();
	
}
public void inputUserIdAndPasswordAndClickLogin() throws InterruptedException {
	userId.sendKeys("standard_user");
	passWord.sendKeys("secret_sauce");
	logIn.click();
	Thread.sleep(5000);
	sauce.click();
	Thread.sleep(5000);
	addToCart.click();
	//Alert alert = driver.switchTo().alert();
	//alert.accept();
	Thread.sleep(5000);
	shoppingCartLink.click();
	
}

}
