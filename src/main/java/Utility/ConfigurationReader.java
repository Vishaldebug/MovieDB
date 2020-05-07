package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigurationReader {

	public static Properties prop = new Properties();
	public static InputStream input = null;

	/**
	 * Load the property file mentioned in filepath
	 * @param filePath
	 * @return
	 */
	public static Properties loadProperty(String filePath) {
		try {
			input = new FileInputStream(filePath);
			prop.load(input);
		} catch (IOException e) {

			e.printStackTrace();
		}
		return prop;
	}

}
