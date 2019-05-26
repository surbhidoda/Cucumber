package com.carboncredits;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Test Runner class will use the (junit..) annotation @RunWith(), which tells JUnit what is the test runner class
@RunWith(Cucumber.class)

//This is a property file or settings for your test
@CucumberOptions(features="Features",glue= {"com.carboncredits"})

public class testRunner {

}
