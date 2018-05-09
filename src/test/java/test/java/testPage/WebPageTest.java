package test.java.testPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebPageTest {
	private WebDriver oDriver;

	@BeforeTest
	public void setup() {
		oDriver= new ChromeDriver();
	}
	
	@Test
	public void test() {
		
		String name="mahesh";
		oDriver.get("http://localhost:8081/DemoWebPage/");
		oDriver.findElement(By.id("myText")).sendKeys(name);
		oDriver.findElement(By.xpath("/html/body/button")).click();
		String output_name=oDriver.findElement(By.id("demo")).getText();
		
		Assert.assertEquals(name, output_name);
	}
	
	@AfterTest
	public void closeTest() throws Exception {
		
		Thread.sleep(5000);
		
		oDriver.quit();
	}

}
