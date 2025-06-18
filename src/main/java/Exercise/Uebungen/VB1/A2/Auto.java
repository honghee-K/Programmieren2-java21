package Exercise.Uebungen.VB1.A2;

public class Auto extends Fahrzeug {
    @Override
    public void fahre() {
        System.out.println("Auto");
    }

    @Override
    public double tankstand() {
        return 60.0;
    }
}
