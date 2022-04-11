package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
		
        features = "src/test/java/features",
        
        tags = {"@Sanity, @Regression"},  //Feature level tag - To run entire login feature file
        
        
        glue = {"stepDefs"}
        
        )


public class TestRunner {

}
