package com.atlassian.confluence;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(strict = true, format = {
		"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json"},
		tags = { "@confluence" })
public class RunTestsCukes {
}