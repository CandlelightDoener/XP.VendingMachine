package com.improuv.xp.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class VendingMachineDeliveryTest {

    private VendingMachine vendingMachine;

    @Before
    public void setUp() throws Exception {
        vendingMachine = new VendingMachine();
    }

    @Test
    public void emptyMachine_hasNothingInCompartment() throws Exception {
        assertThat(vendingMachine.hasCanInCompartment("blubb"), is(false));
    }

    @Test
    public void emptyMachine_deliversNothing_whenButtonPressed() throws Exception {
        vendingMachine.pressButton("blubb");
        assertThat(vendingMachine.hasCanInCompartment("blubb"), is(false));
    }

    @Test
    public void filledMachine_deliversCan_whenButtonPresssed() throws Exception {
        vendingMachine.addCans(1, "blubb");
        vendingMachine.pressButton("blubb");
        assertThat(vendingMachine.hasCanInCompartment("blubb"), is(true));
    }
}
