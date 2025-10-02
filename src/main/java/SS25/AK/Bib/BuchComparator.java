package SS25.AK.Bib;

import java.util.Comparator;

public class BuchComparator implements Comparator<Buch> {
    @Override
    public int compare(Buch a, Buch b) {
        if (!a.autor.equals(b.autor)) {
            return a.autor.compareTo(b.autor);
        } else {
            return a.name.compareTo(b.name);
        }
    }
}
