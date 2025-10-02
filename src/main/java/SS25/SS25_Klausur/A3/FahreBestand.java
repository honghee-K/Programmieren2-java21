/*
package Exercise.SS25.A3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FahreBestand {

    List<Auto> bestand = new ArrayList<>();

    public FahreBestand(List<Auto> bestand){
        this.bestand = bestand;
    }
    public List<Auto> suchen (String searchArt){
        return bestand.stream().filter(a -> a.kraftstoffart.equals(searchArt)).toList();
    }

    public Map<String, List<Auto>> erzeugeMap(String kraftstoffart, List<Auto> autos){
        Map<String, List<Auto>> map = new HashMap<>();
        if(map.containsKey(kraftstoffart)){
            map.put(kraftstoffart, autos);
        } else {
            map.get(kraftstoffart).add(autos); //addAll.....
        }
        return map;
    }
}
*/
