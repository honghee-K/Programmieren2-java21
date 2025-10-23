package SS25.AK.Iterator;

import java.util.Iterator;

public class RouletteZahlen implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return new RouletteZahlenIterator();
    }

    public static void main(String[] args) {

        RouletteZahlen rouletteZahlen = new RouletteZahlen();

        for (Integer i : rouletteZahlen) {
            System.out.println(i);
        }

        System.out.println("---------------");

        RouletteZahlenIterator rouletteZahlenIterator = new RouletteZahlenIterator();
        while (rouletteZahlenIterator.hasNext()) {
            System.out.println(rouletteZahlenIterator.next());
        }
    }
}
