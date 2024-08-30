package mindq.cucumberbddframework;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features"},
                 glue = {"mindq.cucumberbddframework.stepdefs"},
                 plugin = {"pretty","html:test-output/cucumber-html-report/testreport.html"},
                 tags = "@home",
                 monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{

}
