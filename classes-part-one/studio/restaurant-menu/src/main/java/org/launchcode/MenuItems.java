package org.launchcode;

public class MenuItems {

    private String name;
    private double price;
    private String category;
    private String description;
    private boolean isNew;

    public MenuItems(String name, double price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
