package Exercise.Uebungen.VB2.A1;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Bedienbar[] bedienbars = {new Lampe(), new Lampe(), computer, new Lampe(), computer};

        // ? 이게 왜 "Schreiben Sie eine Methode, die eine Liste von Bedienbar-Objekten nacheinander
        // ein- und ausschaltet."?
        // for(int i = 100; i > 0; i--) {
        for (int j = 0; j < bedienbars.length; j++) {
            bedienbars[j].einschalten();
            bedienbars[j].ausschalten();
        }
        // }
    }
}
