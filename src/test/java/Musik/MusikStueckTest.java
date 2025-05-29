package Musik;

import Exercise.AK.Musik.MusikStueck;
import Exercise.AK.Musik.MusikStueckSammlung;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MusikStueckTest {

    MusikStueck song1;
    MusikStueck song2;
    MusikStueck song3;
    MusikStueckSammlung sammlung;

    @BeforeEach
    void setup(){
        song1 = new MusikStueck("chacha", "A", 220);
        song2 = new MusikStueck("ala", "A", 180);
        song3 = new MusikStueck("haha", "D", 200);

        sammlung = new MusikStueckSammlung();
        sammlung.musikStueckEinfuegen(song1);
        sammlung.musikStueckEinfuegen(song2);
        sammlung.musikStueckEinfuegen(song3);
    }
    @Test
    void testSortierungNachTitel(){
        List<MusikStueck> musikList = sammlung.getAlleMusikStueckeNachTitel();
        assertEquals("chacha", musikList.get(1).getTitel());
        assertEquals("ala", musikList.get(0).getTitel());
        assertEquals("haha", musikList.get(2).getTitel());
    }

    @Test
    void testSortierungNachLaenge(){
        List<MusikStueck> musikList = sammlung.getAlleMusikStueckNachLaenge();
        assertEquals(180, musikList.get(0).getLaenge());
        assertEquals(200, musikList.get(1).getLaenge());
        assertEquals(220, musikList.get(2).getLaenge());
    }
}
