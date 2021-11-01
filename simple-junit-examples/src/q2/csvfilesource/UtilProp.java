package q2.csvfilesource;

import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UtilProp {
	static final boolean _W = System.getProperty("os.name").toLowerCase().contains("windows");
	static String _PROP_ID_DISCOUNT = "simple-junit-examples/id_discount.properties";
	static String _PROP_RATE_DISCOUNT = "simple-junit-examples/rate_discount.properties";
	static Properties prop = new Properties();


	public static void loadProperty() throws Exception {
		loadProperty(_PROP_ID_DISCOUNT);
		loadProperty(_PROP_RATE_DISCOUNT);
	}
	
	public static void loadProperty(String fileName) throws Exception {
		FileInputStream inputStream = null;
		if (new File(fileName).exists()) {
			System.out.println("[DBG] Loaded: " + new File(fileName).getAbsolutePath());
			inputStream = new FileInputStream(fileName);
		}
		if (inputStream == null) {
			throw new FileNotFoundException();
		}
		prop.load(inputStream);
	}

	public static String getProp(String key) {
		return prop.getProperty(key).trim();
	}
}
