package WS25.Tutorium.Getraenkevoerrakte;

//Zusätzliche Aufgabe Lek 15.Ü4
public abstract class Getraenke {

    String herkunft;
    String sorte;
    double gehalt;

    public Getraenke(String herkunft, String sorte, double gehalt) {
        this.herkunft = herkunft;
        this.sorte = sorte;
        this.gehalt = gehalt;
    }

}
