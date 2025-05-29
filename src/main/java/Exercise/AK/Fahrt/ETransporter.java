package Exercise.AK.Fahrt;

public class ETransporter extends Fahrzeug implements EFahrzeug{
    @Override
    public double berechneEntgelte(Fahrt f){
        if(f.min <= 60){
            return 0.03 * f.km;
        } else return (0.25 * f.km) + 0.03 * f.km; // Doppelte Code?
    }
    @Override
    public void kehreZurueckZurLadestation(){
        System.out.println("E-Transporter wurde zur Ladestation zurückgekehrt.");
    }
}
