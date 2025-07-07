package Baum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Exercise.AK.BaumVisitor.Baum;
import org.junit.jupiter.api.Test;

public class BaumTest {

    @Test
    void testSize() {
        Baum <Integer> baum = new Baum<>();
        baum.einfuegen(10);
        baum.einfuegen(5);
        baum.einfuegen(15);

        assertEquals(3, baum.size());
    }

    @Test
    void testSizeEmpty() {
        Baum<Integer> baum = new Baum<>();

        assertEquals(0, baum.size());
    }
}
