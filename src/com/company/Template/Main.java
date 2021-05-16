package com.company.Template;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Template");

        ItalianHoagie italianHoagie = new ItalianHoagie();

        italianHoagie.makeSandwich();

        System.out.println();

        VeggieHoagie veggieHoagie = new VeggieHoagie();

        veggieHoagie.makeSandwich();

        System.out.println();

        BrazilianHoagie brazilianHoagie = new BrazilianHoagie();

        brazilianHoagie.makeSandwich();
    }
}
