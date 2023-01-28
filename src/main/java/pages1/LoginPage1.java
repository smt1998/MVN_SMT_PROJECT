package pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public static WebDriver driver;
	public LoginPage1 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginButton;
	
	
	public void enterUsername(String sumit) {
			username.sendKeys(sumit);
			
		}
	
	public void enterPassword(String pass) {
			password.sendKeys(pass);
		}
	
	public void clickOnLogin() {
		if(loginButton.isEnabled()) {
			loginButton.click();
		}
	}
	
}
