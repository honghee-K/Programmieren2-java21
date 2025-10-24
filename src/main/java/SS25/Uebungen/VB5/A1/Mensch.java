package SS25.Uebungen.VB5.A1;

public class Mensch extends Lebewesen {
    String beruf;

    public Mensch(String name, String beruf) {
        super(name);
        this.beruf = beruf;
    }

    @Override
    public void beschreibe() {
        System.out.println(name + ", " + beruf);
    }
}
