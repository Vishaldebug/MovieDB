package StepDefinition;
/**
 * 
 * @author Vishal Lad
 * @Description In this class we defined a steps to be performed
 * Performing the scenario's
 *
 */



import org.testng.Assert;

import Utility.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MovieDB_Step extends BaseClass{

	public BaseClass base = new BaseClass();


	@Given("^user navigates to the movie main screen$")
	public void user_navigates_to_the_movie_main_screen() throws Throwable {
		try {

			base.launchApp();
			Assert.assertTrue(getElement("Mainscreen").isDisplayed());
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^I click on \"([^\"]*)\"$")
	public void i_click_on(String locatorKey)  {
		try {
			base.click(locatorKey);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	@Then("^user verify navigation to the details screen by text \"([^\"]*)\"$")
	public void user_navigates_to_the_details_screen_by_text(String expectedText) throws Throwable {

		try {
			Assert.assertEquals(getElement("Movie_description").getText(), expectedText,"expected and actual text are not same");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@And("^user taps on back button$")
	public void user_tap_on_back_button() throws Throwable {

		try {
			driver.navigate().back();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@When("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_as(String locatorKey, String inputText) {

		try {
			base.enter(locatorKey, inputText);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@Then("^user validates valid search$")
	public void user_validate_valid_search() throws Throwable {

		try {
			Assert.assertTrue(getElement("Searchtext_box").getText().contains(getElement("Searchtext_box").getText()));			
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^user validates invalid search by message \"([^\"]*)\"$")
	public void user_validate_invalid_search_by_message(String expectedText) throws Throwable {

		try {
			Assert.assertEquals(getElement("invalid_search_message").getText(), expectedText,"expected and actual text are not same");
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^user verify navigation to the About screen by text \"([^\"]*)\"$")
	public void verify_user_navigates_to_the_About_screen_by_text(String expectedText) throws Throwable {

		try {
			Assert.assertEquals(getElement("About").getText(), expectedText,"expected and actual text are not same");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	@And("user closed the application")
	public void I_want_to_Close() throws InterruptedException{ 

		try {
			base.close(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}


