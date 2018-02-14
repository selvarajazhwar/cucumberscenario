package cucumberscenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	public WebDriver driver;
	@Given("^I am in demoq website$")
	public void i_am_in_demoq_website() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","E:\\Java WS\\cucumberscenario\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^I enter firstname and lastname$")
	public void i_enter_firstname_and_lastname(DataTable item) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> load =item.asLists(String.class);
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(load.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(load.get(0).get(0));

		
	}

	@Then("^I validate the firstname and lastname$")
	public void i_validate_the_firstname_and_lastname() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}


}
