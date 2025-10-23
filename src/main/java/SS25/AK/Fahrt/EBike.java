package SS25.AK.Fahrt;

public class EBike extends Fahrzeug implements EFahrzeug {

    @Override
    public double berechneEntgelte(Fahrt f) {
        return 0.125 * f.min;
    }

    @Override
    public void kehreZurueckZurLadestation() {
        System.out.println("E-Bike wurde zur Ladestation zurückgekehrt.");
    }
}
