package utility1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String readProperty(String keys) throws IOException {
//		step-1 to get the dynamic path
		String Path=System.getProperty("user.dir")+"\\src\\test\\resources\\config1.properties";
		
//		step-2 Create objcet of properties class => import form java.util
		Properties prop=new Properties();
		
//		step-3 TO read the file we need the FileInputStream class
		FileInputStream fis=new FileInputStream(Path);
		
//		step-4 to load the file we need to call the load method 
		prop.load(fis);
		
//		we need to store the value in the string for that we have to store the value in string
		String value= prop.getProperty(keys);
		
//		System.out.println(value);
		return value;
	}

	/*
	 * public static void main(String[] args) throws IOException {
	 * PropertyReader.readProperty(); }
	 */
}
