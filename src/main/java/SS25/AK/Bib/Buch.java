package SS25.AK.Bib;

public class Buch implements IBuch {
    String name;
    String autor;
    String verlag;
    int preisInCents;
    // int seitenzahl; Änderung

    public Buch(String name, String autor, String verlag, int preisInCents) {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAutor() {
        return autor;
    }
}
