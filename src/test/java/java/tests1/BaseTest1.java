package tests1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages1.LoginPage1;
import utility1.PropertyReader;

public class BaseTest1 {
	public static WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(PropertyReader.readProperty("URL"));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		

	}

	@AfterSuite
	public void tearDown() {
		driver.close();
	}

}
