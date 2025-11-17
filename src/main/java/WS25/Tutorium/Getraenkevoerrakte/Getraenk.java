package WS25.Tutorium.Getraenkevoerrakte;

// Zusätzliche Aufgabe Lek 15.u4
public class Getraenk {

    public String herkunft;
    public String sorte;
    public double gehalt;

    public Getraenk(String herkunft, String sorte, double gehalt) {
        this.herkunft = herkunft;
        this.sorte = sorte;
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Herkunft: " + herkunft + "\n" + "Sorte: "
                + sorte + "\n" + "Alkoholgehalt: "
                + gehalt + "\n" + "alkoholfrei: "
                + (istAlkoholfrei() ? "ja" : "nein");
    }

    public boolean istAlkoholfrei() {
        return gehalt < 0.5;
    }
}
