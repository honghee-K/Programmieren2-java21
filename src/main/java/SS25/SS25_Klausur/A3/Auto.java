package SS25.SS25_Klausur.A3;

// 38 Punkte
// Die Aufgabenverteilung ist nicht genau.
// a) Auto(name, kraftstoffart), nur kann 5 kraft-arten erstellen. Fahre-bestand - Beim "bestand" handelt sich um eine
// List aller Autos.
// b) suchen() Mit Stream API nach Kraf-art
// c) erzeugeMap(), key: kraft-art
// d) J Unit-Test : 3 Autos(Angaben gegeben), anzahl der kraft-art "Elektro" mit Hilfe von erzeugeMap()
public class Auto {
    String welchename;
    String kraftstoffart;
    int count;

    public Auto(String welchename, String kraftstoffart) {
        this.welchename = welchename;
        if (count > 6) {
            System.out.println("Man kann nur 5 kraft-arten erstellen.");
            throw new RuntimeException("Man kann nur 5 kraft-arten erstellen.");
            // Ich bin nicht sicher, aber ich habe es ungefähr wie eines von beiden geschrieben.
        }
    }
}
