package com.improuv.xp.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class VendingMachineContentTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() throws Exception {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void emptyMachine_hasNoCansInside() throws Exception {
        assertThat(vendingMachine.noOfCansInside("Coke"), is(0));
    }

    @Test
    public void afterAddingCans_theyAreInside() throws Exception {
        vendingMachine.addCans(3,"Coke");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(3));
    }

    @Test
    public void thereCanBeMultipleDrinksInside() throws Exception {
        vendingMachine.addCans(2,"Coke");
        vendingMachine.addCans(4,"Fanta");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(2));
        assertThat(vendingMachine.noOfCansInside("Fanta"), is(4));
    }

    @Test
    public void drinksReducedOnlyWhenEnoughDrinksInside() throws Exception {
        vendingMachine.pressButton("Coke");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(0));
    }

    @Test
    public void deliveringCanReducesDrinksInside() throws Exception {
        vendingMachine.addCans(2,"Coke");
        vendingMachine.pressButton("Coke");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(1));
    }
}
