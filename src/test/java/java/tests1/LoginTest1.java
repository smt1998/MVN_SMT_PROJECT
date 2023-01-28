package tests1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages1.LoginPage1;

@Listeners(utility1.TestListeners1.class)
public class LoginTest1 extends BaseTest1 {
//    public static  WebDriver driver;
	LoginPage1 dio;
@BeforeClass
	public void initObject() {
	 dio = new LoginPage1(driver);
		
	}

	@Test
	public void enterID()  {
		dio.enterUsername("sumit@gmail.com");
		dio.enterPassword("smt123");
		Assert.assertTrue(true);
	}

	@Test
	public void login() {
		Assert.assertFalse(true);

	}

}
