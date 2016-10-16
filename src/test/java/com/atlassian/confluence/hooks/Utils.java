package com.atlassian.confluence.hooks;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import cucumber.api.java.Before;

/** 
 * @desc this class contains all the utilities and common methods used across the project
 * @author Esteban Balvin estebillan@gmail.com
*/

public class Utils {
    final WebDriver driver;
	
	public Utils(final SharedWebDriver driver){
		this.driver = driver;
	}
	
	@Before ()
	public void beforeScenario() {
		this.driver.manage().window().maximize();
	}
	
	/**
	 * Wait until the element that can be located by the id selector is loaded on the browser.
	 * @param LocatorString
	 * @throws NoSuchElementException,TimeOutException
	 */
	public WebElement findVisibleElement(final By locator_id) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(this.driver)
			.withTimeout(30, TimeUnit.SECONDS)
	        .pollingEvery(500, TimeUnit.MILLISECONDS)
	        .ignoring(NoSuchElementException.class);
		WebElement foundElement = null;
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator_id));
			foundElement = this.driver.findElement(locator_id);
		} catch (final Exception e) {
			
			Assert.fail("The element wasn't found" +locator_id);
		}

		return foundElement;
	}
	
	/**
	 * Wait until the page is fully loaded and displays an element 
	 * @param LocatorString
	 */
	public void waitPageLoad(final By locator) {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		this.findVisibleElement(locator).isDisplayed();
	}
	
	
}
