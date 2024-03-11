package com.LimeRoad.runner;

import org.junit.runner.RunWith;

import com.LimeRoad.base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Avadi\\workspace\\LimeRoad\\src\\test\\resources\\limeroad.feature",
					glue = "com.LimeRoad.stepdef",
					dryRun = false,
					
					plugin = { "pretty",
							"html:Reports/nykaa.html", 
							"json:Reports/nykaa.json",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class TestRunner extends BaseClass {
	
	
	
	

}
