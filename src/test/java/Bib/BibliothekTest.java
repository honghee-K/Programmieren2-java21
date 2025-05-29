package Bib;

import Exercise.AK.Bib.Bibliothek;
import Exercise.AK.Bib.Buch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BibliothekTest {
    Buch buch1;
    Buch buch2;
    Buch buch3;
    Buch buch4;
    Bibliothek bib;

    @BeforeEach
    void setup(){
        buch1 = new Buch("Ari", "Bob", "Vangoh", 1500);
        buch2 = new Buch("Ari2", "Bob", "Vangoh", 1800);
        buch3 = new Buch("Contry", "Ace", "Haha", 1500);
        buch4 = new Buch("GOOD", "Baochao", "Can", 1400);
        List<Buch> buecher = new ArrayList<>(Arrays.asList(buch1, buch2, buch3, buch4));
        bib = new Bibliothek();
        bib.hinzufuegeBuecher(buecher);
    }

    @Test
    void sortierungTest(){
    bib.sortiereNachAutorDannNachName();
    List<Buch> sortierteList = bib.getBibList();

    assertEquals(buch3, sortierteList.get(0));
    assertEquals(buch4, sortierteList.get(1));
    assertEquals(buch1, sortierteList.get(2));
    assertEquals(buch2, sortierteList.get(3));

    }
}
