package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled;

    public void pressButton(String drinkName) {
    }

    public boolean hasCanInCompartment() {
        return filled;
    }

    public void fill() {
        filled = true;
    }
}
