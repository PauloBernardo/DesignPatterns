package com.company.Visitor;

public class Liquor implements Visitable{
    private final double price;

    Liquor(double price) {
        this.price = price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return this.price;
    }
}
