package SS25.AK.Bib;

import java.util.List;

public class Reihe {

    String reiheName;
    private List<Buch> baenden ;

    public Reihe(String reiheName, List<Buch> baenden) {
        this.reiheName = reiheName;
        this.baenden = baenden;
    }
}
