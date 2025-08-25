package com.glog.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.glog.domain.Currency;
import com.glog.domain.Money;

public class MoneyTest {

    @Test
    public void testGetAmount() {
        Currency euro = new Currency("EUR", "Euro");
        Money money = new Money(100.50, euro);
        assertEquals(100.50, money.getAmount());
    }

    @Test
    public void testGetCurrency() {
        Currency yen = new Currency("JPY", "Japanese Yen");
        Money money = new Money(5000, yen);
        assertEquals("JPY", money.getCurrency().getSymbol());
    }
}