package SS25.AK.WS22_23.A3;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    // Q. Muss man der Interface in Aritkel Class implementieren, auch wenn auf der Aufgabe nicht steht.
    public List<Artikel> einmalSpielbar(List<Artikel> liste) {
        return liste.stream()
                .filter(a -> a instanceof IstEinmalSpielbar isb && isb.einmalSpielbar())
                .toList();
    } // 아래 클래스 사용하려면 .filter(new Test())

    public static class Test implements Predicate<Artikel> {

        @Override
        public boolean test(Artikel artikel) {

            if (artikel instanceof IstEinmalSpielbar) {
                IstEinmalSpielbar isb = (IstEinmalSpielbar) artikel;
                isb.einmalSpielbar();
            }

            return false;
        }
    }
}
