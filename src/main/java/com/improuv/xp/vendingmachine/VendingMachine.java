package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled;
    private String emptyDrawer;
    private String buttonPressed;
    private boolean compartmentEmpty;

    public void pressButton(String drinkName) {
        buttonPressed = drinkName;
    }

    public boolean hasCanInCompartment() {
        return hasCanInCompartment(buttonPressed);
    }

    public boolean hasCanInCompartment(String drinkName) {
        if (!filled) {
            return false;
        }

        if (buttonPressed == null) {
            return false;
        }

        if (buttonPressed.equals(emptyDrawer)) {
            return false;
        }

        if (!buttonPressed.equals(drinkName)) {
            return false;
        }

        return true;
    }

    public void fill() {
        filled = true;
    }

    public void clearDrawer(String drinkName) {
        emptyDrawer = drinkName;
    }

    public void clearCompartment() {
        compartmentEmpty = true;
    }
}
