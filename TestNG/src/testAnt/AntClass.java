package testAnt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AntClass {

//	//public static void main(String[] args) {
//	@Test
//	public void AntTestNGMethod() {
//		// TODO Auto-generated method stub
//		System.out.println("HELLO ANT PROGRAM");
//		System.out.println("TODAY's DATE IS->" + currentDate());
//
//	}
//
//	private static String currentDate() {
//		// TODO Auto-generated method stub
//		return new Date().toString();
//	}

	@Test
	public void TestNGMethod() {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/home/");
		driver.get("http://amazon.com");
		List<WebElement> listAllCourseLinks = driver.findElements(By.xpath("//a[contains(text(),'Become an Affiliate')]"));
		for (WebElement webElement : listAllCourseLinks) {
			System.out.println(webElement.getAttribute("href"));
		}
	}
}
