package WS25.Tutorium.Getraenkevoerrakte;

public abstract class Wein extends Getraenk {
    public int jahrgang;

    public Wein(String herkunft, String sorte, double gehalt, int jahrgang) {
        super(herkunft, sorte, gehalt);
        this.jahrgang = jahrgang;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJahrgang: " + jahrgang;
    }
}
