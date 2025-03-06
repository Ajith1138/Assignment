package resources;

import java.util.ArrayList;
import java.util.List;

import dataprovider.ExcelReader;

public class ExcelTest {
	String path;
	String sheetName;
	String columnName;

	public ExcelTest(String path, String sheetName, String columnName) {
		this.path = path;
		this.sheetName = sheetName;
		this.columnName = columnName;
	}

	public  List<String> getTestCaseTagsfromExcel() {
		ExcelReader excelReader = new ExcelReader(path);
		List<String> li = new ArrayList<String>();
		int columnCount = excelReader.getRowCount(sheetName);
		for (int i = 2; i <=columnCount; i++) {
			String cellData = excelReader.getCellData(sheetName, columnName, i);
			if (!(cellData.isBlank())) {
				li.add(cellData);
			}
			
		}
		return li;
	}


}
