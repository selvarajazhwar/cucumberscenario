package cucumberscenario;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\src\\raj.features",
glue = {"cucumberscenario"},tags={"@tag"}, plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunnerOne {

}
