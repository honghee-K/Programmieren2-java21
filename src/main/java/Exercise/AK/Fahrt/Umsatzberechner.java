package Exercise.AK.Fahrt;

import java.util.ArrayList;
import java.util.List;

public class Umsatzberechner {
    public double berechneGesamtumsatz(List<Fahrzeug> fahrzeugList){
        double umsatz = 0.0; //local 변수는 항상 초기화
        for(Fahrzeug fahrzeug : fahrzeugList){
            for(Fahrt f : fahrzeug.getFahrtenbuch()){
                umsatz += fahrzeug.berechneEntgelte(f);
            }
        }
        return umsatz;
    }

    public double berechneElektroumsatz(List<Fahrzeug> fahrzeugList){
        List<Fahrzeug> elektroFahrzeugList = new ArrayList<>();
        for(Fahrzeug fahrzeug : fahrzeugList){
            if(fahrzeug instanceof EFahrzeug){
                elektroFahrzeugList.add(fahrzeug);
            }
        }
        return berechneGesamtumsatz(elektroFahrzeugList);
    }
}
