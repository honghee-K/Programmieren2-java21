package Exercise.AK.Bib;

public class Hoerbuch extends Buch implements IBuch{

    String sprecher;
    int spieldauer;

    public Hoerbuch(String name, String autor, String verlag, int preisInCents, String sprecher, int spieldauer) {
        super(name, autor, verlag, preisInCents);
        this.sprecher = sprecher;
        this.spieldauer = spieldauer;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getAutor(){
        return autor;
    }


}

