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
    public void filledMachine_deliversAnything_whenButtonPresssed() throws Exception {
        vendingMachine.fill();
        vendingMachine.pressButton("blubb 1234 :-)");
        assertThat(vendingMachine.hasCanInCompartment("blubb 1234 :-)"), is(true));
    }

    @Test
    public void filledMachine_whichRanOutOfDrink_wontDeliverDrink() throws Exception {
        vendingMachine.fill();
        vendingMachine.clearDrawer("asdf");
        vendingMachine.pressButton("asdf");
        assertThat(vendingMachine.hasCanInCompartment("asdf"), is(false));
    }

    @Test
    public void filledMachine_whichRanOutOfDrink_willStillDeliverOtherDrink() throws Exception {
        vendingMachine.fill();
        vendingMachine.clearDrawer("aaa");
        vendingMachine.pressButton("bbb");
        assertThat(vendingMachine.hasCanInCompartment("aaa"), is(false));
    }


}
