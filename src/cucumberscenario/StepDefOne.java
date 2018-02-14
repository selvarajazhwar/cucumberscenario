package cucumberscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefOne {
	public  static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver","E:\\Java WS\\cucumberpro\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement q= driver.findElement(By.xpath("//select[@id='dropdown_7']"));
		 //int y=Integer.parseInt(arg1);
         Select s = new Select(q);
		s.selectByVisibleText(arg1);
	}

	@Then("^Message displayed Successfully$")
	public void message_displayed_Successfully() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	}


}
