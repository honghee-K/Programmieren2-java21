package SS25.AK.SS17.WortVorkommen;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Wort und = new Wort("und");
        WortVorkommen woerter = new WortVorkommen();
        woerter.einfuegen(und, new Position(1, 3));
        woerter.einfuegen(und, new Position(3, 7));
        Position letztePosition = woerter.holeLetztePosition(und);
        Collection<Position> allePositionen = woerter.holeAlle(und);
        int anzahlVorkommen = woerter.anzahlVorkommen(und);
    }
}
