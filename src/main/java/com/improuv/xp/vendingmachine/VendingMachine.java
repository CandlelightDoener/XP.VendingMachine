package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled;
    private String emptyDrawer;
    private Compartment compartment = new Compartment();

    public void pressButton(String drinkName) {
        if(filled && !drinkName.equals(emptyDrawer))
            compartment.add(drinkName);
    }

    public boolean hasCanInCompartment() {
        return compartment.isEmpty();
    }

    public boolean hasCanInCompartment(String drinkName) {
        return compartment.hasCan(drinkName);
    }

    public void fill() {
        filled = true;
    }

    public void clearDrawer(String drinkName) {
        emptyDrawer = drinkName;
    }

    public void clearCompartment() {
        compartment.clear();
    }
}
