package JiraAPIUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.http.HttpHeaders;
import org.json.simple.parser.ParseException;
import org.testng.Assert;

import dataprovider.JIRADataProvider;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import jirautils.CredentialsEncoder;
import jirautils.IssueCreationPayloadUpdate;

public class JIRAServices {
	JIRADataProvider jirsaDataProvider = new JIRADataProvider();

	String userName = jirsaDataProvider.getJIRAUserName();
	String tokenID = jirsaDataProvider.getJIRATokenID();
	CredentialsEncoder credentialsEncoder = new CredentialsEncoder();
	String assigneeResponseFilePath = System.getProperty("user.dir")
			+ "\\src\\main\\java\\jirapayloads\\assigneeResponse.json";
	File assigneeResponsefile = new File(assigneeResponseFilePath);
	FileOutputStream fileOutputStream;
	IssueCreationPayloadUpdate payLoadData = new IssueCreationPayloadUpdate();
//To Fetch the assignee ID from the JIRA API Call
	public String getAssignee(String assigneeMailID) {
		String accountID = "";
		try {
			System.out.println("assignee Response file Path " + assigneeResponseFilePath);
			fileOutputStream = new FileOutputStream(assigneeResponsefile);

			String assineeEndPoint = "https://azentio.atlassian.net/rest/api/3/user/search?query=" + assigneeMailID;
			Response response = RestAssured.given().auth().basic(userName, tokenID)
					.header(HttpHeaders.CONTENT_TYPE, "application/json")
					.header(HttpHeaders.AUTHORIZATION,
							"Basic " + credentialsEncoder.getEncodedCredentials(userName, tokenID))
					.get(assineeEndPoint);

			String assigneeResponseBody = response.asString();
			System.out.println("assignee Response body " + assigneeResponseBody);
			fileOutputStream.write(assigneeResponseBody.getBytes());
			fileOutputStream.close();
			accountID = payLoadData.getAssigneeAccountID(assigneeResponsefile);
		} catch (IOException e) {
			System.out.println(
					"Payload file is not available in the mentioned Path " + assigneeResponsefile.getAbsolutePath());
		} catch (ParseException e) {
			System.out.println(" Unable to parse the json object to java due to " + e.getCause());
		}
		return accountID;

	}
//In this function It will create a payload with requeired values (That values are in aruguments) 
	public void createIssueCreationPayload(File payloadFile, String issueDescription, String issueSummary,
			String component, String labels, String severity, String reportedInVersion, String assigneeAccountID,
			String environmentDetails) {
		try {
			payLoadData.setPayLoadFile(payloadFile);
			payLoadData.setIssueSummary(issueSummary);
			payLoadData.setIssueDescriptionValue(issueDescription);
			payLoadData.setIssueComponents(component);
			payLoadData.setIssueLabels(labels);
			payLoadData.setIssueSeverity(severity);
			payLoadData.setIssueReportedInVersion(reportedInVersion);
			payLoadData.setIssueAssignee(assigneeAccountID);
			payLoadData.setIssueEnvironmentDetails(environmentDetails);
		} catch (IOException e) {
			System.out.println("Payload file is not available at the mentioned path " + e.getCause());
		} catch (ParseException e) {
			System.out.println("Unable to parse the json object please check with setter methods " + e.getCause());
		}
	}
	//Creating the JIRA issue with the payload(JSON Payload) 
	public int createIssue(File payloadFile, File responseFile) {
		int statusCode = 0;
		try {
			FileOutputStream responseOutputStream = new FileOutputStream(responseFile);
			String issueCreationEndPoint = "https://azentio.atlassian.net/rest/api/3/issue";
			Response postResponse = RestAssured.given().auth().basic(userName, tokenID)
					.header(HttpHeaders.CONTENT_TYPE, "application/json")
					.header(HttpHeaders.AUTHORIZATION,
							"Basic " + credentialsEncoder.getEncodedCredentials(userName, tokenID))
					.body(payloadFile).post(issueCreationEndPoint);
			statusCode = postResponse.getStatusCode();
			String postResponseAsString = postResponse.asString();
			responseOutputStream.write(postResponseAsString.getBytes());
			responseOutputStream.close();

		} catch (Exception e) {
			System.out.println(
					"Payload file is not available at the mentioned file path " + payloadFile.getAbsolutePath());
		}
		return statusCode;
	}
	//This service triggerred onec the b issue is created, After that this service will attach the screenshot to that perticular issue

	public void addAttachementService(String issueID, File[] attachements) {
		String issueAttachementEndPoint = "https://azentio.atlassian.net/rest/api/3/issue/" + issueID + "/attachments";

		for (File fileAttachement : attachements) {
			Response postResponse = RestAssured.given().auth().basic(userName, tokenID)
					.header(HttpHeaders.CONTENT_TYPE, "multipart/form-data")
					.header(HttpHeaders.AUTHORIZATION,
							"Basic " + credentialsEncoder.getEncodedCredentials(userName, tokenID))
					.header("X-Atlassian-Token", "no-check").multiPart(fileAttachement).post(issueAttachementEndPoint);
			// System.out.println(postResponse.getStatusCode());
			Assert.assertEquals(postResponse.getStatusCode(), 200);
		}

	}
//This service give the issue ID as response
	public void getIsue(String issueID) {
		String issueCreationValidationEndPoint = "https://azentio.atlassian.net/rest/api/3/issue/" + issueID;
		Response getIssueResponse = RestAssured.given().auth().basic(userName, tokenID)
				.header(HttpHeaders.CONTENT_TYPE, "application/json")
				.header(HttpHeaders.AUTHORIZATION,
						"Basic " + credentialsEncoder.getEncodedCredentials(userName, tokenID))
				.get(issueCreationValidationEndPoint);
		int responseCode = getIssueResponse.statusCode();
		Assert.assertEquals(responseCode, 200);

	}

}
