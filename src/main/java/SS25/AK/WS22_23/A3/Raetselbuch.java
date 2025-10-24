package SS25.AK.WS22_23.A3;

public class Raetselbuch extends Buch implements IstEinmalSpielbar {

    boolean einmalSpielbar;

    public Raetselbuch(String name, int preisInCent, int gewichtInGramm, int seitenanzahl, boolean einmalSpielbar) {
        super(name, preisInCent, gewichtInGramm, seitenanzahl);
        this.einmalSpielbar = einmalSpielbar;
    }

    @Override
    public boolean einmalSpielbar() {
        return einmalSpielbar;
    }
}
