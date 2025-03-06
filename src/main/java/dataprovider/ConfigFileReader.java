package dataprovider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private  Properties properties;
	private final String propertyFilePath = "configs//data.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			// read the property file using BufferReader
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				// load properties file
				properties.load(reader);
				// close the reader
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
// get implicit wait from properties file
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
	}

	// get csm application url from properties file
	public String getCSMApplicationUrl() {
		String url = properties.getProperty("CSMapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	// get sads application url from properties file
public String getSADSApplicationUrl() {
		String url = properties.getProperty("SADSapplicationUrl");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

//get csm param url from properties file
public String getCSMparamsUrl() {
	String url = properties.getProperty("CSMparamsUrl");
	if (url != null)
		return url;
	else
		throw new RuntimeException("url not specified in the Configuration.properties file.");
}

//get type of user from properties file
	public String getBrowser() {
		String browser = properties.getProperty("browser");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

//get timeout from properties file
	public long getTimeOut() {
		String timeOut = properties.getProperty("timeout");
		long parseLong = Long.parseLong(timeOut);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("timeOut not specified in the Configuration.properties file.");
	}
	
	// get polling time for fluent wait
	public long getPollingTime() {
		String pollingTime = properties.getProperty("pollingTime");
		long parseLong = Long.parseLong(pollingTime);
		if (parseLong != 0)
			return parseLong;
		else
			throw new RuntimeException("pollingTime not specified in the Configuration.properties file.");
	}
	
	// get Excel test runner status from properties file
	public String getExcelRunnnerFlagStatus() {
		String flag = properties.getProperty("ExcelRunner");
		if (flag != null)
			return flag;
		else
			throw new RuntimeException("Excel Runner Flag Not Specified in Excel Runner");
	}
	
	// test data file name from properties file
	public String getTestDataFileName() {
		String browser = properties.getProperty("CSMapplicationExcelPath");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}
	
	// get headless mode status from properties file
	public String getHeadlessMode() {
		String headless = properties.getProperty("HeadlessMode");
		if (headless!= null)
			return headless;
		else
			throw new RuntimeException("HeadlessMode not specified in the Configuration.properties file.");
	}

	}

	
