package com.pluralsight;

public class Product {
    private String ID;
    private String name;
    private double price;

    public Product(String ID, String name, double price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
