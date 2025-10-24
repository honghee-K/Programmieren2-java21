package SS25.Konfigurationsdatei;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import SS25.AK.SS20.Konfigurationsdatei.Konfigurator;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class KonfigurationsMapTest {

    @Test
    public void testKonfigurationsMap() {
        Konfigurator konfigurator = new Konfigurator();
        Map<String, String> konfigurationsMap = konfigurator.teilKonfigurationsdateiAuf();
        assertTrue(konfigurationsMap.containsKey("mail.transport.protocol"));
        assertEquals("smtp", konfigurationsMap.get("mail.transport.protocol"));
    }
}
