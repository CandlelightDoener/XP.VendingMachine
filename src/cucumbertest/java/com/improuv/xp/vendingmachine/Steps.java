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

    @Given("^it ran out of \"([^\"]*)\"$")
    public void itRanOutOf(String drinkName) throws Throwable {
        vendingMachine.clearDrawer(drinkName);
    }

    @Given("^(\\d+) cans of \"([^\"]*)\"$")
    public void cansOf(int arg0, String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    
    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheButton(String drinkName) throws Throwable {
        vendingMachine.pressButton(drinkName);
    }

    @When("^I clear the compartment$")
    public void iClearTheCompartment() throws Throwable {
        vendingMachine.clearCompartment();
    }

    @Then("^no can is in the compartment$")
    public void noCanIsInTheCompartment() throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(), is(false));
    }

    @Then("^a \"([^\"]*)\" is in the compartment$")
    public void aIsInTheCompartment(String drinkName) throws Throwable {
        assertThat(vendingMachine.hasCanInCompartment(drinkName), is(true));
    }

    @Then("^there is (\\d+) cans of \"([^\"]*)\" left$")
    public void thereIsCansOfLeft(int amount, String drinkName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
