package WS25.Lek15;

import static org.junit.jupiter.api.Assertions.*;

import WS25.Tutorium.Getraenkevoerrakte.Bier;
import WS25.Tutorium.Getraenkevoerrakte.RotWein;
import WS25.Tutorium.Getraenkevoerrakte.WeissWein;
import org.junit.jupiter.api.Test;

public class GetraenkTest {

    @Test
    public void testBier() {
        Bier bier = new Bier("Eichhofen", "Helles", 5.0);
        assertEquals("Eichhofen", bier.herkunft);
        assertEquals("Helles", bier.sorte);
        assertEquals(5.0, bier.gehalt);
        assertFalse(bier.istAlkoholfrei());
        System.out.println(bier.toString());
    }

    @Test
    public void testWeisswein() {
        WeissWein weisswein = new WeissWein("Randersacker", "Silvaner", 12.5, 2022);
        assertEquals("Randersacker", weisswein.herkunft);
        assertEquals("Silvaner", weisswein.sorte);
        assertEquals(12.5, weisswein.gehalt);
        assertEquals(2022, weisswein.jahrgang);
        assertFalse(weisswein.istAlkoholfrei());
        System.out.println(weisswein.toString());
    }

    @Test
    public void testRotwein() {
        RotWein rotwein = new RotWein("Lauda-Königshofen", "Rose", 12.5, 2021);
        assertEquals("Lauda-Königshofen", rotwein.herkunft);
        assertEquals("Rose", rotwein.sorte);
        assertEquals(12.5, rotwein.gehalt);
        assertEquals(2021, rotwein.jahrgang);
        assertFalse(rotwein.istAlkoholfrei());
        System.out.println(rotwein.toString());
    }
}
