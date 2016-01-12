package com.improuv.xp.vendingmachine;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:build/cucumber-html-report")
public class VendingMachineCucumberTests {

    @Test
    public void canaryCucumberTest() {}
}
