package SS25.Uebungen.VB5.A1;

public class Tier extends Lebewesen {
    String art;

    public Tier(String name, String art) {
        super(name);
        this.art = art;
    }

    @Override
    public void beschreibe() {
        System.out.println(name + ", " + art);
    }
}
