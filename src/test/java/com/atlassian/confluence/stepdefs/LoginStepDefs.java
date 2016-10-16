package com.atlassian.confluence.stepdefs;
import com.atlassian.confluence.hooks.ConfluenceConfig;
import com.atlassian.confluence.pageobjects.LoginPage;

import cucumber.api.java.en.Given;
public class LoginStepDefs {
	
	private final LoginPage loginPage;
	
	public LoginStepDefs(final LoginPage loginPage){
		this.loginPage = loginPage;
	}
	
	@Given("^I am logged in Atlassian cloud$")
	public void i_am_logged_in_Atlassian_cloud(){
		
		loginPage.loginWith(ConfluenceConfig.ADMIN_USERNAME,
				            ConfluenceConfig.ADMIN_PASSWORD);
	}
}