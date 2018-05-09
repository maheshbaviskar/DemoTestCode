package test.java.testPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WebPageTest2 {
	private static WebDriver oDriver;
	private static String output_name;
	

	@Given("^Go To Url ([^\"]*)$")
	public void launch(String arg1) throws Throwable {
		oDriver=new ChromeDriver();
		oDriver.get(arg1);

	}


	@When("^Enter the below ([^\"]*)$")
	public void search(String Name) throws Throwable {

		oDriver.findElement(By.id("myText")).sendKeys(Name);
		oDriver.findElement(By.xpath("/html/body/button")).click();
		output_name=oDriver.findElement(By.id("demo")).getText();

	}

	@Then("^Same name should be displayed ([^\"]*)$")
	public void validate(String Name1) throws Throwable {
		Assert.assertEquals(Name1, output_name);
		oDriver.close();

	}

}
