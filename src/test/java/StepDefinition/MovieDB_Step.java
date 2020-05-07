package StepDefinition;
/**
 * 
 * @author Vishal Lad
 * @Description In this class we defined a steps to be performed
 * Performing the scenario's
 *
 */



import org.junit.Assert;
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
			Assert.assertTrue(pro.getProperty("mainscreen"), true);
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

	@Then("^user navigates to the details screen$")
	public void user_navigates_to_the_details_screen() throws Throwable {

		try {
			Assert.assertTrue(pro.getProperty("description"), true);
			captureScreenShot();
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
			captureScreenShot();
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
			Assert.assertTrue(pro.getProperty("result"), true);
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^user validates invalid search$")
	public void user_validate_invalid_search() throws Throwable {

		try {
			Assert.assertTrue(pro.getProperty("alertmessage"), true);
			captureScreenShot();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Then("^verify user navigates to the About screen$")
	public void verify_user_navigates_to_the_About_screen() throws Throwable {

		try {
			Assert.assertEquals(pro.getProperty("About"),"ABOUT");
			captureScreenShot();
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


