package SS25.Uebungen.VB1.A2;

public class Fahrrad extends Fahrzeug {
    @Override
    public void fahre() {
        System.out.println("Fahrrad");
    }

    @Override
    public double tankstand() {
        return 0.0;
    }
}
