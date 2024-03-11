package com.LimeRoad.hooks;

import com.LimeRoad.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	
	@Before
	public void setup() {
		
	}

	@After
	public void screenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			screenshot1("tshirt");
			System.out.println("Hooks executed");
		}
		
	}
}
