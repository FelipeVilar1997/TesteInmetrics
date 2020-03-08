package main;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", tags = "@ct01",  
		glue = {"steps"}, monochrome = true, dryRun = false)


public class desafioWebsiteTest {
	
}