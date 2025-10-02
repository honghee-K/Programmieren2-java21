package SS25.Morsen;

import SS25.AK.Morsen.Morse;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    public void TestZeichenketteToMorse(){
        Morse morse = new Morse();
        String str = "CAT";
        System.out.println(morse.zeichenketteToMorse(str));

    }
}
