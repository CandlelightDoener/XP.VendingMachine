package com.improuv.xp.vendingmachine;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class Steps {

    private VendingMachine vendingMachine;

    @Given("^a filled vending machine$")
    public void aFilledVendingMachine() throws Throwable {
        vendingMachine = new VendingMachine();
    }

    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheButton(String drinkName) throws Throwable {
        vendingMachine.pressButton(drinkName);
    }

    @Then("^a can appears in the compartment$")
    public void aCanAppearsInTheCompartment() throws Throwable {
        assertTrue(vendingMachine.hasCanInCompartment());
    }
}
