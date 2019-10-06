package demo.webapp.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/main/java/demo/webapp/features", 
				 	glue = {"demo/webapp/stepDefinitions"},
				 	plugin = {"pretty", "html:target/test_report", "json:target/output_file.json", "junit:target/test_outcome.xml"},
				 	monochrome = true,
				 	dryRun = false,
				 	strict = true,
				 	tags = {"~@SecondTest", "~@FirstTest", "@ThirdTest"}
		        )

public class TestRunner {

}
