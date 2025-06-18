package Exercise.AK.Fahrt;

public class Motorroller extends Fahrzeug {

    @Override
    public double berechneEntgelte(Fahrt f) {
        return 3.15 * f.km;
    }
}
