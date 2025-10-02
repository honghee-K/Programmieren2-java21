package SS25.AK.Musik;

public class Main {
    public static void main(String[] args) {
        MusikStueck song1 = new MusikStueck("D", "ab", 220);
        MusikStueck song2 = new MusikStueck("B", "ab", 180);
        MusikStueck song3 = new MusikStueck("C", "df", 170);

        MusikStueckSammlung sammlung = new MusikStueckSammlung();
        sammlung.musikStueckEinfuegen(song1);
        sammlung.musikStueckEinfuegen(song2);
        sammlung.musikStueckEinfuegen(song3);
        System.out.println("Sortiert nach Titel:");
        for (MusikStueck musik : sammlung.getAlleMusikStueckeNachTitel()) {
            System.out.println(musik.getTitel() + " - " + musik.getInterpret() + "(" + musik.getLaenge() + ")");
        }
        System.out.println("Sortiert nach Länge");
        for (MusikStueck musik : sammlung.getAlleMusikStueckNachLaenge()) {
            System.out.println(musik.getTitel() + " - " + musik.getInterpret() + "(" + musik.getLaenge() + ")");
        }
    }
}
