package org.launchcode;

public class MenuItems {

    private String name;
    private double price;
    private String category;
    private String description;

    public MenuItems(String name, double price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    private void setDescription(String description) {
        this.description = description;
    }
}
