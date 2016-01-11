package com.improuv.canary;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Simply run this class, either in your IDE or on your command line. It will
 * pick up all the feature files in the resources under
 * com.improuv.vendingmachine.controller.cucumber and run them as Cucumber tests.
 *
 * You need to write some glue code which maps the steps from your feature files
 * to your business code. Do this e.g. in the 'Steps' class.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:build/cucumber-html-report")
public class CanaryCucumberTest {

    @Test
    public void canaryCucumberTest() throws Exception {


    }
}
