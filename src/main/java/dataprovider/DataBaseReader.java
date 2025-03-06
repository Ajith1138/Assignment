package dataprovider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataBaseReader {
	DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration();
	static Map<String,String> testdataValue = new LinkedHashMap<String,String>();
	static Map<String,String> testdataDetails = new LinkedHashMap<String,String>();
	public static Connection dataBaseConnection;
	public static Statement stmt;
	
	// this method will create database connection through jdbc driver using 
	// db url , username , password
	public Connection dataBaseConnection() throws Exception {
		dataBaseConnection = null;
		for (int i = 0; i <= 5; i++) {
 
			try {
				// initialize jdbc driver
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url = databaseConfiguration.getDatabaseURL();
				String userName = databaseConfiguration.getDatabaseUserName();
				String password = databaseConfiguration.getDatabasePassword();
				dataBaseConnection = DriverManager.getConnection(url, userName, password);
				break;
			} catch (Exception e) {
				try {
					dataBaseConnection.close();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						System.err.println("Thread got interepted");
						e1.printStackTrace();
					}
				} catch (Exception ex) {
					// Log closing connection failure
					System.err.println("Failed to close connection: " + ex.getMessage());
				}
				if (i == 5) {
					e.printStackTrace();
					System.err.print(e.getMessage());
					throw new Exception(e.getMessage());
 
				}
			}
		}
		return dataBaseConnection;

	}
	//this method create statement through database connection to execute queries
	public Statement statement() throws Exception {
		stmt=null;
		try {
			stmt = dataBaseConnection.createStatement();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return stmt;
 
	}
// get list of opt reference until root from application
	public List<String> getListOfOptID(String optName, String appName) throws Exception {
		List<String> listOfOptName = new ArrayList<>();
		String prgRef = "";
		String idPrefix = databaseConfiguration.getOptNamePrefix();
		try {
			while (true) {

				String stringQuery = "select prog_ref,app_name, parent_ref, prog_order, menu_title_eng, disp_order from opt where prog_ref = '"
						+ optName + "' and app_name = '" + appName + "'";
				ResultSet executeQuery = stmt.executeQuery(stringQuery);
				while (executeQuery.next()) {
					optName = executeQuery.getString("PARENT_REF");
					prgRef = executeQuery.getString("PROG_REF");
					listOfOptName.add(idPrefix + prgRef);
				}
				if (optName.equals("ROOT")) {
					break;
				}

			}
			return listOfOptName;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
			
		}

	}
// this method will execute the db query and return value
	public String getTestDataBasedOnQuery(String query) throws Exception {
		String Value = null;
		ResultSet executeQuery = stmt.executeQuery(query);
		try {
			if (executeQuery.next()) {
				Value = executeQuery.getString(1);
			}
			if (Value == null) {
				String keyFromValue = getKeyFromValue(testdataValue, query);
				throw new Exception("No testdata found in db else check db query "+testdataDetails.get(keyFromValue));

			}
			return Value;
		} catch (Exception e) {
			throw new AssertionError(e.getMessage());

		}

	}
	
	public  <K, V> K getKeyFromValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; 
    }
	// get list of values from query

	public ArrayList<String> getListOfTestDataBasedOnQuery(String query) throws ClassNotFoundException, SQLException {
		ResultSet executeQuery = stmt.executeQuery(query);
		ArrayList<String> listOfRestrictionCode = new ArrayList<>();

		while (executeQuery.next()) {
			String value = executeQuery.getString(1);
			listOfRestrictionCode.add(value);
		}
		return listOfRestrictionCode;

	}
	
	// execute db  query and does not return values
	public void executeQuery(String query) throws SQLException {
		stmt.executeQuery(query);
	}


}
