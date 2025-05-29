package Exercise.Uebungen.Frage;

public class Dreieck extends GeometrischerFigur{
    double grundseite;
    double hoehe;

    public Dreieck(double grundseite, double hoehe){
        this.grundseite = grundseite;
        this.hoehe = hoehe;
    }

    @Override
    public double berechneFlaeche(){
        return 0.5 * grundseite * hoehe;
    }
}
