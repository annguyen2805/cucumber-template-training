package com.cucumber.demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/feature/pricing.feature"
//        glue = "stepdefinition"
//        tags = "@login"
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
