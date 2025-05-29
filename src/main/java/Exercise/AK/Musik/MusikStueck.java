package Exercise.AK.Musik;

public class MusikStueck
{
    private String titel;
    private String interpret;
    private int laenge; // Dauer in Sekunden
    public MusikStueck(String titel, String interpret, int laenge)
    {
        this.titel = titel;
        this.interpret = interpret;
        this.laenge = laenge;
    }

    public String getTitel() {
        return titel;
    }
    public String getInterpret(){
        return interpret;
    }
    public int getLaenge(){
        return laenge;
    }
    @Override
    public String toString(){

        return String.format("Title: %s\n Interpret: %s\n Lange: %d Sekunden", this.titel, this.interpret, this.laenge);
    }


}
