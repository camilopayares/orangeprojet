package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"Steps"},
		plugin= {"pretty","html:target/report1.html"},// To generate report in HTML, JUnit,  or JSON format
		monochrome=true,
		dryRun=false,
		//true roule les test qui n'ont pas de code , validateur de escenarios
		//name="count"
		tags= "@P8" 
		)
public class TestRunner {
	
}