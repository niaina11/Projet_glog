package domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.glog.domain.Currency;
import com.glog.domain.*;

public class CurrencyTest {

    @Test
    public void testGetSymbol() {
        Currency euro = new Currency("EUR", "Euro");
        assertEquals("EUR", euro.getSymbol());
    }

    @Test
    public void testGetName() {
        Currency dollar = new Currency("USD", "US Dollar");
        assertEquals("US Dollar", dollar.getName());
    }
}
