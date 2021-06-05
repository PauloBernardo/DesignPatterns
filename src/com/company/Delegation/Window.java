package com.company.Delegation;

public class Window {
    private Double width, height;

    public Window(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double area() {
        System.out.println("I don't how to measure the area, so I'm returning 0.");
        return 0.0;
    }

    public Double area(Shape shape) {
        return shape.area(width, height);
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
