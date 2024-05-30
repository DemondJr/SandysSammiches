package com.pluralsight;

import java.util.List;

public class NewOrder {
private List<Sammiches> sammichesList;
private List<Drinks> drinks;
private List<Chips> chips;
private Customer customer;

    public NewOrder(List<Sammiches> sammichesList, List<Drinks> drinks, List<Chips> chips, Customer customer) {
        this.sammichesList = sammichesList;
        this.drinks = drinks;
        this.chips = chips;
        this.customer = customer;
    }

    public List<Sammiches> getSammichesList() {
        return sammichesList;
    }

    public void setSammichesList(List<Sammiches> sammichesList) {
        this.sammichesList = sammichesList;
    }

    public List<Drinks> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drinks> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
