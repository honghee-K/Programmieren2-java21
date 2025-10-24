package SS25.Uebungen.VB2.A4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Superheld> superheldList = new ArrayList<>();
        superheldList.add(new Superheld());
        superheldList.add(new Superheld());

        // Random
        Random random = new Random();

        for (Superheld superheld : superheldList) {
            int randomZahl = random.nextInt(1, 4);
            if (1 == randomZahl) {
                superheld.fliege();
            } else if (2 == randomZahl) {
                superheld.hebeGewicht(100);
            } else {
                superheld.versteckeDich();
            }
        }
    }
}
