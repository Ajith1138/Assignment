package dataprovider;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	private String TestDataSheetName;
	private String TestDataColumnName;
	private ExcelReader reader;
	private String FilePath;
	public ExcelData(String FilePath,String TestDataSheetName,String TestDataColumnName) {
		this.TestDataSheetName=TestDataSheetName;
		this.TestDataColumnName=TestDataColumnName;
		this.FilePath=FilePath;
		reader = new ExcelReader(FilePath);
	}
	
	// get testdata from excel sheet based on dataset id
	public Map<String, String> getTestdata(String DataSetID) {
		Map<String,String> testdata = new LinkedHashMap<String,String>();
		// get the column count from testdata sheet
		int columnCount = reader.getColumnCount(TestDataSheetName);
		// get the row number from testdata sheet
		int cellRowNum = reader.getCellRowNum(TestDataSheetName,TestDataColumnName,DataSetID);
		
		// iterate column count
			for (int j = 1; j <=columnCount; j++) {
				// get column name
				String key = reader.getCellData(TestDataSheetName,j,1);
				// get cell value
				String value = reader.getCellData(TestDataSheetName,j, cellRowNum);
				// remove .0 values
				if (value.contains(".0")) {
					String[] split = value.split("[.]");
					 value =split[0];
				}
				// store column name and cell value in map
				testdata.put(key, value);
				// check where data preset in respective column
				if (testdata.get(key).isBlank()||testdata.get(key).isEmpty()) {
					testdata.put(key, "SheetName: "+TestDataSheetName+" "+"RowNum :"+cellRowNum+" "+"ColumNum :"+j+" ColumnName :"+key);
				}			
			}
			return testdata;
			
	}
	
  public void updateTestData(String DataSetID,String ColumnName,String TestDataValue) {
	  // get row num
	  int cellRowNum = reader.getCellRowNum(TestDataSheetName,TestDataColumnName,DataSetID);
	  // update cell value in respective column
	  reader.setCellData(TestDataSheetName, ColumnName, cellRowNum, TestDataValue);

}
  // this function return all the test data value
  public HashMap<String, HashMap<String, HashMap<String, String>>> getAllTestDataFromExcel(String ColumnName) throws IOException {
		 String TestDataColumnName=ColumnName;
		 ExcelReader reader = new ExcelReader(FilePath);
		HashMap<String ,HashMap<String,HashMap<String, String>>> test = new HashMap<String, HashMap<String,HashMap<String,String>>>();
		FileInputStream fis = new FileInputStream(FilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int numberOfSheets = workbook.getNumberOfSheets();
		for (int i = 0; i <numberOfSheets; i++) {
			String sheetName = workbook.getSheetName(i);
			//System.out.println(sheetName);
			HashMap<String,HashMap<String, String>> testdata1 = new HashMap<String,HashMap<String, String>>();
			HashMap<String, String> testdata = new HashMap<String, String>();
		int rowCount = reader.getRowCount(sheetName);
		//int columnCount = reader.getColumnCount(sheetName);
		for (int j =1; j <=rowCount; j++) {
			
				String cellData = reader.getCellData(sheetName, TestDataColumnName, j);
				//System.out.println(cellData);
				int columnCount = reader.getColumnCount(sheetName);
				//System.out.println(rowCount+"    "+columnCount);
				int cellRowNum = reader.getCellRowNum(sheetName,TestDataColumnName,cellData);
				for (int k = 1; k <=columnCount; k++) {
					String key = reader.getCellData(sheetName,j,1);
					String value = reader.getCellData(sheetName,j, cellRowNum);
					if (value.contains(".0")) {
						String[] split = value.split("[.]");
						 value =split[0];
					}
					testdata.put(key, value);
					
					if (testdata.containsValue("")) {
						testdata.remove(reader.getCellData(sheetName,j,1));
					}			
				}
				
				testdata1.put(cellData, testdata);
				
				
		}
		test.put(sheetName, testdata1);
		
		
		}
		return test;
		
	}


}
