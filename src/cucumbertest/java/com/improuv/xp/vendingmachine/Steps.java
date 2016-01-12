package com.improuv.xp.vendingmachine;

import cucumber.api.PendingException;
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

    @When("^I press some button$")
    public void iPressSomeButton() throws Throwable {
        vendingMachine.pressButton();
    }

    @Then("^a can is thrown out$")
    public void aCanIsThrownOut() throws Throwable {
        assertTrue(vendingMachine.threwOutCan());
    }
}
