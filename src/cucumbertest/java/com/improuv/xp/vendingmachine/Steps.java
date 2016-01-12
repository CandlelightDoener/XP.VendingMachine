package com.improuv.xp.vendingmachine;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

public class Steps {

    private VendingMachine vendingMachine;

    @Given("^a filled vending machine$")
    public void aFilledVendingMachine() throws Throwable {
        vendingMachine = new VendingMachine();
        vendingMachine.fill();
    }

    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheButton(String drinkName) throws Throwable {
        vendingMachine.pressButton(drinkName);
    }

    @Then("^a can appears in the compartment$")
    public void aCanAppearsInTheCompartment() throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(), is(true));
    }

    @Given("^an empty vending machine$")
    public void anEmptyVendingMachine() throws Throwable {
        vendingMachine = new VendingMachine();
    }

    @Then("^no can appears in the compartment$")
    public void noCanAppearsInTheCompartment() throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(), is(false));
    }
}
