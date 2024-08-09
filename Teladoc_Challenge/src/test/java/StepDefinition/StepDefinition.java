package StepDefinition;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Element_Repository.WebTables;
import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition 
{
	Hooks hook;
	WebDriver driver;
	WebTables page1;
	
	@Given("I am on WebTables page of Way2Automation website")
	public void i_am_on_web_tables_page_of_way2automation_website() throws IOException 
	{
		hook = new Hooks();
		driver = hook.setup();
	    System.out.println("WebTables page is displayed");
	}

	@When("I select Add User button")
	public void i_select_add_user_button() throws IOException 
	{
	    page1.createUser();
	}

	@When("add details and save")
	public void add_details_and_save() throws IOException 
	{
	    page1.createUser();
	    page1.addUserDetails();
	}

	@Then("A row will be added with the details of what I entered")
	public void a_row_will_be_added_with_the_details_of_what_i_entered() 
	{
	    Assert.assertTrue(page1.verifyUser());
	}

	@When("I click on cross icon of username {string}")
	public void i_click_on_cross_icon_of_username(String string) 
	{
	    page1.deleteUser();
	}

	@Then("A dialogue box will be prompted for confirmation")
	public void a_dialogue_box_will_be_prompted_for_confirmation() 
	{
	    page1.confirmDelete();
	}

	@Then("entry will be deleted")
	public void entry_will_be_deleted() 
	{
	    Assert.assertFalse(page1.verifyUserDeleted());
	}
}
