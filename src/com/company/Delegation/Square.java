package com.company.Delegation;

public class Square implements Shape{
    @Override
    public Double area(Double width, Double height) {
        return width * width;
    }

    @Override
    public Double perimeter() {
        return null;
    }
}
