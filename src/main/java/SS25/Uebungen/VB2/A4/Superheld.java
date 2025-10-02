package SS25.Uebungen.VB2.A4;

public class Superheld implements Flugfaehig, Unsichtbar, Stark {

    @Override
    public void fliege() {
        System.out.println("fliege");
    }

    @Override
    public void hebeGewicht(int kg) {
        System.out.println("hebeGewicht");
    }

    @Override
    public void versteckeDich() {
        System.out.println("versteckeDich");
    }
}
