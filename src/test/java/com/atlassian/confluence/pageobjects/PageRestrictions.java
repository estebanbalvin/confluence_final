package com.atlassian.confluence.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atlassian.confluence.hooks.SharedWebDriver;
import com.atlassian.confluence.hooks.Utils;

/** 
 * @desc this class will hold all the Web elements and methods of the Page Restriction
 * @author Esteban Balvin estebillan@gmail.com
*/

public class PageRestrictions {
	
	final WebDriver driver;
	final Utils utils;
	
	//Definition of the WebElements of PageRestriction
	
	By btnPageOptions = By.id("action-menu-link");
	By lnkRestrictions =By.id("action-page-permissions-link");
	By pnlRestrictions =By.cssSelector(".aui-dialog2-header-main");
	By ldtRestrictions =By.id("page-restrictions-dialog-selector");
	By lstRestrictionLevel =By.id("page-restrictions-permission-selector");
	By imgRestriction= By.cssSelector("#content-metadata-page-restrictions");
	By txtUserRestriction=By.id("s2id_autogen2");
	By lblResult= By.cssSelector(".select2-result-label");
	By btnApply=By.id("page-restrictions-dialog-save-button");
	
	// Initialization of objects
	public PageRestrictions(SharedWebDriver driver){
		this.driver = driver;
		this.utils = new Utils(driver);
	}
	
	/**
	  * @desc clicks the page options and click on the link restrictions
	*/
    public void gotoRestrictionPopup() {
    	
    	this.utils.findVisibleElement(btnPageOptions).click();
    	this.utils.findVisibleElement(lnkRestrictions).click();
	}
    
	/**
	  * @desc wait until the pop up restriction is loaded and select the type of restriction
	  * @param string $restrictionType - type of restriction to apply to the user
	*/
	public void setRestrictionTo(final String restrictionType) {
	
		this.utils.findVisibleElement(pnlRestrictions).isDisplayed();
		this.utils.findVisibleElement(ldtRestrictions).click();
		
		Select dropdown = new Select(driver.findElement(ldtRestrictions));
		dropdown.selectByValue(restrictionType);
	}
	
	/**
	  * @desc Finds the text box to type the user to apply the restriction
	  * @param string -username
	*/
	public void typeUser(final String user) {	

		this.utils.findVisibleElement(txtUserRestriction).sendKeys(user);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		this.utils.findVisibleElement(lblResult).click();
	}
	
	/**
	  * @desc apply changes by clicking button
	*/
	public void applyChanges() {	
		
		this.utils.findVisibleElement(btnApply).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	/**
	  * @desc finds the icon that is displayed and read the attribute with 
	  *       the type of restriction applied to the page
	*/
	public String getRestrictionApplied() {	
		
		String restrictionApplied=this.utils.findVisibleElement(imgRestriction).getAttribute("class");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return restrictionApplied;
	}

	/**
	  * @desc search for the restriction icon displayed on the page and return the webelement
	*/
    public WebElement isRestrictionApplied() {
    	WebElement iconRestriction= this.utils.findVisibleElement(imgRestriction);	
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		return iconRestriction;
	}
    
    /**
	  * @desc click the restriction level when the option view and edit is selected.
	  * @param string $restrictionLevel - level of restriction to apply to the user
	*/
    public void setRestrictionLevel(String restrictionLevel) {
		this.utils.findVisibleElement(lstRestrictionLevel).click();
		//Select from the restriction from the list
		Select dropdown = new Select(driver.findElement(lstRestrictionLevel));
		dropdown.selectByValue(restrictionLevel);
	}
    

}