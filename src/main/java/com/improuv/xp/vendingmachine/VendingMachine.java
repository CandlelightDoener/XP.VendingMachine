package com.improuv.xp.vendingmachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private Map<String, Integer> drinks = new HashMap<String, Integer>();
    private Compartment compartment = new Compartment();

    public void pressButton(String drinkName) {
        if(hasCansInside(drinkName)) {
            compartment.add(drinkName);
            decreaseAmountOfCans(drinkName);
        }
    }

    private void decreaseAmountOfCans(String drinkName) {
        int newAmount = drinks.get(drinkName) - 1;
        drinks.put(drinkName, newAmount);
    }

    public boolean hasCanInCompartment() {
        return ! compartment.isEmpty();
    }

    public boolean hasCanInCompartment(String drinkName) {
        return compartment.hasCan(drinkName);
    }

    public void clearCompartment() {
        compartment.clear();
    }

    private boolean hasCansInside(String drinkName) {
        if(drinks.containsKey(drinkName)) {
            return drinks.get(drinkName) != 0;
        }

        return false;
    }

    public int noOfCansInside(String drinkName) {
        if(drinks.containsKey(drinkName)) {
            return drinks.get(drinkName);
        }

        return 0;
    }

    public void addCans(int amount, String drinkName) {
        if(drinks.containsKey(drinkName)) {
            amount += drinks.get(drinkName);
        }

        drinks.put(drinkName, amount);
    }
}
