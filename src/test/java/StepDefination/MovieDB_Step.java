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
import Utility.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MovieDB_Step extends BaseClass{

	public BaseClass base = new BaseClass();
	

	@Given("^user navigates to the movie main screen$")
	public void user_navigates_to_the_movie_main_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    base.launchApp();
		System.out.println("Application launched successfully");
	}

@Test
	@Then("^user navigates to the details screen$")
	public void user_navigates_to_the_details_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.name("DESCRIPTION")).getText(),"DESCRIPTION");
		System.out.println("User navigated to the movies detailed page");
		}
	

@Test	
	@Then("^verify user navigates to the About screen$")
	public void verify_user_navigates_to_the_About_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(driver.findElement(By.name("ABOUT")).getText(),"ABOUT");
		System.out.println("User navigated to the about screen");
		}
@Test	
	@Then("^user validate invalid search$")
	public void user_validate_invalid_search() throws Throwable {
		Assert.assertEquals(driver.findElement(By.name("No movies found for this query")).getText(),"No movies found for this query");
		System.out.println("Verified invalid search");
		}
	
@Test
	@Then("^user validate valid search$")
	public void user_validate_valid_search() throws Throwable {
	
	    String s = driver.findElement(By.id("etSearchBox")).getText();
		String v = driver.findElement(By.id("tvTitleSearchResult")).getText();
		System.out.println(s);
	    System.out.println(v);
	    System.out.println("Verified valid search");
		}

@Test
	@And("^user tap on back button$")
	public void user_tap_on_back_button() throws Throwable {
		driver.navigate().back();
		System.out.println("User back to main screen");
	}

@Test
	@And("^I click on \"([^\"]*)\"$")
	public void i_click_on(String locatorKey)  {
		base.click(locatorKey);

	}
@Test
	@When("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_as(String locatorKey, String inputText) {
		base.enter(locatorKey, inputText);
	}
	
@Test
	 @And("user close the application")
		public void I_want_to_Close() throws InterruptedException{  
		 base.close(); 
		 System.out.println("Application closed");
		}

}


