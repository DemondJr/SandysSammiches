package com.pluralsight;

import java.util.Collections;
import java.util.List;

public class Sammiches {
    private final List<Toppings> toppings = List.of();
    private String breadType;
    private String size;
    List<Toppings> toppingsList;
    private boolean isToasted;

    public Sammiches(String breadType, String size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        this.toppingsList = toppingsList;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }
}
