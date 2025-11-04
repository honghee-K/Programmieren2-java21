package WS25.Lek16;

import WS25.Lek16.schach.Brett;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BrettTest {
    @Test
    public void testKombiniere(){
        Brett b1 = new Brett();
        Brett b2 = new Brett();

        b1.markiereFeld(2,2);
        b2.markiereFeld(4,5);

        Brett neuesBrett = b1.kombiniere(b2);

        for(int i = 1; i <= 8; i++){
            for(int j = 1; j <= 8; j++){
                boolean expected = (i == 2 && j == 2) || (i == 4 && j == 5);
                assertEquals(expected, neuesBrett.gibFeld(i,j));

            }
        }


    }
}
