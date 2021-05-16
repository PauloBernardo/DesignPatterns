package com.company.Composite;

public class Product extends ProductComponent{
    private String description;
    private float price;

    public Product(String description, float price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
