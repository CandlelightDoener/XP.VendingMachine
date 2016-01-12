package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled;
    private String emptyDrawer;
    private String buttonPressed;

    public void pressButton(String drinkName) {
        buttonPressed = drinkName;
    }

    public boolean hasCanInCompartment() {
        return hasCanInCompartment(buttonPressed);
    }

    public void fill() {
        filled = true;
    }

    public void clearDrawer(String drinkName) {
        emptyDrawer = drinkName;
    }

    public boolean hasCanInCompartment(String drinkName) {
        if(filled && buttonPressed != null && !buttonPressed.equals(emptyDrawer) && buttonPressed.equals(drinkName))
            return true;
        return false;
    }
}
