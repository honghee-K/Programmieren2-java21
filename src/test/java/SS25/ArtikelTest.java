package SS25;

import SS25.AK.WS22_23.A3.Artikel;
import SS25.AK.WS22_23.A3.Main;
import SS25.AK.WS22_23.A3.Raetselbuch;
import SS25.AK.WS22_23.A3.Raetselspiel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArtikelTest {

    @Test
    public void testFilterEinmalSpielbar() {
        List<Artikel> artikelTestList = new ArrayList<>();
        Raetselspiel raetselspiel1 = new Raetselspiel("A", 450, 300, true);
        Raetselspiel raetselspiel2 = new Raetselspiel("B", 450, 300, false);
        Raetselbuch raetselbuch1 = new Raetselbuch("B", 450, 300, 30, false);


        artikelTestList.add(raetselspiel1);
        artikelTestList.add(raetselspiel2);
        artikelTestList.add(raetselbuch1);


        Main main = new Main();
        main.einmalSpielbar(artikelTestList);
        assertEquals(1, main.einmalSpielbar(artikelTestList).size());

    }
}
