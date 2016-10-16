package com.atlassian.confluence.stepdefs;

import java.util.UUID;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.atlassian.confluence.hooks.SharedWebDriver;
import com.atlassian.confluence.hooks.Utils;
import com.atlassian.confluence.pageobjects.PageCreation;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class PageCreationStepDefs {

	private final PageCreation page;
	private final Utils utils;
	public String rndTitle = "New page "+UUID.randomUUID().toString().substring(30);
	
	//Definition of the WebElements of PageRestriction
	By pnlContent =By.className("aui-page-panel-inner");
	By pnlPageEdit =By.id("createpageform");
	By lnkLike =By.id("likes-and-labels-container");
	By lblTitle =By.id("title-text");
	
	
	
	public PageCreationStepDefs(final PageCreation page, final SharedWebDriver driver){
		this.page = page;
		this.utils = new Utils(driver);
	}

	
	@When("^I click on the button create page$")
	public void i_click_on_the_button_create_page() {
		
		this.utils.waitPageLoad(pnlContent);
		this.page.clickNewPageButton();	
	}

	@When("^I set a unique page title$")
	public void i_set_a_unique_page_title() {
		
		this.utils.waitPageLoad(pnlPageEdit);
		this.page.setTitle(rndTitle);
	}

	@When("^I type some text on the body$")
	public void i_type_some_text_on_the_body() {
	}

	@When("^I click on the button publish$")
	public void i_click_on_the_button_publish() {
		this.page.clickPublishButton();	
	
	}
	
	@Then("^The page is created sucessfully$")
	public void the_page_is_created_sucessfully() {
		this.utils.waitPageLoad(lnkLike);
		Assert.assertTrue(this.utils.findVisibleElement(lblTitle).isDisplayed());
		Assert.assertTrue(this.page.capturePageTitle().contains(rndTitle));
	}

}
