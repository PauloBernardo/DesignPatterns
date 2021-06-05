package com.company.Delegation;

public class Rectangle implements Shape{
    @Override
    public Double area(Double width, Double height) {
        return width * height;
    }

    @Override
    public Double perimeter() {
        return null;
    }
}
