package com.improuv.xp.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class Drinks {

    private Map<String, Integer>drinks = new HashMap<String, Integer>();

    void decreaseAmountOfCans(String drinkName) {
        if(drinks.get(drinkName) == null)
            throw new IllegalStateException("Can't reduce number of cans for unknown drink " + drinkName);
        int newAmount = drinks.get(drinkName) - 1;

        if(newAmount < 0)
            throw new IllegalStateException("Can't reduce number of " + drinkName + " cans  below zero");

        drinks.put(drinkName, newAmount);
    }

    boolean hasCansInside(String drinkName) {
        if(drinks.containsKey(drinkName)) {
            return drinks.get(drinkName) != 0;
        }

        return false;
    }

    int amountOfCans(String drinkName) {
        if(drinks.containsKey(drinkName)) {
            return drinks.get(drinkName);
        }

        return 0;
    }

    void addCans(int amount, String drinkName) {
        if(amount < 0)
            throw new IllegalStateException("Can't add negative number of cans");

        if(drinks.containsKey(drinkName)) {
            amount += drinks.get(drinkName);
        }

        drinks.put(drinkName, amount);
    }
}
