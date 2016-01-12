package com.improuv.xp.vendingmachine;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class DrinksTest {

    Drinks drinks;

    @Before
    public void setUp() throws Exception {
        drinks = new Drinks();
    }

    @Test
    public void canAddCans() throws Exception {
        drinks.addCans(3,"Coke");
        assertThat(drinks.amountOfCans("Coke"), is(3));
    }

    @Test
    public void canHoldMultipleCans() throws Exception {
        drinks.addCans(2,"Coke");
        drinks.addCans(4,"Fanta");
        assertThat(drinks.amountOfCans("Coke"), is(2));
        assertThat(drinks.amountOfCans("Fanta"), is(4));
    }
}
