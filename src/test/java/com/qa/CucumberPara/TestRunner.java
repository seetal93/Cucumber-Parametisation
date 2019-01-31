package com.qa.CucumberPara;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\com\\qa\\TeaTesting\\TeaTesting.feature")
public class TestRunner {

}
