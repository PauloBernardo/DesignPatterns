package com.company.Mediator;

public class StockOffer {
    private int stockShares = 0;
    private String stockSymbol = "";
    private int colleagueCode = 0;

    public StockOffer(int stockShares, String stockSymbol, int colleagueCode) {
        this.stockShares = stockShares;
        this.stockSymbol = stockSymbol;
        this.colleagueCode = colleagueCode;
    }


    public int getStockShares() {
        return stockShares;
    }

    public void setStockShares(int stockShares) {
        this.stockShares = stockShares;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public int getColleagueCode() {
        return colleagueCode;
    }

    public void setColleagueCode(int colleagueCode) {
        this.colleagueCode = colleagueCode;
    }
}
