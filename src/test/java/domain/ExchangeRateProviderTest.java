package domain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.glog.domain.ExchangeRateProvider;

public class ExchangeRateProviderTest {

    @Test
    public void testAddAndGetRate() {
        ExchangeRateProvider provider = new ExchangeRateProvider();
        provider.addRate("EUR", "USD", 1.18);
        assertEquals(1.18, provider.getRate("EUR", "USD"));
    }

    @Test
    public void testGetNonExistentRate() {
        ExchangeRateProvider provider = new ExchangeRateProvider();
        assertThrows(IllegalArgumentException.class, () -> {
            provider.getRate("EUR", "JPY");
        });
    }
}
