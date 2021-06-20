package com.company.ChainOfResponsibility;

public class Numbers {
    private final double number1;
    private final double number2;
    private final String calculationWanted;

    public Numbers(double number1, double number2, String calculationWanted) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculationWanted = calculationWanted;
    }


    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getCalculationWanted() {
        return calculationWanted;
    }
}
