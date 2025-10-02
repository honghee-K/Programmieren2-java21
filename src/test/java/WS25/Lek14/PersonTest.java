package WS25.Lek14;

import WS25.Lek14.Adresse;
import WS25.Lek14.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testPerson(){
        Person p = new Person("Braun", "Kim", new Adresse("Peter-Schneider", "7", "97074", "Wuerzburg"));

        assertEquals("Braun", p.vorname);
        assertEquals("Kim", p.nachname);
        assertEquals("Peter-Schneider", p.adresse.strasse);
        assertEquals("7", p.adresse.hausnummer);
        assertEquals("97074", p.adresse.postleitzahl);
        assertEquals("Wuerzburg", p.adresse.ort);

    }

    @Test
    void pruefeBedingung(){
        assertThrows(RuntimeException.class, () -> {
            new Person("braun", "Kim", new Adresse("Peter-Schneider", "7", "97074", "Wuerzburg"));
        });
        assertThrows(RuntimeException.class, () -> {
            new Person("Braun", "Kim", new Adresse("peter-Schneider", "7", "97074", "Wuerzburg"));
        });
        assertThrows(RuntimeException.class, () -> {
            new Person("Braun", "Kim", new Adresse("Peter-Schneider", "7", "97074", "wuerzburg"));
        });


    }
}
