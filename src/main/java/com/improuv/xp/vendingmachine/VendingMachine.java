package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private Drinks drinks = new Drinks();
    private Compartment compartment = new Compartment();

    public void pressButton(String drinkName) {
        if(drinks.hasCansInside(drinkName)) {
            compartment.add(drinkName);
            drinks.decreaseAmountOfCans(drinkName);
        }
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

    public int noOfCansInside(String drinkName) {
        return drinks.amountOfCans(drinkName);
    }

    public void addCans(int amount, String drinkName) {
        drinks.addCans(amount, drinkName);
    }
}
