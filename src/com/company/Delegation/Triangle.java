package com.company.Delegation;

public class Triangle implements Shape{
    @Override
    public Double area(Double width, Double height) {
        return width * height / 2;
    }

    @Override
    public Double perimeter() {
        return null;
    }
}
