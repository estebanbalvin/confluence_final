package com.atlassian.confluence.pageobjects;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atlassian.confluence.hooks.SharedWebDriver;
import com.atlassian.confluence.hooks.Utils;
/** 
 * @desc this class has Web Elements and methods of Confluence Page creation
 * @author Esteban Balvin estebillan@gmail.com
*/

public class PageCreation {
	
	final WebDriver driver;
	final Utils utils;
	
	//Declarations of the Locator of the page Login
	By btnCreatePage=By.id("quick-create-page-button");
	By lblTitle =By.id("content-title");
	By dvContent =By.id("content");
	By txtContent = By.cssSelector(".mceContentBody.aui-theme-default");
	By btnPublish = By.id("rte-button-publish");
	By lblContentTitle =By.id("title-text");
	
	
	// Initialization of objects
	public PageCreation(final SharedWebDriver driver){
		this.driver = driver;
		this.utils = new Utils(driver);
	}
	
	// The following methods are explained themselves
	public void clickNewPageButton() {
		this.utils.findVisibleElement(btnCreatePage).click();
	    
	}
	
	public void waitPageLoad( ) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		this.utils.findVisibleElement(dvContent).isDisplayed();
	}
	
	public void setTitle(String title) {
		this.utils.findVisibleElement(dvContent).isDisplayed();
		this.utils.findVisibleElement(lblTitle).sendKeys(title);
	}
		
	public void setContentBody() {
		this.driver.switchTo().frame("wysiwygTextarea_ifr");
		utils.findVisibleElement(txtContent).sendKeys("Hello World!!!..");	
	}
	
	public void clickPublishButton() {
		driver.switchTo().defaultContent();
		utils.findVisibleElement(btnPublish).click();	
	}
	
	public String capturePageTitle() {
		String titlecaptured= this.driver.getTitle();	
	  return titlecaptured;
	}
	
}