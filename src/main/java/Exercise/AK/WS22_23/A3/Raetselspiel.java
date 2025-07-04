package Exercise.AK.WS22_23.A3;

public class Raetselspiel extends Artikel implements IstEinmalSpielbar {
    boolean einmalSpielbar;

    public Raetselspiel(String name, int preisInCent, int gewichtInGramm, boolean einmalSpielbar){
        super(name, preisInCent, gewichtInGramm);
        this.einmalSpielbar = einmalSpielbar;
    }
    @Override
    public boolean einmalSpielbar(){
        return einmalSpielbar;
    }
}
