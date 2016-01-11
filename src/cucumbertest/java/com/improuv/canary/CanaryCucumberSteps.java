package com.improuv.canary;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class CanaryCucumberSteps {

    MarkedDice markedDice;
    int roll;

    @Given("^a marked dice$")
    public void aMarkedDice() {
        markedDice = new MarkedDice();
    }

    @When("^I roll it$")
    public void iRollIt() throws Throwable {
        roll = markedDice.roll();
    }

    @Then("^it shows (\\d+) dots$")
    public void itShowsDots(int expectedNumberOfDots) throws Throwable {
        assertTrue(roll == 6);
        assertThat(roll, is(6));
    }
}
