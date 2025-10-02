package SS25.Uebungen.VB1.A2;

public class Main {
    public static void main(String[] args) {
        Fahrzeug[] array = {new Auto(), new Auto(), new Fahrrad(), new Elektroauto()};

        // 3
        for (int i = 0; i < array.length; i++) {
            array[i].fahre();
        }
    }
}
