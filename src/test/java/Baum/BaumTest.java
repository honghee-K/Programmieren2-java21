package Baum;

import Exercise.Uebungen.Lek22.Baum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaumTest {

    @Test
    void testSize(){
        Baum<Integer> baum = new Baum<>();
        baum.einfuegen(10);
        baum.einfuegen(5);
        baum.einfuegen(15);

        assertEquals(3, baum.size());
    }

    @Test
    void testSizeEmpty(){
        Baum<Integer> baum = new Baum<>();

        assertEquals(0, baum.size());
    }
}
