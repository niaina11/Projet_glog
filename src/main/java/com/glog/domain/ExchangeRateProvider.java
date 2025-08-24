package com.glog.domain;


import java.util.HashMap;
import java.util.Map;

public class ExchangeRateProvider {
    private Map<String, Double> rates = new HashMap<String, Double>();

    public void addRate(String fromSymbol, String toSymbol, double rate) {
        rates.put(fromSymbol + toSymbol, rate);
    }

    public double getRate(String fromSymbol, String toSymbol) {
        if (!rates.containsKey(fromSymbol + toSymbol)) {
            throw new IllegalArgumentException("Exchange rate not found.");
        }
        return rates.get(fromSymbol + toSymbol);
    }
}
