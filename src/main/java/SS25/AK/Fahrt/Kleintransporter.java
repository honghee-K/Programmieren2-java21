package SS25.AK.Fahrt;

public class Kleintransporter extends Fahrzeug {
    @Override
    public double berechneEntgelte(Fahrt f) {
        if (f.min <= 60) {
            return 0.03 * f.km;
        } else return (0.25 * f.km) + 0.03 * f.km; // Doppelte Code?
    }
}
