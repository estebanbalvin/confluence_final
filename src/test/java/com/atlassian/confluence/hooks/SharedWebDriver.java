package com.atlassian.confluence.hooks;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class SharedWebDriver extends EventFiringWebDriver {
	public SharedWebDriver() {
		super(new FirefoxDriver());
	}
}