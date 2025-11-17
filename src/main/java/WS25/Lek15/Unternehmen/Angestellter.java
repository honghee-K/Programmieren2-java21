package WS25.Lek15.Unternehmen;

import java.time.LocalDate;

public abstract class Angestellter {
    private String nachname;
    private String vorname;
    private int id;
    private double grundgehalt;
    private double gehaltfaktor;
    private LocalDate geburtsdatum;

    public Angestellter(String nachname, String vorname, int id, double grundgehalt, double gehaltfaktor) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.gehaltfaktor = gehaltfaktor;
        this.geburtsdatum = LocalDate.of(2000, 01, 01);
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(double grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public double getGehaltfaktor() {
        return gehaltfaktor;
    }

    public void setGehaltfaktor(double gehaltfaktor) {
        this.gehaltfaktor = gehaltfaktor;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }
}
