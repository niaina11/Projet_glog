package com.glog.domain;


public class Currency {
    private String symbol;
    private String name;

    public Currency(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}
