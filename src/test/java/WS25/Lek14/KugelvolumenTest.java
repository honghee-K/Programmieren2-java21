package WS25.Lek14;

import WS25.Lek14.Kugelvolumen;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KugelvolumenTest {

    @Test
    void testCompareKugelvolumen (){
        Kugelvolumen kugelvolumen = new Kugelvolumen();
        assertEquals(0, kugelvolumen.berechneKugelvolumen(0), 0.001);
        assertEquals(4.188, kugelvolumen.berechneKugelvolumen(1), 0.001);
        assertEquals(4.0/3.0 * Math.PI * 5 * 5 * 5, kugelvolumen.berechneKugelvolumen(5), 0.001);
/*
        assertEquals(-4.188, kugelvolumen.berechneKugelvolumen(-1), 0.001);
*/
    }

}
