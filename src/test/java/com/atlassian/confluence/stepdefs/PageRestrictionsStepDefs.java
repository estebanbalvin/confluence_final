package com.atlassian.confluence.stepdefs;
import org.junit.Assert;
import com.atlassian.confluence.pageobjects.PageRestrictions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PageRestrictionsStepDefs {

	private final PageCreationStepDefs pageCreation;
	private final PageRestrictions pageRestictions;
	
	
	public PageRestrictionsStepDefs(final PageCreationStepDefs pageCreation, final PageRestrictions pageRestictions){	
		this.pageRestictions = pageRestictions;
		this.pageCreation = pageCreation;
	}
	
	@Given("^a page exists$")
	public void a_page_exists() {
		this.pageCreation.i_click_on_the_button_create_page();
		this.pageCreation.i_set_a_unique_page_title();
		this.pageCreation.i_click_on_the_button_publish();
		this.pageCreation.the_page_is_created_sucessfully();
	}

	@When("^I open the options for the page$")
	public void i_open_the_options_for_the_page() {
		this.pageRestictions.gotoRestrictionPopup();
	}
	
	@When("^I set the restriction to only edit$")
	public void i_set_the_restriction_to_only_edit() {
		this.pageRestictions.setRestrictionTo("edit");
		this.pageRestictions.typeUser("Aleja");
		this.pageRestictions.applyChanges();
	}

	@When("^I set the restriction to Viewing and editing restricted$")
	public void i_set_the_restriction_to()  {
		this.pageRestictions.setRestrictionTo("viewedit");
	}
	
	@When("^I type the user \"([^\"]*)\"$")
	public void i_type_the_user(String user)  {
		this.pageRestictions.typeUser(user);
	}
	
	@When("^I select the permission to \"([^\"]*)\"$")
	public void i_select_the_permission_to(String restrictionLevel) {
		this.pageRestictions.setRestrictionLevel(restrictionLevel);
		this.pageRestictions.applyChanges();
	}
	
	@Then("^The restriction is applied to the page$")
	public void the_restriction_is_applied_to_the_page()  {
		Assert.assertTrue(this.pageRestictions.isRestrictionApplied().isDisplayed());
		Assert.assertTrue(this.pageRestictions.getRestrictionApplied().contains("locked"));
	}

}
