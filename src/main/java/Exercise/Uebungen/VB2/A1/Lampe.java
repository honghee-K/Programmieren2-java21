package Exercise.Uebungen.VB2.A1;

public class Lampe implements Bedienbar {

    @Override
    public void einschalten() {
        System.out.println("Lampe wurde eingeschaltet");
    }

    @Override
    public void ausschalten() {
        System.out.println("Lampe wurde ausgeschaltet");
    }
}
