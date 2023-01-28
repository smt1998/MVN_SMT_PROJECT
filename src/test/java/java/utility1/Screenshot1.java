package utility1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import tests1.BaseTest1;

public class Screenshot1 extends BaseTest1{
//	public static WebDriver driver;

	public static void captureScreenshot(String name) throws IOException {

		// step-1 give the path
		String path = System.getProperty("user.dir")+"\\Screenshots1\\"+name +getCurrentDate1()+".jpg";

		System.out.println(path);
		// step-2 usig TakesScreenshot Reference
		TakesScreenshot tss = (TakesScreenshot) driver;

		// step-3 give the output type as a file
		File souceFile = tss.getScreenshotAs(OutputType.FILE);

		// step-4 create file class object
		File destinationFile = new File(path);

		// step-4 Using FIle Handler class
		FileHandler.copy(souceFile, destinationFile);

		System.out.println("Screenshot Capture Successfully");

	}

	public static String getCurrentDate1() {

		DateFormat date = new SimpleDateFormat("DD-MM-YYYY hh-mm-ss");

		Calendar cal = Calendar.getInstance();

		String currentDate = date.format(cal.getTime());
		
		System.out.println(currentDate);

		return currentDate;

	}
	
	public static void main(String[] args) throws IOException {
		Screenshot1.captureScreenshot( "sumit");
	}

}
