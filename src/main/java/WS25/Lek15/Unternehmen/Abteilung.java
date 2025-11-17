package WS25.Lek15.Unternehmen;

import java.util.ArrayList;
import java.util.List;

public class Abteilung {
    private Abteilungsleiter abteilungsleiter;
    private List<Angestellter> angestellte = new ArrayList<>();

    public List<Angestellter> getAngestellte() {
        return angestellte;
    }
}
