package Exercise.AK.Fahrt;

public class Elektroroller extends Fahrzeug implements EFahrzeug{
    @Override
    public double berechneEntgelte(Fahrt f){
         return 3.15 * f.km;
    }

    @Override
    public void kehreZurueckZurLadestation(){
        System.out.println("Elektroroller wurde zur Ladestation zurückgekehrt.");
    }


}
