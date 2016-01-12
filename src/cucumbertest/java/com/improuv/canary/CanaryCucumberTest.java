package com.improuv.canary;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Simply run this class as JUnit Test, either in your IDE or on your command
 * line. It will pick up all the feature files (written in Gherkin) under
 * resources/com.improuv.canary and execute them.
 *
 * In general, you need to write some glue code which maps the steps in your
 * feature files to your business code. Put them e.g. in your
 * "CanaryCucumberSteps" class.
 *
 * If you're lucky your IDE supports you mapping Gherkin to glue code. If not,
 * just run the tests and find code-snippets for the missing parts in the
 * console output.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = "html:build/cucumber-html-report")
public class CanaryCucumberTest {

    @Test
    public void canaryCucumberTest() throws Exception {


    }
}
