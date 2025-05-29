package Exercise.Uebungen.Frage;

public class Main {
    public static void main(String[] args) {
        GeometrischerFigur g;
        g = new Dreieck(10, 5);

        System.out.println(g.berechneFlaeche());
    }
}
