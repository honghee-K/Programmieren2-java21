package WS25.Lek14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PunktTest {

    @Test
    void testVerschiebePunkt() {
        Punkt punkt = new Punkt();
        punkt.verschiebePunkt(1910, 1070);
        assertEquals(1910, punkt.x);
        assertEquals(1070, punkt.y);
    }

    @Test
    void testNegativeZahlen() {
        Punkt punkt = new Punkt();
        assertThrows(RuntimeException.class, () -> punkt.verschiebePunkt(-1910, 1080));
    }

    @Test
    void testZuGross() {
        Punkt punkt = new Punkt();
        assertThrows(RuntimeException.class, () -> punkt.verschiebePunkt(1921, 1081));
    }
}
