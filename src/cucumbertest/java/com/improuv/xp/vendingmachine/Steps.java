package com.improuv.xp.vendingmachine;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Steps {

    private VendingMachine vendingMachine;

    @Given("^a filled vending machine$")
    public void aFilledVendingMachine() throws Throwable {
        vendingMachine = new VendingMachine();
        vendingMachine.fill();
    }

    @Given("^an empty vending machine$")
    public void anEmptyVendingMachine() throws Throwable {
        vendingMachine = new VendingMachine();
    }

    @And("^it ran out of \"([^\"]*)\"$")
    public void itRanOutOf(String drinkName) throws Throwable {
        vendingMachine.clearDrawer(drinkName);
    }

    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheButton(String drinkName) throws Throwable {
        vendingMachine.pressButton(drinkName);
    }

    @Then("^no can appears in the compartment$")
    public void noCanAppearsInTheCompartment() throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(), is(false));
    }

    @Then("^a \"([^\"]*)\" can appears in the compartment$")
    public void aCanAppearsInTheCompartment(String drinkName) throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(drinkName), is(true));
    }
}
