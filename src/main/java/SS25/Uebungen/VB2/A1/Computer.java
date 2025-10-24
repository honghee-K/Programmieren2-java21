package SS25.Uebungen.VB2.A1;

public class Computer implements Bedienbar {

    int counter = 0;

    @Override
    public void einschalten() {
        counter++;
        System.out.println("Computer wurde zum " + counter + ". mal eingeschaltet");
    }

    @Override
    public void ausschalten() {
        System.out.println("Computer wurde ausgeschaltet");
    }
}
