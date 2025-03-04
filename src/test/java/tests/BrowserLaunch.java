package tests;

import java.util.ArrayList;
import java.util.List;

public class BrowserLaunch {
	public static List<int[]> pairSum(int[] arr, int s) {
        ArrayList<int []> out = new ArrayList<int []>();
        for(int i=0 ; i<arr.length;i++){
        	//System.out.println(i);
            for(int j=0;j<arr.length;j++){
            	//System.out.println(i+" "+j);
                if(arr[i]<arr[j]&&arr[i]+arr[j]==s)
                {
                    out.add(new int[]{arr[i],arr[j]});
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        return out;
    }
public static void main(String[] args) throws Throwable {
//	//System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//	ConfigFileReader config = new ConfigFileReader();
//	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--remote-allow-origins=*");
//	WebDriver driver = new ChromeDriver(options);
//	driver.get(config.getCSMApplicationUrl());
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
//	driver.quit();
	
//	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
//	ExcelData ChequeTransactionTestExecution = new ExcelData(path, "ChequeTransactionTestExecution", "TestCaseID");
//	ExcelData ChequeTransactionExcelData = new ExcelData(path, "Cheque_Transaction", "Data Set ID");
//	Map<String, String> testdata = ChequeTransactionTestExecution.getTestdata("CHTR_P2_180");
//	Map<String, String> testdata2 = ChequeTransactionExcelData.getTestdata(testdata.get("Data Set ID"));
//	System.out.println(testdata2.get("CreditCurrencyCode"));
//	 LocalDateTime timestamp = LocalDateTime.now();
//	 DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH:mm:ss");
//     System.out.println("Current Timestamp: " + timestamp.format(ofPattern));
// 	Class.forName("oracle.jdbc.driver.OracleDriver");
// 	String url = "jdbc:oracle:thin:@192.168.128.75:1521/ora12cs1?oracle.net.disableoob=true";
// 	String userName = "IMAL_CSMPARAM_O19";
// 	String password = "IMAL_CSMPARAM_O19";
// Connection connection = DriverManager.getConnection(url, userName, password);
// System.out.println(connection);()
	System.out.println(pairSum(new int[] {1,2,3,4,5},5));
}
}
