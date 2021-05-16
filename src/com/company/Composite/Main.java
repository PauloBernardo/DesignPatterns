package com.company.Composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Composite");

        ProductComponent everyProduct = new ProductGroup("Every Product");
        ProductComponent packOfCookies = new ProductGroup("Pack of cookies - 10 units");
        addProductsToProductGroup(packOfCookies, "Cookie", 2, 10);

        ProductComponent packOfBeers = new ProductGroup("Pack of beers - 6 unit");
        addProductsToProductGroup(packOfBeers, "Beer", 5, 6);

        ProductComponent pizza = new Product("Mozzarella pizza", 10);

        everyProduct.addProductComponent(packOfCookies);
        everyProduct.addProductComponent(packOfBeers);
        everyProduct.addProductComponent(pizza);

        System.out.println("\n-> Every product description and price");
        System.out.println(everyProduct.getDescription());
        System.out.println(everyProduct.getPrice());

        System.out.println("\n-> Pack of Beers description and price");
        System.out.println(packOfBeers.getDescription());
        System.out.println(packOfBeers.getPrice());

        System.out.println("\n-> Pack of cookies description and price");
        System.out.println(packOfCookies.getDescription());
        System.out.println(packOfCookies.getPrice());

        System.out.println("\n-> Pizza description and price");
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
    }

    public static void addProductsToProductGroup(ProductComponent productComponent, String description, float price, int count) {
        for (int i = 0; i < count; i++) {
            productComponent.addProductComponent(new Product(description, price));
        }
    }
}
