package WS25.Lek14;

public class Person {
    public String vorname;
    public String nachname;
    public Adresse adresse;

    public Person(String vorname, String nachname, Adresse adresse) {
        if (!Character.isUpperCase(vorname.charAt(0))
                || !Character.isUpperCase(adresse.strasse.charAt(0))
                || !Character.isUpperCase(adresse.ort.charAt(0))) {
            throw new RuntimeException("Parameter sind ungültig.");
        }
        if (adresse.hausnummer.length() != 1 || !Character.isDigit(adresse.hausnummer.charAt(0))) {
            throw new RuntimeException("Parameter ist ungültig.");
        }

        this.vorname = vorname;
        this.nachname = nachname;
        this.adresse = adresse;
    }
}
