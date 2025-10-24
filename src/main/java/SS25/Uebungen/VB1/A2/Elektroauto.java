package SS25.Uebungen.VB1.A2;

public class Elektroauto extends Fahrzeug {
    @Override
    public void fahre() {
        System.out.println("Elektroauto");
    }

    @Override
    public double tankstand() {
        return 80.0;
    }
}
