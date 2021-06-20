package com.company.Visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Visitor");

        TaxVisitor taxVisitor = new TaxVisitor();
        TaxHolidayVisitor taxHolidayVisitor = new TaxHolidayVisitor();

        Necessity necessity = new Necessity(4);
        Liquor liquor = new Liquor(20);
        Tobacco tobacco = new Tobacco(10);

        System.out.println("Necessity item with tax: " + necessity.accept(taxVisitor));
        System.out.println("Liquor item with tax: " + liquor.accept(taxVisitor));
        System.out.println("Tobacco item with tax: " + tobacco.accept(taxVisitor));

        System.out.println("Necessity item with tax holiday: " + necessity.accept(taxHolidayVisitor));
        System.out.println("Liquor item with tax holiday: " + liquor.accept(taxHolidayVisitor));
        System.out.println("Tobacco item with tax holiday: " + tobacco.accept(taxHolidayVisitor));
    }
}
