package reportexcel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Baseclass;

public class Test_01 extends Baseclass {

	@Test
	public void t_001() {
		driver.findElement(By.xpath("(//*[contains(text(),'Categories')])[1]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Central')]")).click();
		System.out.println("Test_01 executed successfully");
	}

}
