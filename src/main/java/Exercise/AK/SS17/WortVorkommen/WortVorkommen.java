package Exercise.AK.SS17.WortVorkommen;

import java.util.*;

public class WortVorkommen {
    Map<Wort, List<Position>> wortVorkommen;

    public WortVorkommen(){
        wortVorkommen = new HashMap<>();
    }
    public void einfuegen(Wort w, Position position){
        if(!wortVorkommen.containsKey(w)){
            List<Position> positions = new ArrayList<>();
            positions.add(position);
            wortVorkommen.put(w, positions);
        } else {
            wortVorkommen.get(w).add(position);
        }
    }

    public Collection<Position> holeAlle(Wort w){
        if(wortVorkommen.containsKey(w)){
            return wortVorkommen.get(w);
        } else {
            return new ArrayList<>();
        }
    }

    public Position holeLetztePosition(Wort w){
        List<Position> positionsWithWort = wortVorkommen.get(w);
        if(positionsWithWort != null && !positionsWithWort.isEmpty()){
            return positionsWithWort.get(positionsWithWort.size()-1);
        } else {
            return null;
        }
    }

    public int anzahlVorkommen(Wort w){
        if(wortVorkommen.containsKey(w)){
            return wortVorkommen.get(w).size();
        } else {
            return 0;
        }
    }
}
