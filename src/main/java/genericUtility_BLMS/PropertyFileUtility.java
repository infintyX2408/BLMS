package genericUtility_BLMS;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {

	public String getProperty(String Keyname) throws IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/CommonData.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(Keyname);
		return value;

	}
}
