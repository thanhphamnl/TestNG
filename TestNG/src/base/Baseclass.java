package base;
import org.automationtesting.excelreport.Xl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class Baseclass {

	public WebDriver driver;

	@BeforeMethod
	public void baseclass1() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
	}

	@AfterMethod
	public void quitDriver() {
		driver.close();
	}

	@AfterSuite
	public void generateReport() throws Exception {
		Xl.generateReport("Report_Excel.xlsx");
		//	extent = new ExtentReports(System.getProperty("user.dir") + "//test-output//STMExtentReport.html", true);
	}

}
