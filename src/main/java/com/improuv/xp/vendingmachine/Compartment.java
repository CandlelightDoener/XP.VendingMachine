package com.improuv.xp.vendingmachine;

import java.util.HashSet;
import java.util.Set;

public class Compartment {

    private Set<String> content = new HashSet<String>();

    public void add(String drinkName) {
        content.add(drinkName);
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public boolean hasCan(String drinkName) {
        return content.contains(drinkName);
    }

    public void clear() {
        content.clear();
    }
}
