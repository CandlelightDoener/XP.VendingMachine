package com.improuv.xp.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CompartmentTest {

    private Compartment compartment;

    @Before
    public void setUp() throws Exception {
        compartment = new Compartment();
    }

    @Test
    public void isEmptyInitially() throws Exception {
        assertThat(compartment.isEmpty(), is(true));
    }

    @Test
    public void isNotEmptyAfterAddingCan() throws Exception {
        compartment.add("blubb");
        assertThat(compartment.isEmpty(), is(false));
    }

    @Test
    public void holdsCanWhichWasAdded() throws Exception {
        compartment.add("blubb");
        assertThat(compartment.hasCan("blubb"), is(true));
    }

    @Test
    public void holdsJustTheCanWhichWasAdded() throws Exception {
        compartment.add("aaa");
        assertThat(compartment.hasCan("bbb"), is(false));
    }

    @Test
    public void hasNoCansAfterClearing() throws Exception {
        compartment.add("blubb");
        compartment.clear();
        assertThat(compartment.hasCan("blubb"), is(false));
    }
}
