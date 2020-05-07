package StepDefination;
/**
 * 
 * @author Vishal Lad
 * @Description In this class we defined a steps to be performed
 * Performing the scenario's
 *
 */

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import Utility.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Homepage_MovieTimes extends BaseClass{

	public BaseClass base = new BaseClass();


	@Given("^user navigate to the movie main screen$")
	public void user_navigate_to_the_movie_main_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		base.launchApp();
		System.out.println("Application launched successfully");
	}


	@Then("^user navigate to the details screen$")
	public void user_navigate_to_the_details_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.name("DESCRIPTION")).getText(),"DESCRIPTION");
		System.out.println("User navigated to the movies detailed page");
		}
	
	@Then("^user validate invalid search$")
	public void user_validate_invalid_search() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.name("No movies found for this query")).getText(),"No movies found for this query");
		System.out.println("User navigated to the movies detailed page");
		}

	@And("^user tap on back button$")
	public void user_tap_on_back_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().back();
	}

	@And("^I click on \"([^\"]*)\"$")
	public void i_click_on(String locatorKey)  {
		base.click(locatorKey);

	}

	@When("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_as(String locatorKey, String inputText) {
		base.enter(locatorKey, inputText);
	}
	
	
	 @And("User close the application")
		public void I_want_to_Close() throws InterruptedException{  
		 base.close(); 
		}

}


