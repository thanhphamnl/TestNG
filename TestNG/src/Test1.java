import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Test1 {
	
	static ExtentReports extent;
	ExtentTest logger;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println(System.getProperty("user.dir").toString());
			
			extent = new ExtentReports(System.getProperty("user.dir") + "//test-output//STMExtentReport.html", true);
			//	String path = System.getProperty("user.dir") + "//test-output//screenshots//" + setCurrentDateTime()+" " +fileName + ".png";
				System.out.println("System.getPropertySTMExtentReport.html");
				
				//extent.addSystemInfo("Environment","Environment Name")
				extent.addSystemInfo("THANHKHANH", "SoftwareTesting").addSystemInfo("Environment", "Automation Testing")
						.addSystemInfo("Thanh Pham", "TestEngineer");
				// loading the external xml file (i.e., extent-config.xml) that was placed under
				// the base directory
				// You could find the xml file below. Create xml file in your project and copy
				// paste the code mentioned below
				
				extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));
				
				System.out.println("extent.loadConfig");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
