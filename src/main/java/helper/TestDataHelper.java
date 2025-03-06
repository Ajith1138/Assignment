package helper;

import java.util.ArrayList;
import java.util.Map;

import dataprovider.DataBaseReader;

public class TestDataHelper {
	DataBaseReader dataBaseReader = new DataBaseReader();

	// this method will replace values get from excel and generate query
	public String queryGenerator(String query,Map<String, String> testData) {
		// query starts with $
		if (query.contains("$")) {
			String outputQuery = query;
			try {
				for (int i = 0; i < getCountOfConstraintsFromQueryToBeChanged(query); i++) {
					if (testData.containsKey(removeSpecialCharacterFromConstraints(getListOfConstraintsFromQueryToBeChanged(query).get(i)))) {
						outputQuery = outputQuery.replace(getListOfConstraintsFromQueryToBeChanged(query).get(i), testData.get(removeSpecialCharacterFromConstraints(getListOfConstraintsFromQueryToBeChanged(query).get(i))));
					}
					
				}
			} catch (Exception e) {
				
			}
			return outputQuery;
		}
		else {
			return query;
		}
		
}
 
	
// decide the test data where direct value or query
	public String getGenericTestData(String testData) throws Throwable {
		
			if (testData.startsWith("$")) {
				return dataBaseReader.getTestDataBasedOnQuery(testData.replace("$",""));
			}
			
			else if (testData.contains("RowNum")) {
				 throw new AssertionError(testData);
			}
			
			else
            {
				return testData;
			}

	}
	// this method return count of values to be replaced
	public int getCountOfConstraintsFromQueryToBeChanged(String query) {
		int count = 0;
		char querychar[] = query.toCharArray();
		for (int i = 0; i < query.length(); i++) {
			if (querychar[i] == ':') {
				count++;
			}
		}
		return count;

	}
	// this method return list of values to be replaced
	public ArrayList<String> getListOfConstraintsFromQueryToBeChanged(String query) {
		String requiredString = null;
		ArrayList<String> columnName = new ArrayList<String>();
		char querychar[] = query.toCharArray();
		for (int i = 0; i < query.length(); i++) {
			if (querychar[i] == '[') {
				for (int j = i; j < query.length(); j++) {
					if (querychar[j] == ']') {
						requiredString = query.substring(i-1 , j+1);
						break;
					}
				}
				columnName.add(requiredString);	
			}
		}
		//System.out.println(columnName);
		return columnName;
		
	}
	//remove the special character
	public String removeSpecialCharacterFromConstraints(String Value) {
		return Value.replaceAll("[^a-zA-Z0-9_]", "");

	}

}
