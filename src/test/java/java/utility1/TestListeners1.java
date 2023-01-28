package utility1;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests1.LoginTest1;

public class TestListeners1 implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
try {
	
	Screenshot1.captureScreenshot( result.getName());
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
	}
	
	

}
