package com.practice.runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/resources/com/practice/features/Search.feature",  // Path to Feature Files
    glue = "com/practice/stepdefinitions",                   // Package of Step Definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"}, // Reporting
    monochrome = true,                          // Better console output
    dryRun = false                              // true = check only mappings, no execution
)
public class TestRunnerClass extends AbstractTestNGCucumberTests {
   
}

