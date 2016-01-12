package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled;
    String emptyDrawer;
    String buttonPressed;

    public void pressButton(String drinkName) {
        buttonPressed = drinkName;
    }

    public boolean hasCanInCompartment() {
        if (buttonPressed.equals(emptyDrawer)) {
            return false;
        }
        return filled;
    }

    public void fill() {
        filled = true;
    }

    public void clearDrawer(String drinkName) {
        emptyDrawer = drinkName;
    }
}
