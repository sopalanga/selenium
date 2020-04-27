package examExcel;

import java.io.FileInputStream;
import java.util.Properties;

public class Property_File {
	public static void main(String[] args) {
		
		String sPath =System.getProperty("user.dir")+"/testcases.properties";
		try {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream(sPath);
		prop.load(fi);
		System.getProperties().putAll(prop);
		System.out.println("Property value of Username = "+prop.getProperty("email_field"));
		System.out.println("Property value of Password = "+prop.getProperty("password_field"));
	    }catch(Exception a) {
			System.out.println(a);
		}
		
	}

}


