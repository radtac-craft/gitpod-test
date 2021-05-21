package com.radtac.elib.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, 
		features = "classpath:features/",
		glue = "com.radtac.elib.bdd.steps",
		plugin = {"pretty", "html:target/cucumber"})
public class RunCukesTest {
}