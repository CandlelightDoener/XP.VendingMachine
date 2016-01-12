package com.improuv.xp.vendingmachine;

public class VendingMachine {
    private boolean filled; //deprecated after this feature

    //TODO: find common concept
    private String filledInDrink;
    private int filledInNumberOfDrinks;

    private String emptyDrawer; //deprecated after this feature

    private Compartment compartment = new Compartment();

    public void pressButton(String drinkName) {
        if(filled && !drinkName.equals(emptyDrawer))
            compartment.add(drinkName);
    }

    public boolean hasCanInCompartment() {
        return ! compartment.isEmpty();
    }

    public boolean hasCanInCompartment(String drinkName) {
        return compartment.hasCan(drinkName);
    }

    //später wird im AT statt fill() ein paar mal addCans(x,y) aufgerufen
    public void fill() {
        filled = true;
    }

    public void clearDrawer(String drinkName) {
        emptyDrawer = drinkName;
    }

    public void clearCompartment() {
        compartment.clear();
    }

    public int noOfCansInside(String drinkName) {
        if(filledInDrink != null)
            return filledInNumberOfDrinks;

        return 0;
    }

    public void addCans(int amount, String drinkName) {
        filledInDrink = drinkName;
        filledInNumberOfDrinks = amount;
    }
}
