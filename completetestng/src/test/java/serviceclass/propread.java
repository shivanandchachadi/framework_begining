package serviceclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propread {
	static Properties prop;
	public static String read(String data) throws IOException
	{
		FileInputStream file = new FileInputStream("C:/learn_automation/completetestng/config.properties");
		prop= new Properties();
		prop.load(file);
		String datavalue =prop.getProperty(data);
		return datavalue;
		
	}
	
}
