package com.company.Delegation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Delegation");

        Window window = new Window(4.0, 5.0);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Square square = new Square();

        System.out.println("Measure of the window area:");
        System.out.println("Rectangle: " + window.area(rectangle));
        System.out.println("Triangle: " + window.area(triangle));
        window.setHeight(4.0);
        System.out.println("Square: " + window.area(square));
        System.out.println("No shape: " + window.area());
    }
}
