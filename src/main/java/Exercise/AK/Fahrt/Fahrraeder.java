package Exercise.AK.Fahrt;


public class Fahrraeder extends Fahrzeug{
    @Override
    public double berechneEntgelte(Fahrt f){
        return 0.125 * f.min;
    }

}
