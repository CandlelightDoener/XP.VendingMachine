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
    public void deliveringCanReducesDrinksInside() throws Exception {
        vendingMachine.addCans(2,"Coke");
        vendingMachine.pressButton("Coke");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(1));
    }

    @Test
    public void drinksReducedOnlyWhenEnoughDrinksInside() throws Exception {
        vendingMachine.pressButton("Coke");
        assertThat(vendingMachine.noOfCansInside("Coke"), is(0));
    }


}
