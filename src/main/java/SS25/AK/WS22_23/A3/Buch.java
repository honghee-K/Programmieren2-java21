package SS25.AK.WS22_23.A3;

public class Buch extends Artikel {

    int seitenanzahl;

    public Buch(String name, int preisInCent, int gewichtInGramm, int seitenanzahl) {
        super(name, preisInCent, gewichtInGramm);
        this.seitenanzahl = seitenanzahl;
    }

    public int berechnePreis() {
        return preisInCents / seitenanzahl;
    }
}
