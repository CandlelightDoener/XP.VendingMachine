package com.improuv.xp.vendingmachine;

public class Compartment {

    private String content;

    public void add(String drinkName) {
        content = drinkName;
    }

    public boolean isEmpty() {
        return content == null;
    }

    public boolean hasCan(String drinkName) {
        return drinkName.equals(content);
    }

    public void clear() {
        content = null;
    }
}
