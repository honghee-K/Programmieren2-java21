package WS25.Lek14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class KugelvolumenTest {
    Kugelvolumen kugelvolumen = new Kugelvolumen();
    @Test
    void testCompareKugelvolumen() {


        assertEquals(0, kugelvolumen.berechneKugelvolumen(0), 0.001);

        assertEquals(4.188, kugelvolumen.berechneKugelvolumen(1), 0.001);

        assertEquals(4.0 / 3.0 * Math.PI * 5 * 5 * 5, kugelvolumen.berechneKugelvolumen(5), 0.001);
    }

    @Test
    void testNegative() {
           // assertEquals(-4.188, kugelvolumen.berechneKugelvolumen(-1), 0.001);

            // try-catch -> fail(); catch (Runtimeexception e)

        }

}

