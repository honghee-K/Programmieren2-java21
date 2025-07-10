package Konfigurationsdatei;

import Exercise.AK.SS20.Konfigurationsdatei.Konfigurator;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class KonfigurationsMapTest {

    @Test
    public void testKonfigurationsMap(){
        Konfigurator konfigurator = new Konfigurator();
        Map<String, String> konfigurationsMap = konfigurator.teilKonfigurationsdateiAuf();
        assertTrue(konfigurationsMap.containsKey("mail.transport.protocol"));
        assertEquals("smtp", konfigurationsMap.get("mail.transport.protocol"));
    }
}
