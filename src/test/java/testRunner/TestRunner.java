package testRunner;
import cucumber.api.CucumberOptions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "/Users/gaurangsharma/IdeaProjects/Cucumber_selenium/Feature/OrangeHRM.feature" ,
glue = "stepDefinitions")
public class TestRunner {
}
