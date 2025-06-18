package Exercise.AK.Bib;

import java.util.ArrayList;
import java.util.List;

public class Reihe {

    String reiheName;
    private List<Buch> baenden = new ArrayList<>();

    public Reihe(String reiheName, List<Buch> baenden) {
        this.reiheName = reiheName;
        this.baenden = baenden;
    }
}
