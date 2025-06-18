package Exercise.AK.Musik;

import java.util.Comparator;

public class VergleichMusikStueckLaenge implements Comparator<MusikStueck> {

    public int compare(MusikStueck a, MusikStueck b) {
        return a.getLaenge() - b.getLaenge();
    }
} // Integer.compare(a.laenge, b.laenge)
