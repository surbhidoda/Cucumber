package Practest2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue= {"Practest2"},plugin= {"pretty","json:target/cucumber-reports/cucumber.json","junit:target/cucumber-reports/cucumber.xml",
		"html:target/cucumber-reports"},monochrome=true)
public class testRunner {

}
