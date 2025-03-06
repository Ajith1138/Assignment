package dataprovider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JIRADataProvider {
	private  Properties properties;
	private final String propertyFilePath = "configs//jiraData.properties";
	// constructor initialize property file
	public JIRADataProvider() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}
	// method return JIRA user name from jira.properties
	public String getJIRAUserName() {
		String csmComponent = properties.getProperty("JiraUserName");
		if (!(csmComponent.isBlank()))
			return csmComponent;
		else
			throw new RuntimeException("csm component not specified in the Configuration.properties file.");
	}
	// method return JIRA token from jira.properties
	public String getJIRATokenID() {
		String csmComponent = properties.getProperty("JiraTokenID");
		if (!(csmComponent.isBlank()))
			return csmComponent;
		else
			throw new RuntimeException("csm component not specified in the Configuration.properties file.");
	}
	// method return Components from jira.properties
	public String getcsmComponent() {
		String csmComponent = properties.getProperty("csmComponents");
		if (!(csmComponent.isBlank()))
			return csmComponent;
		else
			throw new RuntimeException("csm component not specified in the Configuration.properties file.");
	}
	// method return Components from jira.properties
	public String getcsmParamComponent() {
		String csmParamComponent = properties.getProperty("camParamComponents");
		if (!(csmParamComponent.isBlank()))
			return csmParamComponent;
		else
			throw new RuntimeException("csm param componet not specified in the Configuration.properties file.");
	}
	// method return Sevirity from jira.properties
	public String getSevirity() {
		String sevirity = properties.getProperty("sevirity");
		if (!(sevirity.isBlank()))
			return sevirity;
		else
			throw new RuntimeException("sevirity not specified in the Configuration.properties file.");
	}
	// method return reportedInVersion from jira.properties
	public String getReportedInVersion() {
		String reportedInVersion = properties.getProperty("reportedInVersion");
		if (!(reportedInVersion.isBlank()))
			return reportedInVersion;
		else
			throw new RuntimeException("reported in verison not specified in the Configuration.properties file.");
	}
	// method return assigneeMailID from jira.properties
	public String getAssigneeMailID() {
		String assigneeMailID = properties.getProperty("assigneeMailID");
		if (!(assigneeMailID.isBlank()))
			return assigneeMailID;
		else
			throw new RuntimeException("assignee mail id not specified in the Configuration.properties file.");
	}
	// method return label from jira.properties
	public String getlabel() {
		String label = properties.getProperty("label");
		if (!(label.isBlank()))
			return label;
		else
			throw new RuntimeException("label not specified in the Configuration.properties file.");
	}
	// method return isBugneedToBeRaisedFlag from jira.properties
	public String isBugneedToBeRaisedFlag() {
		String password = properties.getProperty("isBugNeedToBeRaised");
		if (!(password.isBlank()))
			return password;
		else
			throw new RuntimeException("is bug need to be raised not specified in the Configuration.properties file.");
	}

	
	
	
}
