package WS25.Lek15.Unternehmen;

import java.time.LocalDate;

public class Abteilungsleiter extends Angestellter{
    public Abteilungsleiter(String nachname, String vorname, int id, double grundgehalt, double gehaltfaktor){
        super(nachname, vorname, id, grundgehalt, gehaltfaktor);
        setGehaltfaktor(2);
    }

    public void befoedern (Angestellter angestellter){
        angestellter.setGehaltfaktor(angestellter.getGehaltfaktor() * 1.1);
    }
}
