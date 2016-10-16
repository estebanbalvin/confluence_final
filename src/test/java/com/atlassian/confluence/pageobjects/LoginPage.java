
package com.atlassian.confluence.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.atlassian.confluence.hooks.ConfluenceConfig;
import com.atlassian.confluence.hooks.SharedWebDriver;
import com.atlassian.confluence.hooks.Utils;

/** 
 * @desc this class has WebElements and methods of the LoginPage
 * @author Esteban Balvin estebillan@gmail.com
*/
public class LoginPage {
	
	final WebDriver driver;
	final Utils utils;
	
	
	//Declarations of the Locators
	By txtUsername =By.id("username");
	By txtPassword =By.id("password");
	By btnLogin = By.id("login");
	By pnlLogin = By.id("login-panel");
	
	
	//Initialization of the objects driver
	public LoginPage(final SharedWebDriver driver){
		this.driver = driver;
		this.utils = new Utils(driver);
	}
	
	/**
	 * Method to login the confluence page 
	 * @param string username and password
	 */
	public void loginWith(final String username, final String password) {
		
		this.driver.get(ConfluenceConfig.HOST_URL);
		utils.waitPageLoad(pnlLogin);
		utils.findVisibleElement(txtUsername).sendKeys(username);;
		utils.findVisibleElement(txtPassword).sendKeys(password);
		utils.findVisibleElement(btnLogin).click();
		
	}
	
	
}
