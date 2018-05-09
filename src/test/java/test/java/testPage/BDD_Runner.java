package test.java.testPage;



import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
       tags = {"~@ignored"},
      plugin = { "pretty" , "json:target/cucumber-reports/Cucumber.json",
  			"junit:target/cucumber-reports/Cucumber.xml",
  			"html:target/cucumber-reports"},
       features = {"src/test/java/test/java/Features"} 
)

public class BDD_Runner {
}