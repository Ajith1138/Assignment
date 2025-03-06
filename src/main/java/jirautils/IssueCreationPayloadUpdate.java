package jirautils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class IssueCreationPayloadUpdate {

//	String assigneeResponse = System.getProperty("user.dir") + "\\src\\main\\java\\JiraPayLoads\\assigneeResponse.json";

	File PayloadFile;
	FileReader payloadFileReader;
	FileReader bugFileReader;
	FileReader assigneeResponseFileReader;
	JSONParser jsonParser;
	JSONObject jsonObject = new JSONObject();
	JSONArray jsonArray = new JSONArray();
	Writer writer;

	public void setPayLoadFile(File payLoadFile) {
		this.PayloadFile = payLoadFile;
	}

	@SuppressWarnings("unchecked")
	public void setIssueSummary(String IssueSummary) throws IOException, ParseException {
		JSONObject summaryJson = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		summaryJson = (JSONObject) jsonObject.get("fields");
		String summary = (String) jsonObject.get("summary");
		summaryJson.put("summary", IssueSummary);
		summary = (String) jsonObject.get("summary");

		String finalPayload = jsonObject.toString();

		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(finalPayload.getBytes());

	}

	@SuppressWarnings("unchecked")
	public void setIssueComponents(String Components) throws IOException, ParseException {
		JSONObject fiedJson = new JSONObject();
		JSONArray components = new JSONArray();
		JSONObject componentContent = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		fiedJson = (JSONObject) jsonObject.get("fields");

		components = (JSONArray) fiedJson.get("components");
		componentContent = (JSONObject) components.get(0);
		componentContent.put("name", Components);
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		String finalPayload = jsonObject.toString();
		outputStream.write(finalPayload.getBytes());
	}

	@SuppressWarnings("unchecked")
	public void setIssueDescriptionValue(String issueDescription) throws IOException, ParseException {
		JSONObject summaryJson = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		JSONObject descObject = new JSONObject();
		JSONObject contentJsonObj = new JSONObject();
		JSONObject finalText = new JSONObject();
		JSONArray jsonContentArray = new JSONArray();
		JSONArray contentTwoJsonObj = new JSONArray();
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		summaryJson = (JSONObject) jsonObject.get("fields");
		descObject = (JSONObject) summaryJson.get("description");
		jsonContentArray = (JSONArray) descObject.get("content");
		contentJsonObj = (JSONObject) jsonContentArray.get(0);
		contentTwoJsonObj = (JSONArray) contentJsonObj.get("content");
		finalText = (JSONObject) contentTwoJsonObj.get(0);
		String test = (String) contentJsonObj.get("text");
		finalText.put("text", issueDescription);
		String string = jsonObject.toString();
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(string.getBytes());
		outputStream.close();
	}

	@SuppressWarnings("unchecked")
	public void setIssueSeverity(String Severity) throws IOException, ParseException {
		JSONObject fiedJson = new JSONObject();
		JSONObject severityJson = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		fiedJson = (JSONObject) jsonObject.get("fields");

		severityJson = (JSONObject) fiedJson.get("customfield_10094");
		severityJson.put("value", Severity);
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		String finalPayload = jsonObject.toString();
		outputStream.write(finalPayload.getBytes());
	}

	@SuppressWarnings("unchecked")
	public void setIssueReportedInVersion(String reportedInVersion) throws IOException, ParseException {
		JSONObject fieldJson = new JSONObject();
		JSONArray resportedInVersionArray = new JSONArray();
		JSONObject resportedInVersionContentJson = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		fieldJson = (JSONObject) jsonObject.get("fields");
		resportedInVersionArray = (JSONArray) fieldJson.get("customfield_10150");
		resportedInVersionContentJson = (JSONObject) resportedInVersionArray.get(0);

		resportedInVersionContentJson.put("name", reportedInVersion);
		String reportedInversion = jsonObject.toString();
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(reportedInversion.getBytes());
		outputStream.close();
	}

	@SuppressWarnings("unchecked")
	public void setIssueAssignee(String assigneeAccountID) throws IOException, ParseException {
		JSONObject fieldJson = new JSONObject();
		JSONObject assigneeJson = new JSONObject();

		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		fieldJson = (JSONObject) jsonObject.get("fields");
		assigneeJson = (JSONObject) fieldJson.get("assignee");
		// 62e517832fe585febb3cc99c
		assigneeJson.put("id", assigneeAccountID);
		String reportedInversion = jsonObject.toString();
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(reportedInversion.getBytes());
		outputStream.close();
	}

	@SuppressWarnings("unchecked")
	public void setIssueLabels(String label) throws IOException, ParseException {
		JSONObject fieldJson = new JSONObject();
		JSONArray labelArray = new JSONArray();

		payloadFileReader = new FileReader(PayloadFile);
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		fieldJson = (JSONObject) jsonObject.get("fields");
		labelArray = (JSONArray) fieldJson.get("labels");
		// labelJson.add(0, label);
		int labelArraySize = labelArray.size();
		int labelArrayNode = labelArraySize - 1;
		labelArray.remove(labelArrayNode);

		labelArray.add(labelArrayNode, label);
		String reportedInversion = jsonObject.toString();
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(reportedInversion.getBytes());
		outputStream.close();

	}

	@SuppressWarnings("unchecked")
	public void setIssueEnvironmentDetails(String environmentDetails) throws IOException, ParseException {
		JSONObject summaryJson = new JSONObject();
		payloadFileReader = new FileReader(PayloadFile);
		JSONObject descObject = new JSONObject();
		JSONObject contentJsonObj = new JSONObject();
		JSONObject finalText = new JSONObject();
		JSONArray jsonContentArray = new JSONArray();
		JSONArray contentTwoJsonObj = new JSONArray();
		jsonParser = new JSONParser();
		jsonObject = (JSONObject) jsonParser.parse(payloadFileReader);
		summaryJson = (JSONObject) jsonObject.get("fields");
		descObject = (JSONObject) summaryJson.get("customfield_10157");
		jsonContentArray = (JSONArray) descObject.get("content");
		contentJsonObj = (JSONObject) jsonContentArray.get(0);
		contentTwoJsonObj = (JSONArray) contentJsonObj.get("content");
		finalText = (JSONObject) contentTwoJsonObj.get(0);
		String test = (String) contentJsonObj.get("text");
		finalText.put("text", environmentDetails);
		String string = jsonObject.toString();
		FileOutputStream outputStream = new FileOutputStream(PayloadFile);
		outputStream.write(string.getBytes());
		outputStream.close();
	}

	public String getAssigneeAccountID(File assigneeResponseFile) throws IOException, ParseException {
		String accountID;
		jsonParser = new JSONParser();
		JSONArray assigneeAccountIDArray = new JSONArray();
		JSONObject assigneeAccountID = new JSONObject();
		assigneeResponseFileReader = new FileReader(assigneeResponseFile);
		assigneeAccountIDArray = (JSONArray) jsonParser.parse(assigneeResponseFileReader);
		assigneeAccountID = (JSONObject) assigneeAccountIDArray.get(0);
		accountID = (String) assigneeAccountID.get("accountId");
		return accountID;
	}

	public String getIssueID(File newBugFile) throws IOException, ParseException {
		bugFileReader = new FileReader(newBugFile);
		jsonParser = new JSONParser();
		JSONObject bugIDJsonObject = new JSONObject();
		bugIDJsonObject = (JSONObject) jsonParser.parse(bugFileReader);
		String issueID = (String) bugIDJsonObject.get("key");
		return issueID;

	}

	

}
