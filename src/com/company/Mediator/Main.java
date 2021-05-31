package com.company.Mediator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Mediator");

        StockMediator nyse = new StockMediator();

        GormanSlacks broker = new GormanSlacks(nyse);
        JTPoorMan broker2 = new JTPoorMan(nyse);
        WTRichMan broker3 = new WTRichMan(nyse);

        broker.setCollCode(22);
        broker2.setCollCode(33);
        broker3.setCollCode(44);

        broker.saleOffer("MSFT", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("MSFT", 100);
        broker2.saleOffer("NRG", 10);

        broker3.saleOffer("APPLE", 500);
        broker3.buyOffer("NRG", 10);

        broker.buyOffer("NRG", 10);
        broker.buyOffer("APPLE", 200);

        nyse.getStockOfferings();

        System.out.println();
        broker2.saleOffer("NRG", 10);
        broker2.buyOffer("APPLE", 500);

        nyse.getStockOfferings();
    }
}
